package Abdessalam.RepublicOfGamers;

import AmgharPages.ROGLogInPage;
import AmgharPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInPositive extends CommonAPI {
    @Test
    public void LogIn() {
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());
        ROGLogInPage ROGLogInPage = new ROGLogInPage(getDriver());

        RepublicOfGamers.clickCookiesAcceptBtn();
        Assert.assertEquals(getPageTitle(),"ROG - Republic of Gamers｜USA | The Choice of Champions");
        waitFor(1);
        RepublicOfGamers.clickLogInBtn();
        RepublicOfGamers.clickLogInFromDropDown();
        waitFor(2);
        Assert.assertEquals("Account Login",ROGLogInPage.getLogInPageText());
        ROGLogInPage.typeEmail();
        ROGLogInPage.typePassWord();
        ROGLogInPage.clickLogInBtn();
        waitFor(2);




    }
}
