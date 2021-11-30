package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

import java.util.Random;

public class RegisterPage extends Utility {

    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By email = By.xpath("//input[@id='Email']");
    By enterPassword = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerButton=By.xpath("//button[@id='register-button']");
    By verifyRegisterMsg =By.xpath("//div[contains(text(),'Your registration completed')]");
    By continueBtn =By.xpath("//a[contains(text(),'Continue')]");



    public void inputFirstName() {
        sendTextToElement(firstName, "John");
    }

    public void inputLastName() {
        sendTextToElement(lastName, "Anderson");
    }

    public void inputEmail() {
        sendTextToElement(email, getRandomEmail());
    }
    public void inputPassword(){
        sendTextToElement(enterPassword,"Prime123");
    }
    public void enterConfirmPassword(){
        sendTextToElement(confirmPassword,"Prime123");
    }

    public void clickOnRegisterBtn(){
        clickOnElement(registerButton);
    }
    public void verifyRegisterationMsg(){
        verifyText("Your registration completed",verifyRegisterMsg,"Error");
    }
public void clickOnContinue(){
        clickOnElement(continueBtn);
}


}
