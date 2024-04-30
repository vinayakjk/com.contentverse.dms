package cv_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cv_resources.Utility;

public class CV_Documents extends Utility {

	
		@FindBy(xpath = "//a[@id='documentListSubMenu']")
	    WebElement clickDocument;
		
		@FindBy(xpath = "//a[@id='multipleViewer']")
		WebElement clickView;
		
		@FindBy(xpath = "//a[@id='cutid']")
	    WebElement clickCutDocument;
		
		@FindBy(xpath = "//a[@id='copyId']")
	    WebElement clickCopyDocument;
		
		@FindBy(xpath = "//a[@id='pasteid']")
	    WebElement clickpasteDocument;
		
		@FindBy(xpath = "//a[@id='docReferencePaste']")
	    WebElement clickpasteasrefr;
		
		@FindBy(xpath = "//a[@id='referenceBtn']")
	    WebElement clickReferences;
		
		@FindBy(xpath = "//a[@id='delDocument']")
	    WebElement clickDelete;
		
		@FindBy(xpath = "//a[@id='documentcreatefav']")
	    WebElement clickCrFavorites;
		
		@FindBy(xpath = "//a[@id='documentSendTo']")
	    WebElement clicksendto;
		
		//click on send to --> SubMenu--> mail
		
		@FindBy(xpath = "//a[@id='sendToMail']")
	    WebElement clickMail;
		
		
		//click on send to --> SubMenu--> mail--> Send document as -->Copy
		@FindBy(xpath = "//input[@id='sendDocAsCopy']")
	    WebElement rdcopy;
		
		//click on send to --> SubMenu--> mail-->Send document as-->Reference
		@FindBy(xpath = "//input[@id='sendDocAsReference']")
	    WebElement rdreference;
		
		//click on send to --> SubMenu--> mail-->Send document as-->Convert to pdf
		
		@FindBy(xpath = "//input[@id='convertToPdfChk']")
	    WebElement chkConvertPdf;
		
		//click on send to --> SubMenu--> mail-->Send document as--> Retain Colour
		@FindBy(xpath = "//input[@id='retainPdfColorExport1']")
	    WebElement chkRetainColour;
		
		//click on send to --> SubMenu--> mail-->Send document as--> Quality Dropdawn
		@FindBy(xpath = "//select[@id='convertToPdfQuality']")
	    WebElement ddQuality;
		
		//click on send to --> SubMenu--> mail--> Send document as-->Certified cover page
		@FindBy(xpath = "//input[@id='certifiedCoverPage']")
	    WebElement chkCertifiedPage;
		
		//click on send to --> SubMenu--> mail--> Send document as-->Compress Zip File
		@FindBy(xpath = "//input[@id='compressToZip']")
	    WebElement chkCompressZip;
		

		//click on send to --> SubMenu--> mail--> Send document as-->Password
		@FindBy(xpath = "//input[@id='sendToPassword']")
	    WebElement chkPassword;
		
		//click on send to --> SubMenu--> mail-->Annotation Setting--> Burn Annotation---------------
		@FindBy(xpath = "//input[@id='runAnnotations']")
	    WebElement chkBurnAnnotations;
		
		//click on send to --> SubMenu--> mail-->Annotation Setting--> Blackout
		@FindBy(xpath = "//input[@id='sendToBlackout']")
	    WebElement rdBlackOut;
				
	   //click on send to --> SubMenu--> mail-->Annotation Setting-->Whiteout
		@FindBy(xpath = "//input[@id='sendToWhiteout']")
		WebElement rdWhiteOut;
			
		//click on send to --> SubMenu--> mail-->Annotation Setting-->Unlock Redactions With
		@FindBy(xpath = "//input[@id='unlockRedactionsWith']")
		WebElement chkUnlockRedactions;
		//input[@id='unlockRedactionsPwd']---------------------------------------------------------------
		
		//click on send to --> SubMenu--> mail-->Annotation Setting-->To Email ID
		@FindBy(xpath = "//input[@id='toEmial']")
		WebElement lblToMailId;
		
		//click on send to --> SubMenu--> mail-->Annotation Setting-->CC Mailid
		@FindBy(xpath = "//input[@id='ccEmail']")
		WebElement lblCCMailId;
		
