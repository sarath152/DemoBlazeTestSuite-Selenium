package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

public class L04_cartLocators {

    WebDriver driver = Hooks.driver;

    public WebElement CartButton(){
        return driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[4]/a"));
    }


    public String Product1_Name_Cart(){
        return driver.findElement(By.xpath("//td[contains(text(), 'Sony vaio i5')]")).getText();
    }

    public int Product1_Price_Cart(){
        WebElement price = driver.findElement(By.xpath("//td[text()='Sony vaio i5']/following-sibling::td"));
        return Integer.parseInt(price.getText());
    }

    public String Product2_Name_Cart(){
        return driver.findElement(By.xpath("//td[contains(text(), 'Sony vaio i7')]")).getText();
    }

    public int Product2_Price_Cart(){
        WebElement price = driver.findElement(By.xpath("//td[contains(text(), 'Sony vaio i7')]/following-sibling::td"));
        return Integer.parseInt(price.getText());
    }

    public int actualTotalPrice(){
        WebElement totalPrice = driver.findElement(By.xpath("//*[@id=\"totalp\"]"));
        return Integer.parseInt(totalPrice.getText());

    }





}
