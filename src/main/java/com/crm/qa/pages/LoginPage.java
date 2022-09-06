package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	public LoginPage() throws Exception {
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(name="username")
	WebElement Username;
	@FindBy(name="password")
	WebElement Password;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginbtn;


public HomePage Login(String un,String pwd)
{
	Username.sendKeys(un);
	Password.sendKeys(pwd);
	loginbtn.click();
	return new HomePage();
	
	}
}