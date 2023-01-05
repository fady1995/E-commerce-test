package example.stepsDefin;

import example.pages.P3_HomPag;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class C8_TagDef {

    P3_HomPag Pag3 = new P3_HomPag();

    @Given("chose Apparel category")
    public void chose_appa_cat() {
        Pag3.apparel().click();
    }

    @Then("chose tag name")
    public void chose_tag_name() throws InterruptedException {
        Thread.sleep(2500);
        Pag3.tagone().click();
        Thread.sleep(2500);
        for (double x = 0; x < Pag3.prodlist().size(); x++ )
        {
            String value = Pag3.prodlist().get((int) x).getText();
            System.out.println(value);
            Assert.assertTrue(true, value);
        }
        String expectResult = "Products tagged with 'nice'";
        String actualResult = Pag3.flashTxt().getText();
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(actualResult.contains(expectResult));
        soft.assertTrue(Pag3.flashTxt().isDisplayed());
        soft.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/nice");
        System.out.println(" Your Actual Result : " + actualResult);
        soft.assertAll();

    }

    @And("should be able to select different tag")
    public void chose_diffe_tag() throws InterruptedException {
        Thread.sleep(2500);
        Pag3.tagtwo().click();
        Thread.sleep(2500);
        for (double x = 0; x < Pag3.prodlist().size(); x++ )
        {
            String value = Pag3.prodlist().get((int) x).getText();
            System.out.println(value);
            Assert.assertTrue(true, value);
        }
        String expectResult = "Products tagged with 'jeans'";
        String actualResult = Pag3.flashTxt().getText();
        SoftAssert soft2 = new SoftAssert();
        soft2.assertTrue(actualResult.contains(expectResult));
        soft2.assertTrue(Pag3.flashTxt().isDisplayed());
        soft2.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/jeans");
        System.out.println(" Your Actual Result : " + actualResult);
        soft2.assertAll();
    }

}
