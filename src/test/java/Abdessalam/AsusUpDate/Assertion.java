package Abdessalam.AsusUpDate;

import AmgharPages.AsusHomePage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion extends CommonAPI {

    @Test
    public void Assertion(){
        AsusHomePage AsusHomePage = new AsusHomePage(getDriver());

        AsusHomePage.clickCookiesBtn();
        Assert.assertEquals(getPageTitle(),"ASUS USA");

        waitFor(2);

        Assert.assertEquals(AsusHomePage.getDealsText(),"Deals");

        waitFor(2);


    }
}
