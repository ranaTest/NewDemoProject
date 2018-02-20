package com.tyss.MavenDemoTest;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.tyss.universalLib.ConfigurationClass;

@Listeners

public class HomeTest extends ConfigurationClass {
	public static ExtentTest logger;
	@Test
	public void demoTest(){
		logger=extent.startTest("demotest");
		
		Reporter.log("rana",true);
		logger.log(LogStatus.INFO, "I M 0");
		
		extent.endTest(logger);
	}
	
	@Test
	
	public void demoTest1(){
		
logger=extent.startTest("demotest");
		
		Reporter.log("rana",true);
		logger.log(LogStatus.INFO, "I M 1");
		
		extent.endTest(logger);
		
	}
	
	@Test
	
	public void demotest2(){
logger=extent.startTest("demotest");
		
		Reporter.log("rana",true);
		logger.log(LogStatus.INFO, "I M 2");
		
		extent.endTest(logger);
	}

}
