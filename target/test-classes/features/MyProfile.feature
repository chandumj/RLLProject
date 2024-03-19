
Feature: MyProfile Functionality
 Background: 
     Given User navigate to the FirstCry URL
    When User log into the application with credentials
Scenario: User edits their profile information
 When User click on My Account
 And User select My Profile
 And User perform an Edit operation
 Then User details should be edited