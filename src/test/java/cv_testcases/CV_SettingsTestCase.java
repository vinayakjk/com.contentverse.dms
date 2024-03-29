package cv_testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import cv_pages.CV_LoginPage;
import cv_pages.CV_Settings;

public class CV_SettingsTestCase extends Base
{
	WebDriver driver =launchBrowser();
	CV_LoginPage login_page= new CV_LoginPage(driver);
	CV_Settings newdoc= new CV_Settings(driver);
	
	
	@Test
	public void CV_NewDocumentTest() throws InterruptedException
	{				
		//CV_LoginTestCase.checkValidUser();
		login_page.login_cvWeb(ConfigReader.getUsername(),ConfigReader.getPassword());
	//	login_page.login_cvWeb(ConfigReader.getUsername(),ConfigReader.getPassword());
		newdoc.profile_Setting( ConfigReader.getdefaultView(),ConfigReader.getofficeDocs(),ConfigReader.getofficepdf(),ConfigReader.getLoadcount());
		
	}

	@AfterMethod
	@AfterTest
	//@Test
	public void quit()
	{				
		driver.quit();
	}



}
