Feature: Login Page Saucedemo

  Scenario: Success Login
    Given Dashboard login saucedemo
    When Input username
    And Input password
    And Click login button
    Then User in on dashboard page


  Scenario: Failed Logins with invalid password
    Given Dashboard login saucedemo
    When Input username
    And Input Invalid password
    And Click login button
    Then User get error message

  Scenario: Failed Logins with invalid username
    Given Dashboard login saucedemo
    When Input Invalid username
    And Input password
    And Click login button
    Then User get error message