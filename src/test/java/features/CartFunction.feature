Feature: Manage Cart 

  Background:
    Given User navigate to the FirstCry URL
    When User log into the application with credentials

  Scenario Outline: Manage Cart Functions
    When User add a few products to the cart
    |Toys   |
    |Jackets|
    And  User click on cart
    Then user can see "<allproducts>" in the cart
    And User move a product to the shortlist
    And User delete the product from the cart
    Then the "<product>" should be removed from the cart

Examples:
      | product   |allproducts|
      |           |           |
