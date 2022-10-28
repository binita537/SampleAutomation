package com.citi.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.citi.base.AutomationWrapper;
import com.citi.pages.LoginPage;

public class Employee_Login_With_Valid_Credentails_Test extends AutomationWrapper {

	@Test
	public void addEmployeeTestWithValidCredentails() 
	{
		LoginPage login = new LoginPage(driver);
		login.enterUsername("Admin");
		login.enterPassword("admin123");
		login.clickOnLogin();

		String expectedTitle="OrangeHRM";
		String actualTitle=driver.getTitle();
		
		//Assertion is used for Actaul and Expected value
		Assert.assertEquals(actualTitle, expectedTitle);
		
		//printing the value
		System.out.println(actualTitle);
		
		
	}

}
