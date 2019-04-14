package generic;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
public class MyTestListeners implements ISuiteListener, ITestListener {
	@Override
	public void onStart(ISuite suite) {
		String suiteName = suite.getName();
		Reporter.log(suiteName + " --> Suite started..", true);
	}
	@Override
	public void onFinish(ISuite suite) {
		Reporter.log(suite.getName() + " --> Suite finished..", true);
	}
	@Override
	public void onStart(ITestContext testBlock) {
		Reporter.log(testBlock.getName() + " --> Test block  Started..", true);
	}
	@Override
	public void onFinish(ITestContext testBlock) {
		Reporter.log(testBlock.getName() + " --> Test block finished..", true);
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
	}
	@Override
	public void onTestFailure(ITestResult testMethod) {
		Reporter.log(testMethod.getName() + " --> Test Method Failed..", true);
	}
	@Override
	public void onTestSkipped(ITestResult testMethod) {
		Reporter.log(testMethod.getName() + " --> Test Method skipped..", true);
	}
	@Override
	public void onTestStart(ITestResult testMethod) {
		Reporter.log(testMethod.getName() + " --> Test Method started..", true);
	}
	@Override
	public void onTestSuccess(ITestResult testMethod) {
		Reporter.log(testMethod.getName() + " --> Test Method Pass..", true);
	}
}
