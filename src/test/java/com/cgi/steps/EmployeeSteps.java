package com.cgi.steps;

import java.util.List;
import java.util.Map;

import com.cgi.base.AutomationWrapper;
import com.cgi.pages.MainPage;
import com.cgi.pages.PIMPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSteps {

	private AutomationWrapper wrapper;

	private MainPage main;
	private PIMPage pim;

	public EmployeeSteps(AutomationWrapper wrapper) {
		this.wrapper = wrapper;
		initPageObject();
	}

	public void initPageObject() {
		main = new MainPage(wrapper.driver);
		pim=new PIMPage(wrapper.driver);
	}

	@When("I click on PIM menu")
	public void i_click_on_pim_menu() {
		main.clickOnPIMMenu();
	}

	@When("I click on Add Employee")
	public void i_click_on_add_employee() {
		//
	}

	@When("I fill the employee details")
	public void i_fill_the_employee_details(DataTable dataTable) {

		List<Map<String, String>> lists = dataTable.asMaps();

		System.out.println(lists);
		System.out.println(lists.get(0));
		System.out.println(lists.get(0).get("firstname"));
		System.out.println(lists.get(0).get("middlename"));
		System.out.println(lists.get(0).get("lastname"));
	}

	@When("I click on save")
	public void i_click_on_save() {

	}

	@Then("I should get the profile name as {string}")
	public void i_should_get_the_profile_name_as(String string) {
	}

}
