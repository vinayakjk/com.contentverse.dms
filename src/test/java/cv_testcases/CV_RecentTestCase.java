package cv_testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import cv_pages.CV_LoginPage;
import cv_pages.CV_Recent;

public class CV_RecentTestCase extends Base {

	WebDriver driver;
	CV_LoginPage login_page;
	CV_Recent recent;

	@BeforeMethod
	public void ini() throws Exception {
		driver = launchBrowser();
		login_page = new CV_LoginPage(driver);
		recent = new CV_Recent(driver);
	}

	@Test
	public void verifyRecentFileFolder() throws Exception {
		login_page.Check_Valid_Credentials(sheet.getRow(5).getCell(3).getStringCellValue(),
				sheet.getRow(5).getCell(5).getStringCellValue(), sheet.getRow(1).getCell(7).getStringCellValue());
		System.out.println("Verify Recent Folder Gets started");
		recent.verifyFolder(sheet.getRow(14).getCell(3).getStringCellValue(),
				sheet.getRow(14).getCell(5).getStringCellValue(), sheet.getRow(14).getCell(7).getStringCellValue());
		System.out.println("Verify Recent Document Gets started");
		recent.verifyFile(sheet.getRow(14).getCell(7).getStringCellValue());

	}

	@AfterMethod
	public void teardown() throws Exception {
		driver.quit();
	}

}
