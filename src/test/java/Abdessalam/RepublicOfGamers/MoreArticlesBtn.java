package Abdessalam.RepublicOfGamers;

import AmgharPages.ArticlesPage;
import AmgharPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MoreArticlesBtn extends CommonAPI {

    @Test
    public void MoreArticlesBtn(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());
        ArticlesPage ArticlesPage = new ArticlesPage(getDriver());

        RepublicOfGamers.clickCookiesAcceptBtn();

        Assert.assertEquals(getPageTitle(),"ROG - Republic of Gamers｜USA | The Choice of Champions");





        RepublicOfGamers.hoverOverCommunityMenu(getDriver());
        RepublicOfGamers.clickNewsAndArticles();
        String Text = "ARTICLES";
        Assert.assertEquals(Text,ArticlesPage.getArticleText());
        waitFor(2);
        ArticlesPage.clickMoreArticlesBtn();




    }
}
