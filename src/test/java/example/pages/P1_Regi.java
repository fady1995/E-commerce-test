package example.pages;

import example.stepsDefin.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P1_Regi {

    public WebElement regBtn()
    {
        return Hooks.driver.findElement(By.className("ico-register"));
    }

    public WebElement GenderType() {return Hooks.driver.findElement(By.id("gender-male"));}

    public WebElement firstNam()
    {
        return  Hooks.driver.findElement(By.id("FirstName"));
    }

    public WebElement lasNam()
    {
        return  Hooks.driver.findElement(By.id("LastName"));
    }

    public WebElement Dateday()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }

    public WebElement Datemonth()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }

    public WebElement Dateyear()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }


    public WebElement email()
    {
        return  Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement infocompany() {return Hooks.driver.findElement(By.id("Company"));}
    public WebElement newsletter(){return Hooks.driver.findElement(By.id("Newsletter"));}

    public WebElement passtext()
    {
        return  Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement confpasstxt()
    {
        return  Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement creatBtn() {return Hooks.driver.findElement(By.id("register-button"));}
    public WebElement result()
    {
        return  Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }
    public WebElement pagebod(){return Hooks.driver.findElement(By.className("page-body"));}
    public WebElement colortxt(){return Hooks.driver.findElement(By.className("result"));}

}
