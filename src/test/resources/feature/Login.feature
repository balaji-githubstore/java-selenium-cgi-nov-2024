@login
Feature: Login
  In order to manage employee records 
  As an admin
  I want to access the employee dashboard

  Background: 
    Given I have browser with orangehrm application

	@smoke	@valid
  Scenario: Valid Login
    When I enter username as "Admin"
    And I enter password as "admin123"
    And I click on login
    Then I should get access to the dashboard page with "Quick Launch"

	@invalid
  Scenario Outline: Invalid Login
    When I enter username as "<username>"
    And I enter password as "<password>"
    And I click on login
    Then I should not get access to the dashboard with error "<expected_error>"

    Examples: 
      | username | password | expected_error      |
      | john     | john123  | Invalid credentials |
      | peter    | peter233 | Invalid credentials |
