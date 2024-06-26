package cv_testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import cv_pages.CV_LoginPage;
import cv_pages.CV_NewDocument;

public class CV_NewDocumentTestCase extends Base
{	
	@Test
	public void CV_NewDocumentTest() throws Exception
	{				
		WebDriver driver=launchBrowser();
		CV_LoginPage login_page= new CV_LoginPage(driver);
		CV_NewDocument newdoc= new CV_NewDocument(driver);

		login_page.Check_Valid_Credentials(sheet.getRow(5).getCell(3).getStringCellValue(),sheet.getRow(5).getCell(5).getStringCellValue(), sheet.getRow(1).getCell(7).getStringCellValue());

		newdoc.NewDocument();
		
	}

	@AfterMethod
	@AfterTest
	//@Test
	public void quit()
	{				
		driver.quit();
	}


}
