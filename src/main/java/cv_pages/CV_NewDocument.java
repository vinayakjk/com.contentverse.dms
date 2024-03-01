package cv_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CV_NewDocument 
{//Web Element added - 01/03/2024
	
	@CacheLookup
	//Cabinet
	@FindBy(xpath = "//*[contains(text(), 'New Cabinet')]/ancestor::li/ins[@class='jstree-icon']")
	WebElement usercabinet; //New Cabinet
	
	//Drawer
	@FindBy(xpath = "//*[contains(text(), 'Amol')]/ancestor::li/ins[@class='jstree-icon']")
	WebElement userdrawer; //Amol
	
	//Folder
	@FindBy(xpath = "//*[contains(text(), 'QA_Test')]")
	WebElement userfolder; //QA_Test
	
	//File opening loader
	@FindBy(xpath = "(//div[@class='spinner-border spinner-border-lg'])[2]")
	WebElement loader;
	
	//Document Checkbooks
	@FindBy(xpath = "//span[@class='checkmark']")
	WebElement chkbxdocument;
	
	//New Document
	@FindBy(xpath = "//a[@id='createDocument']")
	WebElement menunewdocument;
	
	//Destination Folder
	@FindBy(xpath = "//input[@id='createDocuemtnLocation']")
	WebElement txtdestinationfolder;
	
	//Document Type
	@FindBy(xpath = "//select[@id='docTypeList']")
	WebElement dddoctype;
	
	//Retain button
	@FindBy(xpath = "//input[@id='retainBtn']")
	WebElement chkbxretain;
	
	//Folder Create Button 
	@FindBy(xpath = "//button[@id='createDocumentSubmit']")
	WebElement btncreate;
	
	//Folder Cancel Button
	@FindBy(xpath = "createDocumentClear")
	WebElement btnclear;
	
	//Navigate button
	@FindBy(xpath = "//button[@id='modelHome'][text()='Navigate']")
	WebElement btnnavigate;
	
	//View Button
	@FindBy(xpath = "//button[@id='viewCreatedDocument'][text()='View ']")
	WebElement btnviewElement;
	
	//After clicking view button
	
	//Send to Workflow Button
	@FindBy(xpath = "//span[@id='viewSendToWrkflw'][text()='Send To Workflow...']")
	WebElement btnsendtoworkflow;
		
	//Document Type
	@FindBy(xpath = "//select[@id='viewDocumentTypeList']")
	WebElement dddocumenttypElement;
	
	//Properties
	@FindBy(xpath = "//div[@class='elementHeader']/span[text()='Properties']")
	WebElement headerElementproperties;
	
	//Update Button
	@FindBy(xpath = "//a[@id='editproperties_983'][text()='Update']")
	WebElement btnupdate;
	
	//After click on Update button
	//Save button
	@FindBy(xpath = "//a[@id='saveproperties_1016']")
	WebElement btnsave;
	
	//Cancel Button
	@FindBy(xpath = "//a[@id='cancelproperties_1016']")
	WebElement btncancel;
	
	//Authors List
	@FindBy(xpath = "//input[@id='indicesViewText_1']")
	WebElement ddAuthorslist;
	
	//Comments
	@FindBy(xpath = "//span[text()='Comments ']")
	WebElement headercommentsElement;
	
	//After click on Comments
	//Search Box
	@FindBy(xpath = "//input[@id='commentsInput']")
	WebElement txtSearchbox;
	
	//Add Comment
	@FindBy(xpath = "//button[@id='addComment']")
	WebElement btnaddcomment;
	
	//Close Button
	@FindBy(xpath = "//button[@id='cancelComments']")
	WebElement btnclose;
	
	//Close
	@FindBy(xpath = "//span[@id='commentsModalClose']")
	WebElement close;
	
	//References
	@FindBy(xpath = "//span[@id='referenceView_1016']")
	WebElement headerreferences;
	
	//After click on References
	//Close
	@FindBy(xpath = "//div[@class='jconfirm-buttons']/button[@class='btn btn-default'][text()='Cancel']")
	WebElement btnreferencescancel;
	
	//Versions
	@FindBy(xpath = "//span[text()='Versions']")
	WebElement headerversions;
	
	//After click on Versions
	//Set Active Version
	@FindBy(xpath = "//a[@id='setVersions_1016']")
	WebElement btnsetactiveversion;
	
	//Delete All Versions
	@FindBy(xpath = "//a[@id='delVersions_1016']")
	WebElement btndeleteallversions;
	
	//Comments
	@FindBy(xpath = "//a[@id='CommentVersion_1016']")
	WebElement btncomments;
	
	//General
	@FindBy(xpath = "//span[text()='General']")
	WebElement headergeneral;

	//After click on General
	//Full Text Search
	@FindBy(xpath = "//a[@id='fullTextSearch_1016']")
	WebElement btnfulltextsearch;
	
	//History
	@FindBy(xpath = "//span[text()='History']")
	WebElement headerhistory;
	
	//After Click on History
	//Excel Export
	@FindBy(xpath = "//div[@class='e-toolbar-item'][@title='Excel Export']")
	WebElement exportexcel;
	
	//PDF Export
	@FindBy(xpath = "//div[@class='e-toolbar-item'][@title='PDF Export']")
	WebElement pdfexport;
	
	//Search bar
	@FindBy(xpath = "//input[@id='historyConfirm_searchbar']")
	WebElement historySearchbar;
	
	//Print All
	@FindBy(xpath = "//button[@class='btn modalDialogButtons']")
	WebElement btnprintall;
	
	//Cancel
	@FindBy(xpath = "//div[@class='jconfirm-buttons']/button[@class='btn btn-default']")
	WebElement btnhistorycancel;

	//New Button
	@FindBy(xpath = "//button[@id='modelNewDocument'][text()='New']")
	WebElement btnnew;	
	
	//After click on New button
	//Plus icon
	@FindBy(xpath = "//div[@id='addPagesDropDown']")
	WebElement ddplusicon;
	
	//Browse 
	@FindBy(xpath = "//input[@id='viewDocumentAddPages']")
	WebElement browse;

	//Camera
	@FindBy(xpath = "//div[@id='fileUploadComp']")
	WebElement camera;
	
	//Scan
	@FindBy(xpath = "//div[@id='scan']")
	WebElement scan;
	
	//New Word Document
	@FindBy(xpath = "//div[@id='addWordFile']")
	WebElement newworddocument;
	
	//New Excel Spreadsheet
	@FindBy(xpath = "//div[@id='addExcelFile']")
	WebElement newexcelspreadsheet;
	
	//New PDF Document
	@FindBy(xpath = "//div[@id='addPdfFile']")
	WebElement newpdfdocument;
}
