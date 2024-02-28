package cv_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CV_ToDoList {

	// Webelement added on 28/02/2024 --Mayur
	// First visit on ToDoList.
	@FindBy(xpath = "//a[@id='myTaskMenu']")
	WebElement ClickToDoList;

	// new items.
	@FindBy(xpath = "//a[@id='newItems']")
	WebElement ClickNewItems;

	// Pending items
	@FindBy(xpath = "//a[@id='todoPending']")
	WebElement ClickpendingItems;

	// Reviewed items
	@FindBy(xpath = "//a[@id='todoReviewed']")
	WebElement ClickReviewedItems;

	// All items
	@FindBy(xpath = "//a[@id='todoAll']")
	WebElement ClickAllItems;

	// Sent items
	@FindBy(xpath = "//a[@id='todoSentItems']")
	WebElement Clicksentitem;

	// Custom columns
	@FindBy(xpath = "//a[@id='todoCustomColumns']")
	WebElement Clickcustomcolumns;

}
