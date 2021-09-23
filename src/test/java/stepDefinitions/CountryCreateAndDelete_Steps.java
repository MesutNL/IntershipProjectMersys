package stepDefinitions;
import pages.DialogContent;
import pages.LeftNav;
import pages.Parent;
import cucumber.api.java.en.*;

public class CountryCreateAndDelete_Steps extends Parent {


 private final DialogContent dialogContent;
 private final LeftNav leftNav;

   public CountryCreateAndDelete_Steps(DialogContent dialogContent, LeftNav leftNav) {
      this.dialogContent = dialogContent;
      this.leftNav = leftNav;
   }


   @When("^Click to Setup button$")
    public void click_to_Setup_button()  {
   leftNav.findAndClick(leftNav.getSetupButtonInCountry());
    }

    @When("^Click to Parameters Button$")
    public void click_to_Parameters_Button() {
      leftNav.findAndClick(leftNav.getParametersButton());

    }

    @When("^Click to Countries Button$")
    public void click_to_Countries_Button()  {
       leftNav.findAndClick(leftNav.getCountriesButton());

    }

    @When("^Click to Add Button$")
    public void click_to_Add_Button() {
      dialogContent.findAndClick(dialogContent.getAddButton());

    }

    @When("^Enter Name as \"([^\"]*)\" to Add$")
    public void enter_Name_as_to_Add(String name){
      dialogContent.findAndSend(dialogContent.getNameInput(), name);

    }

    @When("^Enter Code as \"([^\"]*)\" to Add$")
    public void enter_Code_as_to_Add(String code)  {
       dialogContent.findAndSend(dialogContent.getCodeInput(), code);
    }

    @When("^Click to Save Button$")
    public void click_to_Save_Button()  {
      dialogContent.findAndClick(dialogContent.getSaveButton());

    }

    @Then("^Success message should be displayed$")
    public void success_message_should_be_displayed()  {
      dialogContent.verifyContainsText(dialogContent.getSuccessMessage(), "success");

    }

    @Then("^Enter Name as \"([^\"]*)\" to Search$")
    public void enter_Name_as_to_Search(String name) {
      dialogContent.findAndSend(dialogContent.getSearchNameInput(), name);

    }

    @Then("^Enter Code as \"([^\"]*)\" to Search$")
    public void enter_Code_as_to_Search(String code) {
       dialogContent.findAndSend(dialogContent.getSearchCodeInput(), code);
    }

    @Then("^Click to Search Button$")
    public void click_to_Search_Button()  {
dialogContent.findAndClick(dialogContent.getSearchButton());
    }

    @When("^Click to Delete Button$")
    public void click_to_Delete_Button()  {
      dialogContent.findAndDelete(dialogContent.getDeleteButton(), dialogContent.getDeleteDialogButton());

    }

}
