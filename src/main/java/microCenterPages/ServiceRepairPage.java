package microCenterPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceRepairPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(ServiceRepairPage.class);

    @FindBy(css = "#introTEXT > div.find-battery > form > div > input.labelvalue")
    private WebElement BatteryModel;

    @FindBy(css = "#introTEXT > div.find-battery > form > div > input.submit.btn")
    private WebElement ssearchBtn;


    public ServiceRepairPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }
        public void typeOnsearchField (String Text){
            type(BatteryModel, Text);
        }
        public void clickOnsearchBarBtn () {
            click(ssearchBtn);
            LOG.info(" click on OnsearchBar button success");
        }
    }
