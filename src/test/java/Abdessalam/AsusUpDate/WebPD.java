package Abdessalam.AsusUpDate;

import AmgharPages.AsusHomePage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class WebPD extends CommonAPI {
    @Test
    public void WebD(){
        AsusHomePage AsusHomePage = new AsusHomePage(getDriver());

        AsusHomePage.clickCookiesBtn();



//        click("#cookie-policy-info > div > div.cookie-btn-box > div.btn-asus.btn-ok.btn-read-ck");
//        waitFor(2);
//        click("//*[@id=\"__layout\"]/div/div[2]/div/div[5]/div[2]/div/div[1]/div/div[4]/div[2]");
//        waitFor(2);
//        click("#__layout > div > div:nth-child(3) > div > div.DealsTabBar__tabsLayout__3QPQe.DealsTabBar__dealsTabBar__2Ntcx > div > div.DealsTabBar__IconTabsBox__31HlX > div > a:nth-child(3) > div.DealsTabBar__listDivTitle__T5B9I");

    }
}
