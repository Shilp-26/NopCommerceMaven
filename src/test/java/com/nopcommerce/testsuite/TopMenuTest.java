package com.nopcommerce.testsuite;


import com.nopcommerce.pages.HomePage;
import com.nopcommerce.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {

    HomePage homePage = new HomePage();

    @Test
    public void verifyUserNavigatesToComputersPage() {
        homePage.selectMenu("Computers");
        homePage.verifyComputersText();
    }

    @Test
    public void verifyUserNavigatesToElectronicsPage() {
        homePage.selectMenu("Electronics");
        homePage.verifyElectronicsText();
    }

    @Test
    public void verifyUserNavigatesToApparelPage() {
        homePage.selectMenu("Apparel");
        homePage.verifyApparelText();
    }

    @Test
    public void verifyUserNavigatesToDigitalDownloadsPage() {
        homePage.selectMenu("Digital Downloads");
        homePage.verifyDigitalDownloadsText();
    }

    @Test
    public void verifyUserNavigatesToBooksPage() {
        homePage.selectMenu("Books");
        homePage.verifyBooksText();
    }

    @Test
    public void verifyUserNavigatesToJewelryPage() {
        homePage.selectMenu("Jewelry");
        homePage.verifyJewelryText();
    }

    @Test
    public void verifyUserNavigatesToGiftCardsPage() {
        homePage.selectMenu("Gift Cards");
        homePage.verifyGiftCardsText();
    }
}
