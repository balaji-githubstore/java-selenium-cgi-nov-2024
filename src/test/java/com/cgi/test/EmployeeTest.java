package com.cgi.test;

import org.testng.annotations.Test;

import com.cgi.base.AutomationWrapper;
import com.cgi.pages.LoginPage;

public class EmployeeTest extends AutomationWrapper {
	
	@Test
	public void addValidEmployeeTest()
	{
		LoginPage login = new LoginPage(driver);
		login.enterUsername("Admin");
		login.enterPassword("admin123");
		login.clickOnLogin();
		
//		5. click on PIM menu
//		6. Click on Add Employee
//		7. Enter firstname
//		8. Enter middlename
//		9. Enter lastname
//		10. Click on save
//		11. Assert the profile name

	}
}
