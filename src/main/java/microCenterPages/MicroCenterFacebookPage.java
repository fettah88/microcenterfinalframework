package microCenterPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MicroCenterFacebookPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(MicroCenterFacebookPage.class);

    @FindBy(css = "#footerNav > div.lowerFooter > div.cert-social > div.social > ul > li.fb > a")
    private WebElement facebookLogin;


    public MicroCenterFacebookPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }
        public void clickOnfacebooklogin () {
            click(facebookLogin);
            LOG.info(" click on facebook login button success");
        }
    }
