@firstcry
Feature: Search Functionality

  Background: 
     Given User navigate to the FirstCry URL
   # When User log into the application with credentials

  Scenario Outline: Login, Search 
    Then User should be redirected to the homepage
    When User search for any specific product
    And select  "<searchproduct>" from the search results
    And User switches focus to the new tab
    Then title should contain "<searchproduct>"
    Examples:
|searchproduct |
|watches       |
|Jackets       |