package Abdessalam.AsusUpDate;

import AmgharPages.AsusHomePage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class Search extends CommonAPI {
    @Test
    public void Search(){
        AsusHomePage AsusHomePage = new AsusHomePage(getDriver());

        AsusHomePage.clickCookiesBtn();
        AsusHomePage.clickSearchIcon();
        AsusHomePage.typeAndEnterInSearchBar();


//        click("#cookie-policy-info > div > div.cookie-btn-box > div.btn-asus.btn-ok.btn-read-ck");
//        click("#wrapperDesktop > div.HeaderDesktop__headerLayerTwo__356nX > div > div.HeaderDesktop__navContainer__2TkWh > div > div.headerIcon.HeaderDesktop__searchAndMemberFeatureItem__9yN6u.HeaderDesktop__search__qb94W.HeaderDesktop__themeWhite__1bpoN");
//        typeAndEnter("#wrapperDesktop > div.HeaderDesktop__headerLayerTwo__356nX > div > div.HeaderDesktop__navContainer__2TkWh > div > div.HeaderSearchDropDownMenu__wrapperSearchDropDownMenu__31mT8 > div > div.HeaderSearchDropDownMenu__innerWeaper__1jtC7.HeaderSearchDropDownMenu__active__e5IKF > div > input",("graphic card"));
//        waitFor(5);

    }
}
