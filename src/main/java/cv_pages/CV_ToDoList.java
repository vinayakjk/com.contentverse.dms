package cv_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CV_ToDoList {

	//WebElement added on 28/02/2024 --Mayur
	// First visit on ToDoList.
	@FindBy(xpath = "//a[@id='myTaskMenu']")
	WebElement MenuToDoList;

	//new items.
	@FindBy(xpath = "//a[@id='newItems']")
	WebElement SubMenuNewItems;
	
	//search 
	@FindBy(xpath = "//input[@id='searchTree']")
	WebElement txtserachtodolist;

	//Pending items
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
	
	//search box
	@FindBy(xpath = "//input[@class='custom-input']")
	WebElement Clicksearch;
	
	//ok button
	@FindBy(xpath = "//button[@id='CustomListTodoOK']")
	WebElement btncustomsave;
	
	//Cancel button
	@FindBy(xpath = "//button[@id='CustomListTodoCancel']")
     WebElement btncustomcancel;
	
	
	
	
	
	// Document (After selecting Document)
	
	
	@FindBy(xpath = "//a[@id='documentListSubMenu']")
    WebElement clickDocument;
	
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
	
	//click on send to mail --> SubMenu--> mail
	
	@FindBy(xpath = "//a[@id='sendToMail']")
    WebElement ClickonMail;
	
	//click on send to mail --> SubMenu--> mail-->print
	
	@FindBy(xpath = "//a[@id='sendToPrint']")
    WebElement Clickprint;
	
	//click on send to mail --> SubMenu--> mail-->Export
	@FindBy(xpath = "//a[@id='sendToExport']")
    WebElement ClickDExport;
	
	////click on send to mail --> SubMenu--> mail-->SecureLink
	@FindBy(xpath = "//a[text()='Secure Link...'][1]")
    WebElement ClickSecureLink;
	
    //click on send to mail --> SubMenu--> mail-->Generate Document Link
	@FindBy(xpath = "//a[@id='generateDocumentLink']")
    WebElement ClickGenerateDocLink;
	
	
	//click on send to mail --> SubMenu--> mail-->ClickUplodAmazoneS3
		@FindBy(xpath = "")
	    WebElement ClickUplodAmazoneS3;
	
	
	
	
	
	
	
	
}
