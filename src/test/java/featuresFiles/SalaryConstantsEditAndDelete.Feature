Feature:
  Background:
    Given Navigate to website
    When Enter username and password
    And Click to accept cookies
    And Click to login button

    Then User should be login successfully
    And Click to Human Resources Button
    And Click on Setup under Human Resources
    And Click to Salary Constants Button

  Scenario:Create
    And Click to Add Button
    And Enter Salary Constant Name as "Test1" to Add
    And Add a Random Date
    And Enter Key as "T1" to Add
    And Enter Value as "5" to Add
    When Click to Save Button
    Then Success message should be displayed

  Scenario: Edit
    And Enter Salary Constant Name as "Test1" to Search
    And Enter Key as "T1" to Search
    And Click to Search Button
    And Click to Edit Button
    And Enter Salary Constant Name as "Test2" to Add
    And Enter Key as "T2" to Add
    When Click to Save Button
    Then Success message should be displayed

  Scenario: Delete
    And Enter Salary Constant Name as "Test2" to Search
    And Enter Key as "T2" to Search
    And Click to Search Button
    When Click to Delete Button
    Then Success message should be displayed

