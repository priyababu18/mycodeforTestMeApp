Feature: My validation on Mercury Tours
Scenario: My login on Mercury Tours
Given User has launched the application
Then User enters the valid credentials
And User clicks on submit button
Then User verifies the login status

Scenario: Guest User registration in Mercury Tours
Given User Launched the app of Mercury Tours
Then User clicks onh SignUp link
When User enters the valid data in the form
And User clicks on Submit button available
Then User verifies the registration status
