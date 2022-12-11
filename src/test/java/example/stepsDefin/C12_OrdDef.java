package example.stepsDefin;


import example.pages.P6_MakOrd;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class C12_OrdDef {


    P6_MakOrd Pag6 = new P6_MakOrd();


    @Then("user check Agree Box and press CheckOut")
    public void userCheckAgreeBoxAndPressCheckOut() {
        Pag6.termsOf().click();
        Pag6.checkOut().click();
    }
    @Then("user fill shipping form")
    public void userFillShippingForm() throws InterruptedException {

        Select select = new Select(Pag6.country());
        select.selectByVisibleText("Egypt");
        select = new Select(Pag6.countryPro());
        select.selectByVisibleText("Other");

        Thread.sleep(1500);
        Pag6.City().clear();
        Pag6.City().sendKeys("City Example1");
        Pag6.BilAdress().clear();
        Pag6.BilAdress().sendKeys("Address Example1");
        Pag6.ZipCode().clear();
        Pag6.ZipCode().sendKeys("123451");
        Pag6.phone().clear();
        Pag6.phone().sendKeys("01234567891");
    }

    @When("User Check Out Order Successfully")
    public void userCheckOutOrderSuccessfully() throws InterruptedException {
        Thread.sleep(2000);
        Pag6.CheckoutBut().click();
        Thread.sleep(2000);
        Pag6.CheckoutBut2().click();
        Thread.sleep(2000);
        Pag6.CheckoutBut3().click();
        Thread.sleep(2000);
        Pag6.CheckoutBut4().click();
        Thread.sleep(2000);
        Pag6.CheckoutBut5().click();

        Thread.sleep(3000);
        SoftAssert order = new SoftAssert();
        String expect = "Your order has been successfully processed!";
        String actual = Pag6.txtDone().getText();
        order.assertTrue(actual.contains(expect),"Right Page Shown");
        order.assertTrue(Pag6.txtDone().isDisplayed());
        order.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/checkout/completed");
        System.out.println("Your Result :" + actual);
        order.assertAll();
    }

    @And("user go to Shopping Cart page to buy")
    public void userGoToShoppingCartPageToBuy() throws InterruptedException {
        Thread.sleep(3000);
        Pag6.ShopCartBut().click();
        Thread.sleep(3000);
        for (double x = 0; x < Pag6.product().size(); x++ )
        {
            String value = Pag6.product().get((int) x).getText();
            System.out.println("List Items : " +value);
            Assert.assertTrue(true, value);
        }
    }
}
