package utilities;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import steps.SharedSteps;

public class ListenersUtility extends SharedSteps implements ITestListener {

	SharedSteps sp;
	Logger logger=LogManager.getLogger(SharedSteps.class);;
	ExtentReports extentReport;
	ExtentTest extentTest;
	int row=1;
	

	@Override
	public void onStart(ITestContext context) {
		//logger = SharedSteps.logger; 
		logger.info("Listener Started");
		
	}

	@Override
	public void onTestStart(ITestResult result) {
	    logger.info("Test Started");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("Test Failed");
		try {
			ExcelUtility.writeTestResult(row, "Fail");
			row++;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("Test Skipped");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("Test Success");
		try {
			ExcelUtility.writeTestResult(row, "Pass");
			row++;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onFinish(ITestContext context) {
		logger.info("Listener Closed");
	}
	
	
}
