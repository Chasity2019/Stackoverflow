Feature: Login to the Stackoverflow website
  I want to use this template to validate the credentials of an existing user

  Scenario: Login to the Stackoverflow website with valid credentials
    Given User navigates to the Stackoverflow website
    And User clicks on Login button
    And User enters valid username
    And User enters valid password
    When User clicks on the Submit button
    Then User is taken to home page successfully
    
	
