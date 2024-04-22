package cv_pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cv_resources.Utility;

public class CV_VersionPage extends Utility 
{
	WebDriver driver;

	public CV_VersionPage(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//td[@class=' customDocName'])[1]")
	WebElement FirstDocsInConsole;

	@FindBy(xpath = "//div[@id='version']")
	WebElement tabVersion;

	@FindBy(xpath = "(//td[@class=' versionClass'])[1]")
	WebElement FirstRowVersion;

	public WebElement findVersionInt(int Num) 
	{
		return driver.findElement(By.xpath("(//td[@class=' versionClass'])[" + Num + "]"));
	}

	public WebElement findByID(String ID) 
	{
		return driver.findElement(By.xpath("//div[@id='" + ID + ".docx']"));
	}

	@FindBy(xpath = "(//td[@class=' versionClass'])[5]")
	WebElement SocondRowVersion;

	@FindBy(xpath = "(//td[@class=' versionClass'])[8]")
	WebElement SocondRowVersion_MSg;

	@FindBy(xpath = "//i[@id='fabButton']")
	WebElement BtnFab;

	@FindBy(xpath = "//i[@id='saveFabButton']")
	WebElement btnSaveFab;

	@FindBy(xpath = "//span[@id='messageContent42']")
	WebElement WindowMsg;

	@FindBy(xpath = "//button[@id='messageButtonOK42']")
	WebElement btnOKAfterSaveDocuemnt;

	@FindBy(xpath = "//div[@id='comment']")
	WebElement tabComment;

	@FindBy(xpath = "//div[@id='commentsData']")
	WebElement WindowComment;

	@FindBy(xpath = "//button[@id='addComment']")
	WebElement BtnAddComment;

	@FindBy(xpath = "//button[@id='saveComment']")
	WebElement BtnSaveAddComment;

	@FindBy(xpath = "//div[@id='saveCommentAlert']")
	WebElement MsgComment;

	@FindBy(xpath = "//button[@id='cancelComments']")
	WebElement BtnCloseComment;

	@FindBy(xpath = "//a[@class='editproperties']")
	WebElement BtnUpdateProperties;

	@FindBy(xpath = "//a[@class='saveproperties']")
	WebElement BtnSaveProperties;

	@FindBy(xpath = "//button[@id='CommentsMessageModelOk']")
	WebElement BtnOkToSAveProperties;

	@FindBy(xpath = "//span[@id='commentMessage']")
	WebElement MessageToChangeProperties;

	@FindBy(xpath = "//td[@class=' versionClass']")
	List<WebElement> IndexingOfTabVersion;

	@FindBy(xpath = "//div[@id='addPagesDropDown']")
	WebElement PlusIconAddDocument;

	@FindBy(xpath = "//div[@id='addWordFile']") // addWordFile
	WebElement ddNewWordDocumentButton;

	@FindBy(xpath = "//div[@id='addExcelFile']") // addWordFile
	WebElement ddNewExcelDocumentButton;

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

	@FindBy(xpath = "//div[@class='class2']//img[@class='imgP']")
	WebElement FirstWordICon;

	public void Verify_Version(String documentType) throws InterruptedException {
		Actions ac = new Actions(driver);

		// Open Docuemnt
	
		Thread.sleep(5000);
		FirstDocsInConsole.click();
		Thread.sleep(5000);
		ac.sendKeys(Keys.ENTER, "Content Added into Page for Verify chnage version").perform();
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(4000);

		// Add Comment On that Document
		tabComment.click();
		isVisible(WindowComment, 10);
		BtnAddComment.click();

		keypress("Add Comment For Automation Verification Version");
		Thread.sleep(3000);
		BtnSaveAddComment.click();
		if (MsgComment.getText().contains("Comment Added")) 
			{
				System.out.println("Comment Added Done");
			} 
		else 
			{
				System.out.println(MsgComment.getText());
			}
		BtnCloseComment.click();
		Thread.sleep(2000);

		// Update Properties For that Document
		BtnUpdateProperties.click();
		BtnSaveProperties.click();
		Thread.sleep(2000);
		if (MessageToChangeProperties.getText().equals("Updated Successfully")) 
		{
			System.out.println("Properties Updated Successfully");
			BtnOkToSAveProperties.click();
		}

		// Save Document
		ac.moveToElement(BtnFab).perform();
		btnSaveFab.click();
		Thread.sleep(5000);
		String msg_First = WindowMsg.getText();
		if (msg_First.contains("Document updated")) 
		{
			System.out.println(msg_First);
			btnOKAfterSaveDocuemnt.click();
			msg_First = "";
		}

		// Add Another Document

		Thread.sleep(3000);
		ac.moveToElement(PlusIconAddDocument).build().perform();
		Thread.sleep(1000);
		if (documentType.equalsIgnoreCase("Word")) 
			{
				ddNewWordDocumentButton.click();
			}

		else if (documentType.equalsIgnoreCase("Excel")) 
			{
				ddNewExcelDocumentButton.click();
			}
		Thread.sleep(2000);

		// For File Name
		String file_Name = "CV_" + currentTime();
		txtNewDocumentEnterFileName.sendKeys(file_Name);
		System.out.println(file_Name);
		btnNewDocumentOk.click();

		// Open Second Added File
		Thread.sleep(3000);
		findByID(file_Name).click();

		Thread.sleep(5000);
		if (documentType.equalsIgnoreCase("Word")) 
			{
				keypress("Statement type by Selenium Automation script");
				Thread.sleep(2000);
			} 
		else if (documentType.equalsIgnoreCase("Excel")) 
			{
				doubleClick();
				keypress("Statement type by Selenium Automation script");
				Thread.sleep(2000);
			}

		// Drag Drop second document to First

		ac.dragAndDrop(findByID(file_Name), FirstWordICon).build().perform();

		// Save Dpcument
		ac.moveToElement(BtnFab).perform();
		btnSaveFab.click();
		Thread.sleep(5000);

		String msg_Second = WindowMsg.getText();
		if (msg_Second.contains("Document updated")) {
			System.out.println(msg_Second);
			btnOKAfterSaveDocuemnt.click();
		}

		// Check Version
		tabVersion.click();
		int count = IndexingOfTabVersion.size();
		System.out.println(count);

		// Define column widths
		int columnWidth = 15;

		// Print header
		System.out.println(String.format(
				"%-" + columnWidth + "s | %-" + columnWidth + "s | %-" + columnWidth + "s     | %-" + columnWidth + "s",
				"Version No", "Updated By", "Updated On", "  Comment"));

		// Print data in tabular format
		for (int i = 1; i <= count; i = i + 4) 
		{
			String versionNo = findVersionInt(i).getText();
			String updatedBy = findVersionInt(i + 1).getText();
			String updatedOn = findVersionInt(i + 2).getText();
			String comment = findVersionInt(i + 3).getText();

			System.out.println(String.format(
					"%-" + columnWidth + "s | %-" + columnWidth + "s | %-" + columnWidth + "s | %-" + columnWidth + "s",
					versionNo, updatedBy, updatedOn, comment));
		}
	}

}
