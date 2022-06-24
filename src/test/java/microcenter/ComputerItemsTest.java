package microcenter;

import base.CommonAPI;
import microCenterPages.ComputerItemsPage;
import microCenterPages.HomePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerItemsTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(ComputerItemsTest.class);

    @Test
    public void DesktopsItemsTest() {
        HomePage homePage = new HomePage(getDriver());
        ComputerItemsPage computerItemsPage = new ComputerItemsPage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverComutersBtn(getDriver());
        homePage.clickOnDesktopsBtn();
        String expectedPageTitle = "Desktop Computers | Micro Center";
        Assert.assertEquals(getPageTitle(), expectedPageTitle);
    }

    @Test
    public void LaptopsTest() {
        HomePage homePage = new HomePage(getDriver());
        ComputerItemsPage computerItemsPage = new ComputerItemsPage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverComutersBtn(getDriver());
        homePage.clickOnLaptopsBtn();
        String expectedPageTitle = "Laptop & Notebook Computers | Micro Center";
        Assert.assertEquals(getPageTitle(), expectedPageTitle);
    }
        @Test
        public void All_in_OneDesktopItemsTest() {
            HomePage homePage = new HomePage(getDriver());
            ComputerItemsPage computerItemsPage = new ComputerItemsPage(getDriver());
            homePage.clickOnStorePopUp();
            homePage.hoverOverComutersBtn(getDriver());
            homePage.clickOnDesktopsBtn();
            computerItemsPage.clickOnAll_in_OneDesktopsBtn();
            String expectedPageTitle = "All-in-One : Desktop Computers : Micro Center";
            Assert.assertEquals(getPageTitle(), expectedPageTitle);
        }
    @Test
    public void PC_DesktopItemsTest() {
        HomePage homePage = new HomePage(getDriver());
        ComputerItemsPage computerItemsPage = new ComputerItemsPage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverComutersBtn(getDriver());
        homePage.clickOnDesktopsBtn();
        computerItemsPage.clickOnPC_DesktopsBtn();
        String expectedPageTitle = "Desktop Computers | Micro Center";
        Assert.assertEquals(getPageTitle(), expectedPageTitle);
    }

    @Test
    public void BusinessLaptopsItemsTest() {
        HomePage homePage = new HomePage(getDriver());
        ComputerItemsPage computerItemsPage = new ComputerItemsPage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverComutersBtn(getDriver());
        homePage.clickOnLaptopsBtn();
        computerItemsPage.clickOnBusinessLaptopsBtn();
        String expectedPageTitle = "Laptops/Notebooks : Micro Center";
        Assert.assertEquals(getPageTitle(), expectedPageTitle);
    }

    @Test
    public void ChromebooksLaptopsItemsTest() {
        HomePage homePage = new HomePage(getDriver());
        ComputerItemsPage computerItemsPage = new ComputerItemsPage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverComutersBtn(getDriver());
        homePage.clickOnLaptopsBtn();
        computerItemsPage.clickOnChromebooksLaptops();
        String expectedPageTitle = "Laptops/Notebooks : Micro Center";
        Assert.assertEquals(getPageTitle(), expectedPageTitle);

    }

    @Test
    public void GamingLaptopsItemsTest() {
        HomePage homePage = new HomePage(getDriver());
        ComputerItemsPage computerItemsPage = new ComputerItemsPage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverComutersBtn(getDriver());
        homePage.clickOnLaptopsBtn();
        computerItemsPage.clickOnGamingLaptopsBtn();
        String expectedPageTitle = "Laptops/Notebooks : Micro Center";
        Assert.assertEquals(getPageTitle(), expectedPageTitle);
    }
}