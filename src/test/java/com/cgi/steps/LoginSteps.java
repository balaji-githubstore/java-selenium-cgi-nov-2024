package com.cgi.steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.cgi.base.AutomationWrapper;
import com.cgi.pages.DashboardPage;
import com.cgi.pages.LoginPage;
import com.cgi.pages.MainPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	private AutomationWrapper wrapper;

	private LoginPage login;
	private DashboardPage dashboard;

	public LoginSteps(AutomationWrapper wrapper) {
		this.wrapper = wrapper;
	}

	@Given("I have browser with orangehrm application")
	public void i_have_browser_with_orangehrm_application() {
		wrapper.driver = new ChromeDriver();
		wrapper.driver.manage().window().maximize();
		wrapper.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		wrapper.driver.get("https://opensource-demo.orangehrmlive.com/");
		initPageObject();
	}

	public void initPageObject() {
		login = new LoginPage(wrapper.driver);
		dashboard = new DashboardPage(wrapper.driver);
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String username) {
//		wrapper.driver.findElement(By.name("username")).sendKeys(username);
		login.enterUsername(username);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String password) {
		login.enterPassword(password);
	}

	@When("I click on login")
	public void i_click_on_login() {
		login.clickOnLogin();
	}

	@Then("I should get access to the dashboard page with {string}")
	public void i_should_get_access_to_the_dashboard_page_with(String expectedValue) {
		Assert.assertEquals(dashboard.getQuickLaunchText(), expectedValue);
	}

	@Then("I should not get access to the dashboard with error {string}")
	public void i_should_not_get_access_to_the_dashboard_with_error(String expectedError) {
		Assert.assertEquals(login.getInvalidErrorMessage(), expectedError);
	}
}
