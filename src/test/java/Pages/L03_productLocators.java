package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

public class L03_productLocators {




    WebDriver driver = Hooks.driver;

    public WebElement laptops(){
        return driver.findElement(By.partialLinkText("Lapto"));
    }

    public WebElement firstLaptop(){
        return driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a"));
    }

    public WebElement addToCartButton(){
        return driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));
    }

    public WebElement secondLaptop(){
        return driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a"));
    }

    public void back(){
        driver.navigate().back();
        driver.navigate().back();

    }

    public void productName1(){
        WebElement productTitle1 = driver.findElement(By.xpath("//*[@id='tbodyid']//h2[text()='Sony vaio i5']"));
        storeDetails.productTitle1 = productTitle1.getText();

    }

    public void productName2(){
        WebElement productTitle2 = driver.findElement(By.xpath("//h2[contains(text(), 'Sony vaio i7')]"));
        storeDetails.productTitle2 = productTitle2.getText();
    }

    public void productPrice1(){
        WebElement price1 = driver.findElement(By.xpath("//h2[text()='Sony vaio i5']/following-sibling::h3[@class='price-container']"));
        String priceText = price1.getText();

        storeDetails.productPrice1 = Integer.parseInt(priceText.replaceAll("[^0-9]", ""));
    }

    public void productPrice2(){
        WebElement price = driver.findElement(By.xpath("//h2[contains(text(), 'Sony vaio i7')]/following-sibling::h3[contains(@class, 'price-container')]"));
        String priceText = price.getText();

        storeDetails.productPrice2 = Integer.parseInt(priceText.replaceAll("[^0-9]", ""));


    }





}
