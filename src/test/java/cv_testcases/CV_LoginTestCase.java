package cv_testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import cv_pages.CV_LoginPage;

public class CV_LoginTestCase extends Base {

	CV_LoginPage login_page;
	WebDriver driver;


	@BeforeMethod
	public void initalization() throws Exception 
	{

		driver = launchBrowser();
		login_page = new CV_LoginPage(driver);

	}

	@AfterMethod
		public void tearDown() 
	{

		driver.quit();
	}

	@Test(priority = 1)
	public void check_InValid_UserName()

	{
		login_page.Invalid_Username(getInValidUsername(), getValidPassword());
	}

	@Test(priority = 2)//, groups = "smoke"
	public void check_InValid_Password()

	{
		login_page.Invalid_Password(getValidUsername(), getInvalidPassword());
	}

	@Test(priority = 3)
	public void check_Blank_Username()

	{
		login_page.Blank_Username(getInvalidPassword()); // getValidUsername()
	}

	@Test(priority = 4)
	public void check_Blank_Password()

	{
		login_page.Blank_Password(getValidUsername());// , getInvalidPassword()
	}

	@Test(priority = 5)
	public void check_Select_Room()

	{
		login_page.Select_Room(getValidUsername(), getInvalidPassword());
	}

	@Test(priority = 6)//,groups = "smoke"
	public void Check_Valid_Credentials()

	{
		login_page.Check_Valid_Credentials(getValidUsername(), getValidPassword(), getRoom());

	}

}
