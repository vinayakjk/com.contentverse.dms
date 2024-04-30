package cv_pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cv_resources.Utility;

public class CV_Settings extends Utility {
	// ClickimgSettings
	@FindBy(xpath = "//img[@id='imgSettings']")
	WebElement imgSettings;

	// labelSettings
	@FindBy(xpath = "//h3[text()='Settings']")
	WebElement lblSettings;

	// ClickMyPreferences-----------------------------------------------------
	@FindBy(xpath = "//li[@id='myPreferencesSettingsNav']")
	WebElement lblMyPreferences;

	@FindBy(xpath = "//div[@id='mypreferencesModal']//div[@class='modal-content1']")
	WebElement windowMyprefernce;

	// Label1MyPreferences
	@FindBy(xpath = "//h3[contains(text(),'My Preferences')]")
	WebElement lbl1MyPreferences;

	// ClickPreferences
	@FindBy(xpath = "//li[contains(text(),'Preferences')]")
	WebElement lblPreferences;

	// SelectddDefaultViewListNo
	@FindBy(xpath = "//select[@id='defaultViewListNo']")
	WebElement ddDefaultViewListNo;

	// SelectddOfficeDocuments
	@FindBy(xpath = "//select[@id='defaultOfficeDocViewListNo']")
	WebElement ddOfficeDocuments;

	// SelectddDateFormat
	@FindBy(xpath = "//select[@id='dateformatid']")
	WebElement ddDateFormat;

	// SelectddLogInformation
	@FindBy(xpath = "//select[@id='enablelogs']")
	WebElement ddLogInformation;

	// SelectddAnnotation
	@FindBy(xpath = "//span[@id='allAnnDropDownSpan']")
	WebElement ddAnnotation;

	// SelectddQuickFind
	@FindBy(xpath = "//select[@id='quickFindListNo']")
	WebElement ddQuickFind;

	// SelectddViewerZoom
	@FindBy(xpath = "//select[@id='viewerZoomId']")
	WebElement ddViewerZoom;

	// SelectddPdfDocuments
	@FindBy(xpath = "//select[@id='defaultPdfDocViewListNo']")
	WebElement ddPdfDocuments;

	// SelectddRefresh
	@FindBy(xpath = "//select[@id='refreshNo']")
	WebElement ddRefresh;

	// SelectddlogerLevel
	@FindBy(xpath = "//select[@id='logLevels']")
	WebElement ddlogerLevel;

	// SelectddPdfWithOverlay
	@FindBy(xpath = "//select[@id='pdfWithOverlayOption']")
	WebElement ddPdfWithOverlay;

	// SelectddLoadMoreCount
	@FindBy(xpath = "//input[@id='loadmorecount']")
	WebElement txtLoadMoreCount;

	// ClicktxtRedactionViewPwd
	@FindBy(xpath = "//input[@id='redactionPwd']")
	WebElement txtRedactionViewPwd;

	// ClickimgTogglePassword
	@FindBy(xpath = "//i[@id='togglePassword']")
	WebElement imgTogglePassword;

	// ClicktxtFileDownloadPath
	@FindBy(xpath = "//input[@id='downloadsPath']")
	WebElement txtFileDownloadPath;

	// ClickbtnAddSignature
	@FindBy(xpath = "//button[@id='addSignature']")
	WebElement btnAddSignature;

	// ClickbtnResetSignaturePassword
	@FindBy(xpath = "//button[@id='resetSignaturePassword']")
	WebElement btnResetSignaturePassword;

	// checkboxDisplayCompactView
	@FindBy(xpath = "//input[@id='displayCompactViewOfList']")
	WebElement chkDisplayCompactView;

	// chkDownLoadAllFiles
	@FindBy(xpath = "//input[@id='defaultDownLoadAllFiles']")
	WebElement chkDownLoadAllFiles;

	// chkEnableDashboard
	@FindBy(xpath = "//input[@id='enableDashboard']")
	WebElement chkEnableDashboard;

	// btnApplyMyPreferences
	@FindBy(xpath = "//button[@id='myPreferencesSubmit']")
	WebElement btnApplyMyPreferences;

	// btnResetMyPreferences
	@FindBy(xpath = "//button[@id='resetmyPreferences']")
	WebElement btnResetMyPreferences;

	// btnCloseMyPreferences
	@FindBy(xpath = "//button[@id='myPreferencesCloseBtn']")
	WebElement btnCloseMyPreferences;

