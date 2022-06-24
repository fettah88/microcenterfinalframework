package microCenterPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.activation.ActivationGroupDesc;

public class ComputerItemsPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(ComputerItemsPage.class);

    public ComputerItemsPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }
        @FindBy(css = "#links > ul > li:nth-child(6) > a")
        private WebElement GamingLaptops;
    @FindBy(css = "#links > ul > li:nth-child(6) > a")
    private WebElement BusinessLaptops;

    @FindBy(css = "#links > ul > li:nth-child(4) > a")
    private WebElement Chromebooks;

    @FindBy(css = "#links > ul > li:nth-child(3) > a")
    private WebElement All_in_OneDesktops;

    @FindBy(css = "#links > ul > li:nth-child(5) > a")
    private WebElement  AllWorkstations;

    @FindBy(css = "#links > ul > li:nth-child(4)")
    private WebElement  PC_Desktops;


    public void clickOnGamingLaptopsBtn() {
        click(GamingLaptops);
        LOG.info("click on GamingLaptops button success");
    }
    public void clickOnBusinessLaptopsBtn() {
        click(BusinessLaptops);
        LOG.info("click on BusinessLaptops button success");
    }
    public void clickOnChromebooksLaptops() {
        click(Chromebooks);
        LOG.info("click on ChromebooksLaptops button success");
    }
    public void clickOnAllWorkstationsBtn() {
        click(AllWorkstations);
        LOG.info("click on AllWorkstations button success");
    }
    public void clickOnAll_in_OneDesktopsBtn() {
        click(All_in_OneDesktops);
        LOG.info("click on All_in_OneDesktops button success");
    }
    public void clickOnPC_DesktopsBtn() {
        click(PC_Desktops);
        LOG.info("click on PC_Desktops success");
    }
}