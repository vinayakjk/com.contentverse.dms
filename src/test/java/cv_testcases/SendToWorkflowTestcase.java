package cv_testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cv_pages.CV_LoginPage;
import cv_pages.SendToWorkflowPage;

public class SendToWorkflowTestcase extends Base
{
	CV_LoginPage login_page;
	WebDriver driver;
	SendToWorkflowPage sendWF;

	@BeforeMethod
	public void initalization() throws Exception 
	{
		driver = launchBrowser();
		login_page = new CV_LoginPage(driver);
		sendWF=new SendToWorkflowPage(driver);
	}

	@AfterMethod
		public void tearDown() 
	{
		driver.quit();
	}

	@Test(priority = 1)
	public void SendToWorkFlow() throws InterruptedException

	{
		login_page.Check_Valid_Credentials(getValidUsername(), getValidPassword(),getRoom());
		System.out.println("Document Upload and send to workflow Started From Originator Of User"+getValidUsername());
		sendWF.Worflow(getDocumentName(),getValidUsername(),getName_OF_WF());
		System.out.println("Document Upload and send to workflow Started From Originator Done");
		System.out.println(">>---------------------------------------------------------------->>");
	}

	@Test(priority = 2)
	public void WorflowVerify_By_First_User() throws InterruptedException 

	{
		login_page.Check_Valid_Credentials(getWorkflowVerify_F_User(), getWorkflowVerify_F_Password(),getRoom());
		System.out.println("Workflow Verify By First User StartedUserName:-"+getWorkflowVerify_F_User());
		sendWF.WorflowVerify_By_First_User(getWorkflowStatus(),getDocumentName(),getWorkflowVerify_F_User());
		System.out.println("Workflow Verify By First User Done");
		System.out.println(">>--------------------------------->>");
	}


	@Test(priority = 3)
	public void WorflowVerify_By_Second_User() throws InterruptedException 

	{
		login_page.Check_Valid_Credentials(getWorkflowVerify_S_User(), getWorkflowVerify_S_Password(),getRoom());
		System.out.println("Workflow Verify By Second User Started of UserName:-"+getWorkflowVerify_S_User());
		sendWF.WorflowVerify_By_Second_User(getWorkflowStatus(),getDocumentName(),getWorkflowVerify_S_User());
		System.out.println("Workflow Verify By Second User Done");
		System.out.println(">>--------------------------------->>");
	}


}
