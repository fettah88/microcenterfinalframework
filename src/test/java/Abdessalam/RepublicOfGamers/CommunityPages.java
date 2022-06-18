package Abdessalam.RepublicOfGamers;

import AmgharPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CommunityPages extends CommonAPI {
    @Test
    public void CommunityPages(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());

        RepublicOfGamers.clickCookiesAcceptBtn();

        String text= getPageTitle();
        Assert.assertEquals(text,"ROG - Republic of Gamers｜USA | The Choice of Champions");
       // RepublicOfGamers.scroollToVieuFb();
        waitFor(2);
        RepublicOfGamers.ClickFacebookPage();



    }
}
