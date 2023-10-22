Feature: Shopping Product

  Scenario: Success add product
    Given Dashboard login saucedemo_
    When Input username_
    And Input password_
    And Click login button_
    And User in on dashboard page_
    And User Click add to cart
    And User Click cart increment
    Then User in payment cart

  Scenario: Success delete product in cart
    Given Dashboard login saucedemo_
    When Input username_
    And Input password_
    And Click login button_
    And User in on dashboard page_
    And User Click add to cart
    And User Click cart increment
    And User Click remove product
    Then User in payment cart


