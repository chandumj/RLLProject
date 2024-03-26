@FirstCry
Feature: Manage Shortlisted Products

  Background:
    Given User navigate to the FirstCry URL
    When User log into the application with credentials

  Scenario: Manage Shortlist Functions
    When User shortlist few products
   | Babyhug Cotton Woven Full Sleeves Checked Shirt - Navy Blue for Boys       |
   |Babyhug Cotton Woven Full Sleeves Checked Shirt - Red for Boys           |
    
    And User click on the Shortlist button
    Then user can see "<allproducts>" in the shortlist
    When User add a product to the cart from the shortlist
    When User delete a product from the shortlist
    Then the "<product>" should be removed from the shortlist
