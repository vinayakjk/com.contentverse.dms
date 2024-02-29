package cv_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CV_ToDoList {

	//WebElement added on 28/02/2024 --Mayur
	// First visit on ToDoList.
	@FindBy(xpath = "//a[@id='myTaskMenu']")
	WebElement MenuToDoList;

	//new items.
	@FindBy(xpath = "//a[@id='newItems']")
	WebElement SubMenuNewItems;
	
	//search 
	@FindBy(xpath = "//input[@id='searchTree']")
	WebElement txtserachtodolist;

	//Pending items
	@FindBy(xpath = "//a[@id='todoPending']")
	WebElement SubMenupendingItems;

	// Reviewed items
	@FindBy(xpath = "//a[@id='todoReviewed']")
	WebElement SubMenuReviewedItems;

	// All items
	@FindBy(xpath = "//a[@id='todoAll']")
	WebElement SubMenuAllItems;

	// Sent items
	@FindBy(xpath = "//a[@id='todoSentItems']")
	WebElement SubMenusentitem;

	// Custom columns
	@FindBy(xpath = "//a[@id='todoCustomColumns']")
	WebElement SubMenucustomColumns;
	
	// Reset columns
	@FindBy(xpath = "//a[@id='todoResetColumns']")
	WebElement SubMenuRecetColumns;
	
	//search box
	@FindBy(xpath = "//input[@class='custom-input']")
	WebElement Clicksearch;
	
	//ok button
	@FindBy(xpath = "//button[@id='CustomListTodoOK']")
	WebElement btncustomsave;
	
	//Cancel button
	@FindBy(xpath = "//button[@id='CustomListTodoCancel']")
	WebElement btncustomcancel;
}
