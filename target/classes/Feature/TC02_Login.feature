Feature: F02_Login | users could login with valid data

  Scenario: users could login with valid data
    When user click on login button
    And user login with valid "sarath1502" and "123456"
    And press on login button
    Then verify user login successfully "sarath1502"
