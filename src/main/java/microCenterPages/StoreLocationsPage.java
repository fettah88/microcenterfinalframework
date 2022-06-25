package microCenterPages;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
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

    public void ScrollToView(WebElement element, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        LOG.info(" Scroll Down To View success");

    }
        public void scrollToViewNewJerseyLocations (WebDriver driver){
            ScrollToView(NewJerseyLocations, driver);
            LOG.info("scroll To View scrollToView NewJersey Locations success");
        }
    public void scrollToViewQueensLocations (WebDriver driver){
        ScrollToView(NewJerseyLocations, driver);
        LOG.info("scroll To View scrollToView Queens Locations success");
    }
    public void scrollToViewvirginiaLocations (WebDriver driver){
        ScrollToView(NewJerseyLocations, driver);
        LOG.info("scroll To View scrollToView virginia Locations success");

        }
    }
