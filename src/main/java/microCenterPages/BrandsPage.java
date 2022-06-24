package microCenterPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BrandsPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(BrandsPage.class);
    public BrandsPage (WebDriver driver){

        PageFactory.initElements(driver, this);
    }

    public String getBrandPageTitle(){

        return getPageTitle();
    }
}
