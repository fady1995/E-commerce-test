package example.stepsDefin;

import example.pages.P1_Regi;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;


public class C1_RegDef {

    P1_Regi Pag1 = new P1_Regi();

    @Given("user go to register page")
    public void registerPage() throws InterruptedException {

        Pag1.regBtn().click();
        System.out.println("Register page open successfully");
        Thread.sleep(3000);
    }


    @Then("user select gender type")
    public void userSelectGenderType() {

        Pag1.GenderType().click();
    }

    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String arg0, String arg1) {
        Pag1.firstNam().sendKeys(arg0);
        Pag1.lasNam().sendKeys(arg1);
    }

    @Then("user enter date of birth")
    public void userEnterDateOfBirth() throws InterruptedException {

        Select select = new Select(Pag1.Dateday());
        select.selectByIndex(8);

        select = new Select(Pag1.Datemonth());
        select.selectByVisibleText("March");

        select = new Select(Pag1.Dateyear());
        select.selectByVisibleText("1995");

        Thread.sleep(1500);
    }

    @Then("user enter email {string} field and company name and check options")
    public void userEnterEmailField(String arg0) {
        Pag1.email().sendKeys(arg0);
        Pag1.infocompany().sendKeys("New Register");
        Pag1.newsletter().click();
    }

    @And("user enter Password fields {string} {string}")
    public void userEnterPassword(String arg0, String arg1) {
        Pag1.passtext().sendKeys(arg0);
        Pag1.confpasstxt().sendKeys(arg1);
    }

    @Then("user clicks on register button")
    public void userClicksBut() {
        Pag1.creatBtn().submit();
    }

    @Then("success message is displayed in Screen")
    public void successMsgIsShown() throws InterruptedException {

        String expectedResult = "Your registration completed";
        String actualResult = Pag1.pagebod().getText();
        String textColor = Pag1.colortxt().getCssValue("color");
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(actualResult.contains(expectedResult));
        soft.assertTrue(Pag1.result().isDisplayed(), "Register Successfully");
        soft.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/registerresult/1?returnUrl=/", "Page Is Right");
        System.out.println("Your Actual Result is :" + actualResult);
        System.out.println(textColor);
        Thread.sleep(3000);
        soft.assertAll();
    }
}
