package cv_testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	Sheet sheet;
	public WebDriver driver;

	public void ReadExcel() throws IOException {
		FileInputStream fis = new FileInputStream((System.getProperty("user.dir") + "\\src\\main\\java\\cv_resources\\Test_Data.xlsx"));
		
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(0);
		
		/*
		
		StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
		
		for (StackTraceElement element : stackTrace) 
        {
            String className = element.getClassName();
           
            if (className.contains("LoginTestCase"))
            {
            	sheet = wb.getSheetAt(0);
                break;
            }
            
        }*/

    	//sheet = wb.getSheetAt(1);
        

	}

	public WebDriver launchBrowser() throws Exception {

		ReadExcel();

		if (sheet.getRow(1).getCell(3).getStringCellValue().equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			FirefoxProfile profile = new FirefoxProfile();
			profile.setPreference("browser.download.folderList", 2);
			profile.setPreference("browser.download.dir", System.getProperty("user.dir") + "\\downloadFiles\\");
			profile.setPreference("browser.download.manager.closeWhenDone", true);
			options.setProfile(profile);

			driver = new FirefoxDriver(options);

		} else if (sheet.getRow(1).getCell(3).getStringCellValue().equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			HashMap<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("download.default_directory", System.getProperty("user.dir") + "\\downloadFiles\\");
			prefs.put("browser.download.manager.closeWhenDone", true);
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("--disable-features=InsecureDownloadWarnings");
			driver = new ChromeDriver(options);

		} else if (sheet.getRow(1).getCell(3).getStringCellValue().equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(sheet.getRow(1).getCell(5).getStringCellValue());
		return driver;
	}

	public void sendEmailWithReport() {
        // Your Gmail credentials
        String from = "cmsautomation0@gmail.com";
        String appPassword = "zixw ibsb iafh wqdu"; // Use the App Password here
        String to = "rajendra.mane@sundynetech.com";
        String subject = "Report";
        String body = "This is Auto Send Mail";

        // Get the latest file from the reports folder
        String reportsFolder = System.getProperty("user.dir") + "//reports";
        File latestFile = getLatestFile(reportsFolder);
        
        String reportsFolder_V = System.getProperty("user.dir") + "//Recording";
        File latestFile_V = getLatestFile(reportsFolder_V);
        
        if (latestFile != null || latestFile_V != null) 
        {
            // File to be attached
            String attachmentPath = latestFile.getAbsolutePath();

            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");

            Session session = Session.getInstance(props, new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(from, appPassword);
                }
            });

            try {
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress(from));
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
                message.setSubject(subject);

                // Create the email body part
                MimeBodyPart messageBodyPart = new MimeBodyPart();
                messageBodyPart.setText(body);

                // Create the attachment
                MimeBodyPart attachmentPart = new MimeBodyPart();
                attachmentPart.attachFile(new File(attachmentPath));
                
                // Add the parts to the message
                Multipart multipart = new MimeMultipart();
                multipart.addBodyPart(messageBodyPart);
                multipart.addBodyPart(attachmentPart);
                
                // Set the multipart content to the message
                message.setContent(multipart);

                // Send the message
                Transport.send(message);
                System.out.println("Email sent successfully!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } 
        else 
        {
            System.out.println("No files found in the reports folder.");
        }
    }
	
	private File getLatestFile(String folderPath) {
        File folder = new File(folderPath);
        File[] files = folder.listFiles();

        if (files != null && files.length > 0) {
            // Sort files by last modified timestamp
            Arrays.sort(files, (f1, f2) -> Long.compare(f2.lastModified(), f1.lastModified()));
            return files[0]; // Return the latest file
        } else {
            return null; // No files found
        }
    }

}
