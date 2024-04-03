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

public class Base {

	WebDriver driver;

	String Username;
	String defaultView;
	Properties properties;
	String browser;
	FileInputStream fis;
	String url;
	String Password;

	String officeDocs;
	String officepdf;
	String Loadcount;

	public void ConfigReader() throws Exception {
		properties = new Properties();
		fis = new FileInputStream(
				(System.getProperty("user.dir") + "\\src\\main\\java\\cv_resources\\Config.properties"));

		properties.load(fis);
		browser = properties.getProperty("browser");
		url = properties.getProperty("url");
		Username = properties.getProperty("Username");
		Password = properties.getProperty("Password");
		defaultView = properties.getProperty("defaultView");
		officeDocs = properties.getProperty("officeDocs");
		Loadcount = properties.getProperty("Loadcount");
		officepdf = properties.getProperty("officepdf");
	}

	public String getBrowser() {
		return browser;
	}

	public String getUrl() {
		return url;
	}

	public String getUsername() {
		return Username;
	}

	public String getPassword() {
		return Password;
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

	public void launchBrowser() throws Exception {

		ConfigReader();

		if (getBrowser().equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();

		} else if (getBrowser().equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		} else if (getBrowser().equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		//return driver;
	}

}
