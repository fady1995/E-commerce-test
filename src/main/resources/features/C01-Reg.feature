
@smoke
@test1

Feature: Registration

  Background: Browser will open then Navigate

  # Scenario 1
  Scenario: User could register with valid data
    Given open registration page
    Then select gender
    And insert first name "Name" and insert last name "Name2"
    Then select date of birth
    Then write your email "fadymail@gmail.com" and company name
    And insert the your pass then confirm it "Fady@1234" "Fady@1234"
    Then click on the button to complete the registration
    Then success message should appear


