package cv_pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CV_LoginPage {

public WebDriver gdriver;
	
//Webelement - Rajendra Mane 28/02/2024
	@FindBy(id = "userName")
	WebElement username;

	@FindBy(id = "loginPassword")
	WebElement password;

	@FindBy(xpath = "//select[@id='rooms']")
	WebElement ddproject ;

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
	public CV_LoginPage(WebDriver gdriver)
	{
		this.gdriver=gdriver;
		gdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		PageFactory.initElements(gdriver, this);
		
		
	}
		
	@Test
	public void demo()
	{
		System.out.println("demo");
		
		System.out.println("demo1");
		
		System.out.println("demo1");
	}
}
