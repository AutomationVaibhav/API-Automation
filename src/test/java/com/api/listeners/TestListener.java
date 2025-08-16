package com.api.listeners;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    private static final Logger LOGGER = LogManager.getLogger(TestListener.class);

    public void onTestStart(ITestResult result) {
        LOGGER.info("TEST SUITE STARTED");
    }

    public void onTestSuccess(ITestResult result) {
        LOGGER.info("Passed!! "+ result.getMethod().getMethodName());
        LOGGER.info("Description!! "+ result.getMethod().getDescription());

    }

    public void onTestFailure(ITestResult result) {
        LOGGER.error("Failed!! "+ result.getMethod().getMethodName());

    }

    public void onTestSkipped(ITestResult result) {
        LOGGER.warn("Skipped!! "+ result.getMethod().getMethodName());

    }


    public void onFinish(ITestContext context) {
        LOGGER.info("TEST SUITE FINISHED");

    }


}
