package AmgharPages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import java.util.List;
import java.util.Set;

public class RepublicOfGamersHomePage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(RepublicOfGamersHomePage.class);


    @FindBy(xpath = "//*[@class='btn-asus btn-ok btn-read-ck']")
    private WebElement CookiesAcceptBtn;

    @FindBy(xpath = "//*[@id=\"rogMenu\"]/span")
    private WebElement Products;

    @FindBy(xpath = "//*[@class='SlideShow__rightButton__3C9zJ']")
    private WebElement ExploreOurProductsSlideRightBtn;

    @FindBy(xpath = "//*[@class='SlideShow__leftButton__2Rc32']")
    private WebElement ExploreOurProductsSlideLeftBtn;

    @FindBy(css = "#rogProduct > div > div > div > div.Header__headerWrapper__2jH8a.Header__upscrolled__B00tj > div.Header__headerContainer__1hIKH > header > div.Header__iconBlock__339d9 > button")
    private WebElement SearchBtn;

    @FindBy(css = "#search")
    private WebElement SearchBar;

    @FindBy(xpath = "//*[@class='SearchExplore__title__3e_kG']")
    private WebElement ProductText;

    @FindBy(css = "#rogProduct > div > div > div > div.Header__headerWrapper__2jH8a.Header__upscrolled__B00tj > div.Header__headerContainer__1hIKH > header > nav > div > ul.Header__headerMenuList__3_iXV > li:nth-child(1) > div.headerDropDownMenuList__dropDownMenuContainer__38IYs > div:nth-child(1) > ul:nth-child(3) > li > ul > li:nth-child(1) > a")
    private WebElement ExternalGraphicsDocks2022;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/div/div/main/div[1]/div/div[2]/div[1]/div[3]/div[1]/h3/a/span[1]")
    private WebElement RogXgMobile2022;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/div/div/main/div[1]/div/div[1]/div[1]/h1")
    private WebElement EXTERNALGRAPHICDOCKSText;

    @FindBy(css = "#rogProduct > div > div > div > div.productTabBarContainer.ProductTabBar__productTabBarContainer__1e5nP > div.productTabBarWrapper.ProductTabBar__productTabBarWrapper__1Mza_ > div.ProductTabBar__productInfo__3Gw2U > a > h1")
    private WebElement ROGXGMobile2022Text;

    @FindBy(xpath = "//*[@class='Footer__socialItem__3v6_U']")
    private WebElement FacebookPage;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/footer/div/div[2]/ul[2]/li[2]/a/svg")
    private WebElement TwitterPage;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/div[1]/div[2]/header/nav/div/ul[2]/li[1]/div[2]/div[1]/ul[2]/li/ul/li[1]/a")
    private WebElement MotherboardsFromMenu;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/div/div[4]/div[2]/div[1]/div/div/div[4]/div/a")
    private WebElement RogZenith;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/div[3]/div/div[2]/div[1]/div/div[3]/div[4]/div[6]/div/div[2]/div/a")
    private WebElement NotifyMeBtn;

    @FindBy(xpath = "//*[@id=\"rogMenu2\"]")
    private WebElement DownloadMenu;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/div[1]/div[2]/header/nav/div/ul[2]/li[3]/div[2]/div/ul/li/ul/li[1]/a")
    private WebElement WallPapersFromMenu;

    @FindBy(xpath = "//*[@id=\\\"rogProduct\\\"]/div/div/div/footer/div/img")
    private WebElement FaceBookIcon;

    @FindBy(css = "#rogMenu3 > span")
    private WebElement CommunityMenu;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/div[1]/div[2]/header/nav/div/ul[2]/li[4]/div[2]/div/ul/li/ul/li[1]/a")
    private WebElement NewsAndArticles;

    @FindBy(xpath = "//*[@class='Footer__language__Xv6jK Footer__footerItemName__3SrWr']")
    private WebElement LanguageBtn;

    @FindBy(css = "#rogMenu1")
    private WebElement InnovationMenu;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/div[1]/div[2]/header/nav/div/ul[2]/li[2]/div[2]/div/ul/li/ul/li[2]/a")
    private WebElement ArmoryBtn;

    @FindBy(xpath = "//*[@class='userButton headerPersonalBlock__accountButton__dnqUZ headerPersonalBlock__isLogin__17fMM']")
    private WebElement LogInBtn;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/div[1]/div[2]/header/div[2]/div[2]/ul/li/ul/li[6]/div[1]/span")
    private WebElement LogInFromBtn;

    @FindBy(css = "#rogProduct > div > div > div > main > div.Actions__actionsContainer__3fXsG > div > div.Actions__actionScrollBar__2tyCS")
    private WebElement RecentRelease;

    @FindBy(css = "#rogProduct > div > div > div > main > div.Actions__actionsContainer__3fXsG > div > div.Actions__actionScrollBar__2tyCS > div > a:nth-child(1)")
    private WebElement Image1;

    @FindBy(css = "#rogProduct > div > div > div > main > div.Actions__actionsContainer__3fXsG > div > div.Actions__actionScrollBar__2tyCS > div > a:nth-child(2)")
    private WebElement Image2;

    @FindBy(css = "#rogProduct > div > div > div > main > div.Actions__actionsContainer__3fXsG > div > div.Actions__actionScrollBar__2tyCS > div > a:nth-child(3)")
    private WebElement Image3;

    @FindBy(css = "#rogProduct > div > div > div > main > div.Actions__actionsContainer__3fXsG > div > div.Actions__actionScrollBar__2tyCS > div > a:nth-child(4)")
    private WebElement Image4;

    @FindBy(css = "#rogProduct > div > div > div > main > div.Actions__actionsContainer__3fXsG > div > div.Actions__actionScrollBar__2tyCS > div > a:nth-child(5)")
    private WebElement Image5;

    @FindBy(xpath = "//*[@class='Header__asusLogo__30CFg']")
    private WebElement AsusLogo;

    @FindBy(xpath = "//span[contains(text(),\"What's HOT\")]")
    private WebElement WhatsHot;

    @FindBy(xpath = "//header/nav[1]/div[1]/ul[2]/li[5]/div[2]/div[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    private WebElement AsusPcDiy;



    public RepublicOfGamersHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
















    public void clickCookiesAcceptBtn() {
        click(CookiesAcceptBtn);
        LOG.info("click on Accept button success");
    }

    public void hoverOverProducts(WebDriver driver) {
        hoverOver(driver, Products);
    }

    public void clickSlideRightBtn() {
        click(ExploreOurProductsSlideRightBtn);
    }

    public void clickSlideLeftBtn() {
        click(ExploreOurProductsSlideLeftBtn);
    }

    public void clickSearchBtn() {
        click(SearchBtn);
    }

    public void TypeSearchBar() {
        type(SearchBar, "SSD");
    }

    public void ClearSearchBar() {
        clear(SearchBar);
    }

    public void TypeAndEnterSearchBarr() {
        typeAndEnter(SearchBar, "KeyBoard");
    }

    public String getTextProduct() {
        return getElementText(ProductText);
    }

    public void clickExternalGraphicsDocks2022() {
        click(ExternalGraphicsDocks2022);
    }

    public void clickRogXgMobile2022() {
        click(RogXgMobile2022);
    }

    public void hoverOverRogXgMobile2022(WebDriver driver) {
        hoverOver(driver, RogXgMobile2022);
    }

    public String getEXTERNALGRAPHICDOCKSText() {
        return getElementText(EXTERNALGRAPHICDOCKSText);
    }

    public String getROGXGMobile2022Text() {
        return getElementText(EXTERNALGRAPHICDOCKSText);
    }


//   public void scroollToVieuFb(WebDriver element){
//        scrollToView(FacebookPage);
//
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        element.
//        js.executeScript("arguments[0].scrollIntoView(true);", element);
//    }


    public void ClickFacebookPage() {
        click(FacebookPage);
    }

    public void ClickTwitterPage() {
        click(TwitterPage);
    }

    public void clickMotherboardsFromMenu() {
        click(MotherboardsFromMenu);
    }

    public void clickRogZenith() {
        click(RogZenith);
    }

    public void clickNotifyMeBtn() {
        click(NotifyMeBtn);
    }

    public void hoverOverDownloadMenu(WebDriver driver) {
        hoverOver(driver, DownloadMenu);
    }

    public void clickWallPapersFromMenu() {
        click(WallPapersFromMenu);
    }

    public void hoverOverCommunityMenu(WebDriver driver) {
        hoverOver(driver, CommunityMenu);
    }

    public void clickNewsAndArticles() {
        click(NewsAndArticles);
    }

    public void clickLanguageBtn() {
        click(LanguageBtn);
    }

    public void hoverOverInnovationMenu(WebDriver driver) {
        hoverOver(driver, InnovationMenu);
    }

    public void clickArmoryBtn() {
        click(ArmoryBtn);
    }

    public void clickLogInBtn() {
        click(LogInBtn);
    }

    public void clickLogInFromDropDown() {
        click(LogInFromBtn);
    }


    public void ScrollDownToRecentReleases(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", RecentRelease);

    }


    public void hoverOver5Image(WebDriver driver) {
        hoverOver(driver, Image1);
        hoverOver(driver, Image2);
        hoverOver(driver, Image3);
        hoverOver(driver, Image4);
        hoverOver(driver, Image5);
    }

    public void GoBack(WebDriver driver) {
        click(AsusLogo);
        driver.navigate().back();
        waitFor(2);
        driver.navigate().forward();
        waitFor(2);

    }

    public void hoverAndClickPcDiy(WebDriver driver) {
        clickCookiesAcceptBtn();
        hoverOver(driver, WhatsHot);
        waitFor(2);
        click(AsusPcDiy);
    }

    @FindBy(xpath = "//body/section[@id='get-rewards']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/a[1]")
    private WebElement LearnMoreGetRewards;

    @FindBy(xpath = "//*[@id=\"cookie-policy-info\"]/div/div[2]/div[2]")
    private WebElement CookieAcceptPcDiy;

    @FindBy(css = "#get-rewards > div.bg-white.align-center > div > h2")
    private WebElement scrooltovii;

    @FindBy(css = "#header_menu_2 > nav > ul > li:nth-child(1) > a > span")
    private WebElement HowToJoin;


    public void HandlePcDiyPageSwitch(WebDriver driver) {

        clickCookiesAcceptBtn();
        String ROGPage = driver.getWindowHandle();
        System.out.println("ParentWindow  - " + ROGPage);
        hoverOver(driver, WhatsHot);
        waitFor(2);
        click(AsusPcDiy);
        Set<String> PcDiyHandle = driver.getWindowHandles();
        for (String PcDiyPage : PcDiyHandle) {
            System.out.println("PcDiyPage  :" + PcDiyPage);
            if (!PcDiyPage.equals(ROGPage)) {
                driver.switchTo().window(PcDiyPage);
                waitFor(3);
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].scrollIntoView(true);", scrooltovii);
                waitFor(2);
                click(LearnMoreGetRewards);
                waitFor(2);

            }
        }
        String RateYourGearPage = driver.getWindowHandle();
        System.out.println("RateYourGearPage  - " + RateYourGearPage);
        Set<String> RateYourGearHandle = driver.getWindowHandles();
        for (String RateYourGear : RateYourGearHandle) {
            System.out.println(RateYourGear);
            if (!RateYourGear.equals(RateYourGearPage) & !RateYourGear.equals(ROGPage)) {
                driver.switchTo().window(RateYourGear);
                waitFor(2);
                click(HowToJoin);
                waitFor(5);
            }

        }
    }

    @FindBy(xpath = "//span[contains(text(),'Products')]")
    private WebElement ProductsHover;
    @FindBy(xpath = "//header/nav[1]/div[1]/ul[2]/li[1]/div[2]/div[2]/ul[1]/li[1]/a[1]")
    private WebElement TUFClick;
    @FindBy(xpath = "//a[contains(text(),'See all ASUS TUF Gaming Motherboards')]")
    private WebElement ClickClick;

    public void hovereOverProductsClickSwitchPages(WebDriver driver) {
        String ROGPage = driver.getWindowHandle();
        System.out.println("ParentWindow  - " + ROGPage);

        hoverOver(driver, ProductsHover);
        click(TUFClick);


        Set<String> TUFGaminghandle = driver.getWindowHandles();
        for (String TUFGamingPage : TUFGaminghandle) {
            System.out.println("PcDiyPage  :" + TUFGamingPage);
            if (!TUFGamingPage.equals(ROGPage)) {
                driver.switchTo().window(TUFGamingPage);
                waitFor(3);

                click(ClickClick);
                waitFor(3);
            }
        }

    }


    @FindBy(css = "#rogFooter2")
    private WebElement AccessibilityBtn;


    public void Accessibility(WebDriver driver) {
        clickCookiesAcceptBtn();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", AccessibilityBtn);

        waitFor(2);
        click(AccessibilityBtn);

    }


    @FindBy(css = "#rogProduct > div > div > div > div.Header__headerWrapper__2jH8a.Header__upscrolled__B00tj > div.Header__headerContainer__1hIKH > header > a > div > svg")
    private WebElement LogoROG;

    public void ROGLogo() {
        clickCookiesAcceptBtn();
        isPresent(LogoROG);
    }


    @FindBy(css = "#rogProduct > div > div > div > div.Header__headerWrapper__2jH8a.Header__upscrolled__B00tj > div.Header__headerContainer__1hIKH > header > nav > div > ul.Header__headerMenuList__3_iXV > li:nth-child(5) > div.headerDropDownMenuList__dropDownMenuContainer__38IYs > div > ul > li > ul > li:nth-child(2) > a")
    private WebElement QHD;

    @FindBy(css = "#navbar-collapse > ul > li:nth-child(1) > a")
    private WebElement ROG;

    @FindBy(css = "#navbar-collapse > ul > li:nth-child(2) > a")
    private WebElement TUF;

    @FindBy(css = "#navbar-collapse > ul > li:nth-child(3) > a")
    private WebElement WhatsHott;


    public void QHD(WebDriver driver) {
        clickCookiesAcceptBtn();
        String ROGPage = driver.getWindowHandle();
        System.out.println("ParentWindow  - " + ROGPage);
        hoverOver(driver, WhatsHot);
        waitFor(1);
        click(QHD);
        Set<String> QHDHandle = driver.getWindowHandles();
        for (String QHDPage : QHDHandle) {
            System.out.println("QHDPage  :" + QHDPage);
            if (!QHDPage.equals(ROGPage)) {
                driver.switchTo().window(QHDPage);
                waitFor(1);
                click(ROG);
                waitFor(1);
                click(TUF);
                waitFor(1);
                click(WhatsHott);
                waitFor(1);

            }
        }
    }

    @FindBy(css = "#featured-monitors > div.container > div > div > div.module-titles > div > h2")
    private WebElement FeatureMonitors;

    @FindBy(css = "#features > div.container > div > div > div.module-titles > div > h2")
    private WebElement AsusExecutiveFeatures;

    @FindBy(css = "#enhancements > div.container > div > div > div.module-titles > div > h2")
    private WebElement InGameInEnhancements;

    public void QHDScrollDown(WebDriver driver) {
        clickCookiesAcceptBtn();
        String ROGPage = driver.getWindowHandle();
        System.out.println("ParentWindow  - " + ROGPage);
        hoverOver(driver, WhatsHot);
        waitFor(1);
        click(QHD);
        Set<String> QHDHandle = driver.getWindowHandles();
        for (String QHDPage : QHDHandle) {
            System.out.println("QHDPage  :" + QHDPage);
            if (!QHDPage.equals(ROGPage)) {
                driver.switchTo().window(QHDPage);
                waitFor(1);
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].scrollIntoView(true);", FeatureMonitors);
                waitFor(1);
                js.executeScript("arguments[0].scrollIntoView(true);", AsusExecutiveFeatures);
                waitFor(1);
                js.executeScript("arguments[0].scrollIntoView(true);", InGameInEnhancements);

            }
        }
    }

    @FindBy(xpath = "//header/div[2]/div[1]/a[1]")
    private WebElement AsusLogos;

    @FindBy(css = "#headerLayerOne > div > div.HeaderDesktop__topLeftMenu___uskw.HeaderDesktop__themeWhite__1bpoN > div:nth-child(3) > a > img.HeaderDesktop__hoverImage__3UNUD")
    private WebElement ROGLogos;

    @FindBy(css = "#rogProduct > div > div > div > main > div.Gamer__gamerContainer__UIMyJ > div.GamerTextContent__gamerTextContent__2SGl4")
    private WebElement ROGInAction;

    public void Logos(WebDriver driver) {
        clickCookiesAcceptBtn();
        isPresent(AsusLogos);
        click(AsusLogos);
        waitFor(2);
        String AsusPage = driver.getWindowHandle();
        System.out.println("ParentWindow  - " + AsusPage);
        isPresent(ROGLogos);
        click(ROGLogos);
        waitFor(2);
        Set<String> ROGHandle = driver.getWindowHandles();
        for (String ROGPage : ROGHandle) {
            System.out.println("ROGPage  :" + ROGPage);
            if (!ROGPage.equals(AsusPage)) {
                driver.switchTo().window(ROGPage);
                waitFor(2);
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].scrollIntoView(true);", ROGInAction);
                waitFor(1);
            }
        }
    }


    @FindBy(id = "rogFooter")
    private WebElement AboutROGBtn;

    @FindBy(css = "#ar-innovation > div.ar-section-content > div.ar-nav-wrapper")
    private WebElement HoverAndClick;

    @FindBy(xpath = "//div[contains(text(),'Innovations')]")
    private WebElement Innovation;

    @FindBy(xpath = "//div[contains(text(),'Motherboards')]")
    private WebElement MotherBoards;

    @FindBy(xpath = "//div[contains(text(),'Graphics Cards')]")
    private WebElement GraphicsCards;

    @FindBy(xpath = "//div[contains(text(),'Displays')]")
    private WebElement Displays;

    @FindBy(xpath = "//div[contains(text(),'Laptops')]")
    private WebElement LapTops;

    @FindBy(xpath = "//div[contains(text(),'Phones')]")
    private WebElement Phones;


    public void AboutROGMidlePage(WebDriver driver) {
        clickCookiesAcceptBtn();
        LOG.info("click accept cookies button success");
        String ROGPage = driver.getWindowHandle();
        System.out.println("ParentWindow  - " + ROGPage);
        // Assert.assertEquals(getPageTitle(), "ROG - Republic of Gamers｜USA | The Choice of Champions");
        waitFor(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", AboutROGBtn);
        waitFor(2);
        click(AboutROGBtn);
        Set<String> AboutHandle = driver.getWindowHandles();
        for (String AboutPage : AboutHandle) {
            System.out.println("AboutPage  :" + AboutPage);
            if (!AboutPage.equals(ROGPage)) {
                driver.switchTo().window(AboutPage);
                waitFor(2);
                js.executeScript("arguments[0].scrollIntoView(true);", HoverAndClick);
                waitFor(2);

//                    List<WebElement> ClickBtn = driver.findElements(By.xpath("//body/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/section[2]/div[2]/div[4]/div[1]"));
//                    for (int i = 0; i < ClickBtn.size(); i++) {
//                        ClickBtn.get(5).click();
//                        waitFor(1);
                click(Innovation);
                waitFor(1);
                click(MotherBoards);
                waitFor(1);
                click(GraphicsCards);
                waitFor(1);
                click(Displays);
                waitFor(1);
                click(LapTops);
                waitFor(1);
                click(Phones);
                waitFor(1);

            }
        }
    }

    @FindBy(css = "#ar-milestone > div.ar-section-content > div.ar-nav-wrapper")
    private WebElement DownThePage;

    @FindBy(xpath = "//*[@id=\"ar-milestone\"]/div[2]/div[3]/div/div[1]")
    private WebElement Inception;

    @FindBy(xpath = "//*[@id=\"ar-milestone\"]/div[2]/div[3]/div/div[2]")
    private WebElement Intuition;

    @FindBy(xpath = "//*[@id=\"ar-milestone\"]/div[2]/div[3]/div/div[3]")
    private WebElement Vision;

    @FindBy(xpath = "//*[@id=\"ar-milestone\"]/div[2]/div[3]/div/div[4]")
    private WebElement Immersion;

    @FindBy(xpath = "//*[@id=\"ar-milestone\"]/div[2]/div[3]/div/div[5]")
    private WebElement Portability;

    @FindBy(xpath = "//*[@id=\"ar-milestone\"]/div[2]/div[3]/div/div[6]")
    private WebElement Power;

    @FindBy(xpath = "//*[@id=\"ar-milestone\"]/div[2]/div[3]/div/div[7]")
    private WebElement Precision;

    @FindBy(xpath = "//*[@id=\"ar-milestone\"]/div[2]/div[3]/div/div[8]")
    private WebElement Ecosystem;

    @FindBy(css = "#ar-mission > div > div > div.text-wrapper > div > p")
    private WebElement OurMission;


    public void AboutRogDownPage(WebDriver driver) {
        clickCookiesAcceptBtn();
        String ROGPage = driver.getWindowHandle();
        System.out.println("ParentWindow  - " + ROGPage);
        waitFor(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", AboutROGBtn);
        waitFor(2);
        click(AboutROGBtn);
        Set<String> AboutHandle = driver.getWindowHandles();
        for (String AboutPage : AboutHandle) {
            System.out.println("AboutPage  :" + AboutPage);
            if (!AboutPage.equals(ROGPage)) {
                driver.switchTo().window(AboutPage);
                waitFor(2);
                Assert.assertEquals(getElementText(OurMission), "Unite gamers of diverse backgrounds to achieve their potential together in play." +
                        " Through innovative technology and exceptional experiences, we can push boundaries to create a world without limits.");
                js.executeScript("arguments[0].scrollIntoView(true);", DownThePage);
                waitFor(2);
                click(Inception);
                waitFor(1);
                click(Intuition);
                waitFor(1);
                click(Vision);
                waitFor(1);
                click(Immersion);
                waitFor(1);
                click(Portability);
                waitFor(1);
                click(Power);
                waitFor(1);
                click(Precision);
                waitFor(1);
                click(Ecosystem);
                waitFor(1);

            }
        }
    }


    @FindBy(css = "#rogProduct > div > div > div > div.Header__headerWrapper__2jH8a.Header__upscrolled__B00tj > div.Header__headerContainer__1hIKH > header > nav > div > ul.Header__headerMenuList__3_iXV > li:nth-child(7) > a")
    private WebElement ClickOnPBA;





    public void AccessToPowered(){
        clickCookiesAcceptBtn();
        click(ClickOnPBA);

    }
    @FindBy(css = "#rogProduct > div > div > div > div.Header__headerWrapper__2jH8a.Header__upscrolled__B00tj > div.Header__headerContainer__1hIKH > header > nav > div > ul.Header__headerMenuList__3_iXV > li:nth-child(6)")
    private WebElement SupportBtn;

    public void Support(){
        clickCookiesAcceptBtn();
        click(SupportBtn);

    }

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/main/div[1]/a[1]")
    private WebElement toGo;
    @FindBy(css = "#flow_z13 > div.width-half.content > h2")
    private WebElement toView;

    public void TheList(WebDriver driver){
        click(toGo);
        waitFor(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", toView);
        waitFor(2);
        List<WebElement> TheList = driver.findElements(By.xpath("//*[@class='nav']"));
        for(int i = 0; i< TheList.size(); i++) {
            TheList.get(i).click();
            LOG.info(String.valueOf(TheList));
            waitFor(2);
        }


    }
    @FindBy(css = "#rogProduct > div:nth-child(2) > div > div > div > div > form > div.LoginPage__loginErrorMsg__3osO5")
    private WebElement Wrong;

    public void ToLogIn(){
        clickCookiesAcceptBtn();
        waitFor(2);
        waitFor(2);
        clickLogInBtn();
        clickLogInFromDropDown();
        waitFor(2);
    }
    public String getTextwrong() {
        return getElementText(Wrong);
    }


    @FindBy(css = "#rogProduct > div > div > div > div.Header__headerWrapper__2jH8a.Header__upscrolled__B00tj > div.Header__headerContainer__1hIKH > header > div.Header__iconBlock__339d9 > div.headerPersonalBlock__personalWrapper__28wGT > ul > li:nth-child(2) > ul > li:nth-child(2) > a")
    private WebElement SettingBtn;

    public void SettingAccess(){
        clickLogInBtn();
        click(SettingBtn);
        waitFor(2);

    }

    @FindBy(css = "button[aria-label='Learn more about Slide 2 - ROG Flow X16']")
    private WebElement ClickOnRedLine;

    @FindBy(css = " #rogContent1 > div > picture > img")
    private WebElement ClickOnX16;

    @FindBy(css = "#rogProduct > div > div > div > footer > div > div:nth-child(1) > div > div > a > svg")
    private WebElement scrolltoit;
    public void RogLow(WebDriver driver){
        clickCookiesAcceptBtn();
        click(ClickOnRedLine);
        click(ClickOnX16);
        waitFor(1);
        for(int i=0;i<12000;i++) {
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,5)", "scrolltoit");




//            Point point = scrolltoit.getLocation();
//            int xcord = point.getX();
//            System.out.println("Position of the webelement from left side is "+xcord +" pixels");
//            int ycord = point.getY();
//            System.out.println("Position of the webelement from top side is "+ycord +" pixels");
        }
    }
}
