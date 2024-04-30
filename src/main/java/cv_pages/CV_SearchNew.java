package cv_pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cv_resources.Utility;

public class CV_SearchNew extends Utility {

	WebDriver driver;
	Actions act;
	
	public CV_SearchNew(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='e-multiselect e-input-group e-control-wrapper e-checkbox']")
	List<WebElement>  ddDocumentType;
	@FindBy(xpath = "//div[@class='e-multi-select-wrapper e-down-icon']")
	List<WebElement>  ddDocumentType1;
	
	@FindBy(xpath = "//div[@class='e-multi-select-wrapper e-down-icon']//span[@class='e-input-group-icon e-ddl-icon']")
	WebElement documentCreatorIcon;
	
	
	@FindBy(xpath = "//input[@id='createdDateFrom']")
	WebElement ddCreatedDateFrom;
	
	@FindBy(xpath = "//input[@id='createdDateTo']")
	WebElement ddCreatedDateTo;
	
	@FindBy(xpath = "//div[@id='mc-current--year']")
	WebElement currentYear;
	
	@FindBy(xpath = "//div[@class='mc-calendar mc-calendar--modal mc-calendar--opened']//div[4]")
	WebElement selectYear;
	
	@FindBy(xpath = "//div[@id='mc-current--month']")
	WebElement currentMonth;
	
	@FindBy(xpath = "//div[@aria-label='July']")
	WebElement selectMonth;
	
	public void selectDocumentType(String DocumentName) throws InterruptedException 
	{
		for (int j = 0; j < ddDocumentType1.size(); j++) 
		{
			System.out.println(ddDocumentType1.get(j).getText());
			if (ddDocumentType1.get(j).getText().trim().equalsIgnoreCase(DocumentName)) 
			{
				act = new Actions(driver);
				act.contextClick(ddDocumentType1.get(j)).build().perform();
			}
		}
	}
	
	public void selectSearchedDocument() throws InterruptedException
	{
		isVisible(documentCreatorIcon, 3);
		documentCreatorIcon.click();
	}
	public void selectDate() throws InterruptedException
	{
		ddCreatedDateFrom.click();
		currentYear.click();
		selectYear.click();
		currentMonth.click();
		
		ddCreatedDateFrom.sendKeys("01072023");
		ddCreatedDateTo.click();
		ddCreatedDateTo.sendKeys("31072023");
	}
}
