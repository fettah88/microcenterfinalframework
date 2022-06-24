package microcenter;

import base.CommonAPI;
import microCenterPages.HomePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class pupilarCatigoriesTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(pupilarCatigoriesTest.class);

        @Test
        public void printers() {
         HomePage homePage = new HomePage(getDriver());
         homePage.scrollToViewPrinters(getDriver());
         homePage.clickOnPrinterItem();
         String expectedPageTitle = "Printers : Micro Center";
         Assert.assertEquals(getPageTitle(), expectedPageTitle);
        }

        @Test
        public  void powerSupplies(){
         HomePage homePage = new HomePage(getDriver());
         homePage.scrollToViewPowerSupplies(getDriver());
         homePage.clickOnPowerSupplies();
         String expectedPageTitle = "Power Supplies : Micro Center";
         Assert.assertEquals(getPageTitle(), expectedPageTitle);

        }

        @Test
       public  void makerProducts(){

        HomePage homePage = new HomePage(getDriver());
        homePage.scrollToViewMakerProducts(getDriver());
        homePage.clickOnMakerProductsItems();
        String expectedPageTitle = "Maker/STEM : Micro Center";
        Assert.assertEquals(getPageTitle(), expectedPageTitle);

        }

    @Test
    public  void memoryproducts(){

        HomePage homePage = new HomePage(getDriver());
        homePage.scrollToViewMakerProducts(getDriver());
        homePage.clickOnMemoryItem();
        String expectedPageTitle = "Computer Memory : Micro Center";
        Assert.assertEquals(getPageTitle(), expectedPageTitle);


    }

}

