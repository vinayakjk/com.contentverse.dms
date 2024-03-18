package cv_pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cv_resources.Utility;

public class CV_NewDocument 
{
	// Web Elements added in CV_NewDocuments Amol - 04/03/2024

	
	// Clicked on Sundyne 
	    @CacheLookup
	    // Cabinet
	    @FindBy(xpath = "(//*[contains(text(), 'New Cabinet')]/ancestor::li/ins[@class='jstree-icon'])[2]")
	    WebElement iconPlusCabinet; // New Cabinet
	    // Drawer
	    @FindBy(xpath = "(//*[contains(text(), 'Amol')]/ancestor::li/ins[@class='jstree-icon'])[2]")
	    WebElement iconPlusDrawer; // Amol
	    // Folder
	    @FindBy(xpath = "(//*[contains(text(), 'QA_Test')])[2]")
	    WebElement iconFolder; // QA_Test
	    // File opening loader after click on document
	    @FindBy(xpath = "(//div[@id='progressMsg'][text()='Opening document...'])[2]")
	    WebElement loaderFileOpening;
	    // Document Checkbooks
	    @FindBy(xpath = "//span[@class='checkmark']")
	    WebElement chkDocument;
	// Add New Document ----------------------------------------------------------------------------------
	// If Direct Click on New Document
	    
	    @FindBy(xpath = "//a[@id='createDocument']")
	    WebElement menuNewDocument;
	    // After click on New Document Menu - Destination Folder
	    @FindBy(xpath = "//input[@id='createDocuemtnLocation']")
	    WebElement txtDestinationFolder;
	    
	    // Tab Browse For Folder
	    @FindBy(xpath = "//div[@id='nevDiv']")
	    WebElement tabBrowserForFolder;
	    // Cabinet
	    @FindBy(xpath = "//*[contains(text(), 'New Cabinet')]/ancestor::li/ins[@class='jstree-icon']")
	    WebElement iconPlusSelectCabinet; // New Cabinet
	    // Drawer
	    @FindBy(xpath = "//*[contains(text(), 'Amol')]/ancestor::li/ins[@class='jstree-icon']")
	    WebElement iconPlusSelectDrawer; // Amol
	    // Folder
	    @FindBy(xpath = "//*[contains(text(), 'QA_Test')]")
	    WebElement iconSelectFolder; // QA_Test
	    
	    // Search Icon 
	    @FindBy(xpath = "//input[@id='locateNode']//input[@id='createDocuemtnLocation']")
	    WebElement btnSearchBrowseForFolder;
	    
	    // ok Button
	    @FindBy(xpath = "//button[@id='navigatorTreeOk']")
	    WebElement btnOkBrowseForFolder;
	    // Cancle Button
	    @FindBy(xpath = "//button[@id='navigatorTreeCancle']")
	    WebElement btnCancleBrowseForFolder;
	    
