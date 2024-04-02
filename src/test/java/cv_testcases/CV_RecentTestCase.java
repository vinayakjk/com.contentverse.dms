package cv_testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import cv_pages.CV_LoginPage;
//import cv_pages.CV_LoginPage;
import cv_pages.CV_Recent;

public class CV_RecentTestCase extends Base {

	WebDriver driver = launchBrowser();// "chrome", "http://192.168.1.15:8080/CVWeb/cvLgn"
	CV_LoginPage login_page= new CV_LoginPage(driver);
	CV_Recent recent = new CV_Recent(driver);

	@Test
	public void login() 
	{
		//CV_LoginTestCase.checkValidUser();
		login_page.Check_Valid_Credentials(ConfigReader.getValidUsername(),ConfigReader.getvalidPassword());
	}

	@Test
	public void verifyRecentFileFolder() {

		System.out.println("Verify FOlder Gets started");

		recent.verifyFolder();
		recent.verifyFile();

		recent.logout();

	}

}
