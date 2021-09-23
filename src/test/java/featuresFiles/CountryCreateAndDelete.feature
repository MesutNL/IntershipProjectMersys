
Feature: create and Delete a Country Functionality

  Background:
    Given Navigate to website
    When Enter username and password
    And Click to accept cookies
    And Click to login button
    Then User should be login successfully


  Scenario: Create and Delete Country
    When Click to Setup button
    And  Click to Parameters Button
    And  Click to Countries Button
    And  Click to Add Button
    And  Enter Name as "Codes World21" to Add
    And  Enter Code as "CDW12" to Add
    When Click to Save Button
    Then Success message should be displayed

    And  Enter Name as "Codes World21" to Search
    And  Enter Code as "CDW12" to Search
    And  Click to Search Button
    When Click to Delete Button
    Then Success message should be displayed

