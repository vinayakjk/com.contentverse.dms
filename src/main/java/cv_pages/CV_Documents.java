package cv_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CV_Documents {

	
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
		//	@FindBy(xpath = "")
		   // WebElement ClickUplodAmazoneS3;
		
		
	
	
	
}
