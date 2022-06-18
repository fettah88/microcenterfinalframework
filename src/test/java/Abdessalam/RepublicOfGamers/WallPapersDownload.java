package Abdessalam.RepublicOfGamers;

import AmgharPages.RepublicOfGamersHomePage;
import AmgharPages.WallPapersPage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WallPapersDownload extends CommonAPI {
    @Test
    public void WallPaperDownload(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());
        WallPapersPage WallPapersPage = new WallPapersPage(getDriver());

        RepublicOfGamers.clickCookiesAcceptBtn();
        Assert.assertEquals(getPageTitle(),"ROG - Republic of Gamers｜USA | The Choice of Champions");
        RepublicOfGamers.hoverOverDownloadMenu(getDriver());
        RepublicOfGamers.clickWallPapersFromMenu();
        Assert.assertEquals(WallPapersPage.getWallPapersText(),"WALLPAPERS");
        WallPapersPage.clickWallPapers2022();
        waitFor(2);
        String Title= getPageTitle();
        Assert.assertEquals(Title,"Wallpapers | ROG - Republic of Gamers Global");





    }
}
