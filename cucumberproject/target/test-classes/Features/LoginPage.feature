Feature: verifying the facebook details

Background:
 Given user is on facebook page

Scenario: verify the login details with invalid credentials
  When  user enters username and password
  Then  user schould click login button

  Scenario: verify the login details with invalid credentials
  When user enters username and password
  Then user schould click login button  
