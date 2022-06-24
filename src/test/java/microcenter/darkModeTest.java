package microcenter;


import base.CommonAPI;
import microCenterPages.HomePage;
import microCenterPages.communityPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class darkModeTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(darkModeTest.class);

    @Test
    public void checkDarkMode() {
        HomePage homePage = new HomePage(getDriver());
        communityPage communityPage = new communityPage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.clickOncommunity();
        communityPage.clickOnDarkModeBtn();
        String expectedPageTitle = "Micro Center Community Dashboard";
        Assert.assertEquals(getPageTitle(),expectedPageTitle);



    }
}
