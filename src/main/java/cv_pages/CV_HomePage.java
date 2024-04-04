package cv_pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cv_resources.Utility;

public class CV_HomePage extends Utility {

	WebDriver driver;
	String CabinateName;
	Actions act;

	public CV_HomePage(WebDriver driver) {
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
	List<WebElement> documentListInFolder;
	
	@FindBy(id = "selectall")
	WebElement chkSelectAll;
	
	@FindBy(xpath = "//td[@class=' customDocName']")
	List<WebElement> listOfAllDocs;
	
	@FindBy(xpath = "//td[text()='Image']")
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

	public void cN() {
		CabinateName = Utility.currentTime();
	}

	public boolean cv_CabinateCreation() throws Exception {

		boolean result = false;
		act = new Actions(driver);
		act.moveToElement(btnDataBaseName).build().perform();
		Thread.sleep(3000);
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
				}
			}

		}
		return result;
	}

	public void cvCreateDrawer() throws Exception {
		btnOnCabinateNamefloatButton.click();
		act = new Actions(driver);
		act.moveToElement(createDrawer).click().build().perform();
		txtEnterDrawerName.sendKeys(Utility.currentTime());
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
					act = new Actions(driver);
					Thread.sleep(5000);
					//System.out.println(listOfCabinates.get(i).getText());
					act.moveToElement(listOfCabinates.get(i)).doubleClick().build().perform();;
					//act.doubleClick(listOfCabinates.get(i)).build().perform();
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
				act = new Actions(driver);
				act.doubleClick(listOfDrawers.get(j)).build().perform();
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
				act = new Actions(driver);
				act.moveToElement(selectFolder.get(k)).click(selectFolder.get(k)).build().perform();
				documentListTable();
			}
		}
	}

	public void documentListTable() throws InterruptedException {
		for (int i = 0; i < documentListInFolder.size(); i++) {
			// cv_PageUtility cv_PU = new cv_PageUtility(driver);
			// cv_PU.isVisible();
			Thread.sleep(3000);
			if (documentListInFolder.get(i).getText().trim().equalsIgnoreCase("No data available in table")) {
				System.out.println(documentListInFolder.get(i).getText());
				System.out.println("TestCase Failed");
			} else {
				System.out.println("Documents in selected folder ---->>" + documentListInFolder.get(i).getText());
			}
		}
	}
	
		public void selectAllDocuments() throws InterruptedException 
		{
			chkSelectAll.click();
			Thread.sleep(3000);
			act.contextClick(documentListBox).perform();
		}

		public void selectDocument() throws InterruptedException 
		{
			driver.findElement(By.xpath("//td[text()='Image']/preceding-sibling::td/label/span")).click();
			isDisaplyedW(txtDocumentName, driver, 2);
			act.contextClick(txtDocumentName);
			
			/*for (int i = 0; i < listOfAllDocs.size(); i++) 
			{
				if (listOfAllDocs.get(i).getText().trim().equalsIgnoreCase(docName)) 
				{
					String doc_name = listOfAllDocs.get(i).getText();
					System.out.println(doc_name);
					Thread.sleep(3000);
					//driver.findElement(By.xpath("//td[text()='${doc_name}']/preceding-sibling::td/label/span")).click();

					//driver.findElement(By.xpath("//td[text()='Image']/preceding-sibling::td/label/span")).click();
					Thread.sleep(3000);
					act.contextClick(txtDocumentName);
				}
			}*/
		}
		
		public boolean exportDocument() throws InterruptedException, IOException {
			boolean testresult = false;
			int afterdownload = 0;
			isDisaplyedW(sendTo, driver, 3);
			act.moveToElement(sendTo).click().build().perform();
			if(sendToExport.isEnabled()) 
			{
				isDisaplyedW(sendToExport, driver, 3);
				sendToExport.click();
				btnOKToExport.click();

				isDisaplyedW(exportInfoMessageBox, driver, 2);
				if (exportInfoMessageBox.getText().trim().equalsIgnoreCase("Error On Download")) 
				{
					System.out.println(exportInfoMessageBox.getText());
					btnOKInMessageBox.click();
				}
				else
				{
					int beforedownload = ifFileAvailable();
					System.out.println(beforedownload);
				
					isInvisible(exportInfoMessageBox, driver, 30);
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
