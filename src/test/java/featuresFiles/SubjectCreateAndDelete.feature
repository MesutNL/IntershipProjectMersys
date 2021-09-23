Feature:

  Background:
    Given Navigate to website
    When Enter username and password
    And Click to accept cookies
    And Click to login button
    Then User should be login successfully

  Scenario:Create a Subject
    And Click to Education
    And Click on Setup under Education
    And Click to Subjects
    And Click to Add Button
    And Enter Name as "Greek" to Add
    And Enter Code as "30" to Add
    And Select a Subject Category as "Foreign Languages" to Add
    When Click to Save Button
    Then Success message should be displayed

  Scenario: Delete a Subject
    And Click to Education
    And Click on Setup under Education
    And Click to Subjects
    And Enter Name as "Greek" to Search
    And Enter Code as "30" to Search
    And Select a Subject Categories as "Foreign Languages" to Search
    And Click to Search Button
    When Click to Delete Button
    Then Success message should be displayed