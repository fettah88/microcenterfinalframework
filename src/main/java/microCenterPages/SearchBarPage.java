package microCenterPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SearchBarPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(SearchBarPage.class);

    public SearchBarPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    public String getSearchPageTitle(){
        return getPageTitle();
    }
}
