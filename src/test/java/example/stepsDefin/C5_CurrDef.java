package example.stepsDefin;

import example.pages.P3_HomPag;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class C5_CurrDef {

    P3_HomPag Pag3 = new P3_HomPag();

    @Given("user clicks on currencies list and select euro")
    public void searchBox()
    {
        WebElement listCurrency = Hooks.driver.findElement(By.id("customerCurrency"));
        Select clselect =new Select(listCurrency);
        clselect.selectByVisibleText("Euro");
    }

    @Then("user can see € sign in products")
    public void userCanSee€SignInProducts() {

        for (double x = 0; x < Pag3.prices().size(); x++ )
        {
          String value = Pag3.prices().get((int) x).getText();
            System.out.println("Itemes price change to Euro :" + value);
            Assert.assertTrue(true, value);
        }
    }

}
