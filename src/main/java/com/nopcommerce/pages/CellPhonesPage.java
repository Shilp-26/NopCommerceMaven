package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class CellPhonesPage extends Utility {

    By electronicsPage =By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']");
    By cellPhonesTab = By.xpath("//ul[@class='top-menu notmobile']//a[text()='Cell phones ']");
    By verifyCellPhonesTxt = By.xpath("//h1[contains(text(),'Cell phones')]");
    By listViewTab =By.xpath("//a[contains(text(),'List')]");
    By nokiaLumia =By.xpath("//div[@class='item-grid']//a[contains(text(),'Nokia Lumia 1020')]");

public void hoverOnElectronics(){
    mouseHoverOnly(electronicsPage);
}
public void clickOnCellPhones(){
    clickOnElement(cellPhonesTab);
}
public void verifyCellPhonesPageIsDisplayed(){
    verifyText("Cell phones",verifyCellPhonesTxt,"Cell Phones page not displayed");
}
public void clickOnListViewTab(){
    clickOnElement(listViewTab);
}

public void clickOnNokia(){
    sendKeysToElement(nokiaLumia, Keys.ENTER);
}
}
