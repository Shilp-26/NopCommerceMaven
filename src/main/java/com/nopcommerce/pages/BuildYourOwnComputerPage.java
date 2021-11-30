package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utility {

    By selectCore = By.xpath("//select[@id='product_attribute_1']");
    By selectRam = By.xpath("//select[@id='product_attribute_2']");
    By clickOnHddRadio = By.xpath("//input[@id='product_attribute_3_7']");
    By clickOnOsRadio = By.xpath("//input[@id='product_attribute_4_9']");
    By checkTwoCheckBoxes = By.xpath("//input[@id='product_attribute_5_12']");
    By verifyPrice = By.xpath("//span[contains(text(),'$1,475.00')]");
    By addToCartButton2 = By.xpath("//button[@id='add-to-cart-button-1']");
    By verifyProductAddedMsg = By.xpath("//a[contains(text(),'shopping cart')]");
    By closeCrossBtn = By.className("close");
    By hoverToGoToCart = By.xpath("//span[contains(text(),'Shopping cart')]");

    public void selectCore(){
        selectByVisibleTextFromDropDown(selectCore, "2.2 GHz Intel Pentium Dual-Core E2200");
    }
    public void selectRam(){
        selectByVisibleTextFromDropDown(selectRam, "8GB [+$60.00]");
    }
    public void selectHddRadio(){
        clickOnElement(clickOnHddRadio);
    }
    public void selectOsRadio(){
        clickOnElement(clickOnOsRadio);
    }
    public void checkTwoBoxes(){
        clickOnElement(checkTwoCheckBoxes);
    }
    public void verifyPrice(){
        verifyText("$1,475.00", verifyPrice, "Incorrect Price");
    }
    public void clickOnAddToCartBtn(){
        clickOnElement(addToCartButton2);
    }
    public void verifyProductAddedToCart(){
        verifyText("shopping cart",verifyProductAddedMsg,"Product not added");
    }
    public void clickOnCross(){
        clickOnElement(closeCrossBtn);
    }
    public void clickOnGoToCart() throws InterruptedException {
        mouseHoverClick(hoverToGoToCart);
    }
}
