
@smoke

Feature: Rest Password

  Background: Browser will open then Navigate


  # Scenario 3

  Scenario: could reset his/her password successfully

    Given log into the account
    Then click on Forget password to reset the pass
    Then insert your email "fadymail@gmail.com"
    When click on Recover button
    Then password will be rest successfully


