Feature: Verify Successfull creation of atleast two records.

Scenario Outline: Create Contacts - Positive Scenario

#Given I enter username as <uName>
#And I enter password as <pWord>
#And I click on the login button
Then I verify the HomePage
Given I click the CRMSFA Link
And I click on the Contacts Tab in MyHomePage
And I click on the Contacts Tab
And I enter first name of new Contact as <fName>
And I enter last name of new Contact as <lName>
And I enter Area Pin Code of new Contact as <pinCode>
When I click on the Create Contacts Submit Button
Then I verfy the first name of the Contact Created as <fName>

Examples:
|fName|lName|pinCode|
|'Ravi'|'Kishan'|'77011'|
|'Manoj'|'Tiwari'|'22587'|

#|uName|pWord|fName|lName|pinCode|
#|'DemoSalesManager'|'crmsfa'|'Ravi'|'Kishan'|'77011'|
#|'Democsr'|'crmsfa'|'Manoj'|'Tiwari'|'22587'|
