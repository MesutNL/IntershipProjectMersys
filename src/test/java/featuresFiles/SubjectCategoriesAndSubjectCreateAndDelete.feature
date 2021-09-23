Feature:

  Background:
    Given Navigate to website
    When Enter username and password
    And Click to accept cookies
    And Click to login button
    Then User should be login successfully

  Scenario: 1
    And Click to Education
    And Click on Setup under Education
    And Click to Subject Categories
    And Click to Add Button
    And Enter Name as "MySubjectGroup2" to Add
    And Enter Code as "Group 2" to Add
    When Click to Save Button
    Then Success message should be displayed

  Scenario: 2
    And Click to Education
    And Click on Setup under Education
    And Click to Subjects
    And Click to Add Button
    And Enter Name as "Test" to Add
    And Enter Code as "Group 2" to Add
    And Select a Subject Category as "MySubjectGroup2" to Add
    When Click to Save Button
    Then Success message should be displayed

  Scenario: 3
    And Click to Education
    And Click on Setup under Education
    And Click to Subject Categories
    And Enter Name as "MySubjectGroup2" to Search
    And Enter Code as "Group 2" to Search
    And Click to Search Button
    When Click to Delete Button
    Then Item Can't delete message should be displayed
