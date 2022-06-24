package microcenter;

import base.CommonAPI;
import microCenterPages.HomePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenBoxItemsTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(OpenBoxItemsTest.class);

     @Test
    public void ViewAllOpenBoxItems(){
       HomePage homePage = new HomePage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverProducts(getDriver());
        homePage.hoverOverClearance(getDriver());
        homePage.clickOnViewAllOpenBoxItems();
        String expectedPageTitle = "Open Box Products | Micro Center";
        Assert.assertEquals(getPageTitle(), expectedPageTitle);

    }

     @Test
    public void AppleOpenBoxItems(){
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverProducts(getDriver());
        homePage.hoverOverClearance(getDriver());
        homePage.clickOnAppleOpenBoxItems();
        String expectedPageTitle = "Apple : Micro Center";
        Assert.assertEquals(getPageTitle(), expectedPageTitle);
    }

      @Test
    public void NetworkingOpenBoxItems(){
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverProducts(getDriver());
        homePage.hoverOverClearance(getDriver());
        homePage.clickOnNetworkingOpenBoxItems();
        String expectedPageTitle = "Networking, Modems : Micro Center";
        Assert.assertEquals(getPageTitle(), expectedPageTitle);

    }

      @Test
    public void ComputerOpenBoxItems(){
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverProducts(getDriver());
        homePage.hoverOverClearance(getDriver());
        homePage.clickOnComputerOpenBoxItems();
        String expectedPageTitle = "Computers : Micro Center";
        Assert.assertEquals(getPageTitle(), expectedPageTitle);


    }

}
