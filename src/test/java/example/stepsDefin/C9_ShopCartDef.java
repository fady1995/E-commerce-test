package example.stepsDefin;

import example.pages.P4_ShopCart;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class C9_ShopCartDef {

    P4_ShopCart Pag4 = new P4_ShopCart();

    @And("user add item to Shopping cart")
    public void addItemsToShop() throws InterruptedException {
        Thread.sleep(2000);
        Pag4.shoAdd().click();
        Select select = new Select(Pag4.size());
        select.selectByVisibleText("9");
        Pag4.slecColor().click();
        Pag4.addCartbtn().click();
        Thread.sleep(3000);
        SoftAssert buy = new SoftAssert();
        String expect = "The product has been added to your ";
        String actual = Pag4.sucssText().getText();
        buy.assertTrue(actual.contains(expect));
        buy.assertTrue(Pag4.sucssText().isDisplayed());
        System.out.println("Your Result :" + actual);
        buy.assertAll();
        Thread.sleep(3000);
    }

    @Then("user go to Electronics category")
    public void userGoToElectronicsCategory() {
        Pag4.electronics().click();
    }

    @And("user select Cell phones Subcategory")
    public void userSelectCellPhonesSubcategory() {
        Pag4.SubcatElc().click();
    }

    @Then("user select Mobile HTC One M-8")
    public void userSelectMobileHTCOneM()  {
        Pag4.HTC_M8().click();
    }

    @Then("user add mobiles to Quantity")
    public void userAddMobilesToQuantity() throws InterruptedException {
        Pag4.HTCaddbu().clear();
        Pag4.HTCaddbu().sendKeys("1");
        Thread.sleep(2000);
        for (double x = 0; x < Pag4.priceValue().size(); x++ )
        {
            String value = Pag4.priceValue().get((int) x).getText();
            System.out.println(" Item Price : "+value);
            Assert.assertTrue(true, value);
        }
    }
    @Then("user add mobile to Shopping cart")
    public void userAddMobileToShoppingCart() throws InterruptedException {

        Pag4.HTCcartbut().click();
        Thread.sleep(3000);
        SoftAssert mobbuy = new SoftAssert();
        String expect = "The product has been added to your ";
        String actual = Pag4.sucssText().getText();
        mobbuy.assertTrue(actual.contains(expect));
        mobbuy.assertTrue(Pag4.sucssText().isDisplayed());
        System.out.println("Your Result :" + actual);
        mobbuy.assertAll();
        Thread.sleep(1500);
    }
    @And("user go to Shopping Cart page")
    public void userGoToShoppingCartPage() throws InterruptedException {
        Thread.sleep(3000);
        Pag4.ShopCartBut().click();

        //product
    }
    @Then("user update Shopping cart Quantity")
    public void userUpdateShoppingCartQuantity() throws InterruptedException {
       Thread.sleep(2000);

        Pag4.quant1().clear();
        Pag4.quant1().sendKeys("1");
        Pag4.quant2().clear();
        Pag4.quant2().sendKeys("2");
        Pag4.updatCart().click();
        Thread.sleep(2000);

    }

    @And("user remove one of items from cart")
    public void userRemoveOneOfItmesFromCart() throws InterruptedException {
        Pag4.removeItem().click();
        Thread.sleep(1500);
    }

    @Then("user select size and color")
    public void userSelectSizeAndColor() throws InterruptedException {
        Thread.sleep(2000);
        Pag4.shoAdd().click();
        Select select = new Select(Pag4.size());
        select.selectByVisibleText("9");
        Pag4.slecColor().click();
    }

    @Then("user select Mobile HTC One Mini Blue")
    public void userSelectMobileHTCOneMiniBlue() throws InterruptedException {

        Pag4.HTCblue().click();
        Pag4.CompareBut().click();
        Thread.sleep(3000);
        SoftAssert buy = new SoftAssert();
        String expect = "The product has been added to your ";
        String actual = Pag4.sucssText().getText();
        buy.assertTrue(actual.contains(expect));
        buy.assertTrue(Pag4.sucssText().isDisplayed());
        System.out.println("Your Result :" + actual);
        buy.assertAll();
    }

}
