package Abdessalam.AsusUpDate;

import AmgharPages.AllSeriesLaptopPage;
import AmgharPages.AsusHomePage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class LaptopInStock extends CommonAPI {
    @Test
    public void LaptopInStock(){
        AsusHomePage AsusHomPage = new AsusHomePage(getDriver());
        AllSeriesLaptopPage AllSeriesLaptopPage = new AllSeriesLaptopPage(getDriver());

        AsusHomPage.clickCookiesBtn();
        AsusHomPage.hoverOverMenuLaptop(getDriver());
        AsusHomPage.clickAllSeriesFromLaptopMenu();
        AllSeriesLaptopPage.clickCheckBoxInStockOnAsus();



//        click("#cookie-policy-info > div > div.cookie-btn-box > div.btn-asus.btn-ok.btn-read-ck");
//        hoverOver("#wrapperDesktop > div.HeaderDesktop__headerLayerTwo__356nX > div > div.HeaderDesktop__navContainer__2TkWh > nav > div:nth-child(6) > span");
//        click("#wrapperDesktop > div.HeaderDesktop__headerLayerTwo__356nX > div > div.HeaderDesktop__navContainer__2TkWh > nav > div:nth-child(8) > div > div.HeaderLevelOneDropDownMenu__innerWrapper__IrKxh > ul:nth-child(3) > li:nth-child(2) > a > div");
//        click("#__layout > div > div:nth-child(3) > div > div.LevelTwoSeriesPage__layoutSeries__3csDE > div.LevelTwoSeriesPage__productFilterWrapper__cwV3d > div.LevelTwoSeriesPage__productFilter__-7iLA > div.LevelTwoSeriesPage__productList__4xq7V > div > div.SeriesFilter__filterSection__dOwkx.SeriesFilter__orderItem__3fWdO > div.SeriesFilter__listContainer__1jYq9.SeriesFilter__expand__2b_a8 > div:nth-child(1) > div > div.FilterCheckBox__wrapper__2QsXG > label");
//        click("//*[@id=\"__layout\"]/div/div[2]/div/div[4]/div[2]/div[1]/div[2]/div/div[5]");
//        waitFor(2);
//        click("//*[@id=\"__layout\"]/div/div[2]/div/div[4]/div[2]/div[1]/div[2]/div/div[5]/div[2]/div[3]/div/div[1]/label");
//        waitFor(2);
//        click("#__layout > div > div:nth-child(3) > div > div.LevelTwoSeriesPage__layoutSeries__3csDE > div.LevelTwoSeriesPage__productFilterWrapper__cwV3d > div.LevelTwoSeriesPage__productFilter__-7iLA > div.LevelTwoSeriesPage__productList__4xq7V > div > div:nth-child(12)");
//        waitFor(2);
//        click("#__layout > div > div:nth-child(3) > div > div.LevelTwoSeriesPage__layoutSeries__3csDE > div.LevelTwoSeriesPage__productFilterWrapper__cwV3d > div.LevelTwoSeriesPage__productFilter__-7iLA > div.LevelTwoSeriesPage__productList__4xq7V > div > div:nth-child(12) > div.SeriesFilter__listContainer__1jYq9.SeriesFilter__expand__2b_a8 > div:nth-child(3) > div > div.FilterCheckBox__wrapper__2QsXG > label");
    }
}
