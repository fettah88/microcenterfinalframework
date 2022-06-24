package microcenter;
import base.CommonAPI;
import microCenterPages.CareersPage;
import microCenterPages.HomePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScrollDownToCareersTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(ScrollDownToCareersTest.class);

    @Test
    public void TrainingBtnTest(){
        HomePage homePage = new HomePage(getDriver());
        CareersPage careersPage = new CareersPage(getDriver());
        homePage.scrollToViewCareers(getDriver());
        homePage.clickOncareerBtn();
        careersPage.clickOnCareerPath();
        String expectedPageTitle = "Career Opportunities | Micro Center";
        Assert.assertEquals(getPageTitle(), expectedPageTitle);
    }
    @Test
    public void OurHistoryBtnTest(){
        HomePage homePage = new HomePage(getDriver());
        CareersPage careersPage = new CareersPage(getDriver());
        homePage.scrollToViewCareers(getDriver());
        homePage.clickOncareerBtn();
        careersPage.clickOnHiring();
        String expectedPageTitle = "Career Opportunities | Micro Center";
        Assert.assertEquals(getPageTitle(), expectedPageTitle);
    }
    @Test
    public void CareerPathBtnTest(){
        HomePage homePage = new HomePage(getDriver());
        CareersPage careersPage = new CareersPage(getDriver());
        homePage.scrollToViewCareers(getDriver());
        homePage.clickOncareerBtn();
        careersPage.clickOnCareerPath();
        String expectedPageTitle = "Career Opportunities | Micro Center";
        Assert.assertEquals(getPageTitle(), expectedPageTitle);
    }
    @Test
    public void HiringBtnTest(){
        HomePage homePage = new HomePage(getDriver());
        CareersPage careersPage = new CareersPage(getDriver());
        homePage.scrollToViewCareers(getDriver());
        homePage.clickOncareerBtn();
        careersPage.clickOnHiring();

    }
}
