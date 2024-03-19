
Feature: Cart Functionality

Background:
     Given User navigate to the FirstCry URL
   # When User log into the application with credentials
Scenario: User must be able to view cart
When User Click on cart
And User perform actions
Then Cart should be updated
