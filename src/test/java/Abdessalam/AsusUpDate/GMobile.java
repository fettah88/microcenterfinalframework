package Abdessalam.AsusUpDate;

import AmgharPages.AsusHomePage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class GMobile extends CommonAPI {
    @Test
    public void GamingMobilePhone(){
        AsusHomePage AsusHomePage = new AsusHomePage(getDriver());
        AsusHomePage.clickCookiesBtn();
        AsusHomePage.hoverOverMobile(getDriver());
        AsusHomePage.clickPhoneAllSeriesFromMenu();
        AsusHomePage.clickCheckBoxGamingPhone();
        waitFor(3);
        AsusHomePage.checkIfBoxCheckedGaming();


//        click("#cookie-policy-info > div > div.cookie-btn-box > div.btn-asus.btn-ok.btn-read-ck");
//        waitFor(1);
//        hoverOver("#wrapperDesktop > div.HeaderDesktop__headerLayerTwo__356nX > div > div.HeaderDesktop__navContainer__2TkWh > nav > div:nth-child(3)");
//        click("#wrapperDesktop > div.HeaderDesktop__headerLayerTwo__356nX > div > div.HeaderDesktop__navContainer__2TkWh > nav > div:nth-child(5) > div > div.HeaderLevelOneDropDownMenu__innerWrapper__IrKxh > ul:nth-child(3) > li:nth-child(2) > a");
//        waitFor(1);
//        click("#__layout > div > div:nth-child(3) > div > div.LevelTwoSeriesPage__layoutSeries__3csDE > div.LevelTwoSeriesPage__productFilterWrapper__cwV3d > div.LevelTwoSeriesPage__productFilter__-7iLA > div.LevelTwoSeriesPage__productList__4xq7V > div > div:nth-child(1) > div.SeriesFilter__listContainer__1jYq9.SeriesFilter__expand__2b_a8 > div:nth-child(2) > div > div > label");
//        waitFor(1);
//        click("#__layout > div > div:nth-child(3) > div > div.LevelTwoSeriesPage__layoutSeries__3csDE > div.LevelTwoSeriesPage__productFilterWrapper__cwV3d > div.LevelTwoSeriesPage__productFilter__-7iLA > div.LevelTwoSeriesPage__productList__4xq7V > div > div:nth-child(6)");
//        waitFor(2);
//        click("//*[@id=\"__layout\"]/div/div[2]/div/div[4]/div[1]/div[1]/div[2]/div/div[6]/div[2]/div[2]/div/div[1]");
    }
}
