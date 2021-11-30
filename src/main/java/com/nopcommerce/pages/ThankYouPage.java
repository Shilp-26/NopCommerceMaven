package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class ThankYouPage extends Utility {
    By verifyThankYouMsg=By.xpath("//h1[contains(text(),'Thank you')]");
    By continueButton =By.xpath("//button[contains(text(),'Continue')]");
    By verifyOrderProcessed =By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");

    public void verifyThankYouMsgIsDisplayed(){
        verifyText("Thank you",verifyThankYouMsg,"Thank You Msg Not displayed");
        clickOnElement(continueButton);
    }
    public void verifyOrderProcessedMsg(){
        verifyText("Your order has been successfully processed!", verifyOrderProcessed, "Error");

    }
    public void clickOnContinue(){
        clickOnElement(continueButton);
    }
}
