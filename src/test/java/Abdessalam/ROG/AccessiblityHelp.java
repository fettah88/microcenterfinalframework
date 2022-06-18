package Abdessalam.ROG;

import AmgharPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class AccessiblityHelp extends CommonAPI {


    @Test
    public void Accessible(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());

        RepublicOfGamers.Accessibility(getDriver());

    }
}
