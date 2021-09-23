Feature:

  Background:
    Given Navigate to website
    When Enter username and password
    And Click to accept cookies
    And Click to login button
    Then User should be login successfully
    And Click to Education
    And Click on Setup under Education
    And Click to Subject Categories

  Scenario Outline: Creating Subject Categories

    And Click to Add Button
    And Enter Name as "<SubjectCategoryName>" to Add
    And Enter Code as "<SubjectCategoryCode>" to Add
    When Click to Save Button
    Then Success message should be displayed
    Examples:
      | SubjectCategoryName | SubjectCategoryCode |
      | Selenium            | SE                  |
      | DataBase            | DB                  |
      | Cucumber            | BDD                 |
      | Javascript          | JS                  |

  Scenario Outline: Delete Subject Categories

    And Enter Name as "<SubjectCategoryName>" to Search
    And Enter Code as "<SubjectCategoryCode>" to Search
    And Click to Search Button
    When Click to Delete Button
    Then Success message should be displayed
    Examples:
      | SubjectCategoryName | SubjectCategoryCode |
      | Selenium            | SE                  |
      | DataBase            | DB                  |
      | Cucumber            | BDD                 |
      | Javascript          | JS                  |