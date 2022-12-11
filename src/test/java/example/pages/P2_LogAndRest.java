package example.pages;

import example.stepsDefin.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P2_LogAndRest {

    public WebElement logBtn()
    {
        return Hooks.driver.findElement(By.className("ico-login"));
    }

    public WebElement email() {
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement password() {
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement pagUrl() {
        return Hooks.driver.findElement(By.className("ico-account"));
    }
    public WebElement forgPass(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/passwordrecovery\"]"));
    }
    public WebElement sendEmail(){
        return Hooks.driver.findElement(By.name("send-email"));
    }
    public WebElement actual(){
        return Hooks.driver.findElement(By.className("content"));
    }
    public WebElement SuccMasg() {
        return Hooks.driver.findElement(By.className("content"));
    }
}
