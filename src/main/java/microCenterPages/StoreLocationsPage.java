package microCenterPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StoreLocationsPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(StoreLocationsPage.class);

    @FindBy(css = "#content > div.bnrAd.Large > figure > div.location-container > div.location-three > a:nth-child(15)")
    private WebElement QueensLocations;
    @FindBy(css = "#content > div.bnrAd.Large > figure > div.location-container > div.location-three > a:nth-child(8)")
    private WebElement NewJerseyLocations;
    @FindBy(css = "#content > div.bnrAd.Large > figure > div.location-container > div.location-four > a:nth-child(17)")
    private WebElement virginiaLocations;

    public StoreLocationsPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }
    public void clickOnQueensLocations() {
        click(QueensLocations);
        LOG.info(" click on QueensLocations button success");

    }
    public void clickOnNewJerseyLocations() {
        click(NewJerseyLocations);
        LOG.info(" click on NewJerseyLocations button success");
    }
    public void clickOnvirginiaLocations() {
        click(virginiaLocations);
        LOG.info(" click on virginiaLocations button success");
    }
}