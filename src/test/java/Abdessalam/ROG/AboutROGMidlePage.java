package Abdessalam.ROG;

import AmgharPages.*;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AboutROGMidlePage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(AboutROGMidlePage.class);

    @Test
    public void AboutROG(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());

        RepublicOfGamers.AboutROGMidlePage(getDriver());

    }

    @Test
    public void HoverOverLoop() {
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());

        RepublicOfGamers.clickCookiesAcceptBtn();
        RepublicOfGamers.TheList(getDriver());

    }
    @Test
    public void SupportSearchBarServiceDesk(){
        RepublicOfGamersHomePage ROG = new RepublicOfGamersHomePage(getDriver());
        AsusSupportPage ASP = new AsusSupportPage(getDriver());

        ROG.Support();
        ASP.SearchBarServiceDesk();

    }
    @Test
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

    @Test
    public void StorBy(){
        RepublicOfGamersHomePage ROG = new RepublicOfGamersHomePage(getDriver());
        PoweredByAsusPage PBA = new PoweredByAsusPage(getDriver());

        ROG.AccessToPowered();
        PBA.StorByCYB();


    }

    @Test
    public void checkLoginManagementSocialMediaText(){
        RepublicOfGamersHomePage ROG = new RepublicOfGamersHomePage(getDriver());
        ROGLogInPage LGP = new ROGLogInPage(getDriver());
        ROGLogInSetting RLS = new ROGLogInSetting(getDriver());


        ROG.ToLogIn();
        Assert.assertEquals("Account Login",LGP.getLogInPageText());
        LGP.typeEmail();
        LGP.typePassWord();
        LGP.clickLogInBtn();
        waitFor(2);
        ROG.SettingAccess();
        Assert.assertEquals("Welcome, Anas!",RLS.GetWelcome());
        RLS.SocialMediaCheckText();
        Assert.assertEquals("Login Management",RLS.TextLManagement());

    }

    @Test
    public void Scroll(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());

        RepublicOfGamers.QHDScrollDown(getDriver());

    }

    @Test
    public void QHD(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());

        RepublicOfGamers.QHD(getDriver());

    }
    @Test
    public void PoweredAsus(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());
        PoweredByAsusPage PBA = new PoweredByAsusPage(getDriver());

        RepublicOfGamers.AccessToPowered();
        PBA.PBA(getDriver());


    }
    @Test
    public void PoweredAsusHover(){

        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());
        PoweredByAsusPage PBA = new PoweredByAsusPage(getDriver());

        RepublicOfGamers.AccessToPowered();
        PBA.HoverOverDownPage(getDriver());

    }


    @Test
    public void PoweredAsusBuildsClick(){

        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());
        PoweredByAsusPage PBA = new PoweredByAsusPage(getDriver());

        RepublicOfGamers.AccessToPowered();
        PBA.BuildsClick(getDriver());

    }
    @Test
    public void PcDiy(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());

        RepublicOfGamers.HandlePcDiyPageSwitch(getDriver());

    }

    @Test()
    public void Setting(){
        RepublicOfGamersHomePage ROG = new RepublicOfGamersHomePage(getDriver());
        ROGLogInPage LGP = new ROGLogInPage(getDriver());

        ROG.ToLogIn();
        Assert.assertEquals("Account Login",LGP.getLogInPageText());
        LGP.typeEmail();
        LGP.typePassWord();
        LGP.clickLogInBtn();
        waitFor(2);
        ROG.SettingAccess();

    }

    @Test
    public void AssertWelcome(){
        RepublicOfGamersHomePage ROG = new RepublicOfGamersHomePage(getDriver());
        ROGLogInPage LGP = new ROGLogInPage(getDriver());
        ROGLogInSetting  RLS = new ROGLogInSetting(getDriver());


        ROG.ToLogIn();
        Assert.assertEquals("Account Login",LGP.getLogInPageText());
        LGP.typeEmail();
        LGP.typePassWord();
        LGP.clickLogInBtn();
        waitFor(2);
        ROG.SettingAccess();
        Assert.assertEquals("Welcome, Anas!",RLS.GetWelcome());
        waitFor(1);
        Assert.assertEquals("Email Address",RLS.TextEmail());
        waitFor(1);
        Assert.assertEquals("SOCIAL MEDIA",RLS.TextSocial());


    }

    @Test
    public void LogInNegative() {

        RepublicOfGamersHomePage ROG = new RepublicOfGamersHomePage(getDriver());
        ROGLogInPage LGN = new ROGLogInPage(getDriver());
        Assert.assertEquals(getPageTitle(),"ROG - Republic of Gamers｜USA | The Choice of Champions");
        ROG.ToLogIn();
        LGN.Info();
        Assert.assertEquals(ROG.getTextwrong(),"Wrong account or password.");

    }
    @Test
    public void HandleTUFPage(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());
        RepublicOfGamers.clickCookiesAcceptBtn();

        RepublicOfGamers.hovereOverProductsClickSwitchPages(getDriver());

    }
    @Test
    public void Logos(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());
        RepublicOfGamers.Logos(getDriver());
    }

    @Test
    public void ROGLogo(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());

        RepublicOfGamers.ROGLogo();

    }
    @Test
    public void Accessible(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());

        RepublicOfGamers.Accessibility(getDriver());

    }


}



