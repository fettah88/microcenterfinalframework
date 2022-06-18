package Abdessalam.AsusUpDate;

import AmgharPages.AsusHomePage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AMD_Motherboards extends CommonAPI {
    @Test
    public void AMDMotherBoard() {
        AsusHomePage AsusHomePage = new AsusHomePage(getDriver());

        AsusHomePage.clickCookiesBtn();
        Assert.assertEquals(getPageTitle(),"ASUS USA");
        waitFor(1);
        AsusHomePage.hoverOverMotherBoardsAndComponentsMenu(getDriver());
        waitFor(1);
        AsusHomePage.hoverOverMotherBoardsFromMenu(getDriver());
        waitFor(1);
        AsusHomePage.clickAMDChipsetBrandFromMenu();
        waitFor(2);
        Assert.assertEquals("AMD｜Motherboards｜ASUS USA",getPageTitle());

    }


}