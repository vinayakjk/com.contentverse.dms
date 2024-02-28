package cv_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CV_Search {
	// Click on "Search"
	@FindBy(xpath = "//a[@id='advSearchMenuBtn']")
	WebElement ClickSearch;

	// Click on "Select Document location
	@FindBy(xpath = "//div[@id='cvModel1']")
	WebElement SelectFloderLocation;

	// Click on "Ok"
	@FindBy(xpath = "//button[@id='navigatorTreeOk1']")
	WebElement SearchLocOkBtn;

	// Click on "Cancel"
	@FindBy(xpath = "//button[@id='navigatorTreeCancle1']")
	WebElement SearchLocCancelBtn;

	// Click on "Select search location X "
	@FindBy(xpath = "//span[@id='navigatorModelClose1']")
	WebElement SelectLocXBtn;

	// Click on "Refresh"
	@FindBy(xpath = "//img[@id='searchfolderrefreshBtn']")
	WebElement SelectLocRefreshBtn;

	// Click on "labelSearchImage1"
	@FindBy(xpath = "//img[@id='labelSearchImage1']")
	WebElement ClicklabelSearchImage;

	// Click on "All of the words"
	@FindBy(xpath = "//li[@id='indexOptionMenu_0']")
	WebElement IndexContainAll;

	// Click on "The exact phrase"
	@FindBy(xpath = "//li[@id='indexOptionMenu_1']")
	WebElement IndexContainexact;

	// Click on "At least one of the words"
	@FindBy(xpath = "//li[@id='indexOptionMenu_2']")
	WebElement IndexContainexatleast;

	// Click on Index Contain Text Area
	@FindBy(id = "indexPhrase1")
	WebElement ClickIndexTextArea;

	// Click on "All of the words"
	@FindBy(xpath = "//li[@id='textOptionMenu_0']")
	WebElement TextContainAll;

	// Click on "The exact phrase"
	@FindBy(xpath = "//li[@id='textOptionMenu_1']")
	WebElement TextContainExact;

	// Click on "At least one of the words"
	@FindBy(xpath = "//li[@id='textOptionMenu_2']")
	WebElement TextContainAtLeast;

	// Click on "Any part of the value"
	@FindBy(xpath = "//li[@id='textOptionMenu_3']")
	WebElement TextContainAny;

	// Click on Text Contain Text Area
	@FindBy(id = "indexPhrase2")
	WebElement ClickTextContainArea;

	// SelectDocumentType
	@FindBy(xpath = "(//div[@class='e-multi-select-wrapper e-down-icon'])[1]")
	WebElement SelectDocumentType;

	// Click on "Document types / indices"
	@FindBy(xpath = "//img[@id='addIndicesBtn']")
	WebElement ClickIndicesBtn;

	// Click on "Reset"
	@FindBy(xpath = "//button[@id='navigatorTreeReset6']")
	WebElement ClickResetBtn;

	// Click on "Ok"
	@FindBy(xpath = "//button[@id='navigatorTreeOk6']")
	WebElement ClickOkBtn;

	// Click on "Cancel"
	@FindBy(xpath = "//button[@id='navigatorTreeCancle6']")
	WebElement ClickCanBtn;

	// Click on "Document Type / Indices ×"
	@FindBy(xpath = "//span[@id='navigatorModelClose6']")
	WebElement ClickCloseBtn;

	// Click on "Document Type Refresh"
	@FindBy(xpath = "//img[@id='refreshDocTypeBtn']")
	WebElement DoctyperefreshBtn;

	// SelectDocumentCreator
	@FindBy(xpath = "(//div[@class='e-multi-select-wrapper e-down-icon'])[2]")
	WebElement SelectDocCreator;

	// CreatorrefreshBtn
	@FindBy(xpath = "//img[@id='refreshCreatorBtn']")
	WebElement CreatorrefreshBtn;

	// SelectWorkFlow
	@FindBy(xpath = "(//span[@aria-label='dropdownlist'])[1]")
	WebElement SelectWorkFlow;

	// CalenderCreatedFrom
	@FindBy(xpath = "//input[@id='createdDateFrom']")
	WebElement CalCreatedFrom;

	// CalenderCreatedTo
	@FindBy(xpath = "//input[@id='createdDateTo']")
	WebElement CalCreatedTo;

	// CalenderModifiedFrom
	@FindBy(xpath = "//input[@id='ModifiedDateFrom']")
	WebElement CalModFrom;

	// CalenderModifiedTo
	@FindBy(xpath = "//input[@id='ModifiedDateTo']")
	WebElement CalModTo;

	// Checkbox All Versions
	@FindBy(xpath = "//input[@id='allVersions']")
	WebElement ChkAllVersions;

	// Checkbox Include Comment
	@FindBy(xpath = "//input[@id='includeComment']")
	WebElement ChkincComment;

	// Checkbox Append to hitlist
	@FindBy(xpath = "//input[@id='appendToHitList']")
	WebElement ChkappendToHitList;

	// Checkbox Find inhitlist
	@FindBy(xpath = "//input[@id='findInHitList']")
	WebElement ChkfindInHitList;

	// Click on "Select saved search"
	@FindBy(xpath = "(//select[@id='savedSearchName']")
	WebElement SelectSaveSearch;

	// Click on "Select saved search<New Search>
	@FindBy(xpath = "//select[@id='savedSearchName'])[1]")
	WebElement SelectnewSearch;

	// select "Select saved Button
	@FindBy(xpath = "//img[@id='saveBtnForSaveSearchName']")
	WebElement SaveBtn;

	// select "Select Cancel Button
	@FindBy(xpath = "//img[@id='cancelBtnForSaveSearchName']")
	WebElement CancelBtn;

	// select "Select Refresh Button
	@FindBy(xpath = "//img[@id='refreshBtnForSaveSearchName']")
	WebElement RefreshSearch;

	// Select Find Button
	@FindBy(xpath = "//button[@id='advFindBtnLabel']")
	WebElement findBtn;

	// Select Clear Button
	@FindBy(xpath = "//button[@id='clearSearchBtnLabel']")
	WebElement ClearBtn;

	// SearchDropdown Menu
	@FindBy(xpath = "//ul[@id='customListdropdownmenu']")
	WebElement cusColmndd;

	// Select Custom Colmn
	@FindBy(xpath = "//a[@id='culstomcolsearch']")
	WebElement searchCusColmn;

	// Search Custom List
	@FindBy(xpath = "//input[@id='searchInput']")
	WebElement searchCustomList;

	// Select Default Btn
	@FindBy(xpath = "//button[@id='DefaultCustomList']")
	WebElement defaultBtn;

	// Select OK Btn
	@FindBy(xpath = "//button[@id='CustomListOK']")
	WebElement cusOkBtn;

	// Select Cancel Btn
	@FindBy(xpath = "//button[@id='CustomListCancel']")
	WebElement cusCanBtn;

	// Select Close Btn
	@FindBy(xpath = "//span[@id='customListModelClose']")
	WebElement cusclosebtn;

	//
	@FindBy(xpath = "//button[@id='resetColumsOk']")
	WebElement resetColnOk;

}