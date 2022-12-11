package example.stepsDefin;


import example.pages.P2_LogAndRest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;



public class C2_LogDef {

    P2_LogAndRest Pag2 = new P2_LogAndRest();


    @Given("user go to login page")
    public void loginPage() throws InterruptedException {
        Pag2.logBtn().click();
        Thread.sleep(3000);
    }

    @Then("user enter email {string} and Password {string}")
    public void userEnterEmailAndPassword(String arg0, String arg1) {
        Pag2.email().sendKeys(arg0);
        Pag2.password().sendKeys(arg1);
    }

    @When("user clicks on login button")
    public void userClicksOnLoginButton() {
        Pag2.password().submit();
    }
    @Then("Screen Navigate to home page")
    public void screenNavigateToHomePage() throws InterruptedException {
        Thread.sleep(3000);
        SoftAssert link = new SoftAssert();
        link.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/", "Login page Successfully ");
        link.assertTrue(Pag2.pagUrl().isDisplayed(), "Account is Logged In");
        link.assertAll();
    }


}
