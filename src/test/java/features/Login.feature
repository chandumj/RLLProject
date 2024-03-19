
Feature: FirstCry Login Automation

Scenario: Login to FirstCry
Given User navigate to the FirstCry URL
When user click on the login button
And user enter valid emailid
And user click on the continue button
And user click the submit button
Then user should be logged in successfully

