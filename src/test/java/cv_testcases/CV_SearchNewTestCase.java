package cv_testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cv_pages.CV_HomePage;
import cv_pages.CV_LoginPage;
import cv_pages.CV_SearchNew;

public class CV_SearchNewTestCase extends Base{

	WebDriver driver;
	CV_LoginPage cvLP;
	CV_HomePage cvHP;
	CV_SearchNew cvSN;
	
	@BeforeMethod
	public void initalization() throws Exception
	{
		 driver = launchBrowser();
		 cvLP = new CV_LoginPage(driver);
		 cvHP = new CV_HomePage(driver);
		 cvSN = new CV_SearchNew(driver);
	}
	
	@Test
	public void searchDocument() throws Exception
	{
		cvLP.Check_Valid_Credentials(getValidUsername(), getValidPassword(),getRoom());
		cvHP.advanceSearch();
		Thread.sleep(3000);
		cvSN.selectDocumentType("Test");
		//cvSN.selectSearchedDocument();
		cvSN.selectDate();
		
	}
}
