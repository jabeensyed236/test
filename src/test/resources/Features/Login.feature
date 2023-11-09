Feature: User Login
  As a registered user
  I want to log in to my account on the Iqra Shopping website
  So that I can access my account and make purchases

  Scenario: Successful login
    Given I am on the Login page
    When I enter valid username and password
    And I click the Login button
    Then I should be redirected to the user dashboard