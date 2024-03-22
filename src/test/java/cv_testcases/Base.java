package cv_testcases;

import org.openqa.selenium.WebDriver;
import cv_resources.Utility;

public class Base {
	static WebDriver driver;

	public static WebDriver launchBrowser() {
		try {
			driver = Utility.startBrowser();// "chrome", "http://192.168.1.15:8080/CVWeb/cvLgn"
		}

		catch (Exception e) {

		}
		return driver;
	}

}
