package microcenter;

import base.CommonAPI;
import microCenterPages.HomePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopDealsItemsTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(TopDealsItemsTest.class);

     @Test
    public void AllTopDeals() {
        HomePage homePage = new HomePage(getDriver());
        homePage.hoverOverProducts(getDriver());
        homePage.clickOnStorePopUp();
        homePage.clickOnTopDealsItems();
        homePage.clickOnviewAllTopDeal();
        String expectedPageTitle = "Micro Center";
        Assert.assertEquals(getPageTitle(),expectedPageTitle);


    }

    @Test
    public void monitors() {
        HomePage homePage = new HomePage(getDriver());
        homePage.hoverOverProducts(getDriver());
        homePage.clickOnStorePopUp();
        homePage.clickOnTopDealsItems();
        homePage.clickOnviewAllTopDeal();
        String expectedPageTitle = "Micro Center";
        Assert.assertEquals(getPageTitle(),expectedPageTitle);
    }

    @Test
    public void keyboards() {
        HomePage homePage = new HomePage(getDriver());
        homePage.hoverOverProducts(getDriver());
        homePage.clickOnStorePopUp();
        homePage.clickOnTopDealsItems();
        homePage.clickOnKeyboards();
        String expectedPageTitle = "Wired And Wireless Keyboards : Micro Center";
        Assert.assertEquals(getPageTitle(),expectedPageTitle);

    }

    @Test
    public void Television() {
       HomePage homePage = new HomePage(getDriver());
        homePage.hoverOverProducts(getDriver());
        homePage.clickOnStorePopUp();
        homePage.clickOnTopDealsItems();
        homePage.clickOnviewAllTopDeal();
        String expectedPageTitle = "Micro Center";
        Assert.assertEquals(getPageTitle(), expectedPageTitle);

    }
}