package com.saphire.UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
  WebDriver driver;
  
  @FindBy(id="username")
  private WebElement userNameTextbox;
  
  @FindBy(name="pwd")
  private WebElement passwordTextbox;
  
  @FindBy(id="loginButton")
  private WebElement loginButton;
  
  @FindBy(id="keepLoggedInCheckboxContainer")
  private WebElement keepMeLoggedInCheckboxContainer;
  
  public LoginPage(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }
  
  public void login(String name, String pwd)
  {
	  userNameTextbox.sendKeys(name);
	  passwordTextbox.sendKeys(pwd);
	  loginButton.click();
  }
	
}
