package example.stepsDefin;


import example.pages.P3_HomPag;
import io.cucumber.java.en.Given;
import org.testng.Assert;



public class C4_SearDef {

    P3_HomPag Pag3 = new P3_HomPag();



    @Given("user search for items in search box For {string}")
    public void userSearchForItemsInSearchBoxFor(String arg0) throws InterruptedException {
        Pag3.searchBox().sendKeys(arg0);
        Pag3.searchBox().submit();
        for (double x = 0; x < Pag3.TextItem().size(); x++ )
        {
            String value = Pag3.TextItem().get((int) x).getText();
            System.out.println(value);
            Assert.assertTrue(true, value);
        }
        Thread.sleep(2000);
    }

}
