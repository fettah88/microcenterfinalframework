package Abdessalam.AsusUpDate;


import AmgharPages.AsusHomePage;
import AmgharPages.AsusLogInPage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogPositiveT extends CommonAPI {

    @Test
    public void LogIn(){

        AsusHomePage AsusHomePage = new AsusHomePage(getDriver());
        AsusLogInPage AsusLogInPage = new AsusLogInPage(getDriver());


        AsusHomePage.clickCookiesBtn();
        AsusHomePage.clickLogInIcon();
        AsusHomePage.clickLogInBtn();
        AsusLogInPage.enterEmail();
        AsusLogInPage.enterPassWord();
        waitFor(2);
        AsusHomePage.pageTitle();
        String text = AsusHomePage.pageTitle();
        Assert.assertEquals("ASUS USA", text);



//        click("#wrapperDesktop > div.HeaderDesktop__headerLayerTwo__356nX > div > div.HeaderDesktop__navContainer__2TkWh > div > div.headerIcon.HeaderDesktop__searchAndMemberFeatureItem__9yN6u.HeaderDesktop__member__Q9_HJ.HeaderDesktop__themeWhite__1bpoN");
//
//        click("#wrapperDesktop > div.HeaderDesktop__headerLayerTwo__356nX > div > div.HeaderDesktop__navContainer__2TkWh > div > div.headerIcon.HeaderDesktop__searchAndMemberFeatureItem__9yN6u.HeaderDesktop__member__Q9_HJ.HeaderDesktop__themeWhite__1bpoN > div > div.HeaderDesktop__memberFeaturefloatBox__31KFX > div:nth-child(1)");
//        waitFor(2);
//        type("#txtMail","amganas18@gmail.com");
//        type("#txtPassword","Anes2019");
//        click("body > div:nth-child(2) > div > div > div > div.LoginPage__right__oH-33 > form > div.LoginPage__submit__2W05s > button");
//        waitFor(5);
    }
}
