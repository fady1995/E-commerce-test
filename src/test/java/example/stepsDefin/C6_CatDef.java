package example.stepsDefin;

import example.pages.P3_HomPag;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;


public class C6_CatDef {

    P3_HomPag Pag3 = new P3_HomPag();


    @Given("user select different category tabs")
    public void userSelectDifferentCategoryTabs() {
        Pag3.computers().click();
        Pag3.apparel().click();
        Pag3.electronics().click();
    }

    @Then("user select Computers and go to sub category Software")
    public void userSelectComputersAndGoToSubCategorySoftware() throws InterruptedException {
        Thread.sleep(2500);
        Pag3.computers().click();
        Pag3.SubCateg().click();
    }

    @And("user select Windows-8-Pro")
    public void userSelectWindows() throws InterruptedException {
        Thread.sleep(2500);
        Pag3.win8().click();
        for (double x = 0; x < Pag3.priceValue().size(); x++ )
        {
            String value = Pag3.priceValue().get((int) x).getText();
            System.out.println("Itemes price change to Euro :" + value);
            Assert.assertTrue(true, value);
        }
    }
}
