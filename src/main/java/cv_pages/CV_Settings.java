package cv_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CV_Settings 
{

	    //ClickimgSettings
		@FindBy(xpath = "//img[@id='imgSettings']")
		WebElement imgSettings;
		

	    //labelSettings
		@FindBy(xpath = "//h3[text()='Settings']")
		WebElement lblSettings;
		

	    //ClickMyPreferences-----------------------------------------------------
		@FindBy(xpath = "//li[@id='myPreferencesSettingsNav']")
		WebElement lblMyPreferences;
		
		//Label1MyPreferences
		@FindBy(xpath = "//h3[contains(text(),'My Preferences')]")
		WebElement lbl1MyPreferences;
		
		//ClickPreferences
		@FindBy(xpath = "//li[contains(text(),'Preferences')]")
		WebElement lblPreferences;
		
		//SelectddDefaultViewListNo
		@FindBy(xpath = "//select[@id='defaultViewListNo']")
		WebElement ddDefaultViewListNo;
		
		//SelectddOfficeDocuments
		@FindBy(xpath = "//select[@id='defaultOfficeDocViewListNo']")
		WebElement ddOfficeDocuments;
		
		//SelectddDateFormat
		@FindBy(xpath = "//select[@id='dateformatid']")
		WebElement ddDateFormat;
		
		//SelectddLogInformation
		@FindBy(xpath = "//select[@id='enablelogs']")
		WebElement ddLogInformation;
		
		//SelectddAnnotation
		@FindBy(xpath = "//span[@id='allAnnDropDownSpan']")
		WebElement ddAnnotation;
		
		//SelectddQuickFind
	    @FindBy(xpath = "//select[@id='quickFindListNo']")
		WebElement ddQuickFind;
	    
	    //SelectddViewerZoom
	    @FindBy(xpath = "//select[@id='viewerZoomId']")
		WebElement ddViewerZoom;
	    
	    //SelectddPdfDocuments
	    @FindBy(xpath = "//select[@id='defaultPdfDocViewListNo']")
		WebElement ddPdfDocuments;
	    
	    //SelectddRefresh
	    @FindBy(xpath = "//select[@id='refreshNo']")
		WebElement ddRefresh;
	    
	    //SelectddlogerLevel
	    @FindBy(xpath = "//select[@id='logLevels']")
		WebElement ddlogerLevel;
	    
	    //SelectddPdfWithOverlay
	    @FindBy(xpath = "//select[@id='pdfWithOverlayOption']")
		WebElement ddPdfWithOverlay;
	    
	    //SelectddLoadMoreCount
	    @FindBy(xpath = "//input[@id='loadmorecount']")
		WebElement ddLoadMoreCount;
	    
	    
	    //ClicktxtRedactionViewPwd
	    @FindBy(xpath = "//input[@id='redactionPwd']")
		WebElement txtRedactionViewPwd;
	    
	    //ClickimgTogglePassword
	    @FindBy(xpath = "//i[@id='togglePassword']")
		WebElement imgTogglePassword;
		
	    //ClicktxtFileDownloadPath
	    @FindBy(xpath = "//input[@id='downloadsPath']")
		WebElement txtFileDownloadPath;
	    
	    //ClickbtnAddSignature
	    @FindBy(xpath = "//button[@id='addSignature']")
		WebElement btnAddSignature;
	    
	    //ClickbtnResetSignaturePassword
	    @FindBy(xpath = "//button[@id='resetSignaturePassword']")
		WebElement btnResetSignaturePassword;
	    
	    //checkboxDisplayCompactView
	    @FindBy(xpath = "//input[@id='displayCompactViewOfList']")
		WebElement chkDisplayCompactView;
	    
	    //chkDownLoadAllFiles
	    @FindBy(xpath = "//input[@id='defaultDownLoadAllFiles']")
		WebElement chkDownLoadAllFiles;
	    
	    //chkEnableDashboard
	    @FindBy(xpath = "//input[@id='enableDashboard']")
		WebElement chkEnableDashboard;
	    
	    //btnApplyMyPreferences
	    @FindBy(xpath = "//button[@id='myPreferencesSubmit']")
		WebElement btnApplyMyPreferences;
	    
	    //btnResetMyPreferences
	    @FindBy(xpath = "//button[@id='resetmyPreferences']")
		WebElement btnResetMyPreferences;
	    
	    //btnCloseMyPreferences
	    @FindBy(xpath = "//button[@id='myPreferencesCloseBtn']")
		WebElement btnCloseMyPreferences;
	    
	    //lblScanPreferences----------------------------------------------------------
	    @FindBy(xpath = " //li[@id='scanPreferencesSettingsNav']")
		WebElement lblScanPreferences;
	    
	    //lblScanPreferences
	    @FindBy(xpath = "//h3[contains(text(),'Scan Preferences')]")
		WebElement lbl1ScanPreferences;
	    
	    //lnkDownloadWebScanningModule
	    @FindBy(xpath = "//a[@id='downloadScanMsi']")
		WebElement lnkDownloadWebScanningModule;
	    
	    //lnkConnectScanner
	    @FindBy(xpath = "//div[@id='scdannner']")
		WebElement lnkConnectScanner;
	    
	    //lblSelectSource
	    @FindBy(xpath = "//div[@id='selectSource']")
		WebElement lblSelectSource;
	    
	    //lblDisconnect
	    @FindBy(xpath = "//div[@id='stopScanner']")
		WebElement lblDisconnect;
	    
	    //txtsources
	    @FindBy(xpath = "//select[@id='sources']")
		WebElement txtsources;
	    
	    //ddColorFileFormat
	    @FindBy(xpath = "//select[@id='fileFormatSelect']")
		WebElement ddColorFileFormat;
	    
	    //ddBWFileFormat
	    @FindBy(xpath = "//select[@id='fileBFormatSelect']")
		WebElement ddBWFileFormat;
	    
	    //rangebarCompression
	    @FindBy(xpath = "//input[@id='pdfFormatSelectNum']")
		WebElement rangebarCompression;
	    
	    //rangebar1Compression
	    @FindBy(xpath = "//div[@id='compressionBDiv']")
		WebElement rangebar1Compression;
	    
	    //chkMultiPageFile
	    @FindBy(xpath = "//input[@id='checkBoxMultiPage']")
		WebElement chkMultiPageFile;
	    
	    //chkMultiPageFileB
	    @FindBy(xpath = "//input[@id='checkBoxMultiPageB']")
		WebElement chkMultiPageFileB;
	    
	    //btnApplyScanPreference
	    @FindBy(xpath = "//button[@id='scanPreferencesSubmit']")
		WebElement btnApplyScanPreference;
	    
	    //btnResetScanPreference
	    @FindBy(xpath = "//button[@id='resetScanPreferences']")
		WebElement btnResetScanPreference;
	    
	    //btnCloseScanPreference
	    @FindBy(xpath = "//button[@id='scanPreferencesCloseBtn']")
		WebElement btnCloseScanPreference;
	    
	    //lblNotificationsSetting----------------------------------------------------------
	    @FindBy(xpath = "//li[@id='notificationsSettingsNav']")
		WebElement lblNotificationsSetting;
	    
	    //lblAdminPreferencesSettings----------------------------------------------------------
	    @FindBy(xpath = " //li[@id='adminPreferencesSettingsNav']")
		WebElement lblAdminPreferencesSettings;
	    
	    //lblDocumentTemplates----------------------------------------------------------
	    @FindBy(xpath = " //li[@id='templateDocumentPermissions']")
		WebElement lblDocumentTemplates;
	    
	    
	 
	  
	 
	 
	 
	  
	  
}	
