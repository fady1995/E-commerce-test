
@smoke

Feature: User Customer Can Login to Page

  Background: Open Browser and Navigate to Page


  # Scenario SC2
  Scenario: User could log in with valid email and password
    Given user go to login page
    Then user enter email "testmail@gmail.com" and Password "Fady@1234"
    When user clicks on login button
    Then Screen Navigate to home page





