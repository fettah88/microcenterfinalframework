package microcenter;

import base.CommonAPI;
import microCenterPages.HomePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class instagramBtnTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(instagramBtnTest.class);

    @Test
    public void instagramBtn() {
        HomePage homePage = new HomePage(getDriver());
        homePage.scrollToViewinstagramBtn(getDriver());
        homePage.clickonfacebookB();
        String expectedPageTitle = "Micro Center - Computers and Electronic Device Retailer";
        Assert.assertEquals(getPageTitle(), expectedPageTitle);

    }
}