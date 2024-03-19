@firstcry
Feature: Shortlist Functionality

Background:
     Given User navigate to the FirstCry URL
   # When User log into the application with credentials
  Scenario: Shortlist products
    When User shortlist few products
    And User click on the Shortlist button
    Then the selected products should be in my Shortlist