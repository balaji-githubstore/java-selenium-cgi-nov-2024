package com.cgi.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * will be deleted
 */
public class ZDemo1Test {
	@DataProvider
	public Object[][] loginData() {
		Object[][] data = new Object[3][2];
		// i--> number of test cases
		// j--> number of arguments

		data[0][0] = 3;
		data[0][1] = "kim123";

		data[1][0] = "john";
		data[1][1] = "john123";

		data[2][0] = "peter";
		data[2][1] = "peter123";

		return data;
	}

	@Test(dataProvider = "loginData")
	public void loginTest(String username, String password) {
		System.out.println("login " + username + password);
	}

}

// will resume after the break at 3:45 PM IST
