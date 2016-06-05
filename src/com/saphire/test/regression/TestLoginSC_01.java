package com.saphire.test.regression;

import org.testng.annotations.Test;

import com.saphire.UI.HomePage;
import com.saphire.UI.LoginPage;
import com.saphire.config.TestConfiguration;
import com.saphire.helper.GetData;

public class TestLoginSC_01 extends TestConfiguration
{
	
@Test
	public void testLoginSuccessTC_01() 
	{
		String un=GetData.fromProperties("./data/config.Properties", "un");
		String pwd = GetData.fromProperties("./data/config.Properties", "pwd");
		LoginPage l=new LoginPage(driver);
		l.login(un, pwd);
		HomePage h=new HomePage(driver);
		h.clickLogoutLink();
		//leave 2 lines
	}
@Test
public void testLoginFailTC_02() 
{
	String un=GetData.fromExcel("./data/testdata.xlsx", "TC_02",1,0);
	String pwd = GetData.fromExcel("./data/testdata.xlsx", "TC_02",1,1);
	LoginPage l=new LoginPage(driver);
	l.login(un, pwd);
	//leave 2 lines
}

}
