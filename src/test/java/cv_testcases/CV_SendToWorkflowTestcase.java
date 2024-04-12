package cv_testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cv_pages.CV_LoginPage;
import cv_pages.CV_SendToWorkflowPage;

public class CV_SendToWorkflowTestcase extends Base
{
	CV_LoginPage login_page;
	WebDriver driver;
	CV_SendToWorkflowPage sendWF;

	@BeforeMethod
	public void initalization() throws Exception 
	{
		driver = launchBrowser();
		login_page = new CV_LoginPage(driver);
		sendWF=new CV_SendToWorkflowPage(driver);
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
		sendWF.WorflowVerify_By_First_User(getWorkflowStatus_By_First_User(),getDocumentName(),getWorkflowVerify_F_User());
		System.out.println("Workflow Verify By First User Done");
		System.out.println(">>--------------------------------->>");
	}


	@Test(priority = 3)
	public void WorflowVerify_By_Second_User() throws InterruptedException 

	{
		if(getWorkflowStatus_By_First_User().contains("Accept"))
		{
		login_page.Check_Valid_Credentials(getWorkflowVerify_S_User(), getWorkflowVerify_S_Password(),getRoom());
		System.out.println("Workflow Verify By Second User Started of UserName:-"+getWorkflowVerify_S_User());
		sendWF.WorflowVerify_By_Second_User(getWorkflowStatus_By_Second_User(),getDocumentName(),getWorkflowVerify_S_User());
		System.out.println("Workflow Verify By Second User Done");
		System.out.println(">>--------------------------------->>");
		}
		else 
		{
			System.out.println("This Document all rejected By previous User of name "+getWorkflowVerify_F_User());
		}
	}
	

	@Test(priority = 4)
	public void WorflowVerify_Reject() throws InterruptedException 

	{
		if((getWorkflowStatus_By_First_User().contains("reject"))||(getWorkflowStatus_By_Second_User().contains("reject")))
		{
			login_page.Check_Valid_Credentials(getValidUsername(), getValidPassword(),getRoom());
			System.out.println("Workflow Rejected case Verified");
			sendWF.Verify_Reject_Workflow(getDocumentName());
			if(getWorkflowStatus_By_First_User().contains("reject"))
			{
			 System.out.println("Workflow rejected by first User of name :- "+getWorkflowVerify_F_User());	
			}
			else if(getWorkflowStatus_By_Second_User().contains("reject"))
			{
			 System.out.println("Workflow rejected by Second User of name :- "+getWorkflowVerify_S_User());	
			}
			System.out.println(">>--------------------------------->>");
		}
		else 
		{
			System.out.println("Work In accept flow");
		}
		
		
	}


}
