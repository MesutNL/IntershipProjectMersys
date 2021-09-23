package stepDefinitions;

import cucumber.api.java.en.And;
import pages.DialogContent;
import pages.FormContent;
import pages.LeftNav;

public class PositionsCreateAndEditAndDelete {

    private final LeftNav leftNav;
    private final DialogContent dialogContent;

    public PositionsCreateAndEditAndDelete(LeftNav leftNav, DialogContent dialogContent) {
        this.leftNav = leftNav;
        this.dialogContent = dialogContent;
    }

    @And("^Enter a name \"([^\"]*)\" and a shortname \"([^\"]*)\"$")
    public void enterANameAndAShortname(String name, String shortName)  {
        dialogContent.findAndSend(dialogContent.getNameInput(),name);
        dialogContent.findAndSend(dialogContent.getShortName(),shortName);

    }

    @And("^Enter a new name \"([^\"]*)\" and a new shortname \"([^\"]*)\"$")
    public void enterANewNameAndANewShortname(String newName, String newShortName) {
        dialogContent.findAndSend(dialogContent.getNameInput(),newName);
        dialogContent.findAndSend(dialogContent.getShortName(),newShortName);
    }

    @And("^Enter  Positions Name as \"([^\"]*)\" to Search$")
    public void enterPositionsNameAsToSearch(String SearchName) {
        dialogContent.findAndSend(dialogContent.getPositionsSearchname(),SearchName);
    }

    @And("^Click to Positions Button$")
    public void clickToPositionsButton() {
        leftNav.findAndClick(leftNav.getPositionsButton());
    }
}
