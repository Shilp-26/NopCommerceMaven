package com.nopcommerce.testsuite;

import com.nopcommerce.pages.*;
import com.nopcommerce.testbase.TestBase;
import org.testng.annotations.Test;

public class ComputersTest extends TestBase {

    ComputersPage computersPage = new ComputersPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    WelcomePleaseSignInPage welcomePleaseSignInPage = new WelcomePleaseSignInPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    ThankYouPage thankYouPage = new ThankYouPage();
    HomePage homePage = new HomePage();



    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        computersPage.navigateToDesktop();
        computersPage.sortProductsAToZ();
        computersPage.verifyProductAToZOrder();
        Thread.sleep(2000);
        computersPage.addToCart();

        buildYourOwnComputerPage.selectCore();
        buildYourOwnComputerPage.selectRam();
        buildYourOwnComputerPage.selectHddRadio();
        buildYourOwnComputerPage.selectOsRadio();
        buildYourOwnComputerPage.checkTwoBoxes();
        buildYourOwnComputerPage.verifyPrice();
        buildYourOwnComputerPage.clickOnAddToCartBtn();
        buildYourOwnComputerPage.verifyProductAddedToCart();
        buildYourOwnComputerPage.clickOnCross();
        buildYourOwnComputerPage.clickOnGoToCart();


        shoppingCartPage.verifyShoppingCartMSG();
        shoppingCartPage.changeQuantity();
        shoppingCartPage.clickOnUpdateCartBtn();
        shoppingCartPage.verifyTotalPrice();
        shoppingCartPage.clickOnTermsOfService();
        shoppingCartPage.clickOnCheckoutBtn();

        welcomePleaseSignInPage.verifyWelcomMsg();
        welcomePleaseSignInPage.clickOnCheckoutAsGuestBtn();

        checkoutPage.inputFirstName();
        checkoutPage.inputLastName();
        checkoutPage.inputEmail();
        checkoutPage.selectCountry();
        checkoutPage.inputCity();
        checkoutPage.inputAddress();
        checkoutPage.inputPostCode();
        checkoutPage.inputPhoneNumber();
        checkoutPage.clickOnContinueBtn();
        checkoutPage.selectShippingOption();
        checkoutPage.clickOnShippingContinueBtn();
        checkoutPage.selectPaymentmethod();
        checkoutPage.clickOnContinueBtn2();
        checkoutPage.selectCreditCardType();
        checkoutPage.inputCardHolderName();
        checkoutPage.inputCardNumber();
        checkoutPage.selectExpiryMonth();
        checkoutPage.selectExpiryYear();
        checkoutPage.inputCardCode();
        checkoutPage.clickOnContinueBtn3();
        checkoutPage.verifyPaymentMethod();
        checkoutPage.verifyShippingMethod();
        checkoutPage.verifyTotal();
        checkoutPage.clickOnConfirmBtn();


        thankYouPage.verifyThankYouMsgIsDisplayed();
        homePage.verifyWelcomeToOurStoreMsg();
    }


}
