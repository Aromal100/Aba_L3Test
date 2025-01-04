package utilities;


import java.awt.Desktop;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testBase.BaseClass;

public class ExtentReportsManager implements ITestListener {
	
	ExtentSparkReporter Reporter;
	ExtentReports Reports;
	ExtentTest Test;
	String repname;
	
	 public void onStart(ITestContext context) {
		 
		 SimpleDateFormat df= new SimpleDateFormat("dd.MM.yyyy");
		 Date d= new Date();
		 String currentdate=df.format(d);
		 repname="Test-report"+ currentdate +".html";
		 Reporter= new ExtentSparkReporter(".\\reports\\"+repname);
		 Reporter.config().setDocumentTitle("ABA Login report");
		 Reporter.config().setReportName("LoginTest");
		 Reporter.config().setTheme(Theme.DARK);
		 
		 Reports= new ExtentReports();
		 Reports.attachReporter(Reporter);
		 Reports.setSystemInfo("Application", "Aba_school");
		 String os=context.getCurrentXmlTest().getParameter("os");
		 Reports.setSystemInfo("Operating System", os);
		 
		 String browser=context.getCurrentXmlTest().getParameter("browser");
		 Reports.setSystemInfo("Browser", browser);
		  }
	 
	 public void onTestSuccess(ITestResult result) {
		 Test=Reports.createTest(result.getName());
			Test.log(Status.PASS,"Test is success");
		  }
	 public void onTestFailure(ITestResult result) {
		 Test=Reports.createTest(result.getName());
		 Test.log(Status.FAIL,"Test is failed");
		 
		 try
		 {
			 String imgPath=new BaseClass().capturescreenshot(result.getName());
			 Test.addScreenCaptureFromPath(imgPath);
		 }
		 catch(Exception e)
		 {
			 System.out.println("failed");
		 }
		 
		 
		 
		 
		  }
	 public void onFinish(ITestContext context) {
		    Reports.flush();
		    String pathOfExportReport=System.getProperty("user.dir")+"\\reports\\"+repname;
		    File extentReport= new File(pathOfExportReport);
		    
		    try
		    {
		    	Desktop.getDesktop().browse(extentReport.toURI());
		    }
		    catch(Exception e)
		    {
		    	
		    }
		  }

	

}
