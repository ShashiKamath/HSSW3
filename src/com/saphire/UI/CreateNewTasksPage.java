package com.saphire.UI;

import org.openqa.selenium.By;

//import org.openqa.selenium.Alert;

//import java.util.Iterator;
//import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import com.saphire.helper.SaphireActions;

public class CreateNewTasksPage 
{
	WebDriver driver;
	
	//@FindBy(xpath=".//*[@id='ext-comp-1017']")
	//@FindBy(xpath=".//*[@id='ext-gen239']/td[2]/em")
	//@FindBy(xpath=".//*[@id='ext-gen43']")
	//@FindBy(xpath=".//button[contains(text(),'- Select Customer -')")
	//@FindBy(id="ext-gen479")
	
	
	//@FindBy(css=".x-btn-text")
	//private WebElement customerDDL;
	//WebElement customerDDL = driver.findElement(By.className(".x-btn-text"));

	//act1.moveToElement(customerDDl).perform();
	
	
	//@FindBy(xpath=".//button(text()='Our Company']")
	//private WebElement customerName;
	
	//@FindBy(xpath=".//*[@id='ext-comp-1128']")
	//private WebElement customerDDL;
		
	//@FindBy(xpath=".//*[@id='createTasksPopup_newCustomer']")
	//private WebElement customerName;
	
	//@FindBy(xpath=".//*[@id='createTasksPopup_newProject']")
	
	//@FindBy(xpath=".//button[contains(text(),'- Select Project -')")
	/*@FindBy(id="ext-gen759")
	private WebElement projectDDL;
	
	@FindBy(xpath=".//button(text(),'General']")
	private WebElement projectName;
	*/
	
	@FindBy(xpath=".//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input]")
	private WebElement taskName1;
	
	//@FindBy(xpath=".//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[2]/td[1]/input]")
	//private WebElement taskName2;
	
	@FindBy(xpath=".//*[@id='createTasksPopup_commitBtn']/div/span")
	private WebElement createTaskButton;
	
	public CreateNewTasksPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void CreateNewTask() throws  InterruptedException
	{
		//String custName, String projName, String taskName
		//Set<String> ids=driver.getWindowHandles();
		//Iterator<String> it=ids.iterator();
		//String parent = it.next();
		//String child = it.next();
		//driver.switchTo().window(child);
		//Alert alt = driver.switchTo().alert();
		//alt.wait();
		//SaphireActions.selectDDLByVisibleText(customerName, custName);
		//SaphireActions.selectDDLByVisibleText(projectDDL,projName);
		
		//customerName.sendKeys(custName);
		//projectName.sendKeys(projName);
		//customerDDL.click();
		//	SaphireActions.selectDDLByVisibleText(customerDDL, custName);
		//projectDDL.click();
		//SaphireActions.selectDDLByVisibleText(projectName,projName);
		Actions act1 = new Actions(driver);
		WebElement customerDDL = driver.findElement(By.xpath(".//button[contains(text(),'- Select Customer -')]"));
		act1.moveToElement(customerDDL).perform();
		customerDDL.click();
		//WebElement customerName = driver.findElement(By.xpath(".//button(text()='Our Company']"));
		//customerName.click();
		/*
		SaphireActions.selectDDLByVisibleText(customerDDL, "Our Company");
		Thread.sleep(5000);
		WebElement projectDDL = driver.findElement(By.xpath(".//button[contains(text(),'- Select Project -')"));
		act1.moveToElement(projectDDL).perform();
		//WebElement projectName = driver.findElement(By.xpath(".//button(text()='General']"));
		//projectName.click();
		
		//taskName2.sendKeys("Task2");
		*/
		taskName1.sendKeys("Task1");
		createTaskButton.click();
		
	}
}
