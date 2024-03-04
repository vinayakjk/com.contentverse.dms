package cv_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import cv_resources.Utility;

public class CV_Recent extends Utility{
	
	//RecentTab
	@FindBy(xpath = "//a[@id='recentMenuBtn']")
	WebElement  SubMenuRecent;
	
	//RecentFolder MouseHovermenu
	@FindBy(xpath = "//*text() = 'shraddha23')")
	WebElement SubMenuRecentFolders;
	
	//RecentDocument MouseHovermenu
	@FindBy(xpath = "//*text() = 'Shraddha')")
	WebElement SubMenuRecentDocuments;
	
	
	
		
	}
	
	
	
	
	
	
	
	
	
	

