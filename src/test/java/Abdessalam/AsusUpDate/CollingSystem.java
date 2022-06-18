package Abdessalam.AsusUpDate;

import AmgharPages.AsusHomePage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CollingSystem extends CommonAPI {
    @Test
    public void ColS(){
        AsusHomePage AsusHomePage = new AsusHomePage(getDriver());
        Assert.assertEquals(getPageTitle(),"ASUS USA");
        AsusHomePage.clickCookiesBtn();
        waitFor(1);
//        AsusHomePage.hoverOverMenuLaptop(getDriver());

        AsusHomePage.hoverOverMotherBoardsAndComponentsMenu(getDriver());
        waitFor(1);
        AsusHomePage.hoverOverCoolingFromMenu(getDriver());
        waitFor(2);
        AsusHomePage.ClickOnAllSeriesFronCooling();



//        click("#cookie-policy-info > div > div.cookie-btn-box > div.btn-asus.btn-ok.btn-read-ck");
//
//        hoverOver("#wrapperDesktop > div.HeaderDesktop__headerLayerTwo__356nX > div > div.HeaderDesktop__navContainer__2TkWh > nav > div:nth-child(12)");
//        waitFor(1);
//        hoverOver("#dropDownMenu > div > div.HeaderLevelOneDropDownMenu__innerWrapper__IrKxh > ul.HeaderLevelOneDropDownMenu__menuColumn__17p1m.HeaderLevelOneDropDownMenu__productLevelTwo__pPSIj > li.HeaderLevelOneDropDownMenu__productLevelItemSelect__2VFHX.menuPDLevelTwo");
//        waitFor(1);
//        click("#wrapperDesktop > div.HeaderDesktop__headerLayerTwo__356nX > div > div.HeaderDesktop__navContainer__2TkWh > nav > div:nth-child(14) > div > div.HeaderLevelOneDropDownMenu__innerWrapper__IrKxh > ul:nth-child(2) > li:nth-child(2) > a > div");


    }
}
