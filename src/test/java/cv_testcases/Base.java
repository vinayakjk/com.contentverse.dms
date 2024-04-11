package cv_testcases;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	WebDriver driver;

	String ValidUsername;
	String defaultView;
	Properties properties;
	String browser;
	FileInputStream fis;
	String url;

	String ValidPassword;

	String Password;
	String Room;
	String CabinateName;
	String DrawerName;
	String FolderName;

	String officeDocs;
	String officepdf;
	String Loadcount;
	String InValidUsername;
	String InValidPassword;
	String Act_Msg;
    String Language;
	
	public void ConfigReader() throws Exception {
		properties = new Properties();
		fis = new FileInputStream((System.getProperty("user.dir") + "\\src\\main\\java\\cv_resources\\Config.properties"));

		properties.load(fis);
		browser = properties.getProperty("browser");
		url = properties.getProperty("url");
//<<<<<<< HEAD
		ValidUsername = properties.getProperty("Username");
		ValidPassword = properties.getProperty("Password");
//=======
		//Username = properties.getProperty("Username");
		//Password = properties.getProperty("Password");
		Room = properties.getProperty("Room");
		CabinateName = properties.getProperty("CabinateName");
		DrawerName = properties.getProperty("DrawerName");
		FolderName = properties.getProperty("FolderName");
//>>>>>>> CreateCabinateDrwaer
		defaultView = properties.getProperty("defaultView");
		officeDocs = properties.getProperty("officeDocs");
		Loadcount = properties.getProperty("Loadcount");
		officepdf = properties.getProperty("officepdf");
		InValidUsername = properties.getProperty("Invalid_User");
		InValidPassword = properties.getProperty("Invalid_Pass");
		 Act_Msg=properties.getProperty("Act_Msg");
         Language=properties.getProperty("Language");
	}

	public String getBrowser() {
		return browser;
	}

	public String getUrl() {
		return url;
	}

	public String getValidUsername() {
		return ValidUsername;
	}

	public String getValidPassword() {
		return ValidPassword;
	}
	public String getRoom() {
		return Room;
	}

	public String getCabinetName() {
		return CabinateName;
	}

	public String getDrawerName() {
		return DrawerName;
	}
	public String getFolderName() {
		return FolderName;
	}
	public String getdefaultView() {
		return defaultView;
	}

	public String getofficeDocs() {
		return officeDocs;
	}

	public String getofficepdf() {
		return officepdf;
	}

	public String getLoadcount() {
		return Loadcount;
	}
	
	
	public String getInValidUsername() {
		return InValidUsername;
	}
	
	public  String getInvalidPassword() {
		return InValidPassword;
	}

	public String getAct_Msg() {
		return Act_Msg;
	}

	public String getLanguage() {
		return Language;
	}

	
	public WebDriver launchBrowser() throws Exception  {

		ConfigReader();

		if (getBrowser().equalsIgnoreCase("firefox")) {
			//driver = new FirefoxDriver();
			
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			FirefoxProfile profile = new FirefoxProfile();
			profile.setPreference("browser.download.folderList", 2);
			profile.setPreference("browser.download.dir",System.getProperty("user.dir")+"\\downloadFiles\\");
			profile.setPreference("browser.download.manager.closeWhenDone", true);
			options.setProfile(profile);
			
			driver = new FirefoxDriver(options);

		} else if (getBrowser().equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		} else if (getBrowser().equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		return driver;
	}

}
