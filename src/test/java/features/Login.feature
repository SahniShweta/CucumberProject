Feature: Application Login

Scenario: Home page default login
Given user is on netbanking landing page
When user logs into the application with username "jin" and password "1234"
Then Home page is populated
And Cards displayed are "true"

@MobileTest
Scenario: Home page default login
Given user is on netbanking landing page
When user logs into the application with username "john" and password "4321"
Then Home page is populated
And Cards displayed are "false"

Scenario: Home page default login
Given user is on netbanking landing page
When user signs up with following details
|john |abcd |joh@gmail.com |India |32452352|
Then Home page is populated
And Cards displayed are "false"

@SmokeTest
Scenario Outline: Home page default login
Given user is on netbanking landing page
When user logs in to the application with <username> and <password>
Then Home page is populated
And Cards displayed are "true"

Examples:
|username|password|
|user1	 |pass1		|
|user2	 |pass2		|
|user3	 |pass3		|
|user4	 |pass4		|