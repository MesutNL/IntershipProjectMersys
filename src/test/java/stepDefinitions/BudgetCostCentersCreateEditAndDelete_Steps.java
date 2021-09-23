package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.DialogContent;
import pages.FormContent;
import pages.LeftNav;

public class BudgetCostCentersCreateEditAndDelete_Steps {


    private final LeftNav leftNav;
    private final FormContent formContent;
    private final DialogContent dialogContent;

    public BudgetCostCentersCreateEditAndDelete_Steps
            (LeftNav leftNav, FormContent formContent, DialogContent dialogContent) {
        this.leftNav = leftNav;
        this.formContent = formContent;
        this.dialogContent = dialogContent;
    }

    @And("^Click Cost Centers$")
    public void clickCostCenters() {
        leftNav.findAndClick(leftNav.getCostCenters());
    }

    @Then("^Select \"([^\"]*)\" as type to Add$")
    public void select_as_type_to_Add(String type) {
        formContent.findAndClick(formContent.getTypeinCostCenterClick());
        formContent.listSelectOption(formContent.getTypeSeleckoptionInCostCenter(), type);
    }

    @Then("^Enter \"([^\"]*)\" as Expense Account Code Prefixes to Add$")
    public void enter_as_Expense_Account_Code_Prefixes_to_Add(String text) {
        formContent.findAndClick(formContent.getExpenseAccountCodeInCostCenter());
        formContent.findAndSend(formContent.getExpenseAccountCodeInCostCenter(), text);
    }

    @And("^Enter \"([^\"]*)\" as Name to Add$")
    public void enterAsNameToAdd(String text) {
        dialogContent.findAndSend(dialogContent.getNameInput(), text);
    }

    @And("^Click to Edit Button in Cost Center$")
    public void clickToEditButtonInCostCenter() {
        dialogContent.findAndClick(dialogContent.getEditButton());
    }

    @And("^Click to Delete Button in Cost Center$")
    public void clickToDeleteButtonInCostCenter() {
        dialogContent.findAndClick(dialogContent.getDeleteButton());
        dialogContent.findAndClick(dialogContent.getDeleteDialogButton());

    }

}
