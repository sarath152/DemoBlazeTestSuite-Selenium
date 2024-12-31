package stepDefs;

import Pages.L04_cartLocators;
import Pages.L05_CheckOutLocators;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class TC05_CheckOutSteps {

    L05_CheckOutLocators check = new L05_CheckOutLocators();
    L04_cartLocators cart = new L04_cartLocators();

    @And("click on place order button")
    public void click_on_place_order_button(){

        check.placeOrderButton().click();
    }

    @And("validate the purchase total amount of money")
    public void validate_purchase_total_amount(){

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBePresentInElement(check.messageText(),"Total:"));

        int ExpectedPurchaseTotal = cart.actualTotalPrice();

        int ActualPurchaseTotal = check.OrderTotalMoney();

        Assert.assertEquals(ActualPurchaseTotal,ExpectedPurchaseTotal);

    }

    @And("Fill Data name {string} country {string} city {string} card {string} month {string} year {string}")
    public void fill_the_data_field(String name , String country, String city , String cardNumber , String month , String year){

        check.nameField().sendKeys(name);

        check.countryField().sendKeys(country);

        check.cityField().sendKeys(city);

        check.creditCardField().sendKeys(cardNumber);

        check.monthField().sendKeys(month);

        check.yearField().sendKeys(year);
    }


    @And("click on purchase button")
    public void click_on_purchase_button(){

        check.purchaseButton().click();

    }

    @Then("verify that the purchase completed successfully")
    public void verify_the_purchase_completed_successfully(){

        String expectedPurchaseMessage = "Thank you for your purchase!";
        String actualPurchaseMessage = check.purchaseMessage();

        Assert.assertEquals(actualPurchaseMessage,expectedPurchaseMessage);

    }


}
