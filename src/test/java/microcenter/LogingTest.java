package microcenter;


import base.CommonAPI;
import microCenterPages.HomePage;
import microCenterPages.LoginPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LogingTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(LogingTest.class);

    @Test
    public void missingPassWordField() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        homePage.hoverOverLogingBtn(getDriver());
        homePage.clickOnAcountBtn();
        loginPage.typeOnEmailAdressField("test2gmail.com");
        loginPage.clickSigninBtn();
        waitFor(3);
        String text = loginPage.getPasswordisRequiredText();
        Assert.assertEquals("Password is Required", text);

    }

    @Test
    public void invalidPassWord() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        homePage.hoverOverLogingBtn(getDriver());
        homePage.clickOnAcountBtn();
        loginPage.typeOnEmailAdressField("test2gmail.com");
        loginPage.typeOnPassWordField("1234abcD");
        loginPage.clickSigninBtn();
        String text = loginPage.getInvalidusernamOrPassWordText();
        Assert.assertEquals("Invalid username or password.", text);


    }

    @Test
    public void invalidEmailAdress() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        homePage.hoverOverLogingBtn(getDriver());
        homePage.clickOnAcountBtn();
        loginPage.typeOnEmailAdressField("test2gmail.");
        loginPage.typeOnPassWordField("1234abcD");
        loginPage.clickSigninBtn();
        String text = loginPage.getInvalidusernamOrPassWordText();
        Assert.assertEquals("Invalid username or password.", text);


    }

    @Test
    public void missingEmailAdressField() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        homePage.hoverOverLogingBtn(getDriver());
        homePage.clickOnAcountBtn();
        loginPage.typeOnPassWordField("1234abcD");
        loginPage.clickSigninBtn();
        String text = loginPage.getInvalidusernamOrPassWordText();
        Assert.assertEquals("nvalid username or password.", text);
    }

    @Test
    public void missingPssWordField() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        homePage.hoverOverLogingBtn(getDriver());
        homePage.clickOnAcountBtn();
        loginPage.typeOnEmailAdressField("test@gmail.com");
        loginPage.clickSigninBtn();
        String text = loginPage.getInvalidusernamOrPassWordText();
        Assert.assertEquals("Password is Required", text);
    }
}