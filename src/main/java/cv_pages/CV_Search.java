package cv_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cv_resources.Utility;

public class CV_Search extends Utility {
	
	WebDriver driver;

	//WebElement Added in CV_Search_Page on 28/02/2024 - Suresh
	// Click on "Search"
	@FindBy(xpath = "//a[@id='advSearchMenuBtn']")
	WebElement clickSearchMenu;

	// Click on "Select Document location
	@FindBy(xpath = "//input[@id='folderLocationForSearch']")
	WebElement txtFloderLocationpath;

	// Click on "Ok"
	@FindBy(xpath = "//button[@id='navigatorTreeOk1']")
	WebElement btnOkSearchLocation;

	// Click on "Cancel"
	@FindBy(xpath = "//button[@id='navigatorTreeCancle1']")
	WebElement btnCancelSearchLocation;

	// Click on "Select search location X "
	@FindBy(xpath = "//span[@id='navigatorModelClose1']")
	WebElement btnCloseSearchLocation;

	// Click on "Refresh"--
	@FindBy(xpath = "//img[@id='searchfolderrefreshBtn']")
	WebElement imgRefreshSearchLocation;

	// Click on "labelSearchImage1"--
	@FindBy(xpath = "//input[@id='searchLocateNode']")
	WebElement imgSearchDocumentLocation;

	// Click on "All of the words"--
	@FindBy(xpath = "//li[@id='indexOptionMenu_0']")
	WebElement listIndexOption;

	// Click on "The exact phrase"
	@FindBy(xpath = "//li[@id='indexOptionMenu_1']")
	WebElement list1IndexOption;

	// Click on "At least one of the words"
	@FindBy(xpath = "//li[@id='indexOptionMenu_2']")
	WebElement list2IndexOption;

	// Click on Index Contain Text Area
	@FindBy(id = "indexPhrase1")
	WebElement txtIndexContain;

	// Click on "All of the words"
	@FindBy(xpath = "//li[@id='textOptionMenu_0']")
	WebElement listTextContain;

	// Click on "The exact phrase"
	@FindBy(xpath = "//li[@id='textOptionMenu_1']")
	WebElement list1TextContain;

	// Click on "At least one of the words"
	@FindBy(xpath = "//li[@id='textOptionMenu_2']")
	WebElement list2TextContain;

	// Click on "Any part of the value"
	@FindBy(xpath = "//li[@id='textOptionMenu_3']")
	WebElement list3TextContain;

	// Click on Text Contain Text Area
	@FindBy(id = "indexPhrase2")
	WebElement txtTextContain;

	// SelectDocumentType
	@FindBy(xpath = "(//div[@class='e-multi-select-wrapper e-down-icon'])[1]")
	WebElement ddDocumentType;

	// Click on "Document types / indices"
	@FindBy(xpath = "//img[@id='addIndicesBtn']")
	WebElement imgIndices;

	// Click on "Reset"
	@FindBy(xpath = "//button[@id='navigatorTreeReset6']")
	WebElement btnResetIndices;

	// Click on "Ok"
	@FindBy(xpath = "//button[@id='navigatorTreeOk6']")
	WebElement btnOkIndices;

	// Click on "Cancel"
	@FindBy(xpath = "//button[@id='navigatorTreeCancle6']")
	WebElement btnCancelIndices;

	// Click on "Document Type / Indices ×"
	@FindBy(xpath = "//span[@id='navigatorModelClose6']")
	WebElement btnCloseIndices;

	// Click on "Document Type Refresh"
	@FindBy(xpath = "//img[@id='refreshDocTypeBtn']")
	WebElement imgRefreshDocumentType;

	// SelectDocumentCreator
	@FindBy(xpath = "(//div[@class='e-multi-select-wrapper e-down-icon'])[2]")
	WebElement ddDocumentCreator;

	// CreatorrefreshBtn
	@FindBy(xpath = "//img[@id='refreshCreatorBtn']")
	WebElement imgRefreshDocumentCreator;

