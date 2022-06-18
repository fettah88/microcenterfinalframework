package Abdessalam.ROG;

import AmgharPages.PoweredByAsusPage;
import AmgharPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class SortbyCustomizeYourBuild extends CommonAPI {
    @Test
    public void StorBy(){
        RepublicOfGamersHomePage ROG = new RepublicOfGamersHomePage(getDriver());
        PoweredByAsusPage PBA = new PoweredByAsusPage(getDriver());

        ROG.AccessToPowered();
        PBA.StorByCYB();


    }
}
