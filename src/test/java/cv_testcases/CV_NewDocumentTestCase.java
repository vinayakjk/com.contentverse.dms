package cv_testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import cv_pages.CV_LoginPage;
import cv_pages.CV_NewDocument;

public class CV_NewDocumentTestCase extends Base

{
	
	WebDriver driver =launchBrowser();
	CV_LoginPage login_page= new CV_LoginPage(driver);
	CV_NewDocument newdoc= new CV_NewDocument(driver);
	
	
	@Test
	public void CV_NewDocumentTest() throws InterruptedException
	{				
		login_page.login_cvWeb();
		newdoc.NewDocument();
		
	}

	@AfterMethod
	@AfterTest
	//@Test
	public void quit()
	{				
		driver.quit();
	}


}
