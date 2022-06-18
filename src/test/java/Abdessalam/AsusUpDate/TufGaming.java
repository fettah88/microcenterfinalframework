package Abdessalam.AsusUpDate;

import AmgharPages.AsusHomePage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class TufGaming extends CommonAPI {
    @Test
    public void Tuf(){
        AsusHomePage AsusHomePage =new AsusHomePage(getDriver());

        AsusHomePage.clickCookiesBtn();
        AsusHomePage.hoverOverGamingBtn(getDriver());
        AsusHomePage.clickTufGamingFromDropDown();

//        click("#cookie-policy-info > div > div.cookie-btn-box > div.btn-asus.btn-ok.btn-read-ck");
//        hoverOver("#headerLayerOne > div > div.HeaderDesktop__topRightMenu__1mYR1.HeaderDesktop__themeWhite__1bpoN > div:nth-child(2) > div > span");
//        waitFor(2);
//        click("#headerLayerOne > div > div.HeaderDesktop__topRightMenu__1mYR1.HeaderDesktop__themeWhite__1bpoN > div:nth-child(2) > div > div > a:nth-child(2)");
//        click("#home > section:nth-child(3) > div.navi-m-link.nav-tuf > div:nth-child(3) > a");
//        waitFor(1);
//        click("#owl-products > div.owl-stage-outer.owl-height > div > div.owl-item.active > div > div.content > div.btn.btn-tuf > a");
//        waitFor(1);

    }
}
