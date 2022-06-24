package microcenter;

import base.CommonAPI;
import microCenterPages.HomePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Cart_ListsTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(Cart_ListsTest.class);

    @Test
    public void cart_listsTest(){
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.clickOnCart_ListsBtn();
        String expectedPageTitle = "Closeout : Accessories : Micro Center";
        Assert.assertEquals(getPageTitle(),expectedPageTitle);
    }
}
