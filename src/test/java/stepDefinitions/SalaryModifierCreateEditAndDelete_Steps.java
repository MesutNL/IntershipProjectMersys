package stepDefinitions;

import cucumber.api.java.en.And;
import pages.DialogContent;
import pages.FormContent;
import pages.LeftNav;
import pages.Parent;

public class SalaryModifierCreateEditAndDelete_Steps {
    private final LeftNav leftNav;
    private final DialogContent dialogContent;
    private final FormContent formContent;

    public SalaryModifierCreateEditAndDelete_Steps(LeftNav leftNav, DialogContent dialogContent, FormContent formContent) {
        this.leftNav = leftNav;
        this.dialogContent = dialogContent;
        this.formContent = formContent;
    }


    @And("^Click to Human Resources Button$")
    public void clickToHumanResourcesButton() {
        leftNav.findAndClick(leftNav.getHumanResources());

    }

    @And("^Click on Setup under Human Resources$")
    public void clickOnSetupUnderHumanResources() {
        leftNav.findAndClick(leftNav.getSetupButtonInHumanResources());

    }

    @And("^Click to Salary Modifiers$")
    public void clickToSalaryModifiers() {
        leftNav.findAndClick(leftNav.getSalaryModifiers());

    }

    @And("^Enter Description as \"([^\"]*)\" to Add$")
    public void enterDescriptionAsToAdd(String description)  {
        formContent.findAndSend(formContent.getAddDescriptionInput(),description);

    }

    @And("^Enter Variable as \"([^\"]*)\" to Add$")
    public void enterVariableAsToAdd(String variable) {
        formContent.findAndSend(formContent.getAddVariableInput(),variable);

    }

    @And("^Select a Modifier Type as \"([^\"]*)\" to Add$")
    public void selectAModifierTypeAsToAdd(String type) {
        formContent.findAndClick(formContent.getAddModifierTypeClick());
        dialogContent.listSelectOption(dialogContent.getSelectOption(),type);

    }

    @And("^Enter Integration Code as \"([^\"]*)\" to Add$")
    public void enterIntegrationCodeAsToAdd(String code)  {
        formContent.findAndSend(formContent.getIntegrationCodeInput(),code);

    }


    @And("^Enter Priority as \"([^\"]*)\" to Add$")
    public void enterPriorityAsToAdd(String priority) {
        formContent.findAndSend(formContent.getPriorityInput(),priority);

    }

    @And("^Enter Amount as \"([^\"]*)\" to Add$")
    public void enterAmountAsToAdd(String amount)  {
        formContent.findAndSend(formContent.getAmountInput(),amount);

    }

    @And("^Enter Description as \"([^\"]*)\" to Search$")
    public void enterDescriptionAsToSearch(String description)  {
        dialogContent.findAndSend(dialogContent.getSearchDescriptionInput(),description);

    }

    @And("^Enter Variable as \"([^\"]*)\" to Search$")
    public void enterVariableAsToSearch(String variable)  {
        dialogContent.findAndSend(dialogContent.getSearchVariableInput(),variable);

    }

    @And("^Select a Modifier Type as \"([^\"]*)\" to Search$")
    public void selectAModifierTypeAsToSearch(String type)  {
        dialogContent.findAndClick(dialogContent.getSelectSearchClick());
        dialogContent.listSelectOption(dialogContent.getSelectOption(),type);
    }

    @And("^Click to Edit Button$")
    public void clickToEditButton() {
        dialogContent.waitUntilStalenessOf();
        dialogContent.findAndClick(dialogContent.getEditButton());
    }
}


