package microcenter;

import base.CommonAPI;
import microCenterPages.AppleItemspage;
import microCenterPages.HomePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppleItemsSearchTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(AppleItemsSearchTest.class);

    @Test
    public void macbookItems() {
        HomePage homePage = new HomePage(getDriver());
        AppleItemspage AppleItemspage = new AppleItemspage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverAplleItemsBtn(getDriver());
        String expectedPageTitle = "Micro Center - Computers and Electronic Device Retailer";
        Assert.assertEquals(getPageTitle(),expectedPageTitle);

    }

    @Test
    public void macDesktopsItems() {
        HomePage homePage = new HomePage(getDriver());
        AppleItemspage AppleItemspage = new AppleItemspage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverAplleItemsBtn(getDriver());
        homePage.clickOnmacbookBtn();
        String expectedPageTitle = "Laptops/Notebooks : Micro Center";
        Assert.assertEquals(getPageTitle(),expectedPageTitle);
    }
     @Test
    public void ipadItems() {
        HomePage homePage = new HomePage(getDriver());
        AppleItemspage AppleItemspage = new AppleItemspage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverAplleItemsBtn(getDriver());
        homePage.clickOnipadItemsBtn();
         String expectedPageTitle = "iPads : Micro Center";
         Assert.assertEquals(getPageTitle(),expectedPageTitle);

    }
    @Test
    public void AirPodItems() {
        HomePage homePage = new HomePage(getDriver());
        AppleItemspage AppleItemspage = new AppleItemspage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverAplleItemsBtn(getDriver());
        homePage.clickOnAirPodItems();
        String expectedPageTitle = "AirPods : Headphones And Earbuds : Micro Center";
        Assert.assertEquals(getPageTitle(),expectedPageTitle);

    }
      @Test
    public void AppleWatchItems() {
        HomePage homePage = new HomePage(getDriver());
        AppleItemspage AppleItemspage = new AppleItemspage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverAplleItemsBtn(getDriver());
        homePage.clickOnAppleWatchItems();
        String expectedPageTitle = "Apple : Wearable Technology : Micro Center";
        Assert.assertEquals(getPageTitle(),expectedPageTitle);

    }
}