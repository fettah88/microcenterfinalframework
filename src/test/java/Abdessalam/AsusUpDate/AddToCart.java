package Abdessalam.AsusUpDate;


import AmgharPages.AsusHomePage;
import AmgharPages.AsusLaptopDealPage;
import AmgharPages.AsusLogInPage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
public class AddToCart extends CommonAPI {

    @Test
    
    public void addtocart(){
        AsusHomePage AsusHomePage = new AsusHomePage(getDriver());
        AsusLogInPage AsusLogInPage = new AsusLogInPage(getDriver());
        AsusLaptopDealPage AsusLaptopDealPage = new AsusLaptopDealPage(getDriver());


        AsusHomePage.clickCookiesBtn();
        Assert.assertEquals(getPageTitle(),"ASUS USA");
        AsusHomePage.clickLogInIcon();
        AsusHomePage.clickLogInBtn();
        AsusLogInPage.enterEmail();
        AsusLogInPage.enterPassWord();
        waitFor(3);
        AsusHomePage.clickBuyLaptopDeal();
        waitFor(3);
        AsusLaptopDealPage.clickAddToCartBtn();

    }







//        click("#cookie-policy-info > div > div.cookie-btn-box > div.btn-asus.btn-ok.btn-read-ck");
//        waitFor(2);
//        click("#wrapperDesktop > div.HeaderDesktop__headerLayerTwo__356nX > div > div.HeaderDesktop__navContainer__2TkWh > div > div.headerIcon.HeaderDesktop__searchAndMemberFeatureItem__9yN6u.HeaderDesktop__member__Q9_HJ.HeaderDesktop__themeWhite__1bpoN");
//
//        click("#wrapperDesktop > div.HeaderDesktop__headerLayerTwo__356nX > div > div.HeaderDesktop__navContainer__2TkWh > div > div.headerIcon.HeaderDesktop__searchAndMemberFeatureItem__9yN6u.HeaderDesktop__member__Q9_HJ.HeaderDesktop__themeWhite__1bpoN > div > div.HeaderDesktop__memberFeaturefloatBox__31KFX > div:nth-child(1)");
//        waitFor(2);
//        type("#txtMail","amganas18@gmail.com");
//        type("#txtPassword","Anes2019");
//        click("body > div:nth-child(2) > div > div > div > div.LoginPage__right__oH-33 > form > div.LoginPage__submit__2W05s > button");
//        waitFor(2);
//        click("#storeMenu > span");
//        click("//*[@id=\"__layout\"]/div/div[2]/div/div[2]/div[3]/div[2]/div[1]/div/div[4]/div/div[8]/div[1]");
//        click("#product-addtocart-button");




}
