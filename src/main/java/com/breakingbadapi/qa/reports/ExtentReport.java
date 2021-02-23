package com.breakingbadapi.qa.reports;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.breakingbadapi.qa.apiConfigs.APIPath;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport implements ITestListener{
	protected static ExtentReports reports;
	protected static ExtentTest test;

	private static String resultpath = getResultPath();


	public static void deleteDirectory(File directory) {
		if (directory.exists()) {
			File[] files = directory.listFiles();
			if (null != files) {
				for (int i = 0; i < files.length; i++) {
//					System.out.println(files[i].getName());
					if (files[i].isDirectory()) {
						deleteDirectory(files[i]);
					} else {
						files[i].delete();
					}
				}
			}
		}
	}

	private static String getResultPath() {

		resultpath = "test";//new SimpleDateFormat("yyyy-MM-dd hh-mm.ss").format(new Date());
		if (!new File(resultpath).isDirectory()) {
			new File(resultpath);
		}
		return resultpath;
	}

	String ReportLocation = "test-output/Report/" + resultpath + "/";
	
	@Override
	public void onStart(ITestContext result) {
//		System.out.println(ReportLocation + "  ReportLocation");
		reports = new ExtentReports(APIPath.getReportpath());
		test = reports.startTest("");
		
	}
	@Override
	public void onFinish(ITestContext arg0) {
		reports.endTest(test);
		reports.flush();
		
	}

	

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		test.log(LogStatus.FAIL,"Test is fail");
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		test.log(LogStatus.SKIP, "Test is skipped");
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		test = reports.startTest(result.getMethod().getMethodName());
		test.log(LogStatus.INFO, result.getMethod().getMethodName());
//		System.out.println(result.getTestClass().getTestName());
//		System.out.println(result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		test.log(LogStatus.PASS, "Test is pass");
		
	}

}
