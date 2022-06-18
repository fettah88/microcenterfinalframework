package Abdessalam.ROG;

import AmgharPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class QHDGamingMonitors extends CommonAPI {
    @Test
    public void QHD(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());

        RepublicOfGamers.QHD(getDriver());

    }
}
