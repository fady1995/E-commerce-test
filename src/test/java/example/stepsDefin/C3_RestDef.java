package example.stepsDefin;


import example.pages.P2_LogAndRest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;


public class C3_RestDef {

    P2_LogAndRest Pag2 = new P2_LogAndRest();


    @Then("click on Forget password to reset the pass")
    public void forget_password() {
        Pag2.forgPass().click();
    }

    @Then("insert your email {string}")
    public void Enter_Email_ag(String arg0) {
        SoftAssert page = new SoftAssert();
        page.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/passwordrecovery", "Recover Page");
        Pag2.email().sendKeys(arg0);
        page.assertAll();
    }

    @When("click on Recover button")
    public void Click_Recover_But() {
        Pag2.sendEmail().click();
    }

    @Then("password will be rest successfully")
    public void pass_reset_succ() throws InterruptedException {
        String expictedResult = "Email with instructions has been sent to you.";
        String aactualResult = Pag2.actual().getText();
        Thread.sleep(2000);
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(aactualResult.contains(expictedResult), "Massage Appear");
        soft.assertTrue(Pag2.SuccMasg().isDisplayed(), "Text Displayed");
        System.out.println("Your Result is : " + aactualResult);
        soft.assertAll();
    }


}
