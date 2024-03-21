@firstcry
Feature: Edit User Profile

  Background: 
    Given User navigate to the FirstCry URL
    When User log into the application with credentials

  Scenario Outline: Edit user profile
    When User click on My Account
    And User select My Profile
    Then User should be on profile page
    And User perform an Edit operation on My Address Book
    And User add/change delivery address of "<user>" 
    And click on Save
    Then User can view the "<edited address>"

 Examples:
     | user  |edited address|
     | user1 |              |