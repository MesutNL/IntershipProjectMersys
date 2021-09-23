
Feature: Create and Delete Country and City Functionality
  Background:
    Given Navigate to website
    When Enter username and password
    And Click to accept cookies
    And Click to login button
    Then User should be login successfully


  Scenario: create a country
    When Click to Setup button
    And Click to Parameters Button
    And Click to Countries Button
    And Click to Add Button
    And Enter Name as "Code World123" to Add
    And Enter Code as "CW1123" to Add
    When Click to Save Button
    Then Success message should be displayed


  Scenario: create a city
    When Click to Setup button
    And Click to Parameters Button
    And Click to Cities Button
    And Click to Add Button
    And Select a Country as "Code World123" to Add
    And Enter Name as "World City123" to Add
    When Click to Save Button
    Then Success message should be displayed


  Scenario:  delete country
    When Click to Setup button
    And Click to Parameters Button
    And Click to Countries Button
    And Enter Name as "Code World123" to Search
    And Enter Code as "CW1123" to Search
    And Click to Search Button
    When Click to Delete Button
    Then Item Can't delete message should be displayed

  Scenario:  delete  city
    When Click to Setup button
    And Click to Parameters Button
    And Click to Cities Button
    And Select a Country as "Code World123" to Search
    And Enter Name as "World City123" to Search
    And Click to Search Button
    When Click to Delete Button
    Then Success message should be displayed