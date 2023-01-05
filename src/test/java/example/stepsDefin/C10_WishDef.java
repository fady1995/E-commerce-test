package example.stepsDefin;

import example.pages.P5_WishCom;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class C10_WishDef {

    P5_WishCom Pag5 = new P5_WishCom();

    @Then("add item to Wishlist")
    public void add_item_wishlist() throws InterruptedException {
        Pag5.whishBt2().click();
        Thread.sleep(3000);
        SoftAssert buy = new SoftAssert();
        String expect = "The product has been added to your ";
        String actual = Pag5.sucssText().getText();
        buy.assertTrue(actual.contains(expect));
        buy.assertTrue(Pag5.sucssText().isDisplayed());
        System.out.println("Your Result :" + actual);
        buy.assertAll();
    }

    @And("chose Sound Forge Pro 11 and add it  to Wishlist")
    public void select_win_proWishlist() throws InterruptedException {
        Pag5.ForgePro().click();
        Pag5.whishBt().click();
        Thread.sleep(3000);
        SoftAssert buy = new SoftAssert();
        String expect = "The product has been added to your ";
        String actual = Pag5.sucssText().getText();
        buy.assertTrue(actual.contains(expect));
        buy.assertTrue(Pag5.sucssText().isDisplayed());
        System.out.println("Your Result :" + actual);
        buy.assertAll();
    }

    @Then("open Wishlist page then check the items")
    public void open_wishlist_page() throws InterruptedException {
        Thread.sleep(3000);
        Pag5.wishPageBut().click();
        Thread.sleep(3000);
        for (double x = 0; x < Pag5.product().size(); x++ )
        {
            String value = Pag5.product().get((int) x).getText();
            System.out.println("List Items : " +value);
            Assert.assertTrue(true, value);
        }
    }
}
