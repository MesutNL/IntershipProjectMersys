Feature: Create and Edite And Delete Positions Functionality

  Background:
    Given Navigate to website
    When Enter username and password
    And Click to accept cookies
    And Click to login button
    Then User should be login successfully
    When Click to Human Resources Button
    And  Click on Setup under Human Resources
    And Click to Positions Button

  Scenario: Create a Positions
    And Click to Add Button
    And Enter a name "CucumberTester" and a shortname "CCRTSR"
    And Click to Save Button
    And Success message should be displayed

  Scenario: Edit Positions
    And Enter  Positions Name as "CucumberTester" to Search
    And Click to Search Button
    And Click to Edit Button
    And Enter a new name "CucumberTesterWorld" and a new shortname "CCRTSRWRLD"
    And Click to Save Button
    And Success message should be displayed

  Scenario: Delete the Positions
    And Enter  Positions Name as "CucumberTesterWorld" to Search
    And Click to Search Button
    And Click to Delete Button
    And Success message should be displayed


