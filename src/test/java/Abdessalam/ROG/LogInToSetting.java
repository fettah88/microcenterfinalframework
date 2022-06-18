package Abdessalam.ROG;

import AmgharPages.ROGLogInPage;
import AmgharPages.ROGLogInSetting;
import AmgharPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInToSetting extends CommonAPI {
//    @Test()
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




}
