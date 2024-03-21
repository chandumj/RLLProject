Feature: Add to Cart Functionality
 Background: 
     Given User navigate to the FirstCry URL
   # When User log into the application with credentials
  Scenario: Login, Search and Add Product to Cart
    Then User should be redirected to the homepage
    When User search for a "<product_name>"
    And Click on one Product
     And User switches focus to the new tab
    And click on Add to Cart for the selected product
    Then "<product_name>" should be added to my cart
   
   Examples:
     | product_name  |
     | Toys    |
     | mobiles      |
           

