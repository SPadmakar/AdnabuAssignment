package genericPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomeListeners extends BaseTest implements ITestListener {
	
	
	public void onTestStart(ITestResult result) {
		
	}

	
	public void onTestSuccess(ITestResult result) {
		
	}


	public void onTestFailure(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName+" method failed & taken ScreenShot");
		failedMethod(methodName);
	}

	

	public void onTestSkipped(ITestResult result) {
	
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}


	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	
	public void onStart(ITestContext context) {
		
	}


	public void onFinish(ITestContext context) {
	
	}

}
