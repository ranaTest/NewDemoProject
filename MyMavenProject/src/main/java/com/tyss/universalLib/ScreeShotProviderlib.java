package com.tyss.universalLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreeShotProviderlib implements ITestListener{

	@Override
	public void onFinish(ITestContext Result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext Result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult Result) {
		// TODO Take Screen Shot for every test fail
		
		String FailTestName=Result.getMethod().getMethodName();
		
		EventFiringWebDriver EFWD=new EventFiringWebDriver(ConfigurationClass.driver);
		File srcDir=EFWD.getScreenshotAs(OutputType.FILE);
		File destDir=new File("/home/tyss/Desktop/HybridFrameworkSimple/MyMavenProject/ScreenShot"+FailTestName+".png");
		try{
			FileUtils.copyDirectory(srcDir, destDir);
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult Result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult Result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult Result) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
