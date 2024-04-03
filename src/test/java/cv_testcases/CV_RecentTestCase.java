package cv_testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import cv_pages.CV_LoginPage;
import cv_pages.CV_Recent;

public class CV_RecentTestCase extends Base {

	WebDriver driver;
	CV_LoginPage login_page;
	CV_Recent recent;
	
	@BeforeMethod
	public void ini() throws Exception
	{
		 driver = launchBrowser();
		 login_page= new CV_LoginPage(driver);
		 recent = new CV_Recent(driver);
	}
	
	
	@Test
	public void login() throws Exception 
	{
		login_page.login_cvWeb(getUsername(),getPassword(),getRoom());
	}

	@Test
	public void verifyRecentFileFolder() throws Exception {		

		System.out.println("Verify FOlder Gets started");
		recent.verifyFolder();
		recent.verifyFile();
		
	}
	
/*

public class CV_RecentTestCase {

	// WebDriver driver;

	WebDriver driver = Utility.startBrowser();// "chrome", "http://192.168.1.15:8080/CVWeb/cvLgn"
	// CV_LoginPage login_page = new CV_LoginPage(driver);

	// CV_Recent recent = new CV_Recent(driver);

	CV_Recent recent = new CV_Recent(driver);

	@Test
	public void login() {
		CV_LoginPage login_page = new CV_LoginPage(driver);
		login_page.login_cvWeb();// "shraddha" , "root@123"

	}

	// calling methods to open and verify documents and files 

	@Test
	public void verifyRecentFileFolder() {
		// CV_LoginTestCase.checkValidUser();
		System.out.println("Verify FOlder Gets started");

		recent.verifyFolder();
		recent.verifyFile();

		// Calling logout method

		recent.logout();
	}
*/
	
	@AfterMethod
	public void teardown() throws Exception
	{
		driver.close();
	}


}
