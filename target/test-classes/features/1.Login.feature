@FirstCry
Feature: Login with UserId

  Scenario Outline: Login with UserId
    Given User navigate to the FirstCry URL
    When user click on the login button
    Then user should be on login Page
    And User enter "<UserId>"
    And user click on the continue button
    And user click the submit button
    Then user should be on Home Page

    Examples: 
      | UserId                   |
      | chandumj787013@gmail.com |
      |       |
      
