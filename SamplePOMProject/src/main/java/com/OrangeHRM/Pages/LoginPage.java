package com.OrangeHRM.Pages;

import com.OrangeHRM.CommonMethods.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage enterusername(String username) {
		driver.findElementByXPath("//input[@placeholder='Username']").sendKeys(username);
		return this;
		
		
		
	}
	
	public LoginPage enterpassword(String password) {
		driver.findElementByXPath("//input[@placeholder='Password']").sendKeys(password);
		return this;
		
	}
	public AdminPage clickbtn() {
		driver.findElementByXPath("//button[@type='submit']").click();
	return new AdminPage();
	}
}
