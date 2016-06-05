package com.saphire.UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenTasksPage 
{
	// WebDriver reference variable
	WebDriver driver;

	//@FindBy(xpath = ".//*[@id='ext-comp-1016']/span")
	@FindBy(xpath = ".//span[text() = 'Create Tasks']")
	private WebElement createTasks;

	/*
	@FindBy(xpath=".//*[@id='ext-gen10']")
	private WebElement customers_and_Projects;

	@FindBy(xpath=".//*[@id='wordFilterStringContainer']/input[2]")
	private WebElement filter_tasks_by_Name;
	
	@FindBy(xpath=".//*[@id='tasksFilterSubmitButton']")
	private WebElement apply_Filter_Button;
		
	@FindBy(xpath=".//*[@id='taskNameCell81']/table/tbody/tr/td/a")
	private WebElement Task1;
		
	@FindBy(xpath=".//*[@id='taskNameCell82']/table/tbody/tr/td/a")
	private WebElement Task2;
	
	@FindBy(xpath=".//*[@id='tasksListForm']/table/tbody/tr[3]/td/table/tbody/tr/td/div/table/tbody/tr/td[1]/input")
	private WebElement delete_Selected_Tasks;
		
	@FindBy(xpath=".//*[@id='tasksListForm']/table/tbody/tr[3]/td/table/tbody/tr/td/div/table/tbody/tr/td[2]/input")
	private WebElement complete_Selected_Tasks;
	*/
	
	//Constructor
	 public OpenTasksPage(WebDriver driver)
	  {
		  this.driver=driver;
		  PageFactory.initElements(driver, this);
	  }
	 
	 public void createTasks()
	 {
		 createTasks.click();
	 }
	/* 
	 public void deleteSelectedTasks()
	 {
		 delete_Selected_Tasks.click();
	 }

	 public void completeSelectedTasks()
	 {
	 complete_Selected_Tasks.click();
	 }
	 */
	 
}
