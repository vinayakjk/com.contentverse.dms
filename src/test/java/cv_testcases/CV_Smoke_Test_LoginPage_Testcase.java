package cv_testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cv_pages.CV_Smoke_Test_LoginPage;



public class CV_Smoke_Test_LoginPage_Testcase extends Base
{
	WebDriver driver;
	CV_Smoke_Test_LoginPage STL;
	
	@BeforeMethod
	public void intilization() throws Exception 
	{
		driver=launchBrowser();
		STL= new CV_Smoke_Test_LoginPage(driver);
	}
	
	@Test(priority = 1)
	public void ST_Loginpage() 
	{
		STL.ST_Loginpage(sheet.getRow(7).getCell(3).getStringCellValue(),sheet.getRow(7).getCell(5).getStringCellValue());
	}

	@Test(priority = 2)
	public void ST_SelectectedRoom() 
	{
		STL.ST_SelectectedRoom(sheet.getRow(5).getCell(3).getStringCellValue(),sheet.getRow(5).getCell(5).getStringCellValue());
	}
	
	@Test(priority = 3)
	public void ST_CreateCabinet() 
	{
		ST_SelectectedRoom() ;
		STL.ST_CreateCabinet(sheet.getRow(5).getCell(3).getStringCellValue());
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
