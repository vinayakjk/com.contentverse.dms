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
		cvLP.Check_Valid_Credentials(getValidUsername(), getValidPassword(),getRoom());
		cvHP.listOfCabinatesPresentInDataBase(getCabinetName());
		cvHP.selectDrawerPresentInCabinet(getDrawerName());
		cvHP.selectFolderPresentInDrawer(getFolderName());
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