		//click on send to --> SubMenu--> mail-->Annotation Setting-->Subject
		@FindBy(xpath = "//input[@id='subjectid']")
		WebElement lblSubject;
		
		//click on send to --> SubMenu--> mail-->Annotation Setting-->Message
		@FindBy(xpath = "//input[@id='messageId']")
		WebElement lblMessage;
		
		
		//click on send to --> SubMenu-->print------------------------------
		
		@FindBy(xpath = "//a[@id='sendToPrint']")
	    WebElement clickprint;
		
		//click on send to --> SubMenu-->print-->print setting--> Certified Cover Page
		@FindBy(xpath = "//input[@id='certifiedCoverPagePrint']")
	    WebElement chkCertifiedpage;
		
		
		//click on send to --> SubMenu-->print-->print setting-->include Workflow Summary
		@FindBy(xpath = "//input[@id='includeRouteSummaryPrint']")
	    WebElement chkIncludeReportSummary;
		
		//click on send to --> SubMenu-->print-->Annotation setting--> print Annotation
		@FindBy(xpath = "//input[@id='printAnnotations']")
	    WebElement chkPrintAnnotation;
		
		//click on send to --> SubMenu-->print-->Annotation setting--> Blackout
		@FindBy(xpath = "//input[@id='blackoutPrint']")
	    WebElement rdBlackout;
		
		//click on send to --> SubMenu-->print-->Annotation setting--> Whiteout
		@FindBy(xpath = "//input[@id='whiteoutPrint']")
	    WebElement rdWhiteoutout;
		

		//click on send to --> SubMenu-->print-->Annotation setting--> Unlock Redactions with
		@FindBy(xpath = "//input[@id='unlockRedactionsWithPrint']")
	    WebElement chkUnlockRedactionWith;
		
		//click on send to --> SubMenu-->print-->Annotation setting--> Unlock Redactions with
		@FindBy(xpath = "//input[@id='unlockRedactionsWithPrint']")
	    WebElement lblUnlockRedactionWith;
				
		//click on send to --> SubMenu-->print--> ok
		@FindBy(xpath = "//button[@id='printDocumentOnView']")
	    WebElement btnok;
		
		//click on send to --> SubMenu-->print-->cancel
		@FindBy(xpath = "//button[@id='cancelPrintBtn']")
		WebElement btnCancel;
		
		
		//click on send to--> SubMenu-->Export---------------------------------------------
		@FindBy(xpath = "//a[@id='sendToExport']")
	    WebElement clickDExport;

		//click on send to--> SubMenu-->Export-->Retain Format
		@FindBy(xpath = "//input[@id='retainFormatChkExport']")
	    WebElement chkRetainFormat;
		
		//click on send to--> SubMenu-->Export-->Convert to PDF
		@FindBy(xpath = "//input[@id='convertToPdfChkExport']")
	    WebElement chkConvertToPDF;
		
		
		//click on send to--> SubMenu-->Export-->Retain Colour
		@FindBy(xpath = "//input[@id='retainPdfColorExport']")
	    WebElement chkRetainColor;
		
		//click on send to--> SubMenu-->Export-->Include Workflow Summary
		@FindBy(xpath = "//input[@id='includeRouteSummary']")
	    WebElement chkIncludeWorkflowSummary;
		
		//click on send to--> SubMenu-->Export-->Zip Password
		@FindBy(xpath = "//input[@id='includeRouteSummary']")
	     WebElement lblZipPassword;
		
		//click on send to--> SubMenu-->Export-->PDF Password
		@FindBy(xpath = "//input[@id='pdfPasswordInput']")
	     WebElement lblPDFPasswod;
		
		//click on send to--> SubMenu-->Export-->Annotation Setting --> Export with annotation
		@FindBy(xpath = "//input[@id='exportAnnotations']")
	     WebElement chkExportAnnotations;
		
		//click on send to--> SubMenu-->Export-->Annotation Setting --> Export with annotation
		@FindBy(xpath = "//input[@id='sendToBlackoutExport']")
	    WebElement rdBlackout2;
		
		
		@FindBy(xpath = "//input[@id='sendToWhiteoutExport']")
	    WebElement rdWhiteout;
		

		//click on send to--> SubMenu-->Export-->ok button
		@FindBy(xpath = "//button[@id='saveSendToDocument']")
	    WebElement btnOk;
		
		//click on send to--> SubMenu-->Export-->Cancel button
		@FindBy(xpath = "//button[@id='cancelSendToDocument']")
	    WebElement btncancel;
		
		
		//click on send to --> SubMenu--> mail-->SecureLink
		@FindBy(xpath = "//a[text()='Secure Link...'][1]")
	    WebElement clickSecureLink;
		
		//click on send to --> SubMenu--> mail-->SecureLink--> Recipient Email Address
		@FindBy(xpath = "//input[@id='recepientEmailId']")
	     WebElement lblEmailAddress;
   
		//click on send to --> SubMenu--> mail-->SecureLink--> Confirm Email Address
		@FindBy(xpath = "//input[@id='confirmEmailIdSecure']")
		WebElement lblConfirmEmailAddress;
		
		//click on send to --> SubMenu--> mail-->SecureLink--> Modify Permission
		@FindBy(xpath = "//input[@id='modifyPermissionCheckbox']")
		WebElement chkModifyPermission;
		
		//click on send to --> SubMenu--> mail-->SecureLink--> ok button
		@FindBy(xpath = "//button[@id='navigatorTreeOk32']")
		WebElement btnOK;
		
		//click on send to --> SubMenu--> mail-->SecureLink--> Cancel button
		@FindBy(xpath = "//button[@id='navigatorTreeCancle32']")
		WebElement btnCancelSecureLink;
		
		
	    //click on send to --> SubMenu -->Generate Document Link
		@FindBy(xpath = "//a[@id='generateDocumentLink']")
	    WebElement clickGenerateDocLink;
		
		
		//click on send to--> SubMenu-->Export-->Cancel button
		@FindBy(xpath = "//button[@id='documentLinkOk']")
	     WebElement btnokGenerateDocument;
				
		
		//Click on send to--> SubMenu -->AmazoneS3
		@FindBy(xpath = "//a[@id='uploadToS3Link']")
	    WebElement clickAmazoneS3;
		
		//Click on send to--> SubMenu -->AmazoneS3--> ok button
		@FindBy(xpath = "//button[@id='messageButtonOK']")
	    WebElement btnokAmazone;

		
		//----------------------------------------
		
		
		//Click on take Ownership
		@FindBy(xpath = "//a[@id='takeOwnership']")
		WebElement clickTakeOwnerShip;
		
		//Click on take Ownership
		@FindBy(xpath ="//a[@id='releaseOwnership']")
	    WebElement clickReleseOwnerShip;
		
		//Click on  send to workflow
		@FindBy(xpath ="//a[@id='sendtoworkflow']")
	    WebElement clickonSendToWorkflow;
		
		//Click on Resubmit
		@FindBy(xpath ="//a[@id='resubmitidclick']")
	    WebElement clickResubmit ;
		
		//Click on Freeze
		@FindBy(xpath ="//a[@id='freezeid']")
	    WebElement clickFreeze ;
		
		//Click on defreeze
		@FindBy(xpath ="//a[@id='defreezeid']")
	    WebElement clickUnFreeze ;
		
		//Click on Notification Settings
		@FindBy(xpath ="//a[@id='notificationSettings']")
	    WebElement clickNotificationSettings;
		
		//Click on security
		@FindBy(xpath ="//a[@id='documentSecurity']")
	    WebElement clickSecurity;
		
		//Click on Categories
		@FindBy(xpath ="//a[@id='documentSetcolour']")
	    WebElement clickCategories;
		
		// Click on Categories--> public 
		@FindBy(xpath ="//span[contains(text(),'Public')]")
	    WebElement clickPrvate;
		
		// Click on Categories--> private
		@FindBy(xpath ="//span[@id='private']")
	    WebElement clickPrivate;
		
		//Click on Categories options(colours)
		@FindBy(linkText = "Blue") // (blue,green,dark yellow,red,orange,olive,Maroon,Purple,None)
	    WebElement clickTxt;
		
		//Click on Refresh
		@FindBy(xpath ="//a[@id='refreshDocuments']")
	    WebElement clickRefresh;
		
		public CV_Documents(WebDriver driver) {
			
			super(driver);
		}
		
}

