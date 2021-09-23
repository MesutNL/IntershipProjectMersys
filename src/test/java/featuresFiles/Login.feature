
Feature: Login Functionality
  @SmokeTest
  Scenario:Login with registered user information
    Given Navigate to website
    When Enter username and password
    And Click to accept cookies
    And Click to login button
    Then User should be login successfully

  @SmokeTest
  Scenario:Login with unregistered user information
    Given Navigate to website
    When Enter wrong username and password
    And Click to accept cookies
    And Click to login button
    Then User should not be logged in and should see the error message

