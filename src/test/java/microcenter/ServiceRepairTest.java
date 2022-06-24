package microcenter;
import base.CommonAPI;
import microCenterPages.HomePage;
import microCenterPages.ServiceRepairPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ServiceRepairTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(ServiceRepairTest.class);

    @Test
    public void Mac_LaptopBatteryReplacementService() {
        HomePage homePage = new HomePage(getDriver());
        ServiceRepairPage serviceRepairPage = new ServiceRepairPage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverServiceBtn(getDriver());
        homePage.clickOnBatteriesReplacement();
        serviceRepairPage.typeOnsearchField("macbook pro 15");
        serviceRepairPage.clickOnsearchBarBtn();
        String expectedPageTitle = "macbook pro 15 : Laptop Batteries : Micro Center";
        Assert.assertEquals(getPageTitle(),expectedPageTitle);
    }
    @Test
    public void HP_LaptopBatteryReplacementService() {
        HomePage homePage = new HomePage(getDriver());
        ServiceRepairPage serviceRepairPage = new ServiceRepairPage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverServiceBtn(getDriver());
        homePage.clickOnBatteriesReplacement();
        serviceRepairPage.typeOnsearchField("Dell Inspiron 14 ");
        serviceRepairPage.clickOnsearchBarBtn();
        String expectedPageTitle = "Dell Inspiron 14 : Laptop Batteries : Micro Center";
        Assert.assertEquals(getPageTitle(),expectedPageTitle);
    }
    @Test
    public void LaptopScreenReplacementService() {
        HomePage homePage = new HomePage(getDriver());
        ServiceRepairPage serviceRepairPage = new ServiceRepairPage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverServiceBtn(getDriver());
        homePage.clickOnLaptopScreenReplacement();
        String expectedPageTitle = "Laptop Screen Replacement Service";
        Assert.assertEquals(getPageTitle(),expectedPageTitle);
    }
    @Test
    public void Virus_MalwareScan() {
        HomePage homePage = new HomePage(getDriver());
        ServiceRepairPage serviceRepairPage = new ServiceRepairPage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverServiceBtn(getDriver());
        homePage.clickOnVirus_MalwareScan();
        String expectedPageTitle = "Virus & Malware Scanning and Removal - Micro Center";
        Assert.assertEquals(getPageTitle(),expectedPageTitle);
    }
    @Test
    public void DataBackupandRecoveryServices() {
        HomePage homePage = new HomePage(getDriver());
        ServiceRepairPage serviceRepairPage = new ServiceRepairPage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverServiceBtn(getDriver());
        homePage.clickOnDataBackupandRecoveryServices();
        String expectedPageTitle = "Data Backup & Recovery Services - Micro Center";
        Assert.assertEquals(getPageTitle(),expectedPageTitle);

    }
}
