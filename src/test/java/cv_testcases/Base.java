package cv_testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	 WebDriver driver;

	public static class ConfigReader {
		private static  String Username;
		private static String defaultView;
		private static Properties properties;
		private static String browser;
		public static String url;
		private static String Password;

		private static String officeDocs;
		private static String officepdf;
		private static String Loadcount;
		static {
			properties = new Properties();
			try {

				FileInputStream fis = new FileInputStream(
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

			} catch (IOException e) {

			}
		}

		public static String getBrowser() {
			return browser;
		}

		public static String getUrl() {
			return url;
		}

		public static String getUsername() {
			return Username;
		}

		public static String getPassword() {
			return Password;
		}

		public static String getdefaultView() {
			return defaultView;
		}

		public static String getofficeDocs() {
			return officeDocs;
		}

		public static String getofficepdf() {
			return officepdf;
		}

		public static String getLoadcount() {
			return Loadcount;
		}

	}

	public  WebDriver launchBrowser() {

		if (ConfigReader.getBrowser().equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();

		} else if (ConfigReader.getBrowser().equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		} else if (ConfigReader.getBrowser().equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.get(ConfigReader.url);
		return driver;
	}

}
