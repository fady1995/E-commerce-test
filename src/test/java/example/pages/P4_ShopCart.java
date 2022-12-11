package example.pages;

import example.stepsDefin.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P4_ShopCart {

    public WebElement size(){
        return Hooks.driver.findElement(By.id("product_attribute_9"));
    }
    public WebElement sucssText () {
        return Hooks.driver.findElement(By.className("content"));
    }
    public WebElement shoAdd(){return Hooks.driver.findElement(By.cssSelector("h2 a[href=\"/adidas-consortium-campus-80s-running-shoes\"]"));}
    public WebElement slecColor () {
        return Hooks.driver.findElement(By.className("attribute-square"));
    }
    public WebElement addCartbtn() {
        return Hooks.driver.findElement(By.id("add-to-cart-button-25"));
    }
    public WebElement SubcatElc() {
        return Hooks.driver.findElement(By.cssSelector("h2 a[href=\"/cell-phones\"]"));
    }
    public WebElement HTC_M8(){
        return Hooks.driver.findElement(By.cssSelector("h2 a[href=\"/htc-one-m8-android-l-50-lollipop\"]"));
    }
    public WebElement HTCaddbu(){
        return Hooks.driver.findElement(By.id("product_enteredQuantity_18"));
    }
    public WebElement HTCcartbut(){
        return Hooks.driver.findElement(By.id("add-to-cart-button-18"));
    }
    public WebElement ShopCartBut(){
        return Hooks.driver.findElement(By.className("ico-cart"));
    }
    public WebElement quant1() {return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[1]/table/tbody/tr[1]/td[5]/input"));}
    public WebElement quant2() {return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[1]/table/tbody/tr[2]/td[5]/input"));}
    public WebElement updatCart() {return Hooks.driver.findElement(By.id("updatecart"));}
    public WebElement CompareBut() {return Hooks.driver.findElement(By.className("compare-products"));}
    public WebElement HTCblue() {return Hooks.driver.findElement(By.cssSelector("h2 a[href=\"/htc-one-mini-blue\"]"));}
    public WebElement removeItem() {return Hooks.driver.findElement(By.name("updatecart"));}
    public List<WebElement> priceValue()
    {
        List<WebElement> prices = Hooks.driver.findElements(By.className("product-price"));
        return prices;
    }
    public WebElement electronics() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/electronics\"]"));
    }

}
