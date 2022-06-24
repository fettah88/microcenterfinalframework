package microCenterPages;

import base.CommonAPI;
import microCenterPages.ComputerItemsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreatAcountPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CreatAcountPage.class);
    @FindBy(css = "#ctl00_ContentLeftSide_ucRegistration_txtFirstName")
    private WebElement enterFirstNameAccount;

    @FindBy(css = "#ctl00_ContentLeftSide_ucRegistration_txtLastName")
    private WebElement enterLastNameAccount;

    @FindBy(css = "#ctl00_ContentLeftSide_ucRegistration_txtEmailAddress")
    private WebElement enterEmailAdressAcount;

    @FindBy(css = "#ctl00_ContentLeftSide_ucRegistration_txtPhoneNumber")
    private WebElement enterMobilePhoneAccount;

    @FindBy(css = "#ctl00_ContentLeftSide_ucRegistration_txtPassword")
    private WebElement enterPassWordAccount;

    @FindBy(css = "#ctl00_ContentLeftSide_ucRegistration_txtConfirmPassword")
    private WebElement ConfirmpPassWordAccount;

    @FindBy(css = "#ctl00_ContentLeftSide_ucRegistration_ckbAcceptTerms")
    private WebElement checkBox;

    @FindBy(css = "#ctl00_ContentLeftSide_ucRegistration_btnRegisterAccount")
    private WebElement creatMyProfileBtn;

    @FindBy(css = "#ctl00_ContentLeftSide_ucRegistration_vsAccountInformation > ul > li")
    private WebElement FirstNameisRequired;

    @FindBy(css = "#ctl00_ContentLeftSide_ucRegistration_vsAccountInformation > ul > li")
    private WebElement missingEmailAdressField;

    public CreatAcountPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    public void TypeInFirstNameFld(String Text) {
        type(enterFirstNameAccount, Text);
        LOG.info("Type in FirstName Field success");
    }
    public void TypeLastName(String Text) {
        type(enterLastNameAccount, Text);
        LOG.info("type in LastName field  success");
    }

    public void TypeEmailAdress(String Text) {
        type(enterEmailAdressAcount, Text);
        LOG.info("type in EmailAdress field  success");
    }
    public void TypeMobilePhone(String Text) {
        type(enterMobilePhoneAccount, Text);
        LOG.info("type in MobilePhone field  success");
    }
    public void TypePassWord(String Text) {
        type(enterPassWordAccount, Text);
        LOG.info("type in PassWord field  success");
    }
    public void TypeConfirmPassWord(String Text) {
        type(ConfirmpPassWordAccount, Text);
        LOG.info("type in ConfirmPassWord field  success");
    }
    public void clickCheckBox() {
        click(checkBox);
        LOG.info("click on clickCheckBox success");
    }
    public void clickcreatMyProfileBtn() {
        click(creatMyProfileBtn);
        LOG.info("click on creatMyProfile button success");
    }
    public String getFirstNameisRequiredText() {
        return getElementText(FirstNameisRequired);
    }
    public String getmissingEmailAdressFieldText() {
        return getElementText(missingEmailAdressField);


    }
}




