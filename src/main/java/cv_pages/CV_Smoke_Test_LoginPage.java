package cv_pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import cv_resources.Utility;

public class CV_Smoke_Test_LoginPage extends Utility {
	WebDriver driver;
	String CabinateName;
	@CacheLookup
	@FindBy(xpath = "//img[@alt='Computhink']")
	WebElement imgLogo;

	@CacheLookup
	@FindBy(xpath = "//img[@alt='Computhink']")
	WebElement imgLog01;

	@CacheLookup
	@FindBy(xpath = "//input[@id='userName']")
	WebElement txtUsername;
	@CacheLookup
	@FindBy(xpath = "//input[@id='loginPassword']")
	WebElement txtPassword;

	@FindBy(xpath = "//select[@id='rooms']/option[contains(text(),'DMS-SERVER.SUNDYNE')]")
	WebElement ddRooms;

	@FindBy(xpath = "//button[@id='submitid']")
	WebElement btnSubmit;

	@FindBy(xpath = "//span[@id='logedinusername']")
	WebElement imgLoggedInUsername;

	@FindBy(xpath = "//label[@for='check1']")
	WebElement chkRemeberme;

	@FindBy(xpath = "//button[@id='forgotPassword']")
	WebElement btnForgotPassword;

	@FindBy(xpath = "//a[normalize-space()='Logout']")
	WebElement btnLogout;

	// Forgot password pop form
	@FindBy(xpath = "//input[@id='userNameforgotpassword']")
	WebElement txtUserNameForgotPwd;

	@FindBy(xpath = "//select[@id='availableRoomsforgotpassword']")
	WebElement ddlForgotPwdRooms;

	@FindBy(xpath = "//button[@id='forgotPasswordsendOTP']")
	WebElement btnForgotPasswordsendOTP;

	@FindBy(xpath = "//span[@id='messageContentForgetPassword']")
	WebElement msgSendOtpMessge;

	@FindBy(xpath = "//button[@id='messageButtonOKForgetPassword']")
	WebElement btnMsgOKForgotPassword;

	@FindBy(xpath = "//span[@id='forgetPasswordMessageClose']")
	WebElement btnMsgWindowClose;

	@FindBy(xpath = "//button[@id='forgotpasswordVerifyOtp']")
	WebElement btnForgotPasswordVerifyOtp;

	@FindBy(xpath = "//input[@id='verifyOTPforgotpassword']")
	WebElement txtVerifyOTPforgotpassword;

	@FindBy(xpath = "//button[@id='cvModelLoginValidationOk']")
	WebElement WindowSesionMgr;

	@FindBy(xpath = "//div[@id='header-main']")
	WebElement HeaderMenu;

	@FindBy(xpath = "//span[@id='loginError']")
	WebElement lbllogin;

	@FindBy(xpath = "//form[@id='loginForm']")
	WebElement LoginForm;

	@FindBy(xpath = "//label[@id='copyrightlbl']")
	WebElement ActCopyright;

	@FindBy(xpath = "//div[@id='locale']")
	WebElement LanguageTab;

	@FindBy(xpath = "//a[@id='navigationMenuBtn']")
	WebElement SelectedRoom;

	@FindBy(xpath = "//a[@id='createNodeAnchorForCabinet']")
	WebElement MenuCreateCabinet;

	@FindBy(xpath = "//button[@id='createNewNodeCancel13']")
	WebElement BtncanclecreateCabinet;

	@FindBy(xpath = "//input[@id='newNodeName13']")
	WebElement txtNameCabinet;

	@FindBy(xpath = "(//ins[@class='jstree-icon'])[1]")
	WebElement FirstPlusICon;

	@FindBy(xpath = "//li[@id='2']//a[@href='#']")
	WebElement firstDrawer;

	@FindBy(xpath = "//span[@id='floatButton']")
	WebElement BtnFloat;

	@FindBy(linkText = "Create Folder...")
	WebElement clickNewFOlder;

	@FindBy(xpath = "//button[@id='createNewNodeCancel']")
	WebElement btncancleCreateFolder;

	@FindBy(xpath = "(//a[@href='#'])[142]")
	WebElement clickOnFirstCabinet;

	@FindBy(id = "navigationMenuBtn")
	WebElement btnDataBaseName;

	@FindBy(xpath = "//a[@id='createNodeAnchorForCabinet']")
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

