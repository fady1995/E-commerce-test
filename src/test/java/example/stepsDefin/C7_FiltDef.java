package example.stepsDefin;

import example.pages.P3_HomPag;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class C7_FiltDef {

    P3_HomPag Pag3 = new P3_HomPag();


    @Given("chose Apparel then sub category Shoes")
    public void chose_apparel_sub_cat() {
        Pag3.apparel().click();
        Pag3.shoes().click();
    }

    @Then("chose blu color")
    public void chose_blu_color() {Pag3.blucolor().click();}

    @Then("view the option after filtration")
    public void view_optio_fil() throws InterruptedException {
        Thread.sleep(2000);
        for (double x = 0; x < Pag3.pricecont().size(); x++ )
        {
            String value = Pag3.pricecont().get((int) x).getText();
            System.out.println(" Item Price : "+value);
            Assert.assertTrue(true, value);
        }
        SoftAssert soft = new SoftAssert();
        String expected = "https://demo.nopcommerce.com/shoes?viewmode=grid&orderby=0&pagesize=6&specs=16";
        String actulResult = Hooks.driver.getCurrentUrl();
        soft.assertTrue(actulResult.contains(expected),"Right Page Shown");
        soft.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/shoes?viewmode=grid&orderby=0&pagesize=6&specs=16");
        System.out.println(" Your Filter Get the URl : " + actulResult);
        soft.assertAll();
    }

}
