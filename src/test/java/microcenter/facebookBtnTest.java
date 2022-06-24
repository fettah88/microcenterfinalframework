package microcenter;

import base.CommonAPI;
import microCenterPages.HomePage;
import microCenterPages.MicroCenterFacebookPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class facebookBtnTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(facebookBtnTest.class);

  @Test
  public void facebookBtn(){

      HomePage homePage = new HomePage(getDriver());
      MicroCenterFacebookPage microCenterFacebookPage = new MicroCenterFacebookPage(getDriver());
      homePage.scrollToViewfacebookBtn(getDriver());
      homePage.clickonfacebookB();
      microCenterFacebookPage.clickOnfacebooklogin();
      String expectedPageTitle = "Micro Center - Computers and Electronic Device Retailer";
      Assert.assertEquals(getPageTitle(),expectedPageTitle);

  }


}
