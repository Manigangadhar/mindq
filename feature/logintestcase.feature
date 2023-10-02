Feature: Login feature file for test case

@login
Scenario: User should be able to login to the application

Given User is in login page
When User enters email id "ramussc123@gmail.com"
And User enters password "Test@123"
And User clicks the signin button
Then close application
