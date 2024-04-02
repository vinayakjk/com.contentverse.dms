package cv_testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cv_pages.CV_HomePage;
import cv_pages.CV_LoginPage;

public class CV_CreateCabinateDrawerTest extends Base 
{
	WebDriver driver;

	CV_LoginPage cvLP;
	CV_HomePage cvHP;
	
	
	@BeforeMethod
	public void initalization() throws Exception
	{
		 driver = launchBrowser();
		 cvLP = new CV_LoginPage(driver);
		 cvHP = new CV_HomePage(driver);
	}
	
	@Test
	public void createCabinateAndDrawer() throws Exception
	{
		//WebDriver driver = launchBrowser();
		//CV_LoginPage cvLP = new CV_LoginPage(driver);
		//CV_HomePage cvHP = new CV_HomePage(driver);
		//cvLP.login_cvWeb();
		cvLP.Check_Valid_Credentials(getValidUsername(), getValidPassword());
		Thread.sleep(3000);
		Assert.assertEquals(cvHP.cv_CabinateCreation(), true);
	}
	
	@Test
	public void createCabinate() throws Exception
	{
		createCabinateAndDrawer();
		cvHP.cvCreateDrawer();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	
}
