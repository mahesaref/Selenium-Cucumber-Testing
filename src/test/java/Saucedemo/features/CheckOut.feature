Feature: Payment saucedemo

  Scenario: Success checkout
    Given Dashboard login saucedemo1
    When Input username1
    And Input password1
    And Click login button1
    And User in on dashboard page1
    And User Click add to cart1
    And User Click cart increment1
    Then User in payment cart1
    And User Click button checkout
    Then User in checkout information
    And User Input firstname
    And User Input lastname
    And User Input postalcode
    Then User Click button continue
    Then User in overview checkout
    Then User Click finish
    Then User on page success checkout

