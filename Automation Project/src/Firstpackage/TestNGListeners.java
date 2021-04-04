package Firstpackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
			System.out.println("Tc Start Results Are "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Tc Success Results Are "+result.getName());		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Tc Failure Results Are "+result.getName());		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Tc Skipped Results Are "+result.getName());		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Tc Failed But With Success Percentage Results Are "+result.getName());		
	}

	@Override
	public void onStart(ITestContext result) {
		System.out.println("Tc Onstart Results Are "+result.getName());	
	}

	@Override
	public void onFinish(ITestContext result) {
		System.out.println("Tc Onfinish Results Are "+result.getName());		
	}

}
