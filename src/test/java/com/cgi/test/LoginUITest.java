package com.cgi.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cgi.base.AutomationWrapper;

public class LoginUITest extends AutomationWrapper {
	@Test(groups = {"smoke","ui"})
	public void titleTest() {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "OrangeHRM");
	}

	@Test(groups = {"ui"})
	public void headerTest() {
		String actualHeader = driver.findElement(By.xpath("//h5[normalize-space()='Login']")).getText();
		Assert.assertEquals(actualHeader, "Login");
	}
}
