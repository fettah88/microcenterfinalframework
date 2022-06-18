package Abdessalam.RepublicOfGamers;

import AmgharPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RecentReleases extends CommonAPI {
    @Test
    public void RecentRelease(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());

        Assert.assertEquals(getPageTitle(),"ROG - Republic of Gamers｜USA | The Choice of Champions");
        RepublicOfGamers.clickCookiesAcceptBtn();
        RepublicOfGamers.ScrollDownToRecentReleases(getDriver());
        waitFor(1);
        RepublicOfGamers.hoverOver5Image(getDriver());



    }
}
