package cv_testcases;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import java.lang.reflect.Array;

import java.time.Duration;
import java.util.HashMap;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

//import java.time.Duration;
//import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public WebDriver driver;

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
	
	String[] DocsNameArray = {"DocName1","DocName2"};
	String DocName;
	String DocName1;
	String DocName2;
	
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
		DocName = properties.getProperty("DocName");
        DocName1 = properties.getProperty("DocName1");
		DocName2 = properties.getProperty("DocName2");
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

	public String getDocName() {
		return DocName;
	}
	public String getDocName1() {
		return DocName1;
	}
	public String getDocName2() {
		return DocName2;
	}
	public String[] getDocsName() {
		return DocsNameArray;
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

			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			HashMap<String, Object> prefs = new HashMap<String, Object>();
			//prefs.put("safebrowsing.enabled", false);
			//prefs.put("profile.default_content_settings.popups", 0);
			//prefs.put("download.prompt_for_download", false);
			prefs.put("download.default_directory",System.getProperty("user.dir")+"\\downloadFiles\\");
			prefs.put("browser.download.manager.closeWhenDone", true);
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("--disable-features=InsecureDownloadWarnings");
			//options.addArguments("--disable-popup-blocking");
			//options.addArguments("--disable-notifications");
			//options.addArguments("--safebrowsing-disable-download-protection");
			//options.addArguments("safebrowsing-disable-extension-blacklist");
			//options.addArguments("--allow-running-insecure-content");
			
			driver = new ChromeDriver(options);

		} else if (getBrowser().equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get(url);
		return driver;
	}
	


}
