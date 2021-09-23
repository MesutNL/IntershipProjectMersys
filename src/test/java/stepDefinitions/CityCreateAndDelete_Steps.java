package stepDefinitions;

import pages.LeftNav;
import pages.Parent;
import cucumber.api.java.en.And;

public class CityCreateAndDelete_Steps extends Parent {


    private final LeftNav leftNav;

    public CityCreateAndDelete_Steps(LeftNav leftNav) {
        this.leftNav = leftNav;
    }


    @And("^Click to Cities Button$")
    public void clickToCitiesButton() {
        leftNav.findAndClick(leftNav.getCitiesButton());

    }
}
