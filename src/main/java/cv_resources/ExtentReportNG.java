package cv_resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG 
{


	//Changes Done by rajendra 28/02/2024
	public static ExtentReports getReportObject() 
		  {
				String path= System.getProperty("user.dir")+"//reports//index.html";
				ExtentSparkReporter reporter= new ExtentSparkReporter(path);
				reporter.config().setReportName("Test Cases Report");
				reporter.config().setDocumentTitle("Test Result");
			    ExtentReports extend = new ExtentReports();
				extend.attachReporter(reporter);
				extend.setSystemInfo("Tester", "Rajendra");
				return extend; 
				//extend.createTest(path);
		  }
	
}
