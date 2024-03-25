@FirstCry
Feature: Add to Cart Functionality

  Background: 
    Given User navigate to the FirstCry URL
    When User log into the application with credentials

  Scenario Outline: Login, Search and Add Product to Cart
    When User search for a "<product_name>"
    And Click on one Product
    And User switches focus to the new tab
    And click on Add to Cart for the selected product
    Then "<product>" should be added to my cart

    Examples: 
      | product_name | product |
      | shirts       |         |
     
