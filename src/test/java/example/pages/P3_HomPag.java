package example.pages;

import example.stepsDefin.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P3_HomPag {

    public List<WebElement> prices()
    {
        List<WebElement> prices = Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
        return prices;
    }
    public List<WebElement> pricecont()
    {
        List<WebElement> prices = Hooks.driver.findElements(By.className("prices"));
        return prices;
    }
    public List<WebElement> priceValue()
    {
        List<WebElement> prices = Hooks.driver.findElements(By.className("product-price"));
        return prices;
    }

public List<WebElement> prodlist()
{
    List<WebElement> Plist = Hooks.driver.findElements(By.className("product-title"));
    return Plist;
}
    public WebElement computers() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/computers\"]"));
    }
    public WebElement apparel() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/apparel\"]"));
    }
    public WebElement electronics() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/electronics\"]"));
    }

    public WebElement SubCateg2() {
        return Hooks.driver.findElement(By.cssSelector("h2 a[href=\"/software\""));
    }
    public WebElement win8(){
        return Hooks.driver.findElement(By.cssSelector("h2 a[href=\"/windows-8-pro\"]"));
    }
    public List<WebElement> TextItem()
    {
        List<WebElement> TextList = Hooks.driver.findElements(By.className("product-title"));
        return TextList;
    }
    public WebElement shoes(){
        return Hooks.driver.findElement(By.cssSelector("h2 a[href=\"/shoes\"]"));
    }
    public WebElement blucolor() {
        return Hooks.driver.findElement(By.id("attribute-option-16"));
    }
    public WebElement tagone() { return Hooks.driver.findElement(By.cssSelector("a[href=\"/nice\"]"));}
    public WebElement tagtwo() { return Hooks.driver.findElement(By.cssSelector("a[href=\"/jeans\"]"));}
    public WebElement flashTxt () {
        return Hooks.driver.findElement(By.className("page-title"));
    }
    public WebElement searchBox() {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

}
