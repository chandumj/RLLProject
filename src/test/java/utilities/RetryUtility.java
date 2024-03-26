package utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class RetryUtility implements IRetryAnalyzer,ITestListener {
	private int retryCount = 0;
    private static final int MAX_RETRY_COUNT = 1; 
    
	@Override
	public boolean retry(ITestResult result) {
		if (retryCount < MAX_RETRY_COUNT) {
            retryCount++;
            return true; // Retry the test
        }
        return false;
	}

}
