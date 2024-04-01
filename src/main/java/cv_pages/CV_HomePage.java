package cv_pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cv_resources.Utility;

public class CV_HomePage {

	WebDriver driver;
	String CabinateName;
	Actions act;

	public CV_HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "navigationMenuBtn")
	WebElement btnDataBaseName;

	@FindBy(id = "createNodeAnchorForCabinet")
	WebElement createCabinate;

	// @FindBy(id= "//a[@id='createNodeAnchorForCabinet' and @class='disabled']")
	// WebElement createCabinateDisable;

	@FindBy(id = "createNodeAnchor")
	WebElement createDrawer;

	@FindBy(id = "newNodeName13")
	WebElement txtEnterCabinateName;

	@FindBy(id = "newNodeName")
	WebElement txtEnterDrawerName;

	@FindBy(id = "createNewNodeOk13")
	WebElement btnOKCreateCabinate;

	@FindBy(id = "createNewNodeOk")
	WebElement btnOKCreateDrwaer;

	@FindBy(xpath = "//div[@id='viewDocumentnavigator']/ul/li")
	List<WebElement> listCabinates;

	@FindBy(xpath = "//div[@id='viewDocumentnavigator']//ul//ul//li")
	List<WebElement> listOfDrawers;

	@FindBy(id = "floatButton")
	WebElement btnOnCabinateNamefloatButton;

	@FindBy(xpath = "//li[@class='jstree-open']")
	WebElement minusbtn;

	public void cN() {
		CabinateName = Utility.currentTime();
	}

	public boolean cv_CabinateCreation() throws Exception {

		boolean result = false;
		act = new Actions(driver);
		act.moveToElement(btnDataBaseName).build().perform();
		Thread.sleep(3000);
		if (createCabinate.getAttribute("class").equalsIgnoreCase("disabled")) {
			// act.moveToElement(createCabinate).click().build().perform();
			System.out.println("User not having permission");

		} else {
			System.out.println("User is having permission");
			act.moveToElement(createCabinate).click().build().perform();

		}

		cN();
		txtEnterCabinateName.sendKeys("CV_" + CabinateName);
		btnOKCreateCabinate.click();
		for (int i = 0; i < listCabinates.size(); i++) {
			if (listCabinates.get(i).getText().trim().equalsIgnoreCase("CV_" + CabinateName)) {
				{
					listCabinates.get(i).click();
					result = true;
					break;
				}
			}

		}
		return result;
	}

	public void cvCreateDrawer() throws Exception {
		Thread.sleep(3000);
		btnOnCabinateNamefloatButton.click();
		act = new Actions(driver);
		act.moveToElement(createDrawer).click().build().perform();
		txtEnterDrawerName.sendKeys(Utility.currentTime());
		btnOKCreateDrwaer.click();
		Thread.sleep(1000);
		Assert.assertEquals(minusbtn.isDisplayed(), true);

	}
}
