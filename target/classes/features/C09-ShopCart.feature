@smoke

Feature:  (Add & Remove Product, Update Quantity)

  Background: Browser will open then Navigate


    #Scenario 9
  Scenario: Logged user could add different products to Shopping cart
    Given chose Apparel then sub category Shoes
    Then chose blu color
    Then view the option after filtration
    And add product to Shop cart
    Then chose electronics cat
    And chose cell phones Subcat
    Then select Mobile Nokia lumia
    Then update mobile Quantity
    Then add mobile to Shop cart

    #Scenario 9-2

    Scenario: Logged user could Update Quantity, Remove Product

      Given chose electronics cat
      And chose cell phones Subcat
      Then select Mobile Nokia lumia
      Then update mobile Quantity
      Then add mobile to Shop cart
      Then chose Apparel then sub category Shoes
      Then chose blu color
      Then view the option after filtration
      And add product to Shop cart
      And open Shop Cart page
      Then update Shop cart Quantity
      And remove one item from shop cart
