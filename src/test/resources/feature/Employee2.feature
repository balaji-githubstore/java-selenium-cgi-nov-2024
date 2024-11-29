#@employee
#Feature: Employee
  #In order to manage employee records 
  #As an admin
  #I want to add,edit,delete the employee records
#
  #Scenario: Add Valid Employee
    #Given I have browser with orangehrm application
    #When I enter username as "Admin"
    #And I enter password as "admin123"
    #And I click on login
    #And I click on PIM menu
    #And I click on Add Employee
    #And I fill the employee details
      #| firstname | middlename | lastname |
      #| john      | w          | wick     |
    #And I click on save
    #Then I should get the profile name as "john wick"
#
#
