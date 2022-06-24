package microCenterPages;

import base.CommonAPI;
import microCenterPages.ClearancePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class communityPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(communityPage.class);
    @FindBy(css = "#DarkMode > div")
    private WebElement DarkModeBtn;

    public communityPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }
    public void clickOnDarkModeBtn() {
        click(DarkModeBtn);
        LOG.info("click on DarkMode button success");


    }


}