package example.stepsDefin;


import example.pages.P2_LogAndRest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;



public class C2_LogDef {

    P2_LogAndRest Pag2 = new P2_LogAndRest();


    @Given("log into the account")
    public void login_into_account() throws InterruptedException {
        Pag2.logBtn().click();
        Thread.sleep(3000);
    }

    @Then("enter your email {string} and Password {string}")
    public void enter_email_password(String arg0, String arg1) {
        Pag2.email().sendKeys(arg0);
        Pag2.password().sendKeys(arg1);
    }

    @When("click on the button to login")
    public void click_login_But() {
        Pag2.password().submit();
    }
    @Then("home page will open")
    public void hame_page_navigate() throws InterruptedException {
        Thread.sleep(3000);
        SoftAssert link = new SoftAssert();
        link.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/", "Login page Successfully ");
        link.assertTrue(Pag2.pagUrl().isDisplayed(), "Account is Logged In");
        link.assertAll();
    }


}
