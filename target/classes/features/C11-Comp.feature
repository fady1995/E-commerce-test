@smoke

  Feature: Logged user could add different products to Compare list

    Background: Open Browser and Navigate to Page
      Given user go to login page
      Then user enter email "testmail@gmail.com" and Password "Fady@1234"
      When user clicks on login button


      #Scenario: SC11
    Scenario: SC11- Logged user could add different products to compare list
      Given user go to Electronic cat
      And user sel Cell phone Subcategory
      Then user sel Mobile HTC One M-8
      Then user add mobile to compare list
      Then user go to Electronics category
      And user select Cell phones Subcategory
      Then user select Mobile HTC One Mini Blue
      Then user go to Compare Page