	// SelectWorkFlow
	@FindBy(xpath = "(//span[@aria-label='dropdownlist'])[1]")
	WebElement ddWorkFlow;

	// CalenderCreatedFrom
	@FindBy(xpath = "//input[@id='createdDateFrom']")
	WebElement txtCreatedFrom;

	// CalenderCreatedTo
	@FindBy(xpath = "//input[@id='createdDateTo']")
	WebElement txtCreatedTo;

	// CalenderModifiedFrom
	@FindBy(xpath = "//input[@id='ModifiedDateFrom']")
	WebElement txtModifiesFrom;

	// CalenderModifiedTo
	@FindBy(xpath = "//input[@id='ModifiedDateTo']")
	WebElement txtModifiedTo;

	// Checkbox All Versions
	@FindBy(xpath = "//input[@id='allVersions']")
	WebElement chkAllVersions;

	// Checkbox Include Comment
	@FindBy(xpath = "//input[@id='includeComment']")
	WebElement chkIncludeComment;

	// Checkbox Append to hitlist
	@FindBy(xpath = "//input[@id='appendToHitList']")
	WebElement chkAppendToHitList;

	// Checkbox Find inhitlist
	@FindBy(xpath = "//input[@id='findInHitList']")
	WebElement chkFindInHitList;

	// Click on "Select saved search"
	@FindBy(xpath = "(//select[@id='savedSearchName']")
	WebElement ddSaveSearch;

	// Click on "Select saved search<New Search>
	@FindBy(xpath = "//select[@id='savedSearchName'])[1]")
	WebElement dd1NewSearch;

	// select "Select saved Button
	@FindBy(xpath = "//img[@id='saveBtnForSaveSearchName']")
	WebElement imgSaveSearchName;

	// select "Select Cancel Button
	@FindBy(xpath = "//img[@id='cancelBtnForSaveSearchName']")
	WebElement imgCancelSearchName;

	// select "Select Refresh Button
	@FindBy(xpath = "//img[@id='refreshBtnForSaveSearchName']")
	WebElement imgRefreshSearchName;

	// Select Find Button
	@FindBy(xpath = "//button[@id='advFindBtnLabel']")
	WebElement btnFind;

	// Select Clear Button
	@FindBy(xpath = "//button[@id='clearSearchBtnLabel']")
	WebElement btnClear;

	// SearchDropdown Menu
	@FindBy(xpath = "//ul[@id='customListdropdownmenu']")
	WebElement ddSearchMenu;

	// Select Custom Colmn
	@FindBy(xpath = "//a[@id='culstomcolsearch']")
	WebElement dd1CustomColumn;

	// Search Custom List
	@FindBy(xpath = "//input[@id='searchInput']")
	WebElement txtCustomList;

	// Select Default Btn
	@FindBy(xpath = "//button[@id='DefaultCustomList']")
	WebElement btnDefaultCustomList;

	// Select OK Btn
	@FindBy(xpath = "//button[@id='CustomListOK']")
	WebElement btnOkCustomList;

	// Select Cancel Btn
	@FindBy(xpath = "//button[@id='CustomListCancel']")
	WebElement btnCancelCustomList;

	// Select Close Btn
	@FindBy(xpath = "//span[@id='customListModelClose']")
	WebElement btnCloseCustomList;

	//
	@FindBy(xpath = "//button[@id='resetColumsOk']")
	WebElement dd2ResetColums;
	
	public CV_Search(WebDriver driver )
	{
		super(driver);
		this.driver=driver;
		
	}
	
	public void Search_CV()
	{
		clickSearchMenu.click();
		txtFloderLocationpath.click();
		btnOkSearchLocation.click();
		btnCancelSearchLocation.click();
		btnCloseSearchLocation.click();
		imgRefreshSearchLocation.click();
		imgSearchDocumentLocation.click();
		listIndexOption.click();
		
		
		
		
		
	}		

}