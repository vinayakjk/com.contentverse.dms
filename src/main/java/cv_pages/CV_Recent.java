package cv_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cv_resources.Utility;

public class CV_Recent extends Utility {


	@FindBy(xpath = "(//ins[@class='jstree-icon'])[1]")
	WebElement FIrstPlusIconCabinet;

	public WebElement findDocumentElementPlusIcon(String linkText) 
	{
		return driver.findElement(By.xpath("//*[contains(text(), '" + linkText + "')]/preceding-sibling::ins[@class='jstree-icon']"));
	}

	public WebElement findDocumentElementtxt(String linkText) 
	{
		return driver.findElement(By.xpath("//*[contains(text(), '" + linkText + "')]"));
	}

	@FindBy(xpath = "(//ins[@class='jstree-icon'])[3]")
	WebElement FirstPlusIconDrawer;

	@FindBy(xpath = "(//a[@href='#'])[166]")
	WebElement FirstPlusIconFolder;

	// RecentTab
	@FindBy(xpath = "//*[@id='recentMenus']")
	WebElement SubMenuRecent;

	@FindBy(xpath = "(//td[@class=' customDocName'])[1]")
	WebElement FirstDocument;

	@FindBy(xpath = "//a[@id='documentListSubMenu']")
	WebElement SubmenuDocs;

	@FindBy(xpath = "//div[@id='ownershipMessageModel']")
	WebElement winLock;

	@FindBy(xpath = "//button[@id='ownershipMessageModelOk']")
	WebElement btnokwinLock;

	// RecentFolder MouseHovermenu
	@FindBy(xpath = "//*[@id='recentFolders']/tbody/tr[1]")
	WebElement SubMenuRecentFolders;

	// RecentDocument MouseHovermenu
	@FindBy(xpath = "//*[@id='recentDocuments']/tbody/tr[1]")
	WebElement SubMenuRecentDocuments;

	// Mousehover Document header
	@FindBy(xpath = "//*[@id='recentDocuments']/thead/tr")
	WebElement Doc;

	// Folder selection in tree view
	@FindBy(xpath = "//*[@id='1022']/a")
	WebElement verifyFoldername;

	// Verifying file element
	@FindBy(xpath = "//*[@id='Val_232']")
	WebElement verifyFilevalue;

	// Click on My account
	@FindBy(xpath = "//*[@id='logoutElement']")
	WebElement myaccount;

	// Logout button
	@FindBy(xpath = "//*[@id='idSidenav']/ul/li[1]/a")
	WebElement logoutbtn;

	@FindBy(xpath = "//*[@id='recentFolders']/tbody/tr[1]/td")
	WebElement FirstFolderNameOfFolder;

	@FindBy(xpath = "//*[@id='recentDocuments']/tbody/tr[1]/td")
	WebElement FirstDocsNameOfFolder;

	WebDriver driver;

	public CV_Recent(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void verifyFolder(String Cabinet, String Drawer, String Folder) throws InterruptedException {
		Actions actions = new Actions(driver);

		// CLick On cabinet
		findDocumentElementPlusIcon(Cabinet).click();

		// CLick On Drawer
		findDocumentElementPlusIcon(Drawer).click();

		// CLick On Folder
		Thread.sleep(2000);
		WebElement folder = findDocumentElementtxt(Folder);

		Thread.sleep(2000);
		actions.moveToElement(folder).doubleClick().perform();

		// MouseHover Recent Tab
		Thread.sleep(2000);
		actions.moveToElement(SubMenuRecent).perform();
		Thread.sleep(2000);
		String First_Folder_Name = FirstFolderNameOfFolder.getText();

		if (Folder.equals(First_Folder_Name)) {
			System.out.println("Recent Folder Test Case Pass");
		}

		else {
			Assert.fail();
		}

	}

	public void verifyFile(String Folder) throws InterruptedException 
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(SubmenuDocs).perform();
		Thread.sleep(2000);

		String Name_Of_First_Docs = FirstDocument.getText();
		FirstDocument.click();
		Thread.sleep(2000);

		if (isDisaplyedW(winLock, 5)) {
			btnokwinLock.click();
		}

		actions.moveToElement(SubMenuRecent).perform();

		String First_Docs_Name = FirstDocsNameOfFolder.getText();
		if (Name_Of_First_Docs.equals(First_Docs_Name)) 
		{
			System.out.println("Recent Document Test Case Pass");
		}

		else {
			Assert.fail();
		}

	}
}
