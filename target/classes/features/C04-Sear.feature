@smoke

  Feature: Search for products

    Background: Browser will open then Navigate

        #Scenario 4

     Scenario Outline: Logged User could search for any product

       Given search in search bar For "<productname>"
       Examples:
       |productname|
       |Camera|
       |Software|
       |Notebooks|






