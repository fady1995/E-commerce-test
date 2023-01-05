@smoke

  Feature: add different products to Wishlist

    Background: Browser will open then Navigate

      #Scenario 10

    Scenario: Logged user could add different products to Wishlist
      Given chose Apparel then sub category Shoes
      Then chose blu color
      Then view the option after filtration
      Then confirm size and color
      Then add item to Wishlist
      Then chose computers then sub cat Software
      And chose Sound Forge Pro 11 and add it  to Wishlist
      Then open Wishlist page then check the items



