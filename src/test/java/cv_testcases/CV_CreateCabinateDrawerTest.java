package cv_testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cv_pages.CV_HomePage;
import cv_pages.CV_LoginPage;
import cv_resources.GetscreenShot;

public class CV_CreateCabinateDrawerTest extends Base 
{
	//WebDriver driver;

	CV_LoginPage cvLP;
	CV_HomePage cvHP;
		
	@BeforeMethod
	public void initalization() throws Exception
	{
		 launchBrowser();
		 cvLP = new CV_LoginPage(driver);
		 cvHP = new CV_HomePage(driver);
	}
	
	@Test
	public void createCabinate() throws Exception
	{
		cvLP.Check_Valid_Credentials(getValidUsername(), getValidPassword(),getRoom());
		Thread.sleep(3000);
		Assert.assertEquals(cvHP.cv_CabinateCreation(), true);
	
	}
	
	@Test
	public void createDrawer() throws Exception
	{
		createCabinate();
		cvHP.cvCreateDrawer();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	
}
