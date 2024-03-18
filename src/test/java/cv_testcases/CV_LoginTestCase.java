package cv_testcases;

import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

//import com.github.dockerjava.api.model.Driver;

import cv_pages.CV_LoginPage;

public class CV_LoginTestCase extends Base{

	WebDriver driver =launchBrowser();
	CV_LoginPage login_page= new CV_LoginPage(driver);
	
	@Test
	public void checkValidUser()
	{
		login_page.login_cvWeb();//"mateen", "root@123"
	}
}
