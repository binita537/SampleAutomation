package com.citi.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.citi.base.AutomationWrapper;
import com.citi.pages.LoginPage;

public class Employee_Login_With_Invalid_Credentails_Test extends AutomationWrapper {

	@Test
	public void addEmployeeTestWithInvalidCredentails() {
		
		String expectedInvalidError="Invalid credentials";
		LoginPage login = new LoginPage(driver);
		login.enterUsername("Admin");
		login.enterPassword("admin1234");
		login.clickOnLogin();		
		String actaulInvalidError=login.getInvalidErrorMessage();
		
		//Assertion is used for Actaul and Expected value
		Assert.assertEquals(expectedInvalidError, actaulInvalidError);
		
		//printing the value
		System.out.println(login.getInvalidErrorMessage());
		


		
	}

}
