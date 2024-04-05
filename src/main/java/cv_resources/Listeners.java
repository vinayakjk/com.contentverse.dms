package cv_resources;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners extends Utility implements ITestListener
{
	public Listeners(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	ExtentTest test;
	ExtentReports extend=  ExtentReportNG.getReportObject();
	@Override
	public void onTestStart(ITestResult result) 
	{
		test=extend.createTest(result.getMethod().getMethodName());
		/*String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		ATUTestRecorder recorder = null;
			try 
			{
				recorder = new ATUTestRecorder("D:\\Recorder\\","" +test+ ""+ timestamp +"", false);
			} 
			catch (ATUTestRecorderException e) 
				{
					e.printStackTrace();
				}
			try 
			{
				recorder.start();
			} 
			catch (ATUTestRecorderException e) 
			{
				e.printStackTrace();
			}*/
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
	 test.log(Status.PASS, "Test Passed");
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		test.fail(result.getThrowable());
		
		//TakeScreenShot and Attach To report 
		try {
			driver=(WebDriver) result.getTestClass().getRealClass().getField("wd").get(result.getInstance());
		} catch (Exception e1) {
		}
			String filepath = (System.getProperty("user.dir")+"\\src\\main\\java\\reports");
		test.addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
	test.fail(result.getThrowable());
		
		//TakeScreenShot and Attach To report 
		String filepath = (System.getProperty("user.dir")+"\\src\\main\\java\\reports");
		test.addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());
	}
	
	

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{
		onTestFailure(result);
	}

	@Override
	public void onStart(ITestContext context) 
	{
		
	}
	@Override
	public void onFinish(ITestContext context) 
	{
		 /*try 
		 {
			recorder.stop();
		 } catch (ATUTestRecorderException e) 
		 {
			 e.printStackTrace();
		 }*/
		extend.flush();
	}
}
