package com.saphire.UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
// Webdriver reference variable
WebDriver driver;


//@FindBy(xpath ="//*[@id='topnav']/tbody/tr[1]/td[3]/a")
//@FindBy(xpath=".//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[2]")
//@FindBy(xpath=".//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[1]")
@FindBy(xpath = ".//div[text()='TASKS']")
private WebElement taskTab;

@FindBy(xpath="//div[text()='Users']")
private WebElement usersTab;

@FindBy(xpath=".//a[contains(text(), 'Logout')]")
private WebElement logoutLink1;

//Constructor
public HomePage(WebDriver driver)
{
	 this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void clickLogoutLink()
{
	logoutLink1.click();
}

public void clickTaskTab()
{
	taskTab.click();
}

public void clickUsersTab()
{
	usersTab.click();
}

}
