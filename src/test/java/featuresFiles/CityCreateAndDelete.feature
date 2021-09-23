
Feature: Create and Delete City Functionality
  Background:
    Given Navigate to website
    When Enter username and password
    And Click to accept cookies
    And Click to login button
    Then User should be login successfully

  Scenario: Create and delete city
    When Click to Setup button
    And Click to Parameters Button
    And Click to Cities Button
    And Click to Add Button
    And Enter Name as "YeniDunyaSehri" to Add
    When Click to Save Button
    Then Success message should be displayed

    And  Enter Name as "YeniDunyaSehri" to Search
    And  Click to Search Button
    When Click to Delete Button
    Then Success message should be displayed