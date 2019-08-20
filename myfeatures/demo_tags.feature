Feature: Understanding of tags
@Smoke @Sanity
Scenario: login validation on flipkart
Given launch the flipkart website
Then enter the credentials for login
@Regression
Scenario: user access to items in portal
Given user seraching the product
Then user able to add it to cart
@Smoke
Scenario: user access to remove from cart
Given user able to see the count on cart
Then user able to remove the item from cart
@Sanity
Scenario: user able to track the order
Given user has active order
Then user tracks the status of order
 