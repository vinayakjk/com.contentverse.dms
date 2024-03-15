package cv_testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import cv_pages.CV_LoginPage;
//import cv_pages.CV_LoginPage;
import cv_pages.CV_Recent;
//import cv_resources.Utility;
import cv_resources.Utility;



public class CV_RecentTestCase {

	//WebDriver driver;
	
	WebDriver driver =Utility.startBrowser("chrome", "http://192.168.1.15:8080/CVWeb/cvLgn");
	//CV_LoginPage login_page = new CV_LoginPage(driver);

	//CV_Recent recent = new CV_Recent(driver);

	CV_Recent recent = new CV_Recent(driver);

	
	/*
	 * Call login method from CV_Loginpage class
	 * */
	
	@Test
	public void login() {
		CV_LoginPage login_page = new CV_LoginPage(driver);
		login_page.login_cvWeb("shraddha" , "root@123");

	}
	
	
	/*   calling methods to open and verify documents and files   */
	
	@Test
	public void verifyRecentFileFolder() 
	{
		//CV_LoginTestCase.checkValidUser();

        
		recent.verifyFolder();
		recent.verifyFile();
		
		//Calling logout method
		recent.logout();

	}
	
	
	
	
}
