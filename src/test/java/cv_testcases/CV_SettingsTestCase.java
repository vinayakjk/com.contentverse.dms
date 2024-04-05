package cv_testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cv_pages.CV_LoginPage;
import cv_pages.CV_Settings;

public class CV_SettingsTestCase extends Base
{
	CV_LoginPage login_page;
	CV_Settings newdoc;
	WebDriver driver;
	
	@BeforeMethod
	public void initalization() throws Exception 
	{
		driver = launchBrowser();
		login_page = new CV_LoginPage(driver);
		newdoc=new CV_Settings(driver);
	}

	@Test
	public void CV_NewDocumentTest() throws InterruptedException
	{				
		login_page.Check_Valid_Credentials(getValidUsername(),getValidPassword());
		newdoc.profile_Setting( getdefaultView(),getofficeDocs(),getofficepdf(),getLoadcount());
	}

	@AfterMethod
	public void quit()
	{				
		driver.quit();
	}

}
