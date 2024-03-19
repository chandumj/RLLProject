Feature: Add to Cart Functionality
 Background: 
     Given User navigate to the FirstCry URL
   # When User log into the application with credentials
  Scenario: Login, Search and Add Product to Cart
   
    Then User should be redirected to the homepage
    When User search for a specific product
    And click on Add to Cart for the selected product
    Then the selected product should be added to my cart
