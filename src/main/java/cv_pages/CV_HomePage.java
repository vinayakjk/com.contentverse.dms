package cv_pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import cv_resources.Utility;

public class CV_HomePage extends Utility {

	WebDriver driver;
	String CabinateName;
	Actions act;

	public CV_HomePage(WebDriver driver) {
		
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "navigationMenuBtn")
	WebElement btnDataBaseName;

	@FindBy(id = "createNodeAnchorForCabinet")
	WebElement createCabinate;

	// @FindBy(id= "//a[@id='createNodeAnchorForCabinet' and @class='disabled']")
	// WebElement createCabinateDisable;

	@FindBy(id = "createNodeAnchor")
	WebElement createDrawer;

	@FindBy(id = "newNodeName13")
	WebElement txtEnterCabinateName;

	@FindBy(id = "newNodeName")
	WebElement txtEnterDrawerName;

	@FindBy(id = "createNewNodeOk13")
	WebElement btnOKCreateCabinate;

	@FindBy(id = "createNewNodeOk")
	WebElement btnOKCreateDrwaer;

	@FindBy(xpath = "//div[@id='viewDocumentnavigator']/ul/li")
	List<WebElement> listOfCabinates;

	@FindBy(xpath = "//div[@id='viewDocumentnavigator']//ul//ul//li")
	List<WebElement> listOfDrawers;

	@FindBy(id = "floatButton")
	WebElement btnOnCabinateNamefloatButton;

	@FindBy(xpath = "//li[@rel='cabinet' and @class='jstree-open jstree-last']")
	WebElement minusbtn;

	@FindBy(xpath = "//div[@id='viewDocumentnavigator']//ul//ul//ul//li")
	List<WebElement> listOfFolders;

	@FindBy(xpath = "//div[@id='viewDocumentnavigator']//ul//ul//ul//li//a")
	List<WebElement> selectFolder;

	@FindBy(id = "documentListDiv")
	WebElement documentListBox;

	@FindBy(xpath = "//table[@id='documentListTable']//tbody")
	WebElement documentListInFolder;
	
	@FindBy(xpath = "//table[@id='documentListTable']//tbody//td[contains(@class,'customDocName')]")
	List<WebElement> docsInFolder;
	
	@FindBy(id = "selectall")
	WebElement chkSelectAll;
	
	@FindBy(xpath = "//td[@class=' customDocName']")
	List<WebElement> listOfAllDocs;
	
	@FindBy(xpath = "//td[text()='ODTFILE']")
	WebElement txtDocumentName;
	
	@FindBy(xpath = "//a[@id='documentSendTo']")
	WebElement sendTo;

	@FindBy(id = "sendToExport")
	WebElement sendToExport;
	
	@FindBy(id = "detailsBlock")
	WebElement exportInfoBox;

	@FindBy(id = "saveSendToDocument")
	WebElement btnOKToExport;

	@FindBy(id = "messageBoxFD")
	WebElement exportInfoMessageBox;
	
	@FindBy(id = "messageButtonOKFD")
	WebElement btnOKInMessageBox;
	
	@FindBy(xpath = "//a[@id='advSearchMenuBtn']")
	WebElement btnAdvanceSearch;
	
	@FindBy(xpath = "//div[@id='progressModel' and @class='cvModel']")
	WebElement msgInitializing;
	
	public void cN() {
		CabinateName = currentTime();
	}

	public boolean cv_CabinateCreation() throws Exception {

		boolean result = false;
		act = new Actions(driver);
		act.moveToElement(btnDataBaseName).build().perform();
		Thread.sleep(3000);
//<<<<<<< HEAD
		if (createCabinate.getAttribute("class").equalsIgnoreCase("disabled")) 
			{
				// act.moveToElement(createCabinate).click().build().perform();
				System.out.println("User not having permission");

		
			}
		else 
			{
			 System.out.println("User is having permission");
			 act.moveToElement(createCabinate).click().build().perform();
			 cN();
			 txtEnterCabinateName.sendKeys("CV_" + CabinateName);
			 btnOKCreateCabinate.click();
			 //listOfCabinates.siz
			for (int i = 0; i < listOfCabinates.size(); i++) 
			{
				if (listOfCabinates.get(i).getText().trim().equalsIgnoreCase("CV_" + CabinateName)) 
				{
					{
						listOfCabinates.get(i).click();
						result = true;
						break;
					}
/*					
=======

if (createCabinate.getAttribute("class").equalsIgnoreCase("disabled")) {
			// act.moveToElement(createCabinate).click().build().perform();
			//System.out.println("User not having permission");

		} else {
			//System.out.println("User is having permission");
			act.moveToElement(createCabinate).click().build().perform();

		}

		cN();
		txtEnterCabinateName.sendKeys("CV_" + CabinateName);
		btnOKCreateCabinate.click();
		for (int i = 0; i < listOfCabinates.size(); i++) {
			if (listOfCabinates.get(i).getText().trim().equalsIgnoreCase("CV_" + CabinateName)) {
				{
					listOfCabinates.get(i).click();
					result = true;
					break;
>>>>>>> CreateCabinateDrwaer
*/
				}

			}

		}
		return result;
	}

//<<<<<<< HEAD
	
public void cvCreateDrawer() throws Exception {

		btnOnCabinateNamefloatButton.click();
		act = new Actions(driver);
		act.moveToElement(createDrawer).click().build().perform();
		txtEnterDrawerName.sendKeys(currentTime());
		btnOKCreateDrwaer.click();
		Thread.sleep(2000);
		Assert.assertEquals(minusbtn.isDisplayed(), true);
	}
	
