package cv_pages;

<<<<<<< HEAD
import java.time.Duration;
=======
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
>>>>>>> vinayak-feature

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import cv_resources.Utility;

public class CV_LoginPage extends Utility {

	public WebDriver gdriver;

//Webelement - Rajendra Mane 28/02/2024
	@FindBy(id = "userName")
	WebElement username;

	@FindBy(id = "loginPassword")
	WebElement password;

	@FindBy(xpath = "//select[@id='rooms']")
	WebElement ddproject;

	@FindBy(xpath = "//button[@id='submitid']")
	WebElement btnlogin;

	@FindBy(xpath = "//div[@id='header-main']")
	WebElement header;

	@FindBy(xpath = "//span[@id='loginError']")
	WebElement lbllogin;

	@FindBy(xpath = "//button[@id='cvModelLoginValidationOk']")
	WebElement sesionmgr;

	@FindBy(xpath = "//div[@class='nameValidation']")
	WebElement lblusername;

	@FindBy(xpath = "//div[@class='passwordValidation']")
	WebElement lblpwd;

	@FindBy(xpath = "//span[@id='cvModelLoginValidationMessage']")
	WebElement validationalert;

//Constructor Rajendra -28/02/2024 
	public CV_LoginPage(WebDriver gdriver) {
		this.gdriver = gdriver;
		gdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		PageFactory.initElements(gdriver, this);

<<<<<<< HEAD
=======
	WebDriver driver;
	
	@CacheLookup	
	@FindBy(xpath = "//img[@alt='Computhink']")
	WebElement imgLogo;

	@CacheLookup	
	@FindBy(xpath = "//img[@alt='Computhink']")
	WebElement imgLog01;
	
	@CacheLookup
	@FindBy(xpath="//input[@id='userName']")
	WebElement txtUsername;
	@CacheLookup
	@FindBy(xpath="//input[@id='loginPassword']")
	WebElement txtPassword;

	@FindBy(xpath="//select[@id='rooms']/option[contains(text(),'DMS-SERVER.SUNDYNE')]")
	WebElement ddRooms;

	@FindBy(xpath="//button[@id='submitid']")
	WebElement btnSubmit;
	
	@FindBy(xpath="//span[@id='logedinusername']")
	WebElement imgLoggedInUsername;

	@FindBy(xpath="//label[@for='check1']")
	WebElement chkRemeberme;

	@FindBy(xpath="//button[@id='forgotPassword']")
	WebElement btnForgotPassword;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement btnLogout;
	
	//Forgot password pop form
	@FindBy(xpath="//input[@id='userNameforgotpassword']")
	WebElement txtUserNameForgotPwd;

	@FindBy(xpath="//select[@id='availableRoomsforgotpassword']")
	WebElement ddlForgotPwdRooms;

	@FindBy(xpath="//button[@id='forgotPasswordsendOTP']")
	WebElement btnForgotPasswordsendOTP;

	@FindBy(xpath="//span[@id='messageContentForgetPassword']")
	WebElement msgSendOtpMessge;
	
	@FindBy(xpath="//button[@id='messageButtonOKForgetPassword']")
	WebElement btnMsgOKForgotPassword;
		
	@FindBy(xpath="//span[@id='forgetPasswordMessageClose']")
	WebElement btnMsgWindowClose;
	
	@FindBy(xpath="//button[@id='forgotpasswordVerifyOtp']")
	WebElement btnForgotPasswordVerifyOtp;
	
	@FindBy(xpath="//input[@id='verifyOTPforgotpassword']")
	WebElement txtVerifyOTPforgotpassword;
	
	
	public void cv_LoginPage(WebDriver ldriver )
	{
		this.driver=ldriver;
		
	}
	
	
	public void login_cvWeb(String uid,String pass)
	{
		txtUsername.sendKeys(uid);
		txtPassword.sendKeys(pass);
		ddRooms.click();
		btnSubmit.click();
		
		//check logged in user name correctly after logging/Verify the logging username 
		
		if (imgLoggedInUsername.isDisplayed()==true)
		{
			System.out.println(imgLoggedInUsername.getText() + "logged in succeesfully.");
			imgLoggedInUsername.click();
			btnLogout.click();
			System.out.println("logged out succeesfully.");
		}
		
>>>>>>> vinayak-feature
	}

	public void login(String User, String Pass) 
	{
		SoftAssert softAssert = new SoftAssert();
		username.sendKeys(User);
		password.sendKeys(Pass);

		// For use of visible by text
		// utility.Dropdownbytxt(ddproject, "DMS-SERVER.SUNDYNE");

		// For select by index

		Utility.Dropdownbyindex(ddproject, 1);

		// Direct without using method into utility

		// Select drop=new Select(ddproject);
		// drop.selectByIndex(1);

		btnlogin.click();

		if (Utility.isDisaplyedW(sesionmgr, wd, 5))
		{
			sesionmgr.click();
			System.out.println("Another Session Ended");
		}

		if (Utility.isVisible(header, wd, 15)) 
		{
			System.out.println("Login sucess");
			softAssert.assertAll("Login With Valid data Pass");

		}

		else 
		{
			String Msg = lbllogin.getText();
			System.out.println("Login failed with reason:- " + Msg);
		}

	

	}

}
