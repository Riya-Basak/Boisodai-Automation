Feature: Test Profile display
  Background:
    When Click on the login link
    When User enter valid username
    And Click on the Continue Button
    When User enter valid password
    And Click on the Continue Button
  @Demo
  Scenario: Profile shown
    When Click on the Profile icon
    And Click on dashboard
    And Click on My order