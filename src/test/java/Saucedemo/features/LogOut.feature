Feature: Logout Page Saucedemo

  Scenario: Success Logout
    Given Dashboard login saucedemo2
    When Input username2
    And Input password2
    And Click login button2
    And User in on dashboard page2
    And User Click menu button2
    And User Click menu logout2
    Then User in login page2
