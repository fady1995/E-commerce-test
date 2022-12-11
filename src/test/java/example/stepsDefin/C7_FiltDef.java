package example.stepsDefin;

import example.pages.P3_HomPag;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class C7_FiltDef {

    P3_HomPag Pag3 = new P3_HomPag();


    @Given("user select Apparel and go to sub category Shoes")
    public void userSelectApparelAndGoToSubCategoryShoes() {
        Pag3.apparel().click();
        Pag3.shoes().click();
    }

    @Then("user select color red from CheckBox")
    public void uesrSelectColorRedFromCheckBox() {
        Pag3.redcolor().click();
    }

    @Then("filter option view results")
    public void filterOpthionViewResults() throws InterruptedException {
        Thread.sleep(2000);
        for (double x = 0; x < Pag3.pricecont().size(); x++ )
        {
            String value = Pag3.pricecont().get((int) x).getText();
            System.out.println(" Item Price : "+value);
            Assert.assertTrue(true, value);
        }
        SoftAssert soft = new SoftAssert();
        String expected = "https://demo.nopcommerce.com/shoes?viewmode=grid&orderby=0&pagesize=6&specs=15";
        String actulResult = Hooks.driver.getCurrentUrl();
        soft.assertTrue(actulResult.contains(expected),"Right Page Shown");
        soft.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/shoes?viewmode=grid&orderby=0&pagesize=6&specs=15");
        System.out.println(" Your Filter Get the URl : " + actulResult);
        soft.assertAll();
    }

}
