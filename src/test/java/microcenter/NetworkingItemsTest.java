package microcenter;

import base.CommonAPI;
import microCenterPages.HomePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NetworkingItemsTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(NetworkingItemsTest.class);

    @Test
    public void NetworkingItems(){
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverProducts(getDriver());
        homePage.clickOnNetworking();
        homePage.clickOnAllNetworkingProducts();
        String expectedPageTitle = "Networking | Micro Center";
        Assert.assertEquals(getPageTitle(), expectedPageTitle);

    }

     @Test
    public void BroawdBrandModemsItems(){
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverProducts(getDriver());
        homePage.clickOnNetworking();
        homePage.clickOnBroadBandModemsItems();
         String expectedPageTitle = "Cable/DSL Modems : Micro Center";
         Assert.assertEquals(getPageTitle(), expectedPageTitle);

    }

     @Test
    public void NasEnclusersItems(){
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverProducts(getDriver());
        homePage.clickOnNetworking();
        homePage.clickOnNasEnclosuersItems();
        String expectedPageTitle = "Diskless : Network Attached Storage (NAS) : Micro Center";
        Assert.assertEquals(getPageTitle(), expectedPageTitle);

    }

     @Test
    public void NetworkingTools(){
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverProducts(getDriver());
        homePage.clickOnNetworking();
        homePage.clickOnNetworkingToolsItems();
        String expectedPageTitle = "Diskless : Network Attached Storage (NAS) : Micro Center";
        Assert.assertEquals(getPageTitle(), expectedPageTitle);
     }

    @Test
    public void PowerOverEthernetItems(){
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverProducts(getDriver());
        homePage.clickOnNetworking();
        homePage.clickOnPowerOverEthernet();
        String expectedPageTitle = "Power Over Ethernet : Micro Center";
        Assert.assertEquals(getPageTitle(), expectedPageTitle);
    }

    @Test
    public void ServerItems(){
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverProducts(getDriver());
        homePage.clickOnNetworking();
        homePage.clickOnServersBtn();
        String expectedPageTitle = "Desktop Computers : Micro Center";
        Assert.assertEquals(getPageTitle(), expectedPageTitle);

    }

}
