package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputersPage extends Utility {
    By computerHover = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    By deskptopLink = By.xpath("//div[@class='header-menu']//ul[1]//a[contains(text(),'Computers')]//parent::li//ul//a[contains(text(), 'Desktops')]");
    By allProducts = By.xpath("//h2[@class='product-title']");
    By productsOrder = By.id("products-orderby");
    By addToCartButton = By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]");

    public void verifyProductAToZOrder()  {
        // Mouse hover on computer menu and click on Desktop
        mouseHoverOnly(computerHover);
        clickOnElement(deskptopLink);

        List<WebElement> originalList = driver.findElements(allProducts);
        List<String> originalProductNameList = new ArrayList<>();
        for (WebElement product : originalList) {
            originalProductNameList.add(product.getText());
        }

        Collections.sort(originalProductNameList);  // We sorted this list to alphabetical
        System.out.println(originalProductNameList);

        //Sort by position "Name: A to Z"
        selectByVisibleTextFromDropDown(productsOrder, "Name: A to Z");

        waitUntilVisibilityOfElementLocated(allProducts, 10);

        List<WebElement> afterSortingList = driver.findElements(allProducts);
        List<String> afterSortingProductName = new ArrayList<>();
        for (WebElement product : afterSortingList) {
            afterSortingProductName.add(product.getText());
        }
        System.out.println(afterSortingProductName);

        Assert.assertEquals("Product not sorted", originalProductNameList, afterSortingProductName);

    }

    public void navigateToDesktop(){
        mouseHoverOnly(computerHover);
        clickOnElement(deskptopLink);
    }
    public void sortProductsAToZ(){
        selectByVisibleTextFromDropDown(productsOrder, "Name: A to Z");
    }
    public void addToCart(){
        sendKeysToElement(addToCartButton, Keys.ENTER);
    }
}
