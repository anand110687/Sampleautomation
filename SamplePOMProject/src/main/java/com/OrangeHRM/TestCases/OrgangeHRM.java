package com.OrangeHRM.TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.OrangeHRM.CommonMethods.BaseClass;
import com.OrangeHRM.Pages.LoginPage;

public class OrgangeHRM extends BaseClass {
	
@BeforeTest
	public void testinputs() {
	
	testcaseName ="Login functionality";
	testcaseDec ="To Validate whether user is able to login";
    author ="anand";
	category="smoketest";
		
	}


@Test (dataProvider ="getdata")	
public void loginHRM(String username, String password ) {
	
	/*LoginPage lp = new LoginPage();
	lp.enterusername(username);
	lp.enterpassword(password);
	lp.clickbtn(); */
	
	new LoginPage().enterusername(username).enterpassword(password).clickbtn();
} 

}
