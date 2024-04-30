package cv_testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cv_pages.CV_HomePage;
import cv_pages.CV_LoginPage;
import cv_pages.CV_NewDocument;
import cv_pages.CV_VersionPage;

public class CV_Version_TestCase extends Base
{
	CV_LoginPage cvLP;
	CV_HomePage cvHP;
	CV_NewDocument cvND;
	CV_VersionPage cvVP;
	
	@BeforeMethod
	public void initalization() throws Exception
	{
		 launchBrowser();
		 cvLP = new CV_LoginPage(driver);
		 cvHP = new CV_HomePage(driver);
		 cvND = new CV_NewDocument(driver);
		 cvVP = new CV_VersionPage(driver); 
	}
	
	
	@Test
	public void creatExcelDocument() throws Exception
	{
		cvLP.Check_Valid_Credentials(sheet.getRow(5).getCell(3).getStringCellValue(),sheet.getRow(5).getCell(5).getStringCellValue(),
				sheet.getRow(1).getCell(7).getStringCellValue());
		cvHP.listOfCabinatesPresentInDataBase(sheet.getRow(3).getCell(3).getStringCellValue());
		cvHP.selectDrawerPresentInCabinet(sheet.getRow(3).getCell(5).getStringCellValue());
		cvHP.selectFolderPresentInDrawer(sheet.getRow(3).getCell(7).getStringCellValue());
		int beforeCreatingfileTotalFiles = cvHP.documentListInFolder().size();
		cvND.selectTypeToCreateNewDocument("Word");
		int afterCreatingfileTotalFiles = cvHP.documentListInFolder().size();
		Assert.assertTrue(beforeCreatingfileTotalFiles<afterCreatingfileTotalFiles);
		cvVP.Verify_Version("Word");
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
