package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class NokiaLumia extends Utility {

    By verifyNokiaLumiaText = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    By verifyPrice = By.xpath("//span[contains(text(),' $349.00 ')]");
    By changeQuantity = By.xpath("//input[@id='product_enteredQuantity_20']");
    By addToCart = By.xpath("//button[@id='add-to-cart-button-20']");
    By verifyProductHasBeenAddedMSg = By.xpath("//a[contains(text(),'shopping cart')]");
    By closeCrossButton = By.xpath("//span[@title='Close']");
    By hoverToShoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCart = By.xpath("//button[contains(text(),'Go to cart')]");

    public void verifyNokiaLumiaPage() {
        verifyText("Nokia Lumia 1020", verifyNokiaLumiaText, "Page not displayed");
    }

    public void verifyPrice() {
        verifyText("$349.00", verifyPrice, "Incorrect price");
    }

    public void changeQuantityPhone() {
        sendKeysToElement(changeQuantity, Keys.BACK_SPACE + "2");
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }

    public void verifyProductHasBeenAdded() {
        verifyText("shopping cart", verifyProductHasBeenAddedMSg, "error");
    }

    public void clickOnCrossButton() {
        clickOnElement(closeCrossButton);
    }
public void hoverToShoppingCart(){
        mouseHoverOnly(hoverToShoppingCart);
}
public void clickonGoToCartBtn(){
        clickOnElement(goToCart);
}

}