	// lblScanPreferences----------------------------------------------------------
	@FindBy(xpath = " //li[@id='scanPreferencesSettingsNav']")
	WebElement lblScanPreferences;

	// lblScanPreferences
	@FindBy(xpath = "//h3[contains(text(),'Scan Preferences')]")
	WebElement lbl1ScanPreferences;

	// lnkDownloadWebScanningModule
	@FindBy(xpath = "//a[@id='downloadScanMsi']")
	WebElement lnkDownloadWebScanningModule;

	// lnkConnectScanner
	@FindBy(xpath = "//div[@id='scdannner']")
	WebElement lnkConnectScanner;

	// lblSelectSource
	@FindBy(xpath = "//div[@id='selectSource']")
	WebElement lblSelectSource;

	// lblDisconnect
	@FindBy(xpath = "//div[@id='stopScanner']")
	WebElement lblDisconnect;

	// txtsources
	@FindBy(xpath = "//select[@id='sources']")
	WebElement txtsources;

	// ddColorFileFormat
	@FindBy(xpath = "//select[@id='fileFormatSelect']")
	WebElement ddColorFileFormat;

	// ddBWFileFormat
	@FindBy(xpath = "//select[@id='fileBFormatSelect']")
	WebElement ddBWFileFormat;

	// rangebarCompression
	@FindBy(xpath = "//input[@id='pdfFormatSelectNum']")
	WebElement rangebarCompression;

	// rangebar1Compression
	@FindBy(xpath = "//div[@id='compressionBDiv']")
	WebElement rangebar1Compression;

	// chkMultiPageFile
	@FindBy(xpath = "//input[@id='checkBoxMultiPage']")
	WebElement chkMultiPageFile;

	// chkMultiPageFileB
	@FindBy(xpath = "//input[@id='checkBoxMultiPageB']")
	WebElement chkMultiPageFileB;

	// btnApplyScanPreference
	@FindBy(xpath = "//button[@id='scanPreferencesSubmit']")
	WebElement btnApplyScanPreference;

	// btnResetScanPreference
	@FindBy(xpath = "//button[@id='resetScanPreferences']")
	WebElement btnResetScanPreference;

	// btnCloseScanPreference
	@FindBy(xpath = "//button[@id='scanPreferencesCloseBtn']")
	WebElement btnCloseScanPreference;

	// lblNotificationsSetting----------------------------------------------------------
	@FindBy(xpath = "//li[@id='notificationsSettingsNav']")
	WebElement lblNotificationsSetting;

	// lblAdminPreferencesSettings----------------------------------------------------------
	@FindBy(xpath = " //li[@id='adminPreferencesSettingsNav']")
	WebElement lblAdminPreferencesSettings;

	// lblDocumentTemplates----------------------------------------------------------
	@FindBy(xpath = " //li[@id='templateDocumentPermissions']")
	WebElement lblDocumentTemplates;

	@FindBy(xpath = "//div[@id='commentModel50']")
	WebElement windowdefaultdocs;

	@FindBy(xpath = "//button[@id='cvModel50Ok']")
	WebElement btnokwindowdefaultdocs;

	@FindBy(xpath = "//div[@id='toastMessage']")
	WebElement msgtoast;

	WebDriver driver;

	// Declare Constructor
	public CV_Settings(WebDriver driver) {
		super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);
	}

	public void profile_Setting(String getdefaultView, String getofficeDocs, String getofficepdf, String getLoadcount) {
		imgSettings.click();
		lblMyPreferences.click();

		isVisible(windowMyprefernce, 5);
		// System.out.println(ConfigReader.getdefaultView());
		Dropdownbytxt(ddDefaultViewListNo, getdefaultView);
		Dropdownbytxt(ddOfficeDocuments, getofficeDocs);
		Dropdownbytxt(ddPdfDocuments, getofficepdf);
		txtLoadMoreCount.clear();
		txtLoadMoreCount.sendKeys(getLoadcount);

		btnApplyMyPreferences.click();
		String Settingapplymsg = msgtoast.getText();

		if (isDisaplyedW(windowdefaultdocs, 1) == true)

		{
			btnokwindowdefaultdocs.click();
		}

		System.out.println(Settingapplymsg);
		Assert.assertTrue(Settingapplymsg.contains("Saved Successfully!"));
	}

}
