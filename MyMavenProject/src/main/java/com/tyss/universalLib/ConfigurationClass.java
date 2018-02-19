package com.tyss.universalLib;

import java.io.File;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.yaml.snakeyaml.scanner.Constant;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ConfigurationClass implements ConstantValues{
	
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest logger;
	
	
	@BeforeSuite
	
	public void configReport(){
		
		extent=new ExtentReports("/home/tyss/Desktop/HybridFrameworkSimple/MyMavenProject/test-output/advancereport.html");
		extent.loadConfig(new File("/home/tyss/Desktop/HybridFrameworkSimple/MyMavenProject/Resource/extent-config.xml"));
		extent.addSystemInfo("Host Name", "Software Test Engginer");
		extent.addSystemInfo("Environment", "Automation Testing");
		extent.addSystemInfo("User Name", "Rana Thakur");
		extent.addSystemInfo("Team Lead", "Suchit");
		
	}
	
	@BeforeClass
	
	public void ConfigBrowser(){
		
		if(ConstantValues.Browser.equals(Browser)){		
		System.setProperty("webdriver.chrome.driver", "/home/tyss/Desktop/MyDemoNewProject/MyMavenProject/Resource/chromedriver");
		driver=new ChromeDriver();
		}else if(ConstantValues.Browser.equals(Browser)){
			System.setProperty("webdriver.gecko.driver", "/home/tyss/Desktop/MyDemoNewProject/MyMavenProject/Resource/geckodriver");
			driver=new FirefoxDriver();
		}
		
	}
	
	@BeforeMethod
	
	public void configLoggin(){
		
	}
	
	@AfterMethod
	
	public void configLoggout(){
		
	}
	
	@AfterClass
	
	public void configCleanup(){
		
	}
	
	@AfterSuite
	
	public void configClosingReport(){
		
		extent.flush();
		extent.close();
		
	}
	

}
