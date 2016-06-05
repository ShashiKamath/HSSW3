package com.saphire.test.regression;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saphire.UI.CreateNewTasksPage;
import com.saphire.UI.HomePage;
import com.saphire.UI.LoginPage;
import com.saphire.UI.OpenTasksPage;
import com.saphire.config.TestConfiguration;
import com.saphire.helper.GetData;

public class TestCreateTask_SC_032 extends TestConfiguration 
{

@Test
 public void testCreateTask_TC_032()throws  InterruptedException
 {
 {
	 String un=GetData.fromProperties("./data/config.Properties", "un");
	 String pwd=GetData.fromProperties("./data/config.Properties", "pwd");
	 
	// String custName = GetData.fromExcel("./data/testdata.xlsx", "TC_032", 1, 0);
	// String projName = GetData.fromExcel("./data/testdata.xlsx", "TC_032", 1, 1);
	 String taskName = GetData.fromExcel("./data/testdata.xlsx", "TC_032", 1, 2);
	 
	 LoginPage l = new LoginPage(driver);
	 l.login(un, pwd);
	 
	 HomePage h = new HomePage(driver);
	 Thread.sleep(5000);
	 h.clickTaskTab();
	 
	 OpenTasksPage o=new OpenTasksPage(driver);
	 o.createTasks();
	 
	 CreateNewTasksPage n = new CreateNewTasksPage(driver);
	 n.CreateNewTask();
//	 /custName, projName, taskName
	 String path = "//a[text()='"+taskName+"']";
	 boolean actual = driver.findElement(By.xpath(path)).isDisplayed();
	 Assert.assertEquals(actual, true);
	 h.clickLogoutLink();
 }
}
}