	    // Document Type
	    @FindBy(xpath = "//select[@id='docTypeList']")
	    WebElement ddDoctype;
	    // Authors List
	    @FindBy(xpath = "//input[@id='indicesViewText_1']")
	    WebElement txtAuthorsList;
	    // Retain button
	    @FindBy(xpath = "//input[@id='retainBtn']")
	    WebElement chkbxRetain;
	    // Folder Create Button
	    @FindBy(xpath = "//button[@id='createDocumentSubmit']")
	    WebElement btnNewDocCreate;
	    // Loader (Loading...)
	    @FindBy(xpath = "(//div[@id='progressMsg'][text()='Loading...'])[2]")
	    WebElement loaderNewDocCreate;
	    // Folder Cancel Button
	    @FindBy(xpath = "createDocumentClear")
	    WebElement btnClear;
	// After click on Create Button - Label ---------------------------------------------------------------
	    @FindBy(xpath = "//span[@id='createDocumentMessage']")
	    WebElement lblMessage;
	    // Navigate button
	    @FindBy(xpath = "//button[@id='modelHome'][text()='Navigate']")
	    WebElement btnNavigate;
	    // View Button
	    @FindBy(xpath = "//button[@id='viewCreatedDocument'][text()='View ']")
	    WebElement btnView;
	    // New Button
	    @FindBy(xpath = "//button[@id='modelNewDocument'][text()='New']")
	    WebElement btnNew;
	// After clicking view button - Send to Workflow Button -----------------------------------------------
	    @FindBy(xpath = "//span[@id='viewSendToWrkflw'][text()='Send To Workflow...']")
	    WebElement btnSendToWorkflow;
	    // Document Type
	    @FindBy(xpath = "//select[@id='docTypeList']")
	    WebElement ddDocumentType;
	    // Properties
	    @FindBy(xpath = "//div[@class='elementHeader']/span[text()='Properties']")
	    WebElement lblProperties;
	    // Update Button
	    @FindBy(xpath = "//a[@id='editproperties_983'][text()='Update']")
	    WebElement btnUpdate;
	    // After click on Update button - Save button
	    @FindBy(xpath = "//a[@id='saveproperties_1016']")
	    WebElement btnSave;
	    // Cancel Button
	    @FindBy(xpath = "//a[@id='cancelproperties_1016']")
	    WebElement btnCancel;
	    // Comments
	    @FindBy(xpath = "//span[text()='Comments ']")
	    WebElement lblComments;
	    // After click on Comments - Search Box
	    @FindBy(xpath = "//input[@id='commentsInput']")
	    WebElement txtSearchBox;
	    // Add Comment
	    @FindBy(xpath = "//button[@id='addComment']")
	    WebElement btnAddComment;
	    // Close Button
	    @FindBy(xpath = "//button[@id='cancelComments']")
	    WebElement btnClose;
	    // Close
	    @FindBy(xpath = "//span[@id='commentsModalClose']")
	    WebElement Close;
	    // References
	    @FindBy(xpath = "//span[@id='referenceView_1016']")
	    WebElement lblReferences;
	    // After click on References - Close
	    @FindBy(xpath = "//div[@class='jconfirm-buttons']/button[@class='btn btn-default'][text()='Cancel']")
	    WebElement btnReferencesCancel;
	    // Versions
	    @FindBy(xpath = "//span[text()='Versions']")
	    WebElement lblVersions;
	    // After click on Versions - Set Active Version
	    @FindBy(xpath = "//a[@id='setVersions_1016']")
	    WebElement btnSetActiveVersion;
	    // Delete All Versions
	    @FindBy(xpath = "//a[@id='delVersions_1016']")
	    WebElement btnDeleteAllVersions;
	    // Comments
	    @FindBy(xpath = "//a[@id='CommentVersion_1016']")
	    WebElement btnComments;
	    // General
	    @FindBy(xpath = "//span[text()='General']")
	    WebElement lblGeneral;
	    // After click on General - Full Text Search
	    @FindBy(xpath = "//a[@id='fullTextSearch_1016']")
	    WebElement btnFullTextSearch;
	    // History
	    @FindBy(xpath = "//span[text()='History']")
	    WebElement lblHistory;
	    // After Click on History - Excel Export
	    @FindBy(xpath = "//div[@class='e-toolbar-item'][@title='Excel Export']")
	    WebElement btnExportExcel;
	    // PDF Export
	    @FindBy(xpath = "//div[@class='e-toolbar-item'][@title='PDF Export']")
	    WebElement btnPdfExport;
	    // Search bar
	    @FindBy(xpath = "//input[@id='historyConfirm_searchbar']")
	    WebElement txtHistorySearchBar;
	    // Print All
	    @FindBy(xpath = "//button[@class='btn modalDialogButtons']")
	    WebElement btnPrintAll;
	    // Cancel
	    @FindBy(xpath = "//div[@class='jconfirm-buttons']/button[@class='btn btn-default']")
	    WebElement btnHistoryCancel;
	// After click on New button - Plus icon ---------------------------------------------------------------
	    @FindBy(xpath = "//div[@id='addPagesDropDown']")
	    WebElement ddPlusIcon;
	    // Browse
	    @FindBy(xpath = "//input[@id='viewDocumentAddPages']") // (//div[@id='fileUpload'])[2]
	    WebElement ddBrowseButton;
	    // Camera
	    @FindBy(xpath = "//div[@id='fileUploadComp']") //div[@id='fileUploadComp']
	    WebElement ddCameraButton;
	    // Scan
	    @FindBy(xpath = "//div[@id='scan']") //div[@id='scan']
	    WebElement ddScanButton;
	    // New Word Document
	    @FindBy(xpath = "//div[@id='addWordFile']") //addWordFile
	    WebElement ddNewWordDocumentButton;
	    // Enter File Name
	    @FindBy(xpath = "//input[@id='newTemplateFileName']") 
	    WebElement txtNewDocumentEnterFileName;
	    // Ok Button
	    @FindBy(xpath = "//button[@id='templateOK']")
	    WebElement btnNewDocumentOk;
	    // Cancel Button
	    @FindBy(xpath = "//button[@id='templateCanel']")
	    WebElement btnNewDocumentCancel;
	    // Close Navigation
	    @FindBy(xpath = "//span[@id='navigatorModelCloseTemplate9']")
	    WebElement btnNewDocumentClose;
	    // Container of New Word Document
	    @FindBy(xpath = "//div[@id='djvuViewerDiv_editor_viewerContainer']")
	    WebElement tabNewWordDocument;
	    
	    // Save Add Pages
	    @FindBy(xpath = "//div[@id='saveAddedPages']")
	    WebElement btnSaveNewWordDocument;
	    
	    // After Click on OK - Loader
	    @FindBy(xpath = "(//div[text()='Adding page(s)...'][@id='progressMsg'])[2]")
	    WebElement msgNewDocument;
	    // New Excel Spreadsheet
	    @FindBy(xpath = "//div[@id='addExcelFile']") //addExcelFile
	    WebElement ddNewExcelSpreadsheetButton;
	    // New PDF Document
	    @FindBy(xpath = "//div[@id='addPdfFile']") //addPdfFile
	    WebElement ddNewPdfDocumentButton;
	// Fab Menu Button --------------------------------------------------------------------------------------
	    @FindBy(xpath = "//i[@id='fabButton'][@class='fa fa-bars']")
	    WebElement btnFabMenu;
	    // Fab Save Button
	    @FindBy(xpath = "//i[@id='saveFabButton']")
	    WebElement btnFabSaveDocument;
	    // Fab Delete Button
	    @FindBy(xpath = "//i[@id='deleteFabButton']")
	    WebElement btnFabDeleteDocument;
	    // Fab Upload Button
	    @FindBy(xpath = "//i[@id='uploadFabButton']")
	    WebElement btnFabploadDocument;
	    // Fab Full Screen View
	    @FindBy(xpath = "//i[@id='fullScreenFabButton']")
	    WebElement btnFabFullScreenView;
	//------------------------------------------------------------------------------------------------------------------------------------------------
	    WebDriver driver;
	    
	   
	    public CV_NewDocument(WebDriver driver)
		{
			this.driver = driver;
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			PageFactory.initElements(driver, this);
			
			
		}
	    /*
	    public void PlusIcon() 
	    {
	    	Actions actions = new Actions(driver);
	        actions.moveToElement(ddPlusIcon).build().perform();
	    }
	    */
	    
	    public void NewDocument() 
	    {
	    	 Actions actions = new Actions(driver);
	    	
	        menuNewDocument.click();
	        Utility.isVisible(txtDestinationFolder, driver, 10);
	        actions.moveToElement(txtDestinationFolder).build().perform();
	        txtDestinationFolder.click();
	        if(Utility.isVisible(tabBrowserForFolder, driver, 10)== true);
	        {
	            iconPlusSelectCabinet.click();
	            iconPlusSelectDrawer.click();
	            iconSelectFolder.click();
	            btnOkBrowseForFolder.click();
	        }
	    //  actions.moveToElement(ddDocumentType).build().perform();
	        Utility.Dropdownbytxt(ddDocumentType, "WordDocs");
	        txtAuthorsList.sendKeys("TestDoc");
	        chkbxRetain.click();
	        btnNewDocCreate.click();
	        Utility.isInvisible(loaderNewDocCreate, driver, 10);
	        String msg = lblMessage.getText();
	        if (msg.contains("Document created successfully")) {
	            System.out.println("Document created successfully");
	            btnView.click();
	        } else {
	            System.out.println("Document Not Createed");
	        }
	    }
	    
	    
	    public void Browse() 
	    {
	    	 Actions actions = new Actions(driver);
	    	actions.moveToElement(ddPlusIcon).build().perform();
	        String filePath = "D:\\ContentVerse\\Dummy_Data.xlsx";
	        ddBrowseButton.sendKeys(filePath);
	    }
	    
	    
	    public void NewWordDocument() throws InterruptedException 
	    {    Actions actions = new Actions(driver);
	    	actions.moveToElement(ddPlusIcon).build().perform();
	        ddNewWordDocumentButton.click();
	        txtNewDocumentEnterFileName.sendKeys("TestDocFile");
	        btnNewDocumentOk.click();
	        tabNewWordDocument.sendKeys("Test Word Document");
	        btnSaveNewWordDocument.click();
	        Thread.sleep(5000);
	        
	    }
	    
	
}
