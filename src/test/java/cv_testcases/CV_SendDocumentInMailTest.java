package cv_testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cv_pages.CV_HomePage;
import cv_pages.CV_LoginPage;

public class CV_SendDocumentInMailTest extends Base {

	WebDriver driver;
	CV_LoginPage cvLP;
	CV_HomePage cvHP;

	@BeforeMethod
	public void initalization() throws Exception {
		driver = launchBrowser();
		cvLP = new CV_LoginPage(driver);
		cvHP = new CV_HomePage(driver);
	}
	
	@Test
	public void sendMail()
	{
		cvLP.login_cvWeb(getUsername(), getPassword());
		
	}
	

}
