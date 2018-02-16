package com.tyss.MavenDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MavenTest {
	
	@Test
	
	public void loggin() throws Throwable{
		System.out.println("loggin test");
		
		System.setProperty("webdriver.chrome.driver","/home/tyss/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/");
	}

}
