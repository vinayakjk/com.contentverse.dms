package cv_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CV_Documents 
{
	
	//DOCUMENT MENU CLICK
	@FindBy(xpath = "//a[@id='documentListSubMenu']")
	WebElement MenuDocument ;
	
	//SUMMARY BUTTON CLICK
	@FindBy(xpath="//a[@id='summary1']")
	WebElement btnDocumentSummary ;
	
	//SUMMARY PAGE PRINT BUTTON
	@FindBy(xpath="//a[@id='summaryPrintLink']")
	WebElement btnSummaryPrint;
	
	//SUMMARY PAGE CANCEL BUTTON
	@FindBy(xpath ="//button[@class='btn btn-danger summaryActionClass btn-default']")
	WebElement btnSummaryCancel;
	
	//SUMMARY PAGE DATA EXCEL EXPORT
	@FindBy(xpath ="//button[@id='summaryShowAll_excelexport']")
	WebElement btnExcelExport;
	
	//SUMMARY EXPORT PDF 
	@FindBy(xpath ="//button[@id='summaryShowAll_pdfexport']")
	WebElement btnPdfExport;
	
	//SUMMARY PAGE CLOSE BUTTON
	@FindBy(xpath ="//div[@class='jconfirm-closeIcon']")
	WebElement btnCloseWorkflowSummary;
	
	//SUMMARY PAGE SHOW ALL DATA FILTER
	@FindBy(xpath="//span[text()='Action Only']")
	WebElement btnShowAllData;
	
	//SUMMARY PAGE SEARCH BAR
	@FindBy(xpath="//input[@id='summaryShowAll_searchbar']")
	WebElement SearchShowAllData;
	
	
	
	
	
}	
	
	
	
	


	
	