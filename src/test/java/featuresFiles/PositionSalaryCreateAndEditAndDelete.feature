Feature: Create and Delete Position Salary Functionality


  Background:
    Given Navigate to website
    When Enter username and password
    And Click to accept cookies
    And Click to login button
    Then User should be login successfully
    When Click to Human Resources Button
    And Click on Setup under Human Resources
    And  Click to Position Salary Button

  Scenario: Create  and Delete Position Salary
    And  Click to Add Button
    And  Enter New Position Name as "CucumberWorld" to Add
    When Click to Save Button
    And  Enter New Position Name as "CucumberWorld" to Search
    And  Click to Search Button
    And Click to Specific Position Salary Button
    And Click to Position Salary Add Button
    And Enter a Experience Range "5"
    And Add a Random Date
    And Enter to Salary "5000"
    And Select a Subject Category as "EUR" to Add
    And Click to Add of Salary History button
    When Click to Save Button
    Then Success message should be displayed

  Scenario: Edit
    And  Enter New Position Name as "CucumberWorld" to Search
    And  Click to Search Button
    And Click to Edit Button
    And Enter A New Position Name "CucumberWorldArena"
    And Click to Save Button


  Scenario: Delete
    And  Enter New Position Name as "CucumberWorldArena" to Search
    And  Click to Search Button
    And Click to Specific Position Salary Button
    When Click to Delete Button
    And Back To Position Salary
    And  Enter New Position Name as "CucumberWorld" to Search
    And  Click to Search Button
    When Click to Delete Button
    Then Success message should be displayed

