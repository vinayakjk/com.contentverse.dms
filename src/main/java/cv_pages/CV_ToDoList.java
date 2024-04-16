package cv_pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cv_resources.Utility;

public class CV_ToDoList extends Utility {

	WebDriver driver;

	public CV_ToDoList(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// WebElement added on 28/02/2024 --Mayur
	// First visit on ToDoList.
	@FindBy(xpath = "//a[@id='myTaskMenu']")
	WebElement MenuToDoList;

	// new items.
	@FindBy(xpath = "//a[@id='newItems']")
	WebElement SubMenuNewItems;

	// search
	@FindBy(xpath = "//input[@id='searchTree']")
	WebElement txtserachtodolist;

	// Pending items
	@FindBy(xpath = "//a[@id='todoPending']")
	WebElement SubMenupendingItems;

	// Reviewed items
	@FindBy(xpath = "//a[@id='todoReviewed']")
	WebElement SubMenuReviewedItems;

	// All items
	@FindBy(xpath = "//a[@id='todoAll']")
	WebElement SubMenuAllItems;

	// Sent items
	@FindBy(xpath = "//a[@id='todoSentItems']")
	WebElement SubMenusentitem;

	// Custom columns
	@FindBy(xpath = "//a[@id='todoCustomColumns']")
	WebElement SubMenucustomColumns;

	// Reset columns
	@FindBy(xpath = "//a[@id='todoResetColumns']")
	WebElement SubMenuRecetColumns;

	// search box
	@FindBy(xpath = "//input[@class='custom-input']")
	WebElement Clicksearch;

	// ok button
	@FindBy(xpath = "//button[@id='CustomListTodoOK']")
	WebElement btncustomsave;

	// Cancel button
	@FindBy(xpath = "//button[@id='CustomListTodoCancel']")
	WebElement btncustomcancel;

	// Document (After selecting Document)

	// @FindBy(xpath = "//a[@id='documentListSubMenu']")
	// WebElement clickDocument;

	@FindBy(xpath = "//a[@id='multipleViewer']")
	WebElement ClickView;

	@FindBy(xpath = "//a[@id='cutid']")
	WebElement clickCutDocument;

	@FindBy(xpath = "//a[@id='copyId']")
	WebElement clickCopyDocument;

	@FindBy(xpath = "//a[@id='pasteid']")
	WebElement clickpasteDocument;

	@FindBy(xpath = "//a[@id='docReferencePaste']")
	WebElement clickpasteasrefr;

	@FindBy(xpath = "//a[@id='referenceBtn']")
	WebElement ClickReferences;

	@FindBy(xpath = "//a[@id='delDocument']")
	WebElement ClickDelete;

	@FindBy(xpath = "//a[@id='documentcreatefav']")
	WebElement ClickCrFavorites;

	@FindBy(xpath = "//a[@id='documentSendTo']")
	WebElement Clicksendto;

	// click on send to mail --> SubMenu--> mail

	@FindBy(xpath = "//a[@id='sendToMail']")
	WebElement ClickonMail;

	// click on send to mail --> SubMenu--> mail-->print

	@FindBy(xpath = "//a[@id='sendToPrint']")
	WebElement Clickprint;

	// click on send to mail --> SubMenu--> mail-->Export
	@FindBy(xpath = "//a[@id='sendToExport']")
	WebElement ClickDExport;

	//// click on send to mail --> SubMenu--> mail-->SecureLink
	@FindBy(xpath = "//a[text()='Secure Link...'][1]")
	WebElement ClickSecureLink;

	// click on send to mail --> SubMenu--> mail-->Generate Document Link
	@FindBy(xpath = "//a[@id='generateDocumentLink']")
	WebElement ClickGenerateDocLink;

	@FindBy(xpath = "//div[@id='workflowModel']")
	WebElement WindowWorkFLowModel;

	@FindBy(xpath = "//button[@id='wfactionOk']")
	WebElement btnokworkflowaccept;

	@FindBy(xpath = "//textarea[@id='wfcomments']")
	WebElement txtAreaComment;

	@FindBy(xpath = "//a[@id='reject']")
	WebElement btnrejectWorkflow;

	@FindBy(xpath = "//a[@id='endwf']")
	WebElement btnEndWorkflow;

	@FindBy(xpath = "//a[@id='accept']")
	WebElement btnacceptworkFlow;

	@FindBy(xpath = "//div[@id='ownershipMessageModel']")
	WebElement WinDocumentInWF;

	@FindBy(xpath = "//button[@id='ownershipMessageModelOk']")
	WebElement btnOkDocumentInWF;

	@FindBy(xpath = "(//td[@class=' customDocName'])[1]")
	WebElement clickondocument;

	@FindBy(xpath = "(//*[contains(text(), 'SCL')]/ancestor::li/ins[@class='jstree-icon'])[1]")
	WebElement IconPlusCabinet;

	@FindBy(xpath = "(//*[contains(text(), 'SCL')]/ancestor::li/ins[@class='jstree-icon'])[2]")
	WebElement IconPlusDrawer;

	@FindBy(linkText = "SCLUpload")
	WebElement FolderNameWord;

	@FindBy(linkText = "SalesReportPDF_26_03") // SalesReportPDF
	WebElement FolderNamePDF;

	@FindBy(xpath = "//input[@id='tableFilter']")
	WebElement searchbarPdfDocument;

	@FindBy(xpath = "//td[@class=' customDocName']")
	WebElement clickDocument;

	@FindBy(xpath = "//select[@id='docTypeList']")
	WebElement ddDocumenttype;

	@FindBy(xpath = "//button[@id='createDocumentSubmit']")
	WebElement btnCreateDocument;

	@FindBy(xpath = "//input[@id='retainBtn']")
	WebElement chkRetain;

	@FindBy(xpath = "//input[@id='indices_5']")
	WebElement txtReportName;

	@FindBy(xpath = "(//div[@class='spinner-border spinner-border-lg'])[2]")
	WebElement DocumentUploadloader;

	@FindBy(xpath = "//button[@id='modelNewDocument']")
	WebElement btnNewDocument;

	@FindBy(xpath = "//span[@id='createDocumentMessage']")
	WebElement FileUploadlblMessage;

	@FindBy(xpath = "//span[normalize-space()='History']")
	WebElement tabhistory;

	@FindBy(xpath = "(//td[@class='e-rowcell'])[3]")
	WebElement historymsg;

	@FindBy(xpath = "//*[@id='documentListTable']/tbody/tr[1]/td[3]")
	WebElement clickOnDocument;

	public WebElement findDocumentElementtxt(String linkText) {
		return driver.findElement(By.xpath("//*[contains(text(), '" + linkText + "')]"));
	}


	public void openDocs() throws InterruptedException 
	{
		IconPlusCabinet.click();
		IconPlusDrawer.click();
		isVisible(FolderNameWord, 15);
		FolderNameWord.click();
		Thread.sleep(2000);
	}

	public void To_Do_List(String DocumentName, String Status, String UserName) throws InterruptedException 
	{
		moveToElement(MenuToDoList);
		SubMenuNewItems.click();
		 //findDocumentElementtxt(DocumentName).click();
			try 
			{
			  findDocumentElementtxt(DocumentName).click();	
			} 
			catch (Exception e) 
				{
					moveToElement(MenuToDoList);
					SubMenupendingItems.click();
					findDocumentElementtxt(DocumentName).click();
				}
			
		
		
		
		isDisaplyedW(btnacceptworkFlow, 10);

		if (Status.contains("Accept")) 
		{
			btnacceptworkFlow.click();
			isDisaplyedW(WindowWorkFLowModel, 10);
			txtAreaComment.sendKeys("This Done by Automation");
			btnokworkflowaccept.click();
		
			Thread.sleep(3000);
			openDocs();
			Thread.sleep(2000);
			clickOnDocument.click();
			Thread.sleep(2000);
			
			if (WinDocumentInWF.isDisplayed() == true) 
			{
				btnOkDocumentInWF.click();
			}
			Thread.sleep(3000);
			tabhistory.click();
			Thread.sleep(3000);
			String verifymsghistory = historymsg.getText();
			if (verifymsghistory.equals("Document has been Approved by " + UserName)) 
			{
				System.out.println(verifymsghistory);
			} else 
			{
				Assert.fail("Document Not approved by First User! Actual text: " + verifymsghistory);
			}
		
		}
		if (Status.contains("reject"))
		{
			Thread.sleep(3000);
			btnrejectWorkflow.click();
			Thread.sleep(4000);
			txtAreaComment.sendKeys("This Document rejected by User :- " + UserName);
			btnokworkflowaccept.click();
			Thread.sleep(3000);

		}

		if (Status.contains("End Workflow")) 
		{
			btnrejectWorkflow.click();
			txtAreaComment.sendKeys("This Document rejected by Automation");
			btnokworkflowaccept.click();

		}

	}

}
