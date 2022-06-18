package Abdessalam.AsusUpDate;

import AmgharPages.AsusHomePage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class Keyboardwireless extends CommonAPI {

    @Test
    public void wall(){
        AsusHomePage AsusHomePage = new AsusHomePage(getDriver());

        AsusHomePage.clickCookiesBtn();
        AsusHomePage.hoverOverAccessoriesMenu(getDriver());
        AsusHomePage.clickWirelessKeyboards();



//        click("#cookie-policy-info > div > div.cookie-btn-box > div.btn-asus.btn-ok.btn-read-ck");
//        waitFor(2);
//        hoverOver("#wrapperDesktop > div.HeaderDesktop__headerLayerTwo__356nX > div > div.HeaderDesktop__navContainer__2TkWh > nav > div:nth-child(18)");
//        waitFor(2);
//        click("//*[@id=\"wrapperDesktop\"]/div[2]/div/div[3]/nav/div[20]/div/div[1]/ul[3]/li[2]/a/div");
//        click("#__layout > div > div:nth-child(3) > div > div.LevelTwoSeriesPage__layoutSeries__3csDE > div.LevelTwoSeriesPage__productFilterWrapper__cwV3d > div.LevelTwoSeriesPage__productFilter__-7iLA > div.LevelTwoSeriesPage__productList__4xq7V > div > div.SeriesFilter__filterSection__dOwkx.SeriesFilter__orderItem__3fWdO > div.SeriesFilter__listContainer__1jYq9.SeriesFilter__expand__2b_a8 > div:nth-child(1) > div > div.FilterCheckBox__wrapper__2QsXG > label");
//        waitFor(2);
//        click("//*[@id=\"filterWrapper\"]/div/div[2]/div[1]/div[1]/div[3]/div/div[1]/div[2]/div[1]/div/div/label");


    }

}
