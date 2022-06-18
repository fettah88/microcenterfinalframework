package Abdessalam.AsusUpDate;

import AmgharPages.AsusHomePage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class MicePad extends CommonAPI {
    @Test
    public void mouseAndPad(){
        AsusHomePage AsusHomePage = new AsusHomePage(getDriver());

        AsusHomePage.clickCookiesBtn();
        AsusHomePage.hoverOverAccessoriesMenu(getDriver());
        AsusHomePage.clickAllSeriesFromMiceAndMousePads();

//        click("#cookie-policy-info > div > div.cookie-btn-box > div.btn-asus.btn-ok.btn-read-ck");
//        waitFor(1);
//        hoverOver("#wrapperDesktop > div.HeaderDesktop__headerLayerTwo__356nX > div > div.HeaderDesktop__navContainer__2TkWh > nav > div:nth-child(18)");
//        waitFor(1);
//        hoverOver("//*[@id=\"dropDownMenu\"]/div/div[1]/ul[1]/li[2]");
//        waitFor(1);
//        click("#wrapperDesktop > div.HeaderDesktop__headerLayerTwo__356nX > div > div.HeaderDesktop__navContainer__2TkWh > nav > div:nth-child(20) > div > div.HeaderLevelOneDropDownMenu__innerWrapper__IrKxh > ul:nth-child(3) > li:nth-child(2) > a > div");
//        waitFor(1);
//        click("#__layout > div > div:nth-child(3) > div > div.LevelTwoSeriesPage__layoutSeries__3csDE > div.LevelTwoSeriesPage__productFilterWrapper__cwV3d > div.LevelTwoSeriesPage__productFilter__-7iLA > div.LevelTwoSeriesPage__productList__4xq7V > div > div.SeriesFilter__filterSection__dOwkx.SeriesFilter__orderItem__3fWdO > div.SeriesFilter__listContainer__1jYq9.SeriesFilter__expand__2b_a8 > div:nth-child(1) > div > div.FilterCheckBox__wrapper__2QsXG > label");
//        waitFor(1);
//        click("#filterWrapper > div > div.LevelThreeFilterPage__productListWrapper__rIAkj > div.LevelThreeFilterPage__productFilterWrapper__2azdO > div.LevelThreeFilterPage__productFilter__1DQH0 > div.LevelThreeFilterPage__productList__2SHal > div > div:nth-child(1) > div.SeriesFilter__listContainer__1jYq9.SeriesFilter__expand__2b_a8 > div:nth-child(2) > div > div > label");
    }
}
