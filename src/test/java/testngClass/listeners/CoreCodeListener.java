package testngClass.listeners;

import org.testng.*;

public class CoreCodeListener implements ISuiteListener, ITestListener {
    @Override
    public void onStart(ISuite suite) {
        System.out.println("Suite onStart");
    }

    @Override
    public void onFinish(ISuite suite) {
        System.out.println("Suite onFinish");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println(result.getMethod().getDescription());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Suite onTestFailure");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Suite onTestSkipped");
    }
}