	public void listOfCabinatesPresentInDataBase(String CabinateName) throws InterruptedException 
	{
		Thread.sleep(5000);
		for (int i = 0; i < listOfCabinates.size(); i++) 
		{
				if (listOfCabinates.get(i).getText().trim().equalsIgnoreCase(CabinateName)) 
				{
					String Cabinate_Name = listOfCabinates.get(i).getText();
					//System.out.println(Cabinate_Name);
					moveToElementAndDoubleClick(listOfCabinates.get(i));
					Thread.sleep(5000);
				}
		}
	}

	public void listOfDrawersPresentInCabinet() throws InterruptedException 
	{
		for (int j = 0; j < listOfDrawers.size(); j++) 
		{
			System.out.println(listOfDrawers.get(j).getText());
		}
	}

	public void selectDrawerPresentInCabinet(String DrawerName) throws InterruptedException 
	{
		for (int j = 0; j < listOfDrawers.size(); j++) 
		{
			if (listOfDrawers.get(j).getText().trim().equalsIgnoreCase(DrawerName)) 
			{
				doubleClick(listOfDrawers.get(j));
			}
		}
	}

	public void listOfFoldersPresentInDrawer() throws InterruptedException 
	{
		for (int k = 0; k < listOfFolders.size(); k++) 
		{
			System.out.println("---->>" + listOfFolders.get(k).getText());
		}
	}

	public void selectFolderPresentInDrawer(String FolderName) throws InterruptedException 
	{
		for (int k = 0; k < listOfFolders.size(); k++) 
		{
			if (listOfFolders.get(k).getText().trim().equalsIgnoreCase(FolderName)) 
			{
				isDisaplyedW(selectFolder.get(k), 3);
				moveToElementAndClick(selectFolder.get(k));
			}
		}
	}

	public boolean documentListTable() throws InterruptedException 
	{
		boolean documentListTable = false;
			if (documentListInFolder.getText().trim().equalsIgnoreCase("No data available in table")) 
			{
				System.out.println(documentListInFolder.getText());
				Assert.assertEquals(documentListTable, true);
				
			} else 
			{
				for (int i = 0; i<docsInFolder.size(); i++)
				{
					//System.out.println(docsInFolder.size());
					System.out.println(docsInFolder.get(i).getText());
					documentListTable = true;	
				}		
			}
		return documentListTable;
	}
	
		public void selectAllDocuments() throws InterruptedException 
		{
			chkSelectAll.click();
			isDisaplyedW(documentListBox, 3);
			moveToElementAndContextClick(documentListBox);
		}

		public void selectDocument() throws InterruptedException 
		{
			driver.findElement(By.xpath("//td[text()='ODTFILE']/preceding-sibling::td/label/span")).click();
			isDisaplyedW(txtDocumentName, 2);
			moveToElementAndContextClick(txtDocumentName);
			Thread.sleep(2000);
		}
		public void selectMultipleDocuments(String docName1, String docName2) throws InterruptedException 
		{
				List<WebElement> DocName1 = driver.findElements(By.xpath("//td[contains(text(),'"+docName1+"')]/preceding-sibling::td/label/span"));
				for(int i=0; i<DocName1.size(); i++)
				{
					DocName1.get(i).click();
					isInvisible(msgInitializing,10);
				}
				List<WebElement> DocName2 = driver.findElements(By.xpath("//td[contains(text(),'"+docName2+"')]/preceding-sibling::td/label/span"));
				for(int i=0; i<DocName2.size(); i++)
				{
					DocName2.get(i).click();
				}
		}
		public boolean exportDocument() throws InterruptedException, IOException {
			boolean testresult = false;
			int afterdownload = 0;
			isDisaplyedW(sendTo,2);
			moveToElementAndClick(sendTo);
			if(sendToExport.getAttribute("class").equalsIgnoreCase("enabled"))
			{
				isDisaplyedW(sendToExport,3);
				sendToExport.click();
				btnOKToExport.click();

				isDisaplyedW(exportInfoMessageBox,2);
				if (exportInfoMessageBox.getText().trim().equalsIgnoreCase("Error On Download")) 
				{
					System.out.println(exportInfoMessageBox.getText());
					btnOKInMessageBox.click();
				}
				else
				{
					int beforedownload = ifFileAvailable();
					System.out.println(beforedownload);
				
					isInvisible(exportInfoMessageBox,30);
					afterdownload = ifFileAvailable();
					System.out.println(afterdownload);
					if(beforedownload<afterdownload)
					{
						System.out.println("File downloaded successfully");
						testresult = true;
					}
					else
					{
						System.out.println("File is not downloaded");
					}
				}
			}
			else {
				System.out.println("Export option is disabled");
			}
			return testresult;
		}
		public void advanceSearch() throws InterruptedException
		{
			Thread.sleep(3000);
			btnAdvanceSearch.click();
		}
}
