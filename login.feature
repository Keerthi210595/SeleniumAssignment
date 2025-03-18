Feature: User Authentication

Scenario: Login with valid credentials

Given user is in login page
When user enter username as demosalesmanager
And  user enter password as crmsfa
And user clicks on Login Button
Then user navigated to Welcomepage
And user should see Welcome message