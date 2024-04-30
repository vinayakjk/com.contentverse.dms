package cv_testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cv_pages.CV_HomePage;
import cv_pages.CV_LoginPage;

public class CV_ExportContentTest extends Base
{
	CV_LoginPage cvLP;
	CV_HomePage cvHP;

	@BeforeMethod
	public void initalization() throws Exception {
		launchBrowser();
		cvLP = new CV_LoginPage(driver);
		cvHP = new CV_HomePage(driver);
	}

	@Test
	public void exportSinDocument() throws Exception {
		cvLP.Check_Valid_Credentials(sheet.getRow(5).getCell(3).getStringCellValue(),sheet.getRow(5).getCell(5).getStringCellValue(), sheet.getRow(1).getCell(7).getStringCellValue());
		// Thread.sleep(3000);
		cvHP.listOfCabinatesPresentInDataBase(sheet.getRow(3).getCell(3).getStringCellValue());
		// cv_HP.listOfDrawersPresentInCabinet();

		cvHP.selectDrawerPresentInCabinet(sheet.getRow(3).getCell(5).getStringCellValue());
		// cv_HP.listOfFoldersPresentInDrawer();

		// Thread.sleep(2000);
		cvHP.selectFolderPresentInDrawer(sheet.getRow(3).getCell(7).getStringCellValue());
		cvHP.documentListTable();
		cvHP.selectSingleDocument(sheet.getRow(12).getCell(11).getStringCellValue());
		Assert.assertEquals(cvHP.exportDocument(), true);
	}

	@Test
	public void exportAllDocument() throws Exception {
		cvLP.Check_Valid_Credentials(sheet.getRow(5).getCell(3).getStringCellValue(),sheet.getRow(5).getCell(5).getStringCellValue(), sheet.getRow(1).getCell(7).getStringCellValue());
		// Thread.sleep(3000);
		cvHP.listOfCabinatesPresentInDataBase(sheet.getRow(3).getCell(3).getStringCellValue());
		// cv_HP.listOfDrawersPresentInCabinet();

		cvHP.selectDrawerPresentInCabinet(sheet.getRow(3).getCell(5).getStringCellValue());
		// cv_HP.listOfFoldersPresentInDrawer();

		// Thread.sleep(2000);
		cvHP.selectFolderPresentInDrawer(sheet.getRow(3).getCell(7).getStringCellValue());
		cvHP.documentListTable();
		cvHP.selectAllDocuments();
		Assert.assertEquals(cvHP.exportDocument(), true);
	}

	@Test
	public void exportUserSpecifiedDocument() throws Exception {
		cvLP.Check_Valid_Credentials(sheet.getRow(5).getCell(3).getStringCellValue(),sheet.getRow(5).getCell(5).getStringCellValue(), sheet.getRow(1).getCell(7).getStringCellValue());
		// Thread.sleep(3000);
		cvHP.listOfCabinatesPresentInDataBase(sheet.getRow(3).getCell(3).getStringCellValue());
		// cv_HP.listOfDrawersPresentInCabinet();

		cvHP.selectDrawerPresentInCabinet(sheet.getRow(3).getCell(5).getStringCellValue());
		// cv_HP.listOfFoldersPresentInDrawer();

		// Thread.sleep(2000);
		cvHP.selectFolderPresentInDrawer(sheet.getRow(3).getCell(7).getStringCellValue());
		cvHP.documentListTable();
		
		//Plz verify this with Excel
		cvHP.selectMultipleDocuments(sheet.getRow(12).getCell(11).getStringCellValue(), sheet.getRow(12).getCell(11).getStringCellValue());
		Assert.assertEquals(cvHP.exportDocument(), true);
	}
	
	@AfterMethod
	public void tearDown() 
	{
		//driver.quit();
	}

}
