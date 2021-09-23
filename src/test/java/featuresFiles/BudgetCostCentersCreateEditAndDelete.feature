Feature:

  Background:
    Given Navigate to website
    When Enter username and password
    And Click to accept cookies
    And Click to login button
    Then User should be login successfully
    And Click to Budget
    And Click to Setup under Budget
    And Click Cost Centers

  Scenario: Create Cost Center
    And Click to Add Button
    And Enter Name as "Mehmet" to Add
    And Enter Code as "Mhm" to Add
    And Select "Personal" as type to Add
    And Enter "abc," as Expense Account Code Prefixes to Add
    When Click to Save Button
    Then Success message should be displayed

  Scenario: Edit Cost Centers
    And Click to Edit Button in Cost Center
    And Enter "John" as Name to Add
    When Click to Save Button
    Then Success message should be displayed

  Scenario: Delete Cost Centers
    And Click to Delete Button in Cost Center
    Then Success message should be displayed


