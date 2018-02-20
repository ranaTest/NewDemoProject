package com.tyss.universalLib;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ConfigurationClass implements ConstantValues{
	
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest logger;
	
	
	@BeforeSuite
	
	public void configReport(){
		
		extent=new ExtentReports("/home/tyss/Desktop/MyDemoNewProject/MyMavenProject/test-output/advanceReport.html");
		extent.loadConfig(new File("/home/tyss/Desktop/MyDemoNewProject/MyMavenProject/Resource/extent-config.xml"));
		extent.addSystemInfo("Host Name", "Software Test Engginer");
		extent.addSystemInfo("Environment", "Automation Testing");
		extent.addSystemInfo("User Name", "Rana Thakur");
		extent.addSystemInfo("Team Lead", "Suchit");
		
	}
	 
	@BeforeClass
	
	public void ConfigBrowser(){
		
		if(ConstantValues.Browser.equals(Browser)){		
		System.setProperty("webdriver.chrome.driver", "/home/tyss/Desktop/chromedriver");
		driver=new ChromeDriver();
		}else if(ConstantValues.Browser.equals(Browser)){
			System.setProperty("webdriver.gecko.driver", "/home/tyss/Desktop/MyDemoNewProject/MyMavenProject/Resource/geckodriver");
			driver=new FirefoxDriver();
		}
		
	}
	
	
	
	@BeforeMethod
	
	public void configLoggin(){
		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		//logger.log(LogStatus.INFO, "now it will work");
	}
	
	@AfterMethod
	
	public void configLoggout(){
		Reporter.log("i am log out",true);
		
		
	}
	
	@AfterClass
	
	public void configCleanup(){
		
		
		Reporter.log("hi milon",true);
		driver.close();
		
	}
	
	
	@AfterSuite
	
	public void configClosingReport() throws Throwable{
		
		extent.flush();
		//extent.close();
		
		
	}
	

}
