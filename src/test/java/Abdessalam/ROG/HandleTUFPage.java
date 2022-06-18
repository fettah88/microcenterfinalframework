package Abdessalam.ROG;

import AmgharPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class HandleTUFPage extends CommonAPI {
    @Test
    public void HandleTUFPage(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());
        RepublicOfGamers.clickCookiesAcceptBtn();

        RepublicOfGamers.hovereOverProductsClickSwitchPages(getDriver());

    }
}
