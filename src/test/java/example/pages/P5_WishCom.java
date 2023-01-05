package example.pages;

import example.stepsDefin.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P5_WishCom {

    public WebElement whishBt()
    {
        return Hooks.driver.findElement(By.id("add-to-wishlist-button-12"));
    }
    public WebElement whishBt2()
    {
        return Hooks.driver.findElement(By.id("add-to-wishlist-button-25"));
    }
    public WebElement ForgePro(){return Hooks.driver.findElement(By.cssSelector("h2 a[href=\"/sound-forge-pro-11-recurring\"]"));}
    public WebElement wishPageBut(){return Hooks.driver.findElement(By.className("wishlist-label"));}
    public List<WebElement> product()
    {
        List<WebElement> prodlist = Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div/table/tbody/tr[3]"));
        return prodlist;
    }
    public WebElement sucssText () {
        return Hooks.driver.findElement(By.className("content"));
    }
    public WebElement CompareBut(){return Hooks.driver.findElement(By.className("compare-products"));}
    public WebElement pageTxt() {
        return Hooks.driver.findElement(By.className("page-title"));
    }
    public WebElement ComparePG(){return Hooks.driver.findElement(By.cssSelector("a[href=\"/compareproducts\"]"));}
    public WebElement comparetxt () {
        return Hooks.driver.findElement(By.className("page-title"));
    }

}
