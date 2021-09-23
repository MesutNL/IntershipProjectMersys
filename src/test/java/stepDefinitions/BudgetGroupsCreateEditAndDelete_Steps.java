package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.DialogContent;
import pages.FormContent;
import pages.LeftNav;

public class BudgetGroupsCreateEditAndDelete_Steps {

    private final LeftNav leftNav;
    private final FormContent formContent;
    private final DialogContent dialogContent;

    public BudgetGroupsCreateEditAndDelete_Steps(LeftNav leftNav, FormContent formContent, DialogContent dialogContent) {
        this.leftNav = leftNav;
        this.formContent = formContent;
        this.dialogContent = dialogContent;
    }


    @Then("^Click to Budget$")
    public void click_to_Budget() {
        leftNav.findAndClick(leftNav.getBudget());
    }

    @Then("^Click to Setup under Budget$")
    public void click_to_Setup_under_Budget() {
        leftNav.findAndClick(leftNav.getSetupButtonInBudget());
    }

    @Then("^Click to Budget Groups$")
    public void click_to_Budget_Groups() {
        leftNav.findAndClick(leftNav.getBudgetGroups());
    }

    @Then("^Enter \"([^\"]*)\" as Description to Add$")
    public void enter_as_Description_to_Add(String text) {
        formContent.findAndSend(formContent.getDescriptionInBudgetGroupAdd(), text);
    }

    @Then("^Select Status as \"([^\"]*)\" to  Add$")
    public void select_Status_as_to_Add(String status) {
        formContent.findAndClick(formContent.getStatusClick());
        formContent.listSelectOption(formContent.getSelectOptionStatus(), status);
    }


    @And("^Enter Description on Budget Groups as \"([^\"]*)\" to Search$")
    public void enterDescriptionOnBudgetGroupsAsToSearch(String text) {
        dialogContent.findAndSend(dialogContent.getDescriptionBudgetGroupsSearch(), text);
    }

    @And("^Select Status as \"([^\"]*)\" to Search$")
    public void selectStatusAsToSearch(String status) {
        dialogContent.findAndClick(dialogContent.getStatusBudgetGroupClickSearch());
        formContent.listSelectOption(formContent.getSelectOptionStatus(), status);
    }

    @And("^Select a Start Date as \"([^\"]*)\" and End Date as \"([^\"]*)\" to Add$")
    public void selectAStartDateAsAndEndDateAsToAdd(String startDate, String endDate) {
        formContent.findAndClick(formContent.getStartDateInBudget());
        dialogContent.listSelectOption(dialogContent.getSelectDateBudgetGroups(), startDate);
        formContent.findAndClick(formContent.getEndDateInBudget());
        dialogContent.listSelectOption(dialogContent.getSelectDateBudgetGroups(), endDate);

    }
}
