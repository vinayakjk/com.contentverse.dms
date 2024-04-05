package cv_testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cv_pages.Somke_Test_LoginPage;



public class Somke_Test_LoginPage_Testcase extends Base
{
	WebDriver driver;
	Somke_Test_LoginPage STL;
	
	@BeforeMethod
	public void intilization() throws Exception 
	{
		driver=launchBrowser();
		STL= new Somke_Test_LoginPage(driver);
	}
	
	 
	@Test(priority = 1)
	public void ST_Loginpage() 
	{
		STL.ST_Loginpage(getAct_Msg(),getLanguage());
	}

	@Test(priority = 2)
	public void ST_SelectectedRoom() 
	{
		STL.ST_SelectectedRoom(getValidUsername(),getValidPassword());
	}
	
	@Test(priority = 3)
	public void ST_CreateCabinet() 
	{
		ST_SelectectedRoom() ;
		STL.ST_CreateCabinet(getValidUsername());
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
