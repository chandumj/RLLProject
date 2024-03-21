Feature: Manage Cart 

  Background:
    Given User navigate to the FirstCry URL
    When User log into the application with credentials

  Scenario Outline: Manage Cart Functions
    When User add a few products to the cart
    And  User click on cart
    And User enter "<pincode>" and apply
    And User move a product to the shortlist
    And User delete the product from the cart
    Then the product should be removed from the cart

Examples:
      | pincode   |
      | 500074    |
