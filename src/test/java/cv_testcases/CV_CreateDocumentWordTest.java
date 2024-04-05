package cv_testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cv_pages.CV_HomePage;
import cv_pages.CV_LoginPage;
import cv_pages.CV_NewDocument;

public class CV_CreateDocumentWordTest extends Base
{

	CV_LoginPage cvLP;
	CV_HomePage cvHP;
	CV_NewDocument cvND;
	
		
	@BeforeMethod
	public void initalization() throws Exception
	{
		 launchBrowser();
		 cvLP = new CV_LoginPage(driver);
		 cvHP = new CV_HomePage(driver);
		 cvND = new CV_NewDocument(driver);
	}
	@Test
	
	public void createWordDocument() throws Exception
	{
		cvLP.Check_Valid_Credentials(getValidUsername(), getValidPassword(),getRoom());
		cvHP.listOfCabinatesPresentInDataBase(getCabinetName());
		cvHP.selectDrawerPresentInCabinet(getDrawerName());
		cvHP.selectFolderPresentInDrawer(getFolderName());
		cvND.selectTypeToCreateNewDocument();
		//cvND.NewWorkDocument();
	}
	
}
