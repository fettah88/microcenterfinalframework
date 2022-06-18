package Abdessalam.ROG;

import AmgharPages.AsusSupportPage;
import AmgharPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Support extends CommonAPI {
   // @Test
    public void SupportSearchBarServiceDesk(){
        RepublicOfGamersHomePage ROG = new RepublicOfGamersHomePage(getDriver());
        AsusSupportPage ASP = new AsusSupportPage(getDriver());

        ROG.Support();
        ASP.SearchBarServiceDesk();

    }
    //@Test
    public void SupportPage(){
        RepublicOfGamersHomePage ROG = new RepublicOfGamersHomePage(getDriver());
        AsusSupportPage ASP = new AsusSupportPage(getDriver());

        ROG.Support();
        ASP.SupportPage(getDriver());

    }

    @Test
    public void SupportPageShowAllProductBtn(){
        RepublicOfGamersHomePage ROG = new RepublicOfGamersHomePage(getDriver());
        AsusSupportPage ASP = new AsusSupportPage(getDriver());

        ROG.Support();
        waitFor(2);
        ASP.SupportPageShowAllProductBtn(getDriver());
        waitFor(2);
        Assert.assertEquals(getPageTitle(),"Official Support | ROG USA");
    }


}
