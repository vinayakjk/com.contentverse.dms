package cv_testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cv_pages.CV_HomePage;
import cv_pages.CV_LoginPage;

public class CV_ExportContentTest extends Base
{
	WebDriver driver;
	CV_LoginPage cvLP;
	CV_HomePage cvHP;
	
	@BeforeMethod
	public void initalization() throws Exception
	{
		 driver = launchBrowser();
		 cvLP = new CV_LoginPage(driver);
		 cvHP = new CV_HomePage(driver);
	}
	
	@Test
	public void exportDocument() throws Exception
	{
		cvLP.login_cvWeb(getUsername(), getPassword(), getRoom());
		//Thread.sleep(3000);
		cvHP.listOfCabinatesPresentInDataBase(getCabinetName());
		//cv_HP.listOfDrawersPresentInCabinet();
		
		cvHP.selectDrawerPresentInCabinet(getDrawerName());
		//cv_HP.listOfFoldersPresentInDrawer();
				
		//Thread.sleep(2000);
		cvHP.selectFolderPresentInDrawer(getFolderName());
				
		cvHP.selectDocument();
		//cvHP.selectAllDocuments();
		Assert.assertEquals(cvHP.exportDocument(), true);
	}
}
