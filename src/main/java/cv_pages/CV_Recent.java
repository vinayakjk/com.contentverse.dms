package cv_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import cv_resources.Utility;


public class CV_Recent extends Utility{

	/*
 		Elements from this form are dynamic so we need to provide from config or text data .
   		Text changes as per user login and visited files and folders 
     		so do changes accordingly with below locators.
   	
 	*/
	//RecentTab
	@FindBy(xpath = "//*[@id='recentMenus']")
	WebElement  SubMenuRecent;

	//RecentFolder MouseHovermenu
	@FindBy(xpath = "//*[@id='recentFolders']/tbody/tr[1]")
	WebElement SubMenuRecentFolders;
	
	//RecentDocument MouseHovermenu
	@FindBy(xpath = "//*[@id='recentDocuments']/tbody/tr[1]")
	WebElement SubMenuRecentDocuments;
	
	//Mousehover Document header 
	@FindBy(xpath = "//*[@id='recentDocuments']/thead/tr")
	WebElement Doc;
	
	//Folder selection in tree view
	@FindBy(xpath="//*[@id='1022']/a")
	WebElement verifyFoldername;
	
	//Verifying file element
	@FindBy(xpath="//*[@id='Val_232']")
	WebElement verifyFilevalue;   
	
	//Click on My account
	@FindBy(xpath="//*[@id='logoutElement']")
	WebElement myaccount;
	
	//Logout button
	@FindBy(xpath="//*[@id='idSidenav']/ul/li[1]/a")
	WebElement logoutbtn;
	
	
	
	WebDriver driver;

	

	public CV_Recent(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}  
	
	
       

	public void verifyFolder()
	{		
					
		 //MouseHover Recent Tab
	
	      Actions actions = new Actions(driver);
	       actions.moveToElement(SubMenuRecent).perform();
	       
	       
	       //Open Recent Folder
	        actions.moveToElement(SubMenuRecentFolders).click().perform();

		   //verify folder is opened or present         
	       Boolean disp =verifyFoldername.isDisplayed();
	       if(disp == true)
	       {
	      
	    	   System.out.println( verifyFoldername.getText()  +  "  folder is selected");
	       
	       }
	       
	       else
	       {
	    	   System.out.println("Folder not opened or selected");
	       }
      
		
	}
	
		
	
	public void verifyFile()
	  {
		 //MouseHover Back to Recent Tab

        Actions actions = new Actions(driver);
	    actions.moveToElement(SubMenuRecent).perform();
	    
		/*WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"recentDocuments\\\"]/tbody/tr[1]"))));
*/    	       
	     actions.moveToElement(SubMenuRecent).perform();
	     
	     //Navigate to Documents header
	     Doc.click();
	     
	    //Open Recent File
	     actions.moveToElement(SubMenuRecentDocuments).click().perform();		   
	    	            
	    //verify file is opened or present
	     Boolean filedisp = verifyFilevalue.isDisplayed();
 
	       String filename = verifyFilevalue.getAttribute("value");
	     
	     
	       if (filedisp == true)
	        {
		       System.out.println( filename +   "  document opened successfully");

	        }

	       else
	        {
		        System.out.println(" Document not found");

	         }
		
		
     }
	
	
	
	public void logout()
	  {
		
		
		myaccount.click();
		logoutbtn.click();
		
	   }
	
	
	
	
		
}
	
	
	
	
	
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	

