Feature:
  Background:
    Given Navigate to website
    When Enter username and password
    And Click to accept cookies
    And Click to login button

    Then User should be login successfully
    And Click to Human Resources Button
    And Click on Setup under Human Resources
    And Click to Salary Modifiers

  Scenario:Create
    And Click to Add Button
    And Enter Description as "Test1" to Add
    And Enter Variable as "T1" to Add
    And Select a Modifier Type as "Subtraction" to Add
    And Enter Amount as "5000" to Add
    And Enter Integration Code as "123" to Add
    And Enter Priority as "15" to Add

    When Click to Save Button
    Then Success message should be displayed

  Scenario: Edit
    And Enter Description as "Test1" to Search
    And Enter Variable as "T1" to Search
    And Select a Modifier Type as "Subtraction" to Search
    And Click to Search Button
    And Click to Edit Button
    And Enter Description as "Test2" to Add
    And Enter Variable as "T2" to Add
    When Click to Save Button
    Then Success message should be displayed

  Scenario: Delete
    And Enter Description as "Test2" to Search
    And Enter Variable as "T2" to Search
    And Select a Modifier Type as "Subtraction" to Search
    And Click to Search Button
    When Click to Delete Button
    Then Success message should be displayed


