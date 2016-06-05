package com.saphire.UI;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CreateNewTaskLPage 
{
	WebDriver driver;
	@Test
	//public static void main(String[] args) throws InterruptedException
	//{
	public void test1() throws InterruptedException
    {
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		driver.get("http://demo.actitime.com/");
		//Login
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		Thread.sleep(20);
		
	
		//Click on Tasks tab
		driver.findElement(By.xpath(".//*[@id='topnav']/tbody/tr[1]/td[3]/a")).click();
		Thread.sleep(20);
		
		
		//Click on Create Tasks button
		driver.findElement(By.xpath(".//*[@id='ext-gen33']")).click();
		Thread.sleep(20);
		
		//Select Our Country option from Select Customer
		driver.findElement(By.xpath(".//*[@id='ext-comp-1017']")).click();
		
		List <WebElement> lists = driver.findElements(By.xpath("//div/ul/li[@class='x-menu-list-item']"));
		System.out.println("List size "+lists.size());
		
		for(int i=0;i<lists.size();i++)
		{
			WebElement ele=lists.get(i);
			System.out.println(ele.getText());
			if(ele.getText().equals("Our Company"))
			{
				ele.click();
				break;
			}
		}
		
		// Select a project - General for the list
		driver.findElement(By.xpath(".//*[@id='ext-comp-1105']")).click();
		//driver.findElement(By.xpath("//table[@class='x-btn-wrap x-btn at-dropdown-list-btn x-btn-over']")).click();
		List <WebElement> projects = driver.findElements(By.xpath("//div/ul/li[@class='x-menu-list-item']"));
		
System.out.println("List size "+projects.size());
		
		for(int i=0;i<projects.size();i++)
		{
			WebElement ele1=projects.get(i);
			System.out.println(ele1.getText());
			if(ele1.getText().equals("General"))
			{
				ele1.click();
				break;
			}
		}
	
		// Specify Task Name
		
		driver.findElement(By.xpath("//div/div[3]/table/tbody/tr[1]/td[1]/input[@type='text']")).sendKeys("Task One 1");
		
		// Click on Create Task button	
		driver.findElement(By.xpath(".//*[@id='createTasksPopup_commitBtn']")).click();
		
		//List<WebElement> listElements = driver.findElements(By.xpath(".//*[@id='ext-comp-1017']"));
	//	List<WebElement> listElements = driver.findElements(By.xpath(".//div[@id='ext-gen173']"));
	//	System.out.println("Drop Down List Size is "+listElements.size());
	//	for(int i=0; i<listElements.size();i++)
	//	{
	//		
	//		WebElement ele =listElements.get(i);
			
		//	System.out.println("Listed Elements are "+ele.getText());
		//	if (((WebElement) listElements).getText().equals("Our Company")))
				{
	//				((WebElement) listElements).click();
	//				break;
	//			}
	//	}
		
		
		//driver.findElement(By.xpath(".//*[@id='ext-gen206']")).click();
	
		//WebDriverWait wait = new WebDriverWait(driver);
		
		//.//*[@id='createTasksPopup']/div/table/tbody/tr/td/div[2]
		//Actions act1 = new Actions(driver);
		//WebElement customerDDL = driver.findElement(By.xpath(".//button[contains(text(),'- Select Customer -')]"));
		//act1.moveToElement(customerDDL).perform();
		//customerDDL.click();
		
	}
	


		
		//WebElement ele=driver.findElement(By.xpath("//div[@id='singleUserSelector']/div/input[2]"));
		//ele.clear();
		//ele.click();
		//ele.sendKeys("Moss Bruno");
		//driver.findElement(By.cssSelector(".x-combo-list-item x-combo-selected")).click();
		//driver.findElement(By.xpath("//div[@id='singleUserSelector']/div/img")).click();
		//List <WebElement> lists = driver.findElements(By.className(".//div[@class='x-layer x-combo-list singleUserSelector_list usersSelectorOnTT']"));
		//List <WebElement> lists = driver.findElements(By.xpath(".//div[@class='x-layer x-combo-list singleUserSelector_list usersSelectorOnTT']"));
		
		//System.out.println("List size = "+lists.size());
		//for(int i=0; i<lists.size();i++)
		//{
		//	String text = lists.get(i).getText();
		//	if((text.equals("Moss, Bruno")))
		//	{
		//		lists.get(i).click();
		//	}
				
		//}
		
		
		/*
		// Handle Auto Suggestions
		
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("Java");
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='sbqs_c']"));
				// "*[@id='sbtc']/div[2]/div[2]/div[1]"));
		System.out.println(suggestions.size());
		for(int i=0; i<suggestions.size();i++)
		{
			WebElement ele=suggestions.get(i);
			if(ele.getText().equals("javascript"))
					{
				ele.click();
				break;
					}
			//WebElement suggs = suggestions.get(i);
			
		    
		}
		
		*/
		
	}
}
