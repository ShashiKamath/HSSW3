package com.saphire.helper;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SaphireActions 
{
//This function is used to select a drop down list value. 
//There are three ways to access it
//I way - using index
	public static void selectDDLByIndex(WebElement ddl, int index)
	{
		Select sct = new Select (ddl);
		sct.selectByIndex(index);
	}

//II way - using value
public static void selectDDLByValue(WebElement ddl, String value)
{
	Select sct = new Select (ddl);
	sct.selectByValue(value);
}
//III way - using visible text
public static void selectDDLByVisibleText(WebElement ddl, String VisibleText)
{
	Select sct = new Select (ddl);
	sct.selectByVisibleText(VisibleText);
}

//This function is used to deselect a drop down list value. 
//There are four ways to deselect it
//I way - using index
	public static void deselectDDLByIndex(WebElement ddl, int index)
	{
		Select sct = new Select (ddl);
		sct.deselectByIndex(index);
	}

//II way - using value
public static void deselectDDLByValue(WebElement ddl, String value)
{
	Select sct = new Select (ddl);
	sct.deselectByValue(value);
}
//III way - using visible text
public static void deselectDDLByVisibleText(WebElement ddl, String VisibleText)
{
	Select sct = new Select (ddl);
	sct.deselectByVisibleText(VisibleText);
}

//IV way - using de-select all

public static void deselectDDLAll(WebElement ddl)
{
	Select sct = new Select (ddl);
	sct.deselectAll();
}

//This method is used to check whether drop down list is single select or multi select
public static boolean verifyDDLIsMultiple(WebElement ddl)
{
	boolean status;
	Select sct=new Select(ddl);
	status=sct.isMultiple();
	return status;
}

//This method is used to handle alert
public static void acceptAlert(WebDriver driver)
{
	Alert alt = driver.switchTo().alert();
	alt.accept();
}

//This method is used to dismiss alert
public static void dismissAlert(WebDriver driver)
{
	Alert alt = driver.switchTo().alert();
	alt.dismiss();
}
//This method is used to get text from an alert

public static String getTextFromAlert(WebDriver driver)
{
	Alert alt = driver.switchTo().alert();
	String text= alt.getText();
	return text;
}

//This method is used to send text to alert
public static void setTextToAlert(WebDriver driver, String text)
{
	Alert alt = driver.switchTo().alert();
	alt.sendKeys(text);
}
}