package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {
    By computersPage = By.xpath("//h1[contains(text(),'Computers')]");
    By electronicsPage = By.xpath("//h1[contains(text(),'Electronics')]");
    By apparelPage = By.xpath("//h1[contains(text(),'Apparel')]");
    By digitalDownloadsPage = By.xpath("//h1[contains(text(),'Digital downloads')]");
    By booksPage = By.xpath("//h1[contains(text(),'Books')]");
    By jewelryPage = By.xpath("//h1[contains(text(),'Jewelry')]");
    By giftCardsPage = By.xpath("//h1[contains(text(),'Gift Cards')]");
    By verifyWelcomeMsg =By.xpath("//h2[contains(text(),'Welcome to our store')]");
    By logOut=By.xpath("//a[contains(text(),'Log out')]");

    public void clickOnLogOut(){
        clickOnElement(logOut);
    }
    public void verifyCurrentUrl(){
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://demo.nopcommerce.com/" );
    }

    public void selectMenu(String menu) {
        List<WebElement> topMenuNames = driver.findElements(By.xpath("//div[@class='header-menu']//li"));
        for (WebElement names : topMenuNames) {
            if (names.getText().equalsIgnoreCase(menu)) {
                names.click();
                break;
            }
        }
    }

    public void verifyComputersText() {
        verifyText("Computers", computersPage, "Computers page is not displayed");
    }

    public void verifyElectronicsText() {
        verifyText("Electronics", electronicsPage, "Electronics page is not displayed");
    }

    public void verifyApparelText() {
        verifyText("Apparel", apparelPage, "Apparel page is not displayed");
    }

    public void verifyDigitalDownloadsText() {
        verifyText("Digital downloads", digitalDownloadsPage, "Digital Downloads page is not displayed");
    }

    public void verifyBooksText() {
        verifyText("Books", booksPage, "Books page is not displayed");
    }

    public void verifyJewelryText() {
        verifyText("Jewelry", jewelryPage, "Jewelry page is not displayed");
    }

    public void verifyGiftCardsText() {
        verifyText("Gift Cards", giftCardsPage, "Gift Cards page is not displayed");
    }

    public void verifyWelcomeToOurStoreMsg(){
        verifyText("Welcome to our store", verifyWelcomeMsg, "Welcome Message not displayed");
    }
}

