@FirstCry
Feature: Search Functionality

  Background: 
    Given User navigate to the FirstCry URL
    When User log into the application with credentials

  Scenario Outline: Search for Product
    When User search for "<searchproduct>"
    And select product from the search results
    And User switches focus to the new tab
    Then title should be "<title>"

    Examples: 
      | searchproduct | title |
      | toys          |   Buy Babyhug Cotton Woven Full Sleeves Checked Shirt - Navy Blue for Boys (3-4 Years) Online in India, Shop at FirstCry.com - 15934333    |
     