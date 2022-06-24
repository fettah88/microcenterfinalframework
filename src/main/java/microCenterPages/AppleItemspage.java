package microCenterPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppleItemspage {

    private final Logger LOG = LoggerFactory.getLogger(AppleItemspage.class);

    public AppleItemspage(WebDriver driver) {

        PageFactory.initElements(driver, this);


    }
}