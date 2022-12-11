package example.stepsDefin;

import example.pages.P3_HomPag;
import example.pages.P4_ShopCart;
import example.pages.P5_WishCom;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class C11_CompDef {
    P5_WishCom Pag5 = new P5_WishCom();
    P4_ShopCart PG95 = new P4_ShopCart();

    @Given("user go to Electronic cat")
    public void user_go_to_electronic_cat() throws InterruptedException {
        Thread.sleep(3000);
        PG95.electronics().click();}

    @And("user sel Cell phone Subcategory")
    public void user_sel_cell_phone_subcategory() {
        PG95.SubcatElc().click();
    }

    @Then("user sel Mobile HTC One M-8")
    public void user_sel_mobile_htc_one_m() {
        PG95.HTC_M8().click();
    }

    @Then("user add mobile to compare list")
    public void userAddMobileToCompareList() throws InterruptedException {
        Pag5.CompareBut().click();
        Thread.sleep(3000);
        SoftAssert buy = new SoftAssert();
        String expect = "The product has been added to your ";
        String actual = Pag5.sucssText().getText();
        buy.assertTrue(actual.contains(expect));
        buy.assertTrue(Pag5.sucssText().isDisplayed());
        System.out.println("Your Result :" + actual);
        buy.assertAll();
    }

    @Then("user go to Compare Page")
    public void userGoToComparePage() {
        Pag5.ComparePG().click();
        SoftAssert see1 = new SoftAssert();
        String expect = "Compare products";
        String actual = Pag5.pageTxt().getText();
        see1.assertTrue(actual.contains(expect));
        see1.assertTrue(Pag5.comparetxt().isDisplayed());
        System.out.println("Your Page Show Title :" + actual);
        see1.assertAll();
        for (double x = 0; x < Pag5.product().size(); x++ )
        {
            String value = Pag5.product().get((int) x).getText();
            System.out.println("List Items : " +value);
            Assert.assertTrue(true, value);
        }
    }

}
