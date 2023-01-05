@smoke
@test1

  Feature: Create A Successful Order

    Background: Browser will open then Navigate
      Given log into the account
      Then enter your email "fadymail@gmail.com" and Password "Fady@1234"
      When click on the button to login

    #Scenario 12

    Scenario: Logged user can Create successful Order

      Given chose electronics cat
      And chose cell phones Subcat
      Then select Mobile Nokia lumia
      Then update mobile Quantity
      Then add mobile to Shop cart
      Then chose Apparel then sub category Shoes
      Then chose blu color
      Then view the option after filtration
      And add product to Shop cart
      And open Shop Cart page to buy
      Then update Shop cart Quantity
      Then agree and click on CheckOut
      Then fill shipping template
      When check out then order will be completed



