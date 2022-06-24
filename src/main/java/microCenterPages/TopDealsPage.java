package microCenterPages;

import base.CommonAPI;
import microCenterPages.StoreLocationsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TopDealsPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(TopDealsPage.class);

    public TopDealsPage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }


        }

