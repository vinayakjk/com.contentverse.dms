package cv_testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import cv_pages.CV_LoginPage;

public class CV_LoginTestCase extends Base{
		
	 
	WebDriver driver;
	CV_LoginPage login_page;
	
	@BeforeMethod
	public void initalization() throws Exception
	{
		 launchBrowser();
		 login_page= new CV_LoginPage(driver);
	}
	@Test
	public  void checkValidUser() throws Exception
	
	{
		login_page.login_cvWeb(getUsername(),getPassword());
	}
}
