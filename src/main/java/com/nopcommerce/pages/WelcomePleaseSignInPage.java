package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class WelcomePleaseSignInPage extends Utility {
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By checkoutAsGuestBtn = By.xpath("//button[contains(text(),'Checkout as Guest')]");
    By registerBtn =By.xpath("//button[contains(text(),'Register')]");

    public void verifyWelcomMsg() {
        verifyText("Welcome, Please Sign In!", welcomeText, "Incorrect Message");

    }
    public void clickOnCheckoutAsGuestBtn(){
        clickOnElement(checkoutAsGuestBtn);
    }
    public void clickOnRegister(){
        clickOnElement(registerBtn);
    }

}
