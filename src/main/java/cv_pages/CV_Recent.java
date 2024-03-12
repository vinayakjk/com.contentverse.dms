package cv_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cv_resources.Utility;

public class CV_Recent extends Utility{

	/*
 		Elements from this form are dynamic so we need to provide from config or text data .
   		Text changes as per user login and visited files and folders 
     		so do changes accordingly with below locators.
   	
 	*/
	//RecentTab
	@FindBy(xpath = "//a[@id='recentMenuBtn']")
	WebElement  SubMenuRecent;
	
	//RecentFolder MouseHovermenu text should be provided by User
	@FindBy(xpath = "//*text() = 'SCLUpload')")
	WebElement SubMenuRecentFolders;
	
	//RecentDocument MouseHovermenu  text should be provided by User
	@FindBy(xpath = "//*text() = 'RecentDoc')")
	WebElement SubMenuRecentDocuments;
	
	
	
		
	}
	
	
	
	
	
	
	
	
	
	

