package example.stepsDefin;

import example.pages.P4_ShopCart;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class C9_ShopCartDef {

    P4_ShopCart Pag4 = new P4_ShopCart();

    @And("add product to Shop cart")
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

    @Then("chose electronics cat")
    public void chose_electronics_catego() {
        Pag4.electronics().click();
    }

    @And("chose cell phones Subcat")
    public void chose_cell_pho_sub() {
        Pag4.SubcatElc().click();
    }

    @Then("select Mobile Nokia lumia")
    public void select_Mobile_Nokia_lumia()  {
        Pag4.Nokia_lumia().click();
    }

    @Then("update mobile Quantity")
    public void upd_mob_qua() throws InterruptedException {
        Pag4.NokiaCaddbu().clear();
        Pag4.NokiaCaddbu().sendKeys("1");
        Thread.sleep(2000);
        for (double x = 0; x < Pag4.priceValue().size(); x++ )
        {
            String value = Pag4.priceValue().get((int) x).getText();
            System.out.println(" Item Price : "+value);
            Assert.assertTrue(true, value);
        }
    }
    @Then("add mobile to Shop cart")
    public void add_mob_shop_cart() throws InterruptedException {

        Pag4.Nokiacartbut().click();
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
    @And("open Shop Cart page")
    public void open_shop_cart_page() throws InterruptedException {
        Thread.sleep(3000);
        Pag4.ShopCartBut().click();

        //product
    }
    @Then("update Shop cart Quantity")
    public void update_shop_cart_qua() throws InterruptedException {
       Thread.sleep(2000);

        Pag4.quant1().clear();
        Pag4.quant1().sendKeys("1");
        Pag4.quant2().clear();
        Pag4.quant2().sendKeys("2");
        Pag4.updatCart().click();
        Thread.sleep(2000);

    }

    @And("remove one item from shop cart")
    public void remo_one_item() throws InterruptedException {
        Pag4.removeItem().click();
        Thread.sleep(1500);
    }

    @Then("confirm size and color")
    public void select_size_color() throws InterruptedException {
        Thread.sleep(2000);
        Pag4.shoAdd().click();
        Select select = new Select(Pag4.size());
        select.selectByVisibleText("9");
        Pag4.slecColor().click();
    }

    @Then("chose Mobile HTC Mini Blue")
    public void select_mob_HTC_mini_blue() throws InterruptedException {

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
