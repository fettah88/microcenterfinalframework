package Abdessalam.RepublicOfGamers;

import AmgharPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExternalGraphicsDocks2022 extends CommonAPI {
    @Test
    public void ExternalGraphicsDocks2022(){

        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());

        RepublicOfGamers.clickCookiesAcceptBtn();
        String text2= getPageTitle();
        Assert.assertEquals(text2,"ROG - Republic of Gamers｜USA | The Choice of Champions");
        RepublicOfGamers.hoverOverProducts(getDriver());
        RepublicOfGamers.clickExternalGraphicsDocks2022();
        String text = "EXTERNAL GRAPHIC DOCKS";
        Assert.assertEquals(text, RepublicOfGamers.getEXTERNALGRAPHICDOCKSText());
        waitFor(1);
        RepublicOfGamers.hoverOverRogXgMobile2022(getDriver());
        RepublicOfGamers.clickRogXgMobile2022();
        waitFor(1);
        String text1= getPageTitle();
        Assert.assertEquals(text1,"2022 ROG XG Mobile");
        waitFor(2);



    }
}
