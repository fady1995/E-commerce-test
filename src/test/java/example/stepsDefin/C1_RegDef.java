package example.stepsDefin;

import example.pages.P1_Regi;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;


public class C1_RegDef {

    P1_Regi Pag1 = new P1_Regi();

    @Given("open registration page")
    public void open_registration_page() throws InterruptedException {

        Pag1.regBtn().click();
        System.out.println("Register page open successfully");
        Thread.sleep(3000);
    }


    @Then("select gender")
    public void select_gender() {

        Pag1.GenderType().click();
    }

    @And("insert first name {string} and insert last name {string}")
    public void insert_names(String arg0, String arg1) {
        Pag1.firstNam().sendKeys(arg0);
        Pag1.lasNam().sendKeys(arg1);
    }

    @Then("select date of birth")
    public void select_date_of_birth() throws InterruptedException {

        Select select = new Select(Pag1.Dateday());
        select.selectByIndex(8);

        select = new Select(Pag1.Datemonth());
        select.selectByVisibleText("March");

        select = new Select(Pag1.Dateyear());
        select.selectByVisibleText("1995");

        Thread.sleep(1500);
    }

    @Then("write your email {string} and company name")
    public void enter_email(String arg0) {
        Pag1.email().sendKeys(arg0);
        Pag1.infocompany().sendKeys("New Register");
        Pag1.newsletter().click();
    }

    @And("insert the your pass then confirm it {string} {string}")
    public void Enter_Password(String arg0, String arg1) {
        Pag1.passtext().sendKeys(arg0);
        Pag1.confpasstxt().sendKeys(arg1);
    }

    @Then("click on the button to complete the registration")
    public void But_click() {
        Pag1.creatBtn().submit();
    }

    @Then("success message should appear")
    public void success_masg_appear() throws InterruptedException {

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
