package AmgharPages;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class AsusSupportPage extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(AsusSupportPage.class);


    @FindBy(xpath = "//*[@id=\"rogProduct\"]/main/div[3]/div[2]/div[1]")
    private WebElement closePopUpWindow;


    @FindBy(css = "#rogProduct > main > div.af-sp-init-popup > div.covid-main > div.popup-content > div.covid-content > p > a")
    private WebElement GotoServiceDesk;

    @FindBy(id = "search")
    private WebElement SearchBar;

    @FindBy(css = "#rogProduct > main > section.af-sp-container.af-sp-newsAndContact > div > div.partialBlock.news-block")
    private WebElement NewsImportantInformation;

    @FindBy(xpath = "//*[@id=\"allProduct\"]/div/a")
    private WebElement ShowAllProductBtn;



    public AsusSupportPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }



    public void SearchBarServiceDesk(){
        waitFor(1);
        Assert.assertEquals(getPageTitle(), "Official Support | ROG USA");
        click(GotoServiceDesk);
        waitFor(1);
        typeAndEnter(SearchBar,"DeskTop");
        waitFor(1);


    }


    public void SupportPage(WebDriver driver){
        waitFor(1);
        click(closePopUpWindow);
        waitFor(1);
        Assert.assertEquals(getPageTitle(), "Official Support | ROG USA");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", NewsImportantInformation);
        waitFor(2);

    }

    @FindBy(css = "head > title")
    private WebElement Title;

    public void SupportPageShowAllProductBtn(WebDriver driver){

        waitFor(1);
        click(closePopUpWindow);
        waitFor(1);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", ShowAllProductBtn);
        click(ShowAllProductBtn);
        waitFor(2);

    }



















}
