package com.saphire.config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.saphire.helper.GetData;

public class TestConfiguration 
{
 public WebDriver driver;
 
 @BeforeMethod
 public void pretest()
 {
	 String browser_name=GetData.fromProperties("./data/config.properties","browser");
	 String url = GetData.fromProperties("./data/config.properties", "url");
	 if(browser_name.equals("FF"))
	 {
		 driver=new FirefoxDriver();
	 }
	 else if(browser_name.equals("Chrome"))
	 {
		System.setProperty("webdriver.chrome.driver","./browser-exe/dummy-chrome.exe");
		driver=new ChromeDriver();
	 }
	 else if (browser_name.equals("IE"))
	 {
		 System.setProperty("webdriver.ie.driver","./browser-exe/dummy-ie.exe");
		driver=new InternetExplorerDriver(); 
	 }
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.get(url);
 }
 
 @AfterMethod
 public void postTest()
 {
	 driver.close();
 }
 
 
	
}
