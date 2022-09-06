package com.crm.qa.testcases;

import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageText extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	


	public LoginPageText() throws Exception {
		super();
		
	}
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		loginpage=new LoginPage();
	}
	@Test
	public void logintest()
	{
	homepage = loginpage.Login(prop.getProperty("Username"),prop.getProperty("Password"));
	}
    @AfterMethod
    public void teardown() throws Exception
    {
    	Thread.sleep(10000);
	driver.quit();
	}
}
