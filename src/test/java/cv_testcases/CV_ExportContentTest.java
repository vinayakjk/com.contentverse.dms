package cv_testcases;

import org.openqa.selenium.WebDriver;
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
		cvLP.Check_Valid_Credentials(getValidUsername(), getValidPassword(), getRoom());
		// Thread.sleep(3000);
		cvHP.listOfCabinatesPresentInDataBase(getCabinetName());
		// cv_HP.listOfDrawersPresentInCabinet();

		cvHP.selectDrawerPresentInCabinet(getDrawerName());
		// cv_HP.listOfFoldersPresentInDrawer();

		// Thread.sleep(2000);
		cvHP.selectFolderPresentInDrawer(getFolderName());
		cvHP.documentListTable();
		cvHP.selectDocument();
		Assert.assertEquals(cvHP.exportDocument(), true);
	}

	@Test
	public void exportAllDocument() throws Exception {
		cvLP.Check_Valid_Credentials(getValidUsername(), getValidPassword(), getRoom());
		// Thread.sleep(3000);
		cvHP.listOfCabinatesPresentInDataBase(getCabinetName());
		// cv_HP.listOfDrawersPresentInCabinet();

		cvHP.selectDrawerPresentInCabinet(getDrawerName());
		// cv_HP.listOfFoldersPresentInDrawer();

		// Thread.sleep(2000);
		cvHP.selectFolderPresentInDrawer(getFolderName());
		cvHP.documentListTable();
		cvHP.selectAllDocuments();
		Assert.assertEquals(cvHP.exportDocument(), true);
	}

	@Test
	public void exportUserSpecifiedDocument() throws Exception {
		cvLP.Check_Valid_Credentials(getValidUsername(), getValidPassword(), getRoom());
		// Thread.sleep(3000);
		cvHP.listOfCabinatesPresentInDataBase(getCabinetName());
		// cv_HP.listOfDrawersPresentInCabinet();

		cvHP.selectDrawerPresentInCabinet(getDrawerName());
		// cv_HP.listOfFoldersPresentInDrawer();

		// Thread.sleep(2000);
		cvHP.selectFolderPresentInDrawer(getFolderName());
		cvHP.documentListTable();
		cvHP.selectMultipleDocuments(CabinateName, Act_Msg);
		Assert.assertEquals(cvHP.exportDocument(), true);
	}

	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
