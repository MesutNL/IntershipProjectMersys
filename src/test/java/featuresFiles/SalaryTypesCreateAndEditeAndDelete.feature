Feature: Create And Edit And Delete Salary Types Functionality

  Background:
    Given Navigate to website
    When Enter username and password
    And Click to accept cookies
    And Click to login button
    Then User should be login successfully
    And Click to Human Resources Button
    And Click on Setup under Human Resources
    And Click to Salary Types button

  Scenario: Create
    And Click to Add Button
    And Enter to a Name "NewSalaryCucumber"
    And Select to a User Type "Manager"
    And Click to Save Button
    And Success message should be displayed

  Scenario: Edit
    And Enter a  name of Salary Types "NewSalaryCucumber" to Search
    And Click to Search Button
    And Click to Edit Button
    And Edit a new name of Salary Types "NewSalaryCucumberWorld"
    And Click to Save Button
    And Success message should be displayed

  Scenario: Delete
    And Enter a  name of Salary Types "NewSalaryCucumberWorld" to Search
    And Click to Search Button
    And Click to Delete Button
    And Success message should be displayed


