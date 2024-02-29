package cv_testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import cv_pages.CV_LoginPage;
import cv_resources.Utility;

//Lgin Page code added - Rajendra 28/02/2024

public class CV_LoginTestCase extends Utility 

{
	WebDriver gdriver = Utility.startBrowser("chrome", "http://192.168.1.15:8080/CVWeb/cvLgn");

	CV_LoginPage CVL = new CV_LoginPage(gdriver);

	//@BeforeMethod
	@Test
	public void lg() {

		CVL.login("rajendra", "pass_123");
	}

	@AfterMethod
	
	public void quit() {
		wd.quit();

	}
}
