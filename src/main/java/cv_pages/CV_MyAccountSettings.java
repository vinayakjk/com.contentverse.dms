package cv_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CV_MyAccountSettings 
{

	//ClickMyAccount
	@FindBy(xpath = "//h3[contains(text(),'My Account')]")
	WebElement clickMyAccount;
	
	//lblMyAccount
	@FindBy(xpath = "//h3[text()='My Account']")
	WebElement lblMyAccount;
	
	//ClickLogout
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	WebElement lblLogout;
	
	//ClickwhatsNew
	@FindBy(xpath = "//a[@id='whatsNew']")
	WebElement lblWhatsNew;
	
	//ClickhelpLink
	@FindBy(xpath = "//a[@id='helpLink']")
	WebElement lblHelplink;
	
	//ClickexportDocumentList
	@FindBy(xpath = "//a[@id='exportDocumentList']")
	WebElement lblExport;
	
	//ClickOfflineDocuments
	@FindBy(xpath = "//a[@id='syncDocuments']")
	WebElement lblOfflineDocuments;
	
	//ClickDocuSignDocuments
	@FindBy(xpath = "//a[@id='DocuSignDocuments']")
	WebElement lblDocuSignDocuments;
	
	//ClickDownloadDragAndDrop
	@FindBy(xpath = "//a[@id='downloadDragAndDropMsi']")
	WebElement lblDownloadDragAndDrop;
	
	//ClickCloseBtn
	@FindBy(xpath = "//a[@id='idsettingsclosebtn']")
	WebElement btnIdSettingsClose;
	
	
	
	
}
