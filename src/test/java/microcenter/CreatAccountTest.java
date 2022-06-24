package microcenter;

import base.CommonAPI;
import microCenterPages.CreatAcountPage;
import microCenterPages.HomePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
public class CreatAccountTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CreatAccountTest.class);

    @Test
    public void missigFirstNameField() {
        HomePage homePage = new HomePage(getDriver());
        CreatAcountPage CreatAcountPage = new CreatAcountPage(getDriver());
        homePage.hoverOverLogingBtn(getDriver());
        homePage.clickOnAcountBtn();
        homePage.clickCreatAccountBtn();
        CreatAcountPage.TypeInFirstNameFld("");
        CreatAcountPage.TypeLastName("rayan");
        CreatAcountPage.TypeEmailAdress("adam.90@gmail.com");
        CreatAcountPage.TypeMobilePhone("");
        CreatAcountPage.TypePassWord("1234Abcd");
        CreatAcountPage.TypeConfirmPassWord("1234Abcd");
        CreatAcountPage.clickCheckBox();
        CreatAcountPage.clickcreatMyProfileBtn();
        waitFor(3);
        String text = CreatAcountPage.getFirstNameisRequiredText();
        Assert.assertEquals("First Name is Required", text);

    }
    @Test
    public void missingEmailAdressField() {
        HomePage homePage = new HomePage(getDriver());
        CreatAcountPage CreatAcountPage = new CreatAcountPage(getDriver());
        homePage.hoverOverLogingBtn(getDriver());
        homePage.clickOnAcountBtn();
        homePage.clickCreatAccountBtn();
        CreatAcountPage.TypeInFirstNameFld("Fettah");
        CreatAcountPage.TypeLastName("rayan");
        CreatAcountPage.TypeEmailAdress("");
        CreatAcountPage.TypeMobilePhone("");
        CreatAcountPage.TypePassWord("1234Abcd");
        CreatAcountPage.TypeConfirmPassWord("1234Abcd");
        CreatAcountPage.clickCheckBox();
        CreatAcountPage.clickcreatMyProfileBtn();
        String text = CreatAcountPage.getFirstNameisRequiredText();
        Assert.assertEquals("Please enter valid Email.", text);


    }
    @Test
    public void missigPassWordField() {
        HomePage homePage = new HomePage(getDriver());
        CreatAcountPage CreatAcountPage = new CreatAcountPage(getDriver());
        homePage.hoverOverLogingBtn(getDriver());
        homePage.clickOnAcountBtn();
        homePage.clickCreatAccountBtn();
        CreatAcountPage.TypeInFirstNameFld("Fettah");
        CreatAcountPage.TypeLastName("rayan");
        CreatAcountPage.TypeEmailAdress("adam.90@gmail.com");
        CreatAcountPage.TypeMobilePhone("");
        CreatAcountPage.TypePassWord("");
        CreatAcountPage.TypeConfirmPassWord("1234Abcd");
        CreatAcountPage.clickCheckBox();
        CreatAcountPage.clickcreatMyProfileBtn();
        String text = CreatAcountPage.getmissingEmailAdressFieldText();
        Assert.assertEquals("Password is Required", text);

        }

    @Test
    public void missigLastnameFieldField() {
        HomePage homePage = new HomePage(getDriver());
        CreatAcountPage CreatAcountPage = new CreatAcountPage(getDriver());
        homePage.hoverOverLogingBtn(getDriver());
        homePage.clickOnAcountBtn();
        homePage.clickCreatAccountBtn();
        CreatAcountPage.TypeInFirstNameFld("Fettah");
        CreatAcountPage.TypeLastName("");
        CreatAcountPage.TypeEmailAdress("adam.90@gmail.com");
        CreatAcountPage.TypeMobilePhone("");
        CreatAcountPage.TypePassWord("1234Abcd");
        CreatAcountPage.TypeConfirmPassWord("1234Abcd");
        CreatAcountPage.clickCheckBox();
        CreatAcountPage.clickcreatMyProfileBtn();
        String text = CreatAcountPage.getmissingEmailAdressFieldText();
        Assert.assertEquals("Last Name is Required", text);
    }
      @Test
    public void missigConfirmPassWordField() {
        HomePage homePage = new HomePage(getDriver());
        CreatAcountPage CreatAcountPage = new CreatAcountPage(getDriver());
        homePage.hoverOverLogingBtn(getDriver());
        homePage.clickOnAcountBtn();
        homePage.clickCreatAccountBtn();
        CreatAcountPage.TypeInFirstNameFld("Fettah");
        CreatAcountPage.TypeLastName("rayan");
        CreatAcountPage.TypeEmailAdress("adam.90@gmail.com");
        CreatAcountPage.TypeMobilePhone("");
        CreatAcountPage.TypePassWord("1234Abcd");
        CreatAcountPage.TypeConfirmPassWord("");
        CreatAcountPage.clickCheckBox();
        CreatAcountPage.clickcreatMyProfileBtn();
        String text = CreatAcountPage.getmissingEmailAdressFieldText();
        Assert.assertEquals("Please confirm your password", text);
        }
    }
