package AmgharPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ROGLogInSetting extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(ROGLogInSetting.class);


    @FindBy(css = "#rogProduct > div:nth-child(15) > div > div > div.OverviewPage__memberHeading__3IqGt > div.OverviewPage__slogan__36_ee")
    private WebElement WelcomeAnes;

    @FindBy(css = "#menu > div > div > ul > li:nth-child(3) > span > svg.Menu__iconAlignRight__2klV9.Menu__down__2GaTS")
    private WebElement DropDownManagement;

    @FindBy(css = "#AccountSettings > li:nth-child(2)")
    private WebElement LogInManagement;

    @FindBy(css = "#member-page-content > h1")
    private WebElement TextLManagement;

    @FindBy(css = "#member-page-content > div.wrapper > div:nth-child(1) > div.title-row > p")
    private WebElement EmailAddressText;

    @FindBy(css = "#member-page-content > div.wrapper > div:nth-child(2) > div.title-row > p")
    private WebElement SocialMedia;


    public ROGLogInSetting(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String GetWelcome() {
       return getElementText(WelcomeAnes);
    }

    public String TextLManagement(){
        return getElementText(TextLManagement);
    }

    public void SocialMediaCheckText(){
        click(DropDownManagement);
        click(LogInManagement);

    }
    public String TextEmail() {
        return getElementText(EmailAddressText);
    }
            public String TextSocial(){
            return getElementText(SocialMedia);
        }


}

