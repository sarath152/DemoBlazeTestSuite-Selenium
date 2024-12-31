package stepDefs;

import Pages.L03_productLocators;
import Pages.L04_cartLocators;
import Pages.storeDetails;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TC04_cartValidation{

    L04_cartLocators cart = new L04_cartLocators();




    @And("click on cart button")
    public void click_on_cart_button(){
        cart.CartButton().click();
    }



    @And("verify product 1 added with the same title and price")
    public void Verify_the_first_product_in_cart(){

        String productName1 = storeDetails.productTitle1;
        String cartName1 = cart.Product1_Name_Cart();

        int productPrice1 = storeDetails.productPrice1;
        int cartPrice1 = cart.Product1_Price_Cart();



        Assert.assertEquals(productName1,cartName1);
        Assert.assertEquals(productPrice1,cartPrice1);

    }

    @And("verify product 2 added with the same title and price")
    public void Verify_the_second_product_in_cart(){

        String productName2 = storeDetails.productTitle2;
        String cartName2 = cart.Product2_Name_Cart();

        int productPrice2 = storeDetails.productPrice2;
        int cartPrice2 = cart.Product2_Price_Cart();



        Assert.assertEquals(cartName2,productName2);
        Assert.assertEquals(cartPrice2,productPrice2);

    }

    @Then("Validate the total amount is displayed correctly for both products")
    public void validate_the_total_price(){

        int expectedTotal = cart.Product1_Price_Cart()+ cart.Product2_Price_Cart();
        int actualTotal = cart.actualTotalPrice();

        Assert.assertEquals(actualTotal,expectedTotal);

    }




}
