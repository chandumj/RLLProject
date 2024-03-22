@FirstCry
Feature: Search Functionality

  Background: 
    Given User navigate to the FirstCry URL
    When User log into the application with credentials

  Scenario Outline: Login, Search
    When User search for "<searchproduct>"
    And select product from the search results
    And User switches focus to the new tab
    Then title should be "<title>"

    Examples: 
      | searchproduct | title |
      | watches       |       |
      | mobiles       |       |
