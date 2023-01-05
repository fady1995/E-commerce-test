
@smoke

Feature: User should be able to login

  Background: Browser will open then Navigate


  # Scenario 2

  Scenario: User could log in with valid email and password
    Given log into the account
    Then enter your email "fadymail@gmail.com" and Password "Fady@1234"
    When click on the button to login
    Then home page will open





