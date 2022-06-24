package microcenter;


import base.CommonAPI;
import microCenterPages.HomePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class twitterBtnTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(twitterBtnTest.class);

    @Test
    public void twitterBtnTest(){

      HomePage homePage = new HomePage(getDriver());
        homePage.scrollToViewtwitterBtn(getDriver());
        homePage.clickontwitterB();
        String expectedPageTitle = "Micro Center - Computers and Electronic Device Retailer";
        Assert.assertEquals(getPageTitle(),expectedPageTitle);
    }
}
