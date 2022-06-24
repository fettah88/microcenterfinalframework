package microcenter;

import base.CommonAPI;
import microCenterPages.HomePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PcPartItemsTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(PcPartItemsTest.class);

    @Test
    public void ProcessorsItemsTest(){
        HomePage homePage = new HomePage(getDriver());
        homePage.hoverOverPcPartsItems(getDriver());
        homePage.clickOnProcessorsItems();
        String expectedPageTitle = "CPUs | Computer Processors | Micro Center";
        Assert.assertEquals(getPageTitle(), expectedPageTitle);
    }
     @Test
    public void GraphicsCardsItemsTest(){
       HomePage homePage = new HomePage(getDriver());
        homePage.hoverOverPcPartsItems(getDriver());
        homePage.clickOnGraphicsCardsItems();
        String expectedPageTitle = "Graphics Cards : Micro Center";
        Assert.assertEquals(getPageTitle(), expectedPageTitle);
    }
    @Test
    public void ComputerCasesItemsTest(){
        HomePage homePage = new HomePage(getDriver());
        homePage.hoverOverPcPartsItems(getDriver());
        homePage.clickOnComputerCasesItems();
        String expectedPageTitle = "Computer Cases : Micro Center";
        Assert.assertEquals(getPageTitle(), expectedPageTitle);
    }
    @Test
    public void Drives_StorageItemsTest(){
        HomePage homePage = new HomePage(getDriver());
        homePage.hoverOverPcPartsItems(getDriver());
        homePage.clickOnDrives_StorageItems();
        String expectedPageTitle = "Hard Drives And Data Storage : Micro Center";
        Assert.assertEquals(getPageTitle(), expectedPageTitle);
    }
    @Test
    public void Air_WaterCoolingItemsTest(){
        HomePage homePage = new HomePage(getDriver());
        homePage.hoverOverPcPartsItems(getDriver());
        homePage.clickOnAir_WaterCoolingItems();
        String expectedPageTitle = "Air And Water Cooling : Micro Center";
        Assert.assertEquals(getPageTitle(), expectedPageTitle);

    }



}
