Feature: Verify successfull login scenario for the leafTaps Application

Scenario Outline: Positive Login Functionality

Given I enter username as <uName>
And I enter password as <pWord>
And I click on the login button
Then I verify the HomePage

Examples:
|uName|pWord|
|'DemoSalesManager'|'crmsfa'|
|'Democsr'|'crmsfa'|