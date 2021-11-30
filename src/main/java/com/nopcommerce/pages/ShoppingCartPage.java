package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class ShoppingCartPage extends Utility {

    By verifyShoppingCartMSg = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By changeQuantity = By.xpath("(//input[contains(@id, 'itemquantity')])");
    By updateButton = By.xpath("//button[text()='Update shopping cart']");
    By verifyTotal = By.className("product-subtotal");
    By termsOfService = By.xpath("//input[@id='termsofservice']");
    By checkoutButton = By.xpath("//button[@id='checkout']");
    By verifyQuantity =By.xpath("//span[contains(text(),'(2)')]");
By verifyTotalPhone =By.xpath("//span[contains(text(),'$698.00') and @class='product-subtotal']");

    public void verifyShoppingCartMSG() {
        verifyText("Shopping cart", verifyShoppingCartMSg, "Incorrect Page");
    }
    public void changeQuantity(){
        sendKeysToElement(changeQuantity, Keys.BACK_SPACE + "2");
    }
    public void clickOnUpdateCartBtn(){
        clickOnElement(updateButton);
    }


    public void verifyTotalPrice() {
        verifyText("$2,950.00", verifyTotal, "Incorrect Total");
    }
    public void clickOnTermsOfService(){
        clickOnElement(termsOfService);
    }
    public void clickOnCheckoutBtn(){
        clickOnElement(checkoutButton);
    }
    public void verifyQuantity(){
        verifyText("(2)",verifyQuantity,"Incorrect Quantity");
    }
public void verifyTotalPhone(){
        verifyText("$698.00",verifyTotalPhone,"Error");
}
}
