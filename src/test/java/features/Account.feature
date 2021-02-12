Feature: Application Login

Background:
Given validate the browser
When browser is triggered
Then check if browser is started

@SmokeTest
Scenario: Home page default login
Given user is on netbanking landing page
When user logs into the application with username "jin" and password "1234"
Then Home page is populated
And Cards displayed are "true"