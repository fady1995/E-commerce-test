@smoke

  Feature: User can View Products & Search

    Background: Open Browser and Navigate to Page
      Given user go to login page
      Then user enter email "testmail@gmail.com" and Password "Fady@1234"
      When user clicks on login button

      #Scenario SC4
     Scenario Outline: SC4- Logged User could search for any product
        Given user search for items in search box For "<products>"
       Examples:
       |products|
       |Lenovo|
       |Fahrenheit|
       |Shoes    |






