package Abdessalam.RepublicOfGamers;

import AmgharPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchBarTypeAndClearAndSearch extends CommonAPI {
    @Test
    public void SearchBarTypeAndClearAndSearch(){

        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());

        waitFor(1);
        RepublicOfGamers.clickCookiesAcceptBtn();
        RepublicOfGamers.clickSearchBtn();
        RepublicOfGamers.TypeSearchBar();
        waitFor(2);
        RepublicOfGamers.ClearSearchBar();
        waitFor(1);
        RepublicOfGamers.TypeAndEnterSearchBarr();
        waitFor(2);
        Assert.assertEquals("Product", RepublicOfGamers.getTextProduct());


    }
}
