package example.stepsDefin;

import example.pages.P3_HomPag;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class C6_CatDef {

    P3_HomPag Pag3 = new P3_HomPag();


    @Given("select different category from the drop menu")
    public void Select_Dif_Cat() {
        Pag3.computers().click();
        Pag3.apparel().click();
        Pag3.electronics().click();
    }

    @Then("chose computers then sub cat Software")
    public void chose_Comp_sub_sof() throws InterruptedException {
        Thread.sleep(2500);
        Pag3.computers().click();
        Pag3.SubCateg2().click();

        SoftAssert soft3 = new SoftAssert();
        soft3.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/software");
        soft3.assertAll();

    }



    }
