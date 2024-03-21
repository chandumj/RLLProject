Feature: Login with Mobile Number

  Scenario Outline: Login with Mobile Number
    Given User navigate to the FirstCry URL
    When user click on the login button
    And User enter "<UserId>"
    And user click on the continue button
    And user click the submit button
    Then user should be logged in successfully

    Examples: 
      | UserId |
      |    1234567890 |
      |    986543210 |
