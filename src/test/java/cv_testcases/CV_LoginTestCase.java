package cv_testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import cv_pages.CV_LoginPage;
import cv_resources.Utility;

public class CV_LoginTestCase {

	
	@Test
	public void checkValidUser()
	{
		WebDriver driver =Utility.startBrowser("chrome", "http://192.168.1.15:8080/CVWeb/cvLgn");
		
		CV_LoginPage login_page= PageFactory.initElements(driver,CV_LoginPage.class);
		
		login_page.login_cvWeb("vinayak", "Arnav@123");
	}
	
	
}