	public CV_Smoke_Test_LoginPage(WebDriver driver)

	{
		super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);
	}

	SoftAssert softAssert = new SoftAssert();

	public void ST_Loginpage(String act, String Language) {
		LoginForm.isDisplayed();
		System.out.println("Login Form Displayed");
		System.out.println(">>-------------------------------------------->>");
		imgLogo.isDisplayed();
		System.out.println("Image Logo is displayed");
		System.out.println(">>-------------------------------------------->>");
		txtUsername.isDisplayed();
		System.out.println("Username Displayed");
		System.out.println(">>-------------------------------------------->>");
		txtPassword.isDisplayed();
		System.out.println("Password Form Displayed");
		System.out.println(">>-------------------------------------------->>");
		btnSubmit.isDisplayed();
		System.out.println("Submit Button Displayed");
		System.out.println(">>-------------------------------------------->>");
		ddRooms.isDisplayed();
		System.out.println("Room Displayed");
		System.out.println(">>-------------------------------------------->>");
		chkRemeberme.isDisplayed();
		System.out.println("Remember Checkbox Displayed");
		System.out.println(">>-------------------------------------------->>");
		btnForgotPassword.isDisplayed();
		System.out.println("Btn forgot Password Displayed");
		System.out.println(">>-------------------------------------------->>");
		String Act_Msg = ActCopyright.getText();
		System.out.println(Act_Msg);
		softAssert.assertEquals(Act_Msg, act);
		String Lab_msg = LanguageTab.getText();
		System.out.println(Lab_msg);
		System.out.println(">>-------------------------------------------->>");
		softAssert.assertEquals(Lab_msg, Language);
		softAssert.assertAll();
		System.out.println("Login Page Smoke test Case Passsed");
	}

	public void ST_SelectectedRoom(String User, String Pwd) {
		txtUsername.sendKeys(User);
		txtPassword.sendKeys(Pwd);
		ddRooms.click();
		btnSubmit.click();

		if (isDisaplyedW(WindowSesionMgr, 1)) {
			WindowSesionMgr.click();
			System.out.println("Another Session Ended");
		}

		isDisaplyedW(SelectedRoom, 10);
		String room = SelectedRoom.getText();
		softAssert.assertEquals(room, "SUNDYNE");

		String Username = imgLoggedInUsername.getText();
		softAssert.assertEquals(Username, User);
		/*
		 * imgLoggedInUsername.click(); btnLogout.click();
		 * if(utility.isInvisible(imgLoggedInUsername, driver, 02)==true) {
		 * softAssert.assertTrue(true); }
		 */
		softAssert.assertAll();
	}

	public void cN() {
		CabinateName = currentTime();
	}

	public void ST_CreateCabinet(String User) {

		Actions ac = new Actions(driver);
		ac.moveToElement(SelectedRoom).build().perform();

		if (createCabinate.getAttribute("class").equalsIgnoreCase("disabled")) {
			// act.moveToElement(createCabinate).click().build().perform();
			System.out.println("User not having permission");

		} else {
			System.out.println("User is having permission");
			ac.moveToElement(SelectedRoom).perform();
			createCabinate.click();
			cN();
			txtEnterCabinateName.sendKeys("CV_" + CabinateName);
			btnOKCreateCabinate.click();
			for (int i = 0; i < listCabinates.size(); i++) {
				if (listCabinates.get(i).getText().trim().equalsIgnoreCase("CV_" + CabinateName)) {
					{
						listCabinates.get(i).click();
						// result = true;
						break;
					}
				}

			}
			// return result;
		}

		/*
		 * if(utility.isClicked(MenuCreateCabinet)==true) { softAssert.assertTrue(true);
		 * utility.isClicked(BtncanclecreateCabinet);
		 * System.out.println(ConfigReader.getUsername()
		 * +":- This user should able to create a cabinet."); } else {
		 * System.out.println(ConfigReader.getUsername()
		 * +":- This user should not able to create a cabinet.");
		 * 
		 * }
		 */
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		FirstPlusICon.click();
		firstDrawer.click();
		BtnFloat.click();

		if (isClicked(clickNewFOlder) == true) {
			softAssert.assertTrue(true);
			isClicked(btncancleCreateFolder);
			System.out.println(User + ":- This user should able to create a Folder");
		} else {
			System.out.println(User + ":- This user should not able to create a Folder");

		}
		softAssert.assertAll();

	}
}
