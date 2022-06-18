package Abdessalam.AsusUpDate;


import AmgharPages.AsusHomePage;
import AmgharPages.AsusLogInPage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class LogNegativeT extends CommonAPI {

    @Test
    public void LogIn(){

        AsusHomePage AsusHomePage = new AsusHomePage(getDriver());
        AsusLogInPage AsusLogInPage = new AsusLogInPage(getDriver());

        AsusHomePage.clickCookiesBtn();
        AsusHomePage.clickLogInIcon();
        AsusHomePage.clickLogInBtn();
        AsusLogInPage.enterFakeEmail();
        AsusLogInPage.enterFakePassWord();
        waitFor(5);


//        click("#cookie-policy-info > div > div.cookie-btn-box > div.btn-asus.btn-ok.btn-read-ck");
//        click("#wrapperDesktop > div.HeaderDesktop__headerLayerTwo__356nX > div > div.HeaderDesktop__navContainer__2TkWh > div > div.headerIcon.HeaderDesktop__searchAndMemberFeatureItem__9yN6u.HeaderDesktop__member__Q9_HJ.HeaderDesktop__themeWhite__1bpoN");
//        click("#wrapperDesktop > div.HeaderDesktop__headerLayerTwo__356nX > div > div.HeaderDesktop__navContainer__2TkWh > div > div.headerIcon.HeaderDesktop__searchAndMemberFeatureItem__9yN6u.HeaderDesktop__member__Q9_HJ.HeaderDesktop__themeWhite__1bpoN > div > div.HeaderDesktop__memberFeaturefloatBox__31KFX > div:nth-child(1)");
//        type("#txtMail","amganas@gmail.com");
//        type("#txtPassword","hello");
//        click("body > div:nth-child(2) > div > div > div > div.LoginPage__right__oH-33 > form > div.LoginPage__submit__2W05s > button");
//
//        WrongInfo = driver.findElement(By.cssSelector("body > div:nth-child(2) > div > div > div > div.LoginPage__right__oH-33 > form > div.LoginPage__loginErrorMsg__3osO5")).getText();
//        Assert.assertEquals(WrongInfo,"Wrong account or password.");
//        waitFor(3);
    }
}
