package com.tyss.MavenDemoTest;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.tyss.universalLib.ConfigurationClass;

public class HomeTest extends ConfigurationClass {
	public static ExtentTest logger;
	@Test
	public void demoTest(){
		logger=extent.startTest("demotest");
		
		Reporter.log("rana",true);
		logger.log(LogStatus.INFO, "hi");
	}

}
