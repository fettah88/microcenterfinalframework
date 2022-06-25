package microCenterPages;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomePage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(HomePage.class);

    @FindBy(css = "#hypSignInWrapper > div.unameContainer > div.uname")
    private WebElement LogingBtn;

    @FindBy(css = "#topLvl17133")
    private WebElement AcountBtn;

    @FindBy(css = "#ctl00_ContentLeftSide_hlRegistration > span")
    private WebElement CreatAccountBtn;

    @FindBy(css = "#storeInfo > ul > li.close > button > img")
    private WebElement StoreLocatorPopUp;

    @FindBy(css = "#midLvl18549")
    private WebElement AppleItemsBtn;

    @FindBy(css = "#midLvl18550")
    private WebElement macbookItemBtn;

    @FindBy(css = "#midLvl18551")
    private WebElement macDeskToptsItems;

    @FindBy(css = "#midLvl18552")
    private WebElement ipadItems;

    @FindBy(css = "#midLvl18554")
    private WebElement AirPodItems;

    @FindBy(css = "#midLvl18553")
    private WebElement AppleWatchItems;

    @FindBy(xpath = "//*[@id=\"byProd\"]")
    private WebElement Products;

    @FindBy(xpath = "//*[@id=\"topLvl519\"]")
    private WebElement TopDealsItems;
    @FindBy(css = "#mID519 > ul > li.tertiaryLvl.navarrow.MnID-610 > ul > li:nth-child(2) > a")
    private WebElement allTelevision;

    @FindBy(css = "#mID519 > ul > li.tertiaryLvl.navarrow.MnID-610 > ul > li:nth-child(1) > a")
    private WebElement monitors;

    @FindBy(css = "#mID519 > ul > li.tertiaryLvl.navarrow.MnID-17985 > ul > li:nth-child(1) > a")
    private WebElement keyboards;

    @FindBy(css = "  #mID519 > ul > li.tertiaryLvl.navarrow.MnID-6849 > ul > li > a")
    private WebElement AllTopDeal;

    @FindBy(css = " #topLvl18512")
    private WebElement AvailableBrands;

    @FindBy(css = "#mID18512 > ul > li.tertiaryLvl.navarrow.MnID-18513 > ul > li:nth-child(1) > a")
    private WebElement Search_Acer_Brand;

    @FindBy(xpath = "//*[@id=\"mID18512\"]/ul/li[1]/ul/li[7]/a")
    private WebElement Search_dell_Brand;

    @FindBy(css = "#mID18512 > ul > li.tertiaryLvl.navarrow.MnID-18526 > ul > li:nth-child(4) > a")
    private WebElement Search_Samsung_Brand;

    @FindBy(xpath = "//*[@id=\"mID18512\"]/ul/li[2]/ul/li[2]/a")
    private WebElement Search_Nvidia_Brand;


    @FindBy(css = "#mID18512 > ul > li.tertiaryLvl.navarrow.MnID-18513 > ul > li:nth-child(4) > a")
    private WebElement Search_Asus_Brand;

    @FindBy(css = "#mID18512 > ul > li.tertiaryLvl.navarrow.MnID-18513 > ul > li:nth-child(2) > a")
    private WebElement Search_AMD_Brand;

    @FindBy(css = "#mID18512 > ul > li.tertiaryLvl.navarrow.MnID-18513 > ul > li:nth-child(5) > a")
    private WebElement Search_Brother_Brand;
    @FindBy(css = "#midLvl15312")
    private WebElement community;

    @FindBy(css = "#mpc_Printers > div > a > img")
    private WebElement printers;

    @FindBy(css = "#mpc_Printers > div > a > img")
    private WebElement printerItems;

    @FindBy(css = "#mpc_powersupplies > div > a > img")
    private WebElement powerSupplies;

    @FindBy(css = "#mpc_powersupplies > div > a > img")
    private WebElement powerSuppliesItem;

    @FindBy(css = "   #mpc_Maker > div > a > img")
    private WebElement makerProdacts;

    @FindBy(css = "   #mpc_Maker > div > a > img")
    private WebElement makerProdactsItems;

    @FindBy(css = "  #mpc_Memory > div > a > div")
    private WebElement MemoryItem;

    @FindBy(css = "#footerNav > div.lowerFooter > div.cert-social > div.social > ul > li.fb > a")
    private WebElement facebookBtn;

    @FindBy(css = "#footerNav > div.lowerFooter > div.cert-social > div.social > ul > li.fb > a")
    private WebElement facebookB;

    @FindBy(css = "#footerNav > div.lowerFooter > div.cert-social > div.social > ul > li.ig > a")
    private WebElement instagramBtn;

    @FindBy(css = "#footerNav > div.lowerFooter > div.cert-social > div.social > ul > li.ig > a")
    private WebElement instagramB;

    @FindBy(css = "#footerNav > div.lowerFooter > div.cert-social > div.social > ul > li.tw > a")
    private WebElement twitterBtn;

    @FindBy(css = "#footerNav > div.lowerFooter > div.cert-social > div.social > ul > li.tw > a")
    private WebElement twitterB;

    @FindBy(css = "#footerNav > div.lowerFooter > div.cert-social > div.social > ul > li.yt > a")
    private WebElement youtubeBtn;

    @FindBy(css = "#footerNav > div.lowerFooter > div.cert-social > div.social > ul > li.yt > a")
    private WebElement youtubeB;

    @FindBy(css = "#SignUp")
    private WebElement signUp;

    @FindBy(css = "#SignUp")
    private WebElement signUpb;

    @FindBy(css = "#topLvl524")
    private WebElement Networking;

    @FindBy(css = "#mID524 > ul > li.tertiaryLvl.navarrow.MnID-6871 > ul > li > a")
    private WebElement viwAllNetworkingItems;

    @FindBy(css = "#mID524 > ul > li.tertiaryLvl.navarrow.MnID-705 > ul > li:nth-child(5) > a")
    private WebElement PowerOverEthernet;

    @FindBy(css = "#mID524 > ul > li.tertiaryLvl.navarrow.MnID-2856 > ul > li:nth-child(3) > a")
    private WebElement NasEnclosuersItems;

    @FindBy(css = "#mID524 > ul > li.tertiaryLvl.navarrow.MnID-717 > ul > li:nth-child(1) > a")
    private WebElement BroadBandModems;

    @FindBy(css = "#mID524 > ul > li.tertiaryLvl.navarrow.MnID-2867 > ul > li:nth-child(6) > a")
    private WebElement NetworkingTools;

    @FindBy(css = "#mID524 > ul > li.tertiaryLvl.navarrow.MnID-2856 > ul > li:nth-child(1) > a")
    private WebElement Servers;
    @FindBy(css = "#topLvl518")
    private WebElement ClearanceBtn;

    @FindBy(xpath = "//*[@id=\"mID518\"]/ul/li[1]/ul/li[4]/a")
    private WebElement ViewAllCloseouts;

    @FindBy(css = "#mID518 > ul > li.tertiaryLvl.navarrow.MnID-557 > ul > li:nth-child(6) > a")
    private WebElement AccessoriesItems;

    @FindBy(css = "#mID518 > ul > li.tertiaryLvl.navarrow.MnID-557 > ul > li:nth-child(4) > a")
    private WebElement ElectronicsItems;
    @FindBy(css = "#mID518 > ul > li.tertiaryLvl.navarrow.MnID-557 > ul > li:nth-child(7) > a")
    private WebElement GamingItems;

    @FindBy(xpath = "//*[@id=\"mID518\"]/ul/li[2]/ul/li[8]/a")
    private WebElement ViewAllOpenBoxItems;

    @FindBy(css = "#mID518 > ul > li.tertiaryLvl.navarrow.MnID-559 > ul > li:nth-child(5) > a")
    private WebElement NetworkingOpenBoxItems;

    @FindBy(xpath = "//*[@id=\"mID518\"]/ul/li[2]/ul/li[2]/a")
    private WebElement AppleOpenBoxItems;

    @FindBy(xpath = "//*[@id=\"mID518\"]/ul/li[2]/ul/li[1]/a")
    private WebElement ComputerOpenBoxItems;

    @FindBy(xpath = " //*[@id=\"mID518\"]/ul/li[1]/ul/li[3]/a")
    private WebElement ComputerPartsCloseoutItems;

    @FindBy(css = "#search-query")
    private WebElement searchField;

    @FindBy(css = "#searchForm > input.submit.btn")
    private WebElement searchBtn;

    @FindBy(css = "#midLvl14780")
    private WebElement ServiceBtn;

    @FindBy(css = "#midLvl18223")
    private WebElement schedualeServiceBtn;

    @FindBy(css = "#cmscontent")
    private WebElement AllServicesAndRepaire;

    @FindBy(css = "#midLvl18234")
    private WebElement LaptopBatteriesReplacement;

    @FindBy(css = "#midLvl18237")
    private WebElement LaptopScreenReplacement;
    @FindBy(css = "#midLvl18233")
    private WebElement Virus_MalwareScan;
    @FindBy(css = "#midLvl18239")
    private WebElement DataBackupandRecoveryServices;

    @FindBy(xpath = "//*[@id=\"footerNav\"]/ul/li[3]/ul/li[4]/a")
    private WebElement careers;
    @FindBy(css = "#footerNav > ul > li.inline.topLvl.shopping > ul > li:nth-child(1) > a")
    private WebElement StoreLocationsBtn;
    @FindBy(css = "#midLvl18213")
    private WebElement PcPartsItems;

    @FindBy(css = "#midLvl18216")
    private WebElement ProcessorsItems;

    @FindBy(css = "#midLvl18217")
    private WebElement GraphicsCardsItems;

    @FindBy(css = "#midLvl18219")
    private WebElement Drives_StorageItems;

    @FindBy(css = "#midLvl18603")
    private WebElement ComputerCasesItems;

    @FindBy(css = "#midLvl18605")
    private WebElement Air_WaterCoolingItems;

    @FindBy(css = "#siteSelections > div.rightItems.inline > ul.myCart.inline > li.items.last > a > div > span.label1")
    private WebElement Cart_Lists;

    @FindBy(css = "#midLvl18215")
    private WebElement ComputersBtn;

    @FindBy(css = "#midLvl18221")
    private WebElement DesktopsBtn;

    @FindBy(css = "#midLvl18222")
    private WebElement LaptopsBtn;

    public HomePage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    //reusable steps
    public void hoverOverLogingBtn(WebDriver driver) {
        hoverOver(driver, LogingBtn);
        LOG.info("click click On hover Over Loging button success");
    }

    public void clickOnAcountBtn() {
        click(AcountBtn);
        LOG.info("click click On Acount button success");
    }
    public void clickCreatAccountBtn() {
        click(CreatAccountBtn);
        LOG.info("click click On CreatAccount button success");
    }

    public void clickOnStorePopUp() {
        click(StoreLocatorPopUp);
        LOG.info("click on StorePopUp success");
    }

    public void hoverOverAplleItemsBtn(WebDriver driver) {
        hoverOver(driver, AppleItemsBtn);
    }
    public void clickOnmacbookBtn() {
        click(macbookItemBtn);
        LOG.info("click on macbook button success");
    }
    public void clickOnDesktopsItemsBtn() {
        click(macDeskToptsItems);
        LOG.info("click on DesktopsItems button success");
    }
    public void clickOnipadItemsBtn() {
        click(ipadItems);
        LOG.info("click on ipadItems button success");
    }
    public void clickOnAirPodItems() {
        click(AirPodItems);
        LOG.info("click on AirPod Items success");
    }
    public void clickOnAppleWatchItems() {
        click(AppleWatchItems);
        LOG.info("click on AppleWatch Items success");
    }
    public void hoverOverProducts(WebDriver driver) {
        hoverOver(driver, Products);
        LOG.info("hoverOver Products button success");
    }
    public void clickOnTopDealsItems() {
        click(TopDealsItems);
        LOG.info("click on TopDeals Items success");
    }
    public void clickOntelevisionItem() {
        click(allTelevision);
        LOG.info("click on search button success");
    }

    public void clickOnMonitors() {
        click(monitors);
        LOG.info("click on television Item success");
    }
    public void clickOnKeyboards() {
        click(keyboards);
        LOG.info("click on search button success");
    }
    public void clickOnviewAllTopDeal() {
        click(AllTopDeal);
        LOG.info("click on Keyboards success");
    }
    public void clickOnBrands() {
        click(AvailableBrands);
        LOG.info("click on OnBrands button success");
    }
    public void clickOnAcer() {
        click(Search_Acer_Brand);
        LOG.info("click on Acer Brand success");
    }
    public void clickOndell() {
        click(Search_dell_Brand);
        LOG.info("click on dell Brand success");
    }

    public void clickOnSamsung() {
        click(Search_Samsung_Brand);
        LOG.info("click on Samsung Brand success");
    }
    public void clickOnInvidia() {
        click(Search_Nvidia_Brand);
        LOG.info("click on Invidia Brand success");
    }
    public void clickOnBrother() {
        click(Search_Brother_Brand);
        LOG.info("click on Brother Brand success");
    }

    public void clickOnAMD() {
        click(Search_AMD_Brand);
        LOG.info("click on AMD Brand success");
    }
    public void clickOncommunity() {
        click(community);
        LOG.info("click on community button success");
    }
    public void ScrollToView(WebElement element, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        LOG.info(" Scroll Down To View success");
    }
    public void scrollToViewPrinters(WebDriver driver) {
        ScrollToView(printers, driver);
        LOG.info(" Scroll Down To View success");
    }
    public void clickOnPrinterItem() {
        click(printerItems);
        LOG.info("click on PrinterItem success");
    }
    public void scrollToViewPowerSupplies(WebDriver driver) {
        ScrollToView(powerSupplies, driver);
        LOG.info(" Scroll Down To View success");
    }
    public void clickOnPowerSupplies() {
        click(powerSuppliesItem);
        LOG.info("click on PowerSupplies Item success");
    }
    public void scrollToViewMakerProducts(WebDriver driver) {
        ScrollToView(makerProdacts, driver);
        LOG.info(" Scroll Down To View success");
    }

    public void clickOnMakerProductsItems() {
        click(makerProdacts);
        LOG.info("click on MakerProductsItems success");
    }
    public void clickOnMemoryItem() {
        click(MemoryItem);
        LOG.info("click on MemoryItem success");
    }
    public void scrollToViewfacebookBtn(WebDriver driver) {
        ScrollToView(facebookBtn, driver);
        LOG.info("scroll To View facebook button success");

    }
    public void clickonB() {
        click(facebookB);
        LOG.info("click on facebookB button success");
    }
    public void scrollToViewinstagramBtn(WebDriver driver) {
        ScrollToView(instagramBtn, driver);
        LOG.info("scroll To View instagram button success");
    }
    public void clickonfacebookB() {
        click(instagramB);
        LOG.info("click on instagramBtn button success");
    }
    public void scrollToViewtwitterBtn(WebDriver driver) {
        ScrollToView(twitterBtn, driver);
        LOG.info(" Scroll Down To View twitter button success");
    }
    public void clickontwitterB() {
        click(twitterB);
        LOG.info("click on twitterB button success");
    }
    public void scrollToViewyoutubeBtn(WebDriver driver) {
        ScrollToView(youtubeBtn, driver);
        LOG.info(" Scroll Down To View success");

    }
    public void clickOnYotubeB() {
        click(youtubeB);
        LOG.info("click on YotubeB button success");

    }
    public void scrollToViewSignUp(WebDriver driver) {
        ScrollToView(signUp, driver);
        LOG.info(" Scroll Down To View success");
    }
    public void clickOnSignUp() {
        click(signUpb);
        LOG.info("click on SignUp button success");
    }
    public void clickOnNetworking() {
        click(Networking);
        LOG.info("click on Networking button success");
    }
    public void clickOnPowerOverEthernet() {
        click(PowerOverEthernet);
        LOG.info("click on PowerOverEthernet button success");
    }
    public void clickOnServersBtn() {
        click(Servers);
        LOG.info("click on Servers button success");
    }
    public void clickOnAllNetworkingProducts() {
        click(viwAllNetworkingItems);
        LOG.info("click on AllNetworkingProducts button success");
    }
    public void clickOnNasEnclosuersItems() {
        click(NasEnclosuersItems);
        LOG.info("click on NasEnclosuersItems button success");
    }
    public void clickOnBroadBandModemsItems() {
        click(BroadBandModems);
        LOG.info("click on BroadBandModemsItems button success");
    }
    public void clickOnNetworkingToolsItems() {
        click(NetworkingTools);
        LOG.info("click on NetworkingToolsItems success");
    }
    public void hoverOverClearance(WebDriver driver) {
        hoverOver(driver, ClearanceBtn);
        LOG.info(" hoverOver Clearance button success");
    }
    public void clickOnViewAllCloseouts() {
        click(ViewAllCloseouts);
        LOG.info("click on ViewAllCloseouts button success");
    }
    public void clickOnAccessoriesItemsBtn() {
        click(AccessoriesItems);
        LOG.info("click on AccessoriesItems success");
    }
    public void clickOnElectronicsItemsBtn() {
        click(ElectronicsItems);
        LOG.info("click on ElectronicsItems success");
    }
    public void clickOnComputerPartsCloseoutItems() {
        click(ComputerPartsCloseoutItems);
        LOG.info("click on ComputerPartsCloseoutItems success");
    }
    public void clickOnGamingItemsBtn() {
        click(GamingItems);
        LOG.info("click on GamingItems button success");
    }
    public void clickOnViewAllOpenBoxItems() {
        click(ViewAllOpenBoxItems);
        LOG.info("click on ViewAllOpenBoxItems button success");
    }
    public void clickOnNetworkingOpenBoxItems() {
        click(NetworkingOpenBoxItems);
        LOG.info("click on NetworkingOpenBoxItems button success");
    }
    public void clickOnAppleOpenBoxItems() {
        click(AppleOpenBoxItems);
        LOG.info("click on AppleOpenBoxItems button success");
    }
    public void searchElement(String item) {
        type(searchField, item);
        LOG.info("type in search field and enter success");
    }
    public void clear() {
        clear(searchField);
        LOG.info("type in search field and enter success");
    }
    public void clickOnComputerOpenBoxItems() {
        click(ComputerOpenBoxItems);
        LOG.info("click on ComputerOpenBoxItems button success");
    }
    public void clickSearchBtn() {
        click(searchBtn);
        LOG.info("click on search button success");
    }
    public void hoverOverServiceBtn(WebDriver driver) {
        hoverOver(driver, ServiceBtn);
        LOG.info("hoverOverService button success");
    }

    public void clickOnschedualeServiceBtn() {
        click(schedualeServiceBtn);
        LOG.info("click on schedualeService button success");
    }
    public void clickOnBatteriesReplacement() {
        click(LaptopBatteriesReplacement);
        LOG.info("click on BatteriesReplacement button success");
    }
    public void clickOnLaptopScreenReplacement() {
        click(LaptopScreenReplacement);
        LOG.info("click on LaptopScreenReplacement button success");
    }
    public void scrollToViewCareers(WebDriver driver) {
        ScrollToView(careers, driver);
        LOG.info("scroll To View scrollToViewCareers button success");
    }
    public void clickOnVirus_MalwareScan() {
        click(Virus_MalwareScan);
        LOG.info("click on Virus_MalwareScan button success");
    }
    public void clickOnDataBackupandRecoveryServices() {
        click(DataBackupandRecoveryServices);
        LOG.info("click on DataBackupandRecoveryServices button success");
    }
    public void clickOncareerBtn() {
        click(careers);
        LOG.info("click on career button success");
    }
    public void scrollToViewStoreLocationsBtn(WebDriver driver){
        ScrollToView(StoreLocationsBtn,driver);
        LOG.info("scrollToViewStoreLocations button success");
    }
    public void clickOnStoreLocationsBtn() {
        click(StoreLocationsBtn);
        LOG.info("click on StoreLocations button success");
    }
        public void hoverOverPcPartsItems(WebDriver driver) {
            hoverOver(driver, PcPartsItems);
            LOG.info("hoverOverPcPartsItems button success");
        }
    public void clickOnProcessorsItems() {
        click(ProcessorsItems);
        LOG.info("click on ProcessorsItems success");
    }
    public void clickOnGraphicsCardsItems() {
        click(GraphicsCardsItems);
        LOG.info("click on GraphicsCardsItems success");
    }
    public void clickOnDrives_StorageItems() {
        click(Drives_StorageItems);
        LOG.info("click on Drives_StorageItems success");
    }
    public void clickOnComputerCasesItems() {
        click(ComputerCasesItems);
        LOG.info("click on ComputerCasesItems success");
    }
    public void clickOnAir_WaterCoolingItems() {
        click(Air_WaterCoolingItems);
        LOG.info("click on nAir_WaterCoolingItems success");
    }
    public void clickOnCart_ListsBtn() {
        click(Cart_Lists);
        LOG.info("click on Cart_Lists button success");
    }
    public void hoverOverComutersBtn(WebDriver driver) {
        hoverOver(driver, ComputersBtn);
        LOG.info("hoverOver Comuters button success");
    }
    public void clickOnDesktopsBtn() {
        click(DesktopsBtn);
        LOG.info("click on OnDesktops button success");
    }
    public void clickOnLaptopsBtn() {
        click(LaptopsBtn);
        LOG.info("click on Laptops button success");
    }
        public void accessBrandSection (WebDriver driver){
        clickOnStorePopUp();
        hoverOverProducts(driver);
        clickOnBrands();

   }

    public void searchElementfromExcel(String item) {
        type(searchField, item);
        LOG.info("type in search field and enter success");
    }


}


