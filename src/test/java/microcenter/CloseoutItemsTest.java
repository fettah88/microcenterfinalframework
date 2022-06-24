package microcenter;

import base.CommonAPI;
import microCenterPages.HomePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CloseoutItemsTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CloseoutItemsTest.class);

   @Test
  public void closeoutItemsTest() {
      HomePage homePage = new HomePage(getDriver());
      homePage.hoverOverProducts(getDriver());
      homePage.hoverOverClearance(getDriver());
      homePage.clickOnViewAllCloseouts();
      String expectedPageTitle = "Closeout : Electronics : Micro Center";
      Assert.assertEquals(getPageTitle(),expectedPageTitle);

  }

      @Test
      public void AccessoriesCloseoutItems(){
          HomePage homePage = new HomePage(getDriver());
          homePage.hoverOverProducts(getDriver());
          homePage.hoverOverClearance(getDriver());
          homePage.clickOnAccessoriesItemsBtn();
          String expectedPageTitle = "Closeout : Accessories : Micro Center";
          Assert.assertEquals(getPageTitle(),expectedPageTitle);

      }

    @Test
    public void ElectronicsCloseoutItems(){
        HomePage homePage = new HomePage(getDriver());
        homePage.hoverOverProducts(getDriver());
        homePage.hoverOverClearance(getDriver());
        homePage.clickOnElectronicsItemsBtn();
        String expectedPageTitle = "Closeout : Electronics : Micro Center";
        Assert.assertEquals(getPageTitle(),expectedPageTitle);
    }

    @Test
    public void ComputerPartsCloseoutItems(){
        HomePage homePage = new HomePage(getDriver());
        homePage.hoverOverProducts(getDriver());
        homePage.hoverOverClearance(getDriver());
        homePage.clickOnComputerPartsCloseoutItems();
        String expectedPageTitle = "Closeout : Computer Parts : Micro Center";
        Assert.assertEquals(getPageTitle(),expectedPageTitle);
    }

    @Test
    public void GamingCloseoutItems(){
        HomePage homePage = new HomePage(getDriver());
        homePage.hoverOverProducts(getDriver());
        homePage.hoverOverClearance(getDriver());
        homePage.clickOnGamingItemsBtn();
        String expectedPageTitle = "Closeout : Gaming : Micro Center";
        Assert.assertEquals(getPageTitle(),expectedPageTitle);

      }


}
