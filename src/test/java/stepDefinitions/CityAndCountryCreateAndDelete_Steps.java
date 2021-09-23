package stepDefinitions;
import pages.DialogContent;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class CityAndCountryCreateAndDelete_Steps {


    private final DialogContent dialogContent;

    public CityAndCountryCreateAndDelete_Steps(DialogContent dialogContent) {
        this.dialogContent = dialogContent;
    }

    @And("^Select a Country as \"([^\"]*)\" to Add$")
    public void selectACountryAsToAdd(String name) {
        dialogContent.findAndClick(dialogContent.getSelectAddClick());
        dialogContent.listSelectOption(dialogContent.getSelectOption(),name);

    }

    @Then("^Item Can't delete message should be displayed$")
    public void itemCanTDeleteMessageShouldBeDisplayed() {
        dialogContent.verifyContainsText(dialogContent.getItemCantDeleteMessage(),"can't");

    }

    @And("^Select a Country as \"([^\"]*)\" to Search$")
    public void selectACountryAsToSearch(String name)  {
        dialogContent.findAndClick(dialogContent.getSelectSearchClick());
        dialogContent.listSelectOption(dialogContent.getSelectOption(),name);

    }
}
