package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

public class L05_CheckOutLocators {

    WebDriver driver = Hooks.driver;

    public WebElement placeOrderButton(){
        return driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button"));
    }

    public WebElement nameField(){
        return driver.findElement(By.xpath("//*[@id=\"name\"]"));
    }

    public WebElement countryField(){
        return driver.findElement(By.xpath("//*[@id=\"country\"]"));
    }

    public WebElement cityField(){
        return driver.findElement(By.xpath("//*[@id=\"city\"]"));
    }

    public WebElement creditCardField(){
        return driver.findElement(By.xpath("//*[@id=\"card\"]"));
    }

    public WebElement monthField(){
        return driver.findElement(By.xpath("//*[@id=\"month\"]"));
    }

    public WebElement yearField(){
        return driver.findElement(By.xpath("//*[@id=\"year\"]"));
    }

    public WebElement purchaseButton(){
        return driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]"));
    }

    public int OrderTotalMoney(){
        WebElement buyTotalMoney = driver.findElement(By.xpath("//*[@id=\"totalm\"]"));
        String orderTotal = buyTotalMoney.getText();
        String priceText = orderTotal.replaceAll("[^0-9]", "");
        return Integer.parseInt(priceText);
    }

    public String purchaseMessage(){
        return driver.findElement(By.xpath("/html/body/div[10]/h2")).getText();
    }

    public WebElement messageText(){
        return driver.findElement(By.xpath("//*[@id=\"totalm\"]"));
    }
}
