package cv_testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cv_pages.CV_LoginPage;
import cv_pages.CV_NewDocument;

public class CV_NewDocumentTestCase extends Base

{
	WebDriver driver;
	CV_LoginPage login_page;
	CV_NewDocument newdoc;

	@BeforeMethod
	public void Before() 
	{
		driver = launchBrowser();
		login_page = new CV_LoginPage(driver);
		newdoc = new CV_NewDocument(driver);
	}

	@Test
	public void CV_NewDocumentTest() throws InterruptedException
	{
		login_page.Check_Valid_Credentials(ConfigReader.getValidUsername(), ConfigReader.getvalidPassword());
		newdoc.NewDocument();
	}

	@AfterMethod
	public void quit() 
	{
		driver.quit();
	}

}
