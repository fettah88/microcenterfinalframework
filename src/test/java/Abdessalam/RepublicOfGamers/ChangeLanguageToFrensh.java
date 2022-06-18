package Abdessalam.RepublicOfGamers;

import AmgharPages.LanguagePage;
import AmgharPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeLanguageToFrensh extends CommonAPI {
    @Test
            public void ChangeLanguage() {
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());
        LanguagePage LanguagePage = new LanguagePage(getDriver());

        RepublicOfGamers.clickCookiesAcceptBtn();
        //scrollDown
        Assert.assertEquals(getPageTitle(),"ROG - Republic of Gamers｜USA | The Choice of Champions");
        RepublicOfGamers.clickLanguageBtn();
        Assert.assertEquals(getPageTitle(),"Choose your language | ROG - Republic of Gamers | Global");
        LanguagePage.clickFranceBnt();
        waitFor(1);
        LanguagePage.clickYesBtn();

    }
}
