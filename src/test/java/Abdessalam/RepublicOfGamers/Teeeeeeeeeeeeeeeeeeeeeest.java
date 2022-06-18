package Abdessalam.RepublicOfGamers;

import AmgharPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class Teeeeeeeeeeeeeeeeeeeeeest extends CommonAPI {
    @Test
    public void Test(){
        RepublicOfGamersHomePage RepublicOGHM = new RepublicOfGamersHomePage(getDriver());

        RepublicOGHM.clickCookiesAcceptBtn();

        RepublicOGHM.GoBack(getDriver());

    }
}
