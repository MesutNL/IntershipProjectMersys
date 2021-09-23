
Feature:
  Background:
    Given Navigate to website
    When Enter username and password
    And Click to accept cookies
    And Click to login button
    Then User should be login successfully
    And Click to Budget
    And Click to Setup under Budget
    And Click to Budget Groups

  Scenario:Create
    And Click to Add Button
    And Enter "Fred" as Description to Add
    And Select Status as "Completed" to  Add
    And Select a Start Date as "5" and End Date as "10" to Add
    When Click to Save Button
    Then Success message should be displayed

  Scenario: Edit
    And Enter Description on Budget Groups as "Fred" to Search
    And Select Status as "Completed" to Search
    And Click to Search Button
    And Click to Edit Button
    And Enter "John" as Description to Add
    When Click to Save Button
    Then Success message should be displayed

  Scenario: Delete
    And Enter Description on Budget Groups as "John" to Search
    And Select Status as "Completed" to Search
    And Click to Search Button
    And Click to Delete Button
    Then Success message should be displayed














