package microCenterPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CareersPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CareersPage.class);
    @FindBy(css = "#PageWrap > div:nth-child(2) > div > a:nth-child(1) > div")
    private WebElement Training;

    @FindBy(css = "#PageWrap > div:nth-child(2) > div > a:nth-child(2) > div")
    private WebElement OurHistory;

    @FindBy(css = "#PageWrap > div:nth-child(2) > div > a:nth-child(3) > div")
    private WebElement CareerPath;

    @FindBy(css = "#PageWrap > div:nth-child(2) > div > a:nth-child(5) > div")
    private WebElement Benefits;

    @FindBy(css = "#PageWrap > div:nth-child(2) > div > a:nth-child(6) > div")
    private WebElement Hiring;


    public CareersPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    public void clickOnTraining () {
        click(Training);
        LOG.info("click Training button success");
    }
    public void clickOnOurHistory () {
        click(OurHistory);
        LOG.info("click on OurHistory button success");
    }
    public void clickOnCareerPath() {
        click(CareerPath);
        LOG.info("click on CareerPath button success");
    }
    public void clickOnBenefits() {
        click(Benefits);
        LOG.info("click on Benefits button success");
    }
    public void clickOnHiring() {
        click(Hiring);
        LOG.info("click on Hiring button success");
    }
}
