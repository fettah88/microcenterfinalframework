package Abdessalam.ROG;

import AmgharPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class AsusLogoROGLogo extends CommonAPI {
    @Test
    public void Logos(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());
        RepublicOfGamers.Logos(getDriver());
    }
}
