package cv_testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import cv_pages.CV_LoginPage;
import cv_pages.CV_NewDocument;

public class CV_NewDocumentTestCase extends Base

{
	
	
	
	@Test
	public void CV_NewDocumentTest() throws Exception
	{				
		WebDriver driver=launchBrowser();
		CV_LoginPage login_page= new CV_LoginPage(driver);
		CV_NewDocument newdoc= new CV_NewDocument(driver);
		//CV_LoginTestCase.checkValidUser();
		login_page.login_cvWeb(getUsername(),getPassword());
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
