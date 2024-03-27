@FirstCry
Feature: Manage Cart 

  Background:
    Given User navigate to the FirstCry URL
    When User log into the application with credentials

  Scenario: Manage Cart Functions
    When User add a few products to the cart
    |pens       |
    |books         |
    And  User click on cart
    Then user can see "<allproducts>" in the cart
    When User move a product to the shortlist
    When User change the quantity of product from the cart
    Then the "<quantity>" should be changed

