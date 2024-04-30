package cv_testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import cv_pages.CV_HomePage;
import cv_pages.CV_LoginPage;

public class CV_DeleteCabinateTest extends Base
{
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
	public void deleteCabinate() throws Exception
	{
		cvLP.Check_Valid_Credentials(sheet.getRow(5).getCell(3).getStringCellValue(),sheet.getRow(5).getCell(5).getStringCellValue(), sheet.getRow(1).getCell(7).getStringCellValue());
		cvHP.deleteCabinate(); 
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
	
}
