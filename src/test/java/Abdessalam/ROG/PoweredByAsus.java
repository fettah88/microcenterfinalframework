package Abdessalam.ROG;

import AmgharPages.PoweredByAsusPage;
import AmgharPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class PoweredByAsus extends CommonAPI {
  //  @Test
    public void PoweredAsus(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());
        PoweredByAsusPage PBA = new PoweredByAsusPage(getDriver());

        RepublicOfGamers.AccessToPowered();
        PBA.PBA(getDriver());


    }
   // @Test
    public void PoweredAsusHover(){

        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());
        PoweredByAsusPage PBA = new PoweredByAsusPage(getDriver());

        RepublicOfGamers.AccessToPowered();
        PBA.HoverOverDownPage(getDriver());

    }


    @Test
    public void PoweredAsusBuildsClick(){

        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());
        PoweredByAsusPage PBA = new PoweredByAsusPage(getDriver());

        RepublicOfGamers.AccessToPowered();
        PBA.BuildsClick(getDriver());

    }


}
