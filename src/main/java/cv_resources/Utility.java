package cv_resources;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {


	static WebDriver driver;

	public static class ConfigReader {
	    private static String Username ;
		private static Properties properties;
	    private static String browser;
	    private static String url;
	    private static String Password;

	    static {
	        properties = new Properties();
	        try {
	        	
	            FileInputStream fis = new FileInputStream((System.getProperty("user.dir")+"\\src\\main\\java\\cv_resources\\Config.properties"));
	            
	            properties.load(fis);
	            browser = properties.getProperty("browser");
	            url = properties.getProperty("url");
	            Username = properties.getProperty("Username");
	            Password= properties.getProperty("Password");
	            
	        } catch (IOException e) 
	        {

	        }
	    }

	    public static String getBrowser() {
	        return browser;
	    }

	    public static String getUrl() {
	        return url;
	    }
	    
	    public static String getUsername() {
	        return Username;
	    }
	    
	    public static String getPassword() {
	        return Password;
	    }
	   
	    
	}	

	public void Dropdown(By drp_Ele, String visible) 
	{
		Select dropdown = new Select((WebElement) drp_Ele);
		dropdown.selectByVisibleText(visible);

	}

	public static void Dropdownbytxt(WebElement cat, String visible) 
	{
		Select dropdown = new Select(cat);
		dropdown.selectByVisibleText(visible);
	}

	public static void Dropdownbyindex(WebElement cat, int visible) 
	{
		Select dropdown = new Select(cat);
		dropdown.selectByIndex(visible);

	}

	public static boolean isInvisible(WebElement Element, WebDriver wd, long tm) {
		boolean isDisplayed = false;

		try {

			WebDriverWait wt = new WebDriverWait(wd, Duration.ofMinutes(tm));
			wt.until(ExpectedConditions.invisibilityOf(Element));
			isDisplayed = true;
		} catch (Exception e)

		{
			e.printStackTrace();
		}

		return isDisplayed;

	}

	public static boolean isDisaplyed(By Locator, WebDriver wd, long tm) {
		boolean isDisplayed = false;

		try {

			WebDriverWait wt = new WebDriverWait(wd, Duration.ofSeconds(tm));
			// wt.until(null)
			wt.until(ExpectedConditions.visibilityOfElementLocated(Locator));
			isDisplayed = true;
		} catch (Exception e)

		{

			e.printStackTrace();

		}

		return isDisplayed;

	}

	public void login(WebDriver wd, String url, String User, String Pass) {

		wd.manage().window().maximize();
		wd.findElement(By.id("UserName")).sendKeys(User);
		wd.findElement(By.name("Password")).sendKeys(Pass);
		wd.findElement(By.id("btnLogin")).click();
		System.out.println("Login Sucessfull");

	}

	// Print Message
	public static void print(WebElement Print, String cat, Integer no) {
		String text = Print.getText();
		System.out.println(no + " : " + cat + " " + text);

	}

	// URL Checking
	public static void checkUrl(WebDriver wd) {

		String url = "";
		HttpURLConnection huc = null;
		int respCode = 200;

		List<WebElement> links = wd.findElements((By.xpath("//ul[@class='nav navbar-nav pull-right']//a")));
		Iterator<WebElement> it = links.iterator();

		while (it.hasNext()) {

			url = it.next().getAttribute("href");

			if (url != null && url.endsWith(".aspx")) {
				System.out.println(url);

				try {
					huc = (HttpURLConnection) (new URL(url).openConnection());

					huc.setRequestMethod("HEAD");

					huc.connect();

					respCode = huc.getResponseCode();

					if (respCode >= 400) {
						System.out.println(url + " is a broken link");
					} else {
						System.out.println(url + " :-( Is a valid link)");
					}

				} catch (MalformedURLException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			continue;
		}

	}

	public static boolean isVisible(WebElement WebElement, WebDriver wd, long tm) {
		boolean isVisible = false;

		try {

			WebDriverWait wt = new WebDriverWait(wd, Duration.ofSeconds(tm));
			wt.until(ExpectedConditions.visibilityOf(WebElement));
			isVisible = true;
		} catch (Exception e)

		{
			e.printStackTrace();
		}

		return isVisible;

	}

	public String getScreenshot(String testCaseName, WebDriver wd) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) wd;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir") + "//reports//" + testCaseName + ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir") + "//reports//" + testCaseName + ".png";

	}

	public static boolean isDisaplyedW(WebElement Ele, WebDriver wd, long tm) {
		boolean isDisplayed = false;

		try {

			WebDriverWait wt = new WebDriverWait(wd, Duration.ofSeconds(tm));
			wt.until(ExpectedConditions.visibilityOf(Ele));
			isDisplayed = true;
		} catch (Exception e)

		{
	
		}

		return isDisplayed;

	}

	public void closebrowser() 
	{
		driver.close();
	}

	public static boolean isClickable(WebElement WebElement, WebDriver driver, long tm) {
		boolean isClickable = false;

		try {

			WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(3));
			wt.until(ExpectedConditions.elementToBeClickable(WebElement));
			isClickable = true;
		} catch (Exception e)

		{


		}

		return isClickable;

	}

	public static boolean isClicked(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			return true;
		} catch (Exception e) {
			return false;
		}
	}


	public static boolean isAlertPresent(WebDriver wd) 
	{
		try {
				wd.switchTo().alert();
				return true;
			} 	catch (Exception e) 
			{
			return false;
    }

		}


	public static WebDriver startBrowser() //String browserName,String url
	{
		if(ConfigReader.getBrowser().equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();

		}
		else if (ConfigReader.getBrowser().equalsIgnoreCase("chrome"))
		{

			driver=new ChromeDriver();

		}
		else if (ConfigReader.getBrowser().equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.get(ConfigReader.url);
		
		return driver;


	}
	
	
}

