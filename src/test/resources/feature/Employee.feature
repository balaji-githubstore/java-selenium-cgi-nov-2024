@employee
Feature: Employee
  In order to manage employee records 
  As an admin
  I want to add,edit,delete the employee records

  Scenario Outline: Add Valid Employee
    Given I have browser with orangehrm application
    When I enter username as "<username>"
    And I enter password as "<password>"
    And I click on login
    And I click on PIM menu
    And I click on Add Employee
    And I fill the employee details
      | firstname | middlename | lastname |
      | <fname>   | <mname>    | <lname>  |
    And I click on save
    Then I should get the profile name as "<fname> <lname>"

    Examples: 
      | username | password | fname | mname | lname |
      | Admin    | admin123 | john  | w     | wick  |
      | Admin    | admin123 | peter | p     | ken   |
