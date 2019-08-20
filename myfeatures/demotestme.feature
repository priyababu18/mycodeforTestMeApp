Feature: My validation on TestMe app

Background: TestMe app is launched
Given TestMe app is launched
Then user clicks on the SignIn link


Scenario Outline: Login validation for multiple users
Then user provides valid username "<uname>"
And user provides valid password "<pswrd>"
Then user clicks on the login button
And user verifies the login status 
Then click on SignOut link

Examples:
| uname   | pswrd       |
| lalitha | password123 |
| lalitha | password123 |

