package cv_testcases;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import cv_pages.CV_DynamicWF;
import cv_pages.CV_LoginPage;

public class CV_DynamicWFTest extends Base 
{

	CV_LoginPage cvLP; //Login Page
	CV_DynamicWF cvDF; //Dynamic WF
	ATUTestRecorder recorder;
	String className = this.getClass().getSimpleName();
	String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
	
		
	//@BeforeMethod
	public void initalization() throws Exception
	{
		System.out.println(">>- - - - - - - - - - - - - - - - - - - - - - - - - ->>");
		 launchBrowser(); //Launching Browser
		 cvLP = new CV_LoginPage(driver); //Login Page Object
		 cvDF = new CV_DynamicWF(driver); //Dynamic Page Object
	}

		@BeforeSuite
		public void StartRecord() throws ATUTestRecorderException 
		{
			recorder = new ATUTestRecorder(System.getProperty("user.dir") + "\\Recording\\", "" +className+ "" + timestamp +"", false);
			recorder.start();
		}
	
	@AfterSuite
	public void StopRecord() throws ATUTestRecorderException 
	{
		driver.quit();
		recorder.stop();
		sendEmailWithReport();
		
	}
	
	
	//@AfterMethod
	public void tearDown() throws ATUTestRecorderException
	{
		driver.quit(); //Quit Browser
	}
	
	
	@Test(priority = 1) //Send To WorkFL
	public void Create_Send_To_WF() throws Exception 
	{
		System.out.println(">>- - - - - - - - - - - - - - - - - - - - - - - - - ->>");
		 launchBrowser(); //Launching Browser
		 cvLP = new CV_LoginPage(driver); //Login Page Object
		 cvDF = new CV_DynamicWF(driver); //Dynamic Page Object
		
	
		cvLP.Check_Valid_Credentials(sheet.getRow(5).getCell(3).getStringCellValue(), //User Name
								     sheet.getRow(5).getCell(5).getStringCellValue(), // Password
								     sheet.getRow(1).getCell(7).getStringCellValue()); //Room
		
		cvDF.Worflow(sheet.getRow(16).getCell(3).getStringCellValue(), //Document Name
					 sheet.getRow(5).getCell(3).getStringCellValue(), // User Name
				     sheet.getRow(16).getCell(5).getStringCellValue(), // WF name
				     sheet.getRow(16).getCell(7).getStringCellValue(), // Cabinet Name
				     sheet.getRow(16).getCell(9).getStringCellValue(), // Drawer Name 
				     sheet.getRow(16).getCell(11).getStringCellValue(),// Folder Name 
				     sheet.getRow(26).getCell(3).getStringCellValue(), // User No
				     sheet.getRow(26).getCell(5).getStringCellValue(), // User Name
					 sheet.getRow(41).getCell(3).getStringCellValue()); // Key Field Name
		driver.quit();
	}
	
	@Test(priority = 2) //To Verify first User 
	public void Verify_WF_First_User() throws Exception {

		for (int i = sheet.getRow(26).getCell(5).getRowIndex(); i <= (sheet.getRow(26).getCell(5).getRowIndex())+ 15; i++) 
		{
			System.out.println(">>- - - - - - - - - - - - - - - - - - - - - - - - - ->>");
			launchBrowser(); // Launching Browser
			cvLP = new CV_LoginPage(driver); // Login Page Object
			cvDF = new CV_DynamicWF(driver); // Dynamic Page Object

			cvLP.Check_Valid_Credentials(sheet.getRow(i).getCell(5).getStringCellValue(), // User Name -Change
					sheet.getRow(i).getCell(7).getStringCellValue(), // Password -Change
					sheet.getRow(1).getCell(7).getStringCellValue()); // Room);

			cvDF.WorflowVerify(sheet.getRow(i).getCell(9).getStringCellValue(), // Work Flow Status -Change
					sheet.getRow(16).getCell(3).getStringCellValue(), // Document Name
					sheet.getRow(i).getCell(5).getStringCellValue(), // UserName -Change
					sheet.getRow(16).getCell(7).getStringCellValue(), // Cabinet Name
					sheet.getRow(16).getCell(9).getStringCellValue(), // Drawer Name
					sheet.getRow(16).getCell(11).getStringCellValue(), // Folder Name
					sheet.getRow(i + 1).getCell(3).getStringCellValue(), // Next User No -Change
					sheet.getRow(i + 1).getCell(5).getStringCellValue()); // Next User Name -Change
			// sheet.getRow(i).getCell(5).getStringCellValue()); // First UserName

			driver.quit();
		}
	}
	
	
	@Test(priority = 3)
	public void WorflowVerify_Reject() throws Exception

	{
		// Reject Case :- If any user reject Document then for verification Purpose

		if (   (sheet.getRow(18).getCell(9).getStringCellValue().contains("reject"))  //First User Reject
			|| (sheet.getRow(19).getCell(9).getStringCellValue().contains("reject"))  //Second User Reject
			|| (sheet.getRow(20).getCell(9).getStringCellValue().contains("reject"))  //Third User Reject
			|| (sheet.getRow(21).getCell(9).getStringCellValue().contains("reject"))  //Forth User Reject
			|| (sheet.getRow(22).getCell(9).getStringCellValue().contains("reject"))) //Fifth User Reject 
		{
			System.out.println(">>- - - - - - - - - - - - - - - - - - - - - - - - - ->>");
	   		 launchBrowser(); //Launching Browser
	   		 cvLP = new CV_LoginPage(driver); //Login Page Object
	   		 cvDF = new CV_DynamicWF(driver); //Dynamic Page Object
			
			cvLP.Check_Valid_Credentials(sheet.getRow(5).getCell(3).getStringCellValue(), //Originator User Username
										 sheet.getRow(5).getCell(5).getStringCellValue(), //Originator User Password
										 sheet.getRow(1).getCell(7).getStringCellValue());//Roon
			
			System.out.println("Workflow Rejected case Verified");
			
			cvDF.Verify_Reject_Workflow(sheet.getRow(16).getCell(3).getStringCellValue()); //Document Name
			
			if (sheet.getRow(18).getCell(9).getStringCellValue().contains("reject")) 
			{
			 System.out.println("Workflow rejected by first User of name :-"+sheet.getRow(18).getCell(5).getStringCellValue()); //First User UserName
			} 
			else if (sheet.getRow(19).getCell(9).getStringCellValue().contains("reject")) 
			{
			 System.out.println("Workflow rejected by Second User of name :-"+sheet.getRow(19).getCell(5).getStringCellValue()); //Second User UserName
			}
			else if (sheet.getRow(20).getCell(9).getStringCellValue().contains("reject")) 
			{
			 System.out.println("Workflow rejected by Third User of name :-"+sheet.getRow(20).getCell(5).getStringCellValue()); //Third User UserName
			}
			else if (sheet.getRow(21).getCell(9).getStringCellValue().contains("reject")) 
			{
			 System.out.println("Workflow rejected by Forth User of name :-"+sheet.getRow(21).getCell(5).getStringCellValue()); //Forth User UserName
			}
			else if (sheet.getRow(22).getCell(9).getStringCellValue().contains("reject")) 
			{
			 System.out.println("Workflow rejected by Fifth User of name :-"+sheet.getRow(22).getCell(5).getStringCellValue()); //Fifth User UserName
			}
			System.out.println(">>--------------------------------->>");
		} 
		else 
		{
			System.out.println("Work flow accepted by all User");
		}
		

	}
	
	
	
}
