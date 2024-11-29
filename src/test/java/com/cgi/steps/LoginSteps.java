package com.cgi.steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("I have browser with orangehrm application")
	public void i_have_browser_with_orangehrm_application() {
		System.out.println("given");
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String username) {
		System.out.println("when" + username);
//		driver.findElement(By.name("")).sendKeyse(username);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String password) {
		System.out.println("when" + password);
	}

	@When("I click on login")
	public void i_click_on_login() {
		System.out.println("when login");
	}

	@Then("I should get access to the dashboard page with {string}")
	public void i_should_get_access_to_the_dashboard_page_with(String expectedValue) {
		System.out.println("then" + expectedValue);
	}

	@Then("I should not get access to the dashboard with error {string}")
	public void i_should_not_get_access_to_the_dashboard_with_error(String expectedError) {
		System.out.println("then" + expectedError);
	}
}
