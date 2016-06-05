package com.saphire.test.regression;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.saphire.UI.CreateNewTasksPage;
import com.saphire.UI.HomePage;
import com.saphire.UI.LoginPage;
import com.saphire.UI.OpenTasksPage;
import com.saphire.config.TestConfiguration;
import com.saphire.helper.GetData;
//import com.saphire.helper.SaphireActions;

public class TestTasksSC_02 extends TestConfiguration 
{
	@Test
	public void testTasks_TC_02() throws InterruptedException
	{
		String un=GetData.fromProperties("./data/config.Properties", "un");
		String pwd = GetData.fromProperties("./data/config.Properties", "pwd");
		LoginPage l=new LoginPage(driver);
		l.login(un, pwd);
		HomePage h=new HomePage(driver);
		Thread.sleep(5000);
		h.clickTaskTab();
		OpenTasksPage t = new OpenTasksPage(driver);
		t.createTasks();
		Thread.sleep(10000);
		CreateNewTasksPage c=new CreateNewTasksPage(driver);
		c.CreateNewTask();
		//"Our Company","General","Task1"
		//WebElement ele = driver.findElement(By.xpath(".//*[@id='ext-gen55']/td[2]/em"));
		//SaphireActions.selectDDLByVisibleText(ele, "-New Customer-");
		//h.clickLogoutLink();
		//leave 2 lines
	}
}
