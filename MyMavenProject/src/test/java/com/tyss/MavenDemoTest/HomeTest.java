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
		logger.log(LogStatus.INFO, "I M monika");
		
		extent.endTest(logger);
	}
	
	@Test
	
	public void demoranaTest(){
		
logger=extent.startTest("demotest");
		
		Reporter.log("rana",true);
		logger.log(LogStatus.INFO, "I M rana");
		
		extent.endTest(logger);
		
	}
	
	@Test
	
	public void demomilontest(){
logger=extent.startTest("demotest");
		
		Reporter.log("rana",true);
		logger.log(LogStatus.INFO, "I M milon");
		
		extent.endTest(logger);
	}

}
