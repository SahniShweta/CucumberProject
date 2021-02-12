Feature: Search and place order for vegetables

@SeleniumTest
Scenario: Search for items and validate results
Given User is on Greencart Landing page
When User searched for Cucumber vegetable
Then "Cucumber" results are displayed

@SeleniumTest
Scenario Outline: Search for items and validate results
Given User is on Greencart Landing page
When User searched for <Name> vegetable
And added items to cart
And user proceeded to checkout page for purchase
Then verify selected <Name> item are displayed in check out page

Examples:
|Name		 |
|Brinjal |
|Beetroot|