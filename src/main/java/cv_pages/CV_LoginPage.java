package cv_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class CV_LoginPage {

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
		
	}
}
