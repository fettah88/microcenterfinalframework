package microcenter;

import base.CommonAPI;
import microCenterPages.HomePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class youtubeBtnTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(youtubeBtnTest.class);

    @Test
    public void youtubeBtnTest(){

       HomePage homePage = new HomePage(getDriver());
        homePage.scrollToViewyoutubeBtn(getDriver());
        homePage.clickOnYotubeB();
        String expectedPageTitle = "Micro Center - Computers and Electronic Device Retailer";
        Assert.assertEquals(getPageTitle(),expectedPageTitle);

    }
}

