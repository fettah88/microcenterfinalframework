package microcenter;

import base.CommonAPI;
import microCenterPages.HomePage;
import microCenterPages.SearchBarPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ExcelReader;
import utility.Utility;

import java.util.List;

public class SearchTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(SearchTest.class);

    @Test
    public void searchiPhone11ProMax() {
        HomePage homePage = new HomePage(getDriver());
        SearchBarPage searchBarPage = new SearchBarPage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.searchElement("iPhone 11 pro Max");
        homePage.clickSearchBtn();
        String expectedPageTitle = "iPhone 11 pro Max : Micro Center";
        Assert.assertEquals(getPageTitle(), expectedPageTitle);

    }
     @Test
        public void searchPhilipsSmartLedTv() {
            HomePage homePage = new HomePage(getDriver());
        SearchBarPage searchBarPage = new SearchBarPage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.searchElement("Philips smart led tv");
        homePage.clickSearchBtn();
        String expectedPageTitle = "Philips smart led tv : Micro Center";
        Assert.assertEquals(getPageTitle(),expectedPageTitle);

        }
        @Test

    public void searchAppleWatch() {
        HomePage homePage = new HomePage(getDriver());
        SearchBarPage searchBarPage = new SearchBarPage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.searchElement("AppleWatch");
        homePage.clickSearchBtn();
        String expectedPageTitle = "AppleWatch : Micro Center";
        Assert.assertEquals(getPageTitle(),expectedPageTitle);
    }
      @Test
    public void searchGamingChair() {
        HomePage homePage = new HomePage(getDriver());
        SearchBarPage searchBarPage = new SearchBarPage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.searchElement("GaminChair");
        homePage.clickSearchBtn();
        String expectedPageTitle = "GaminChair : Micro Center";
        Assert.assertEquals(getPageTitle(),expectedPageTitle);
        }


    @Test
    public void excelreader() {
        HomePage homePage = new HomePage(getDriver());
        ExcelReader excelReader = new ExcelReader(Utility.currentDir+"/data/TestData.xlsx");
        SearchBarPage searchBarPage = new SearchBarPage(getDriver());
        homePage.clickOnStorePopUp();
        //homePage.clickSearchBtn();
        List<String> items = excelReader.getEntireColumnForGivenHeader("Sheet1", "item");

            for (String item: items) {
                homePage.clear();
                homePage.searchElement(item);
                waitFor(2);



            }

       // String expectedPageTitle = "GaminChair : Micro Center";
       // Assert.assertEquals(getPageTitle(),expectedPageTitle);
   }






 }