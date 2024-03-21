Feature: Manage Shortlisted Products

  Background:
    Given User navigate to the FirstCry URL
   When User log into the application with credentials

  Scenario: Shortlist and Manage Products
    When User shortlist few products
    And User click on the Shortlist button
 #   Then the selected products should be in my Shortlist
    When User add a product to the cart from the shortlist
    When User delete a product from the shortlist
    Then the product should be removed from the shortlist
