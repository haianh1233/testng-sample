package com.group.listenertest;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestListener extends TestListenerAdapter {

    @Override
    public void onTestSuccess(ITestResult tr) {
        log(tr.getMethod().getMethodName() + " Success ");
    }

    @Override
    public void onTestFailure(ITestResult tr) {
        log(tr.getMethod().getMethodName() + " Failed ");
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        log(tr.getMethod().getMethodName() + " Skipped ");
    }

    private void log(String string) {
        System.out.println(string);
    }
}
