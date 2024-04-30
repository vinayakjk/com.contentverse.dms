package cv_testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cv_pages.CV_HomePage;
import cv_pages.CV_LoginPage;

public class CV_TestCase extends Base 
{
	CV_LoginPage login_page;
	CV_HomePage CVH; 
	
	WebDriver driver;


	@BeforeMethod
	public void initalization() throws Exception 
	{

		driver = launchBrowser();
		login_page = new CV_LoginPage(driver);
		CVH =new CV_HomePage(driver);

	}
	
	@Test

	public void Check_Valid_Credentials()

	{
		login_page.Check_Valid_Credentials(sheet.getRow(5).getCell(3).getStringCellValue(),sheet.getRow(5).getCell(5).getStringCellValue(), sheet.getRow(1).getCell(7).getStringCellValue());

		//CVH.deleteCabinate(getValidUsername());
	}

	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}

}
