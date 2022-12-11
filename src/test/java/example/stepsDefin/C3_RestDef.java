package example.stepsDefin;


import example.pages.P2_LogAndRest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;


public class C3_RestDef {

    P2_LogAndRest Pag2 = new P2_LogAndRest();


    @Then("user clicks on Forget password Link")
    public void userClicksOnForgetPasswordLink() {
        Pag2.forgPass().click();
    }

    @Then("user enter email {string}")
    public void userEnterEmail(String arg0) {
        SoftAssert page = new SoftAssert();
        page.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/passwordrecovery", "Recover Page");
        Pag2.email().sendKeys(arg0);
        page.assertAll();
    }

    @When("user clicks on Recover button")
    public void userClicksOnRecoverButton() {
        Pag2.sendEmail().click();
    }

    @Then("Success massage appears on screen")
    public void successMassageAppearsInGreenOnScreen() throws InterruptedException {
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
