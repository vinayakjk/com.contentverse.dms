package cv_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CV_NewDocument {// Web Element added - 01/03/2024

	@CacheLookup
	// Cabinet
	@FindBy(xpath = "//*[contains(text(), 'New Cabinet')]/ancestor::li/ins[@class='jstree-icon']")
	WebElement UserCabinet; // New Cabinet

	// Drawer
	@FindBy(xpath = "//*[contains(text(), 'Amol')]/ancestor::li/ins[@class='jstree-icon']")
	WebElement UserDrawer; // Amol

	// Folder
	@FindBy(xpath = "//*[contains(text(), 'QA_Test')]")
	WebElement UserFolder; // QA_Test

	// File opening loader
	@FindBy(xpath = "(//div[@class='spinner-border spinner-border-lg'])[2]")
	WebElement Loader;

	// Document Checkbooks
	@FindBy(xpath = "//span[@class='checkmark']")
	WebElement ChkbxDocument;

	// Menu New Document
	@FindBy(xpath = "//a[@id='createDocument']")
	WebElement MenuNewDocument;

	// After click on New Document Menu
	// Destination Folder
	@FindBy(xpath = "//input[@id='createDocuemtnLocation']")
	WebElement TxtDestinationFolder;

	// Document Type
	@FindBy(xpath = "//select[@id='docTypeList']")
	WebElement DdDoctype;

	// Retain button
	@FindBy(xpath = "//input[@id='retainBtn']")
	WebElement ChkbxRetain;

	// Folder Create Button
	@FindBy(xpath = "//button[@id='createDocumentSubmit']")
	WebElement BtnCreate;

	// Folder Cancel Button
	@FindBy(xpath = "createDocumentClear")
	WebElement BtnClear;

	// After click on Create Button
	// Navigate button
	@FindBy(xpath = "//button[@id='modelHome'][text()='Navigate']")
	WebElement BtnNavigate;

	// View Button
	@FindBy(xpath = "//button[@id='viewCreatedDocument'][text()='View ']")
	WebElement BtnViewElement;

	// New Button
	@FindBy(xpath = "//button[@id='modelNewDocument'][text()='New']")
	WebElement BtnNew;

	// After clicking view button
	// Send to Workflow Button
	@FindBy(xpath = "//span[@id='viewSendToWrkflw'][text()='Send To Workflow...']")
	WebElement BtnSendToWorkflow;

	// Document Type
	@FindBy(xpath = "//select[@id='viewDocumentTypeList']")
	WebElement DdDocumentTypElement;

	// Properties
	@FindBy(xpath = "//div[@class='elementHeader']/span[text()='Properties']")
	WebElement HeaderProperties;

	// Update Button
	@FindBy(xpath = "//a[@id='editproperties_983'][text()='Update']")
	WebElement BtnUpdate;

	// After click on Update button
	// Save button
	@FindBy(xpath = "//a[@id='saveproperties_1016']")
	WebElement BtnSave;

	// Cancel Button
	@FindBy(xpath = "//a[@id='cancelproperties_1016']")
	WebElement BtnCancel;

	// Authors List
	@FindBy(xpath = "//input[@id='indicesViewText_1']")
	WebElement DdAuthorsList;

	// Comments
	@FindBy(xpath = "//span[text()='Comments ']")
	WebElement HeaderComments;

	// After click on Comments
	// Search Box
	@FindBy(xpath = "//input[@id='commentsInput']")
	WebElement TxtSearchBox;

	// Add Comment
	@FindBy(xpath = "//button[@id='addComment']")
	WebElement BtnAddComment;

	// Close Button
	@FindBy(xpath = "//button[@id='cancelComments']")
	WebElement BtnClose;

	// Close
	@FindBy(xpath = "//span[@id='commentsModalClose']")
	WebElement Close;

	// References
	@FindBy(xpath = "//span[@id='referenceView_1016']")
	WebElement HeaderReferences;

	// After click on References
	// Close
	@FindBy(xpath = "//div[@class='jconfirm-buttons']/button[@class='btn btn-default'][text()='Cancel']")
	WebElement BtnReferencesCancel;

	// Versions
	@FindBy(xpath = "//span[text()='Versions']")
	WebElement HeaderVersions;

	// After click on Versions
	// Set Active Version
	@FindBy(xpath = "//a[@id='setVersions_1016']")
	WebElement BtnSetActiveVersion;

	// Delete All Versions
	@FindBy(xpath = "//a[@id='delVersions_1016']")
	WebElement BtnDeleteAllVersions;

	// Comments
	@FindBy(xpath = "//a[@id='CommentVersion_1016']")
	WebElement BtnComments;

	// General
	@FindBy(xpath = "//span[text()='General']")
	WebElement HeaderGeneral;

	// After click on General
	// Full Text Search
	@FindBy(xpath = "//a[@id='fullTextSearch_1016']")
	WebElement BtnFullTextSearch;

	// History
	@FindBy(xpath = "//span[text()='History']")
	WebElement HeaderHistory;

	// After Click on History
	// Excel Export
	@FindBy(xpath = "//div[@class='e-toolbar-item'][@title='Excel Export']")
	WebElement ExportExcel;

	// PDF Export
	@FindBy(xpath = "//div[@class='e-toolbar-item'][@title='PDF Export']")
	WebElement PdfExport;

	// Search bar
	@FindBy(xpath = "//input[@id='historyConfirm_searchbar']")
	WebElement HistorySearchBar;

	// Print All
	@FindBy(xpath = "//button[@class='btn modalDialogButtons']")
	WebElement BtnPrintAll;

	// Cancel
	@FindBy(xpath = "//div[@class='jconfirm-buttons']/button[@class='btn btn-default']")
	WebElement BtnHistoryCancel;

	// After click on New button
	// Plus icon
	@FindBy(xpath = "//div[@id='addPagesDropDown']")
	WebElement DdPlusIcon;

	// Browse
	@FindBy(xpath = "//input[@id='viewDocumentAddPages']")
	WebElement Browse;

	// Camera
	@FindBy(xpath = "//div[@id='fileUploadComp']")
	WebElement Camera;

	// Scan
	@FindBy(xpath = "//div[@id='scan']")
	WebElement Scan;

	// New Word Document
	@FindBy(xpath = "//div[@id='addWordFile']")
	WebElement NewWordDocument;

	// Enter File Name
	@FindBy(xpath = "//input[@id='newTemplateFileName']")
	WebElement TxtNewDocumentEnterFileName;

	// Ok Button
	@FindBy(xpath = "//button[@id='templateOK']")
	WebElement BtnNewDocumentOk;

	// Cancel Button
	@FindBy(xpath = "//button[@id='templateCanel']")
	WebElement BtnNewDocumentCancel;

	// Close Navigation
	@FindBy(xpath = "//span[@id='navigatorModelCloseTemplate9']")
	WebElement BtnNewDocumentClose;

	// After Click on Ok
	// Loader
	@FindBy(xpath = "(//div[text()='Adding page(s)...'][@id='progressMsg'])[2]")
	WebElement LoaderNewDocument;

	// New Excel Spreadsheet
	@FindBy(xpath = "//div[@id='addExcelFile']")
	WebElement NewExcelSpreadsheet;

	// New PDF Document
	@FindBy(xpath = "//div[@id='addPdfFile']")
	WebElement NewPdfDocument;

	// Fab Menu Button
	@FindBy(xpath = "//i[@id='fabButton'][@class='fa fa-bars']")
	WebElement BtnFabMenu;
	
	// Fab Save Button
	@FindBy(xpath = "//i[@id='saveFabButton']")
	WebElement BtnFabSaveDocument;
	
	//Fab Delete Button 
	@FindBy(xpath = "//i[@id='deleteFabButton']")
	WebElement BtnFabDeleteDocument;
	
	//Fab Upload Button 
	@FindBy(xpath = "//i[@id='uploadFabButton']")
	WebElement BtnFabploadDocument;
	
	//Fab Full Screen View 
	@FindBy(xpath = "//i[@id='fullScreenFabButton']")
	WebElement BtnFabFullScreenView;
	
			
}

