package cv_resources;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

//This listeners class added by Ajay Sharma
public class listeners implements ITestListener 
{
	String destinationfile;
	ExtentTest test;
	ExtentReportNG ex_Report = new ExtentReportNG();
	ExtentReports reports = ex_Report.getReportObject();
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case start = "+result.getMethod().getMethodName());
		test = reports.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Case PASS");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		//WebDriver d = null;
		try {
			WebDriver d = (WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
			String st = GetscreenShot.takescreenshots(d, result.getMethod().getMethodName());
			System.out.println(st);
			test.addScreenCaptureFromPath(st);
			test.log(Status.FAIL, "Test Case Fail");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Test Case Fail = " + result.getName());
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Case Skip = "+result.getName());
				
	}

/*
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}
*/
	@Override
	public void onFinish(ITestContext context) {
		reports.flush();
	}

}
