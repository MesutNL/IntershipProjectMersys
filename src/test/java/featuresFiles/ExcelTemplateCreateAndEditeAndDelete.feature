Feature:  Create And Edit And Delete Excel Template Functionality
  Background:
    Given Navigate to website
    When Enter username and password
    And Click to accept cookies
    And Click to login button
    Then User should be login successfully
    And Click to Reports
    And Click to Setup of Reports
    And Click to Excel Template

  Scenario: Create
    And Click to Add Button
    And Enter a Name of New Budget Excel Template "CucumberTestNG"
    And Enter Period Count of New Budget Excel Template "2021"
    And Click to Save Button
    And Enter a Row Size "2000"
    And Enter a Column Size "3000"
    And Click to Add Version
    And Click to Save Button
    And Success message should be displayed

  Scenario: Edit
    And  Enter of Budget Excel Template  as "CucumberTestNG" to Search
    And Click to Search Button
    And Click to Edit Button
    And Edit a oldName as new name "CucumberTestNGWorld"
    And Click to Save Button
    And Success message should be displayed

  Scenario: Delete
    And  Enter of Budget Excel Template  as "CucumberTestNGWorld" to Search
    And Click to Search Button
    And Click to Delete Button
    And Success message should be displayed
