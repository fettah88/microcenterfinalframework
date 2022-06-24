package microcenter;

import base.CommonAPI;
import microCenterPages.BrandsPage;
import microCenterPages.HomePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AvailableBrandsTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(AvailableBrandsTest.class);

   // @Test
    public void ViewAllAvailableBrands() {
        HomePage homePage = new HomePage(getDriver());
        BrandsPage BrandPage = new BrandsPage (getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverProducts(getDriver());
        homePage.clickOnBrands();
        String expectedPageTitle = "Micro Center - Computers and Electronic Device Retailer";
        Assert.assertEquals(getPageTitle(),expectedPageTitle);


    }
   //  @Test
    public void search_Acer_Brand() {
        HomePage homePage = new HomePage(getDriver());
        BrandsPage BrandPage = new BrandsPage (getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverProducts(getDriver());
        homePage.clickOnBrands();
        homePage.clickOnAcer();
        String expectedPageTitle = "Acer Store | Micro Center";
        Assert.assertEquals(getPageTitle(),expectedPageTitle);


    }
   //  @Test
    public void search_AMD_Brand() {
        HomePage homePage = new HomePage(getDriver());
        BrandsPage BrandPage = new BrandsPage (getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverProducts(getDriver());
        homePage.clickOnBrands();
        homePage.clickOnAMD();
        String expectedPageTitle = "AMD Brand Showcase";
        Assert.assertEquals(getPageTitle(),expectedPageTitle);

    }
   //  @Test
    public void search_Brother_Brand() {
        HomePage homePage = new HomePage(getDriver());
        BrandsPage BrandPage = new BrandsPage (getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverProducts(getDriver());
        homePage.clickOnBrands();
        homePage.clickOnBrother();
        String expectedPageTitle = "Brother Store | Micro Center";
        Assert.assertEquals(getPageTitle(),expectedPageTitle);
    }
  //  @Test
    public void search_INVIDIA_Brand() {
        HomePage homePage = new HomePage(getDriver());
        BrandsPage BrandPage = new BrandsPage (getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverProducts(getDriver());
        homePage.clickOnBrands();
        homePage.clickOnInvidia();
        String expectedPageTitle = "NVIDIA";
        Assert.assertEquals(getPageTitle(),expectedPageTitle);

    }

    // @Test
    public void search_Samsung_Brand() {
         HomePage homePage = new HomePage(getDriver());
        BrandsPage BrandPage = new BrandsPage (getDriver());
//        homePage.clickOnStorePopUp();
//        homePage.hoverOverOroducts(getDriver());
//        homePage.clickOnBrands();
         homePage.accessBrandSection(getDriver());
        homePage.clickOnSamsung();
         String expectedPageTitle = "Samsung Store | Micro Center";
         Assert.assertEquals(getPageTitle(),expectedPageTitle);

    }
     @Test
    public void search_dell_Brand() {
        HomePage homePage = new HomePage(getDriver());
        BrandsPage BrandPage = new BrandsPage (getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverProducts(getDriver());
        homePage.clickOnBrands();
        homePage.clickOndell();
        String expectedPageTitle = "Dell Store | Micro Center";
        Assert.assertEquals(getPageTitle(),expectedPageTitle);
    }
}