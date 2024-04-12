package cv_testcases;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

//import java.time.Duration;
//import java.util.Properties;

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
	String ValidPassword;
	String Room;
	
	String defaultView;
	Properties properties;
	String browser;
	FileInputStream fis;
	String url;

	
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

	String WorkflowVerify_F_User;
	String WorkflowVerify_F_Password;
	String WorkflowVerify_S_User;
	String WorkflowVerify_S_Password;
	String WorkflowStatus_By_First_User;
	String WorkflowStatus_By_Second_User;
	String DocumentName;
	String Name_OF_WF;

	public void ConfigReader() throws Exception {
		properties = new Properties();
		fis = new FileInputStream(
				(System.getProperty("user.dir") + "\\src\\main\\java\\cv_resources\\Config.properties"));

		properties.load(fis);
		browser = properties.getProperty("browser");
		url = properties.getProperty("url");

		ValidUsername = properties.getProperty("Username");
		ValidPassword = properties.getProperty("Password");
		Room = properties.getProperty("Room");
		CabinateName = properties.getProperty("CabinateName");
		DrawerName = properties.getProperty("DrawerName");
		FolderName = properties.getProperty("FolderName");
		defaultView = properties.getProperty("defaultView");
		officeDocs = properties.getProperty("officeDocs");
		Loadcount = properties.getProperty("Loadcount");
		officepdf = properties.getProperty("officepdf");
		InValidUsername = properties.getProperty("Invalid_User");
		InValidPassword = properties.getProperty("Invalid_Pass");
		Act_Msg = properties.getProperty("Act_Msg");
		Language = properties.getProperty("Language");

		WorkflowVerify_F_User = properties.getProperty("WorkflowVerify_F_User");
		WorkflowVerify_F_Password = properties.getProperty("WorkflowVerify_F_Password");

		WorkflowVerify_S_User = properties.getProperty("WorkflowVerify_S_User");
		WorkflowVerify_S_Password = properties.getProperty("WorkflowVerify_S_Password");
		WorkflowStatus_By_First_User = properties.getProperty("WorkflowStatus_By_First_User");
		WorkflowStatus_By_Second_User = properties.getProperty("WorkflowStatus_By_Second_User");
		DocumentName = properties.getProperty("DocumentName");
		Name_OF_WF = properties.getProperty("Name_OF_WF");
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

	public String getInvalidPassword() {
		return InValidPassword;
	}

	public String getAct_Msg() {
		return Act_Msg;
	}

	public String getLanguage() {
		return Language;
	}

	public String getWorkflowVerify_F_User() {
		return WorkflowVerify_F_User;
	}

	public String getWorkflowVerify_F_Password() {
		return WorkflowVerify_F_Password;
	}

	public String getWorkflowVerify_S_User() {
		return WorkflowVerify_S_User;
	}

	public String getWorkflowVerify_S_Password() {
		return WorkflowVerify_F_Password;
	}

	public String getWorkflowStatus_By_First_User() {
		return WorkflowStatus_By_First_User;
	}

	public String getWorkflowStatus_By_Second_User() {
		return WorkflowStatus_By_Second_User;
	}

	public String getDocumentName() {
		return DocumentName;
	}

	public String getName_OF_WF() {
		return Name_OF_WF;
	}

	public WebDriver launchBrowser() throws Exception {

		ConfigReader();

		if (getBrowser().equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			FirefoxProfile profile = new FirefoxProfile();
			profile.setPreference("browser.download.folderList", 2);
			profile.setPreference("browser.download.dir", System.getProperty("user.dir") + "\\downloadFiles\\");
			profile.setPreference("browser.download.manager.closeWhenDone", true);
			options.setProfile(profile);

			driver = new FirefoxDriver(options);

		} else if (getBrowser().equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		} else if (getBrowser().equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

}
