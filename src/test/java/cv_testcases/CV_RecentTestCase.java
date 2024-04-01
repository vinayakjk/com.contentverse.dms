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
		login_page.login_cvWeb(getUsername(),getPassword());
	}

	@Test
	public void verifyRecentFileFolder() throws Exception {		

		System.out.println("Verify FOlder Gets started");
		recent.verifyFolder();
		recent.verifyFile();
		recent.logout();
	}
	
	@AfterMethod
	public void teardown() throws Exception
	{
		driver.close();
	}

}
