package cv_testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cv_pages.CV_LoginPage;
import cv_pages.CV_ToDoList;

public class CV_ToDoListTestCase extends Base {
	CV_LoginPage login_page;
	CV_ToDoList CV_ToDo_List;
	WebDriver driver;

	@BeforeMethod
	public void initalization() throws Exception
	{
		driver = launchBrowser();
		login_page = new CV_LoginPage(driver);
		CV_ToDo_List = new CV_ToDoList(driver);
	}
	
	@Test
	public void To_Do_List() throws InterruptedException 
	
	{
		//For accept Document if present into New Item or Pending Item
		login_page.Check_Valid_Credentials(sheet.getRow(5).getCell(3).getStringCellValue(),sheet.getRow(5).getCell(5).getStringCellValue(), sheet.getRow(1).getCell(7).getStringCellValue());
		CV_ToDo_List.To_Do_List(sheet.getRow(12).getCell(11).getStringCellValue(),sheet.getRow(12).getCell(15).getStringCellValue(),sheet.getRow(5).getCell(3).getStringCellValue());
	}

	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}

}
