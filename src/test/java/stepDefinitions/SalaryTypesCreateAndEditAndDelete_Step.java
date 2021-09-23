package stepDefinitions;

import cucumber.api.java.en.And;
import pages.DialogContent;
import pages.FormContent;
import pages.LeftNav;

public class SalaryTypesCreateAndEditAndDelete_Step {

    private final LeftNav leftNav;
    private final DialogContent dialogContent;
    private final FormContent formContent;

    public SalaryTypesCreateAndEditAndDelete_Step(LeftNav leftNav, DialogContent dialogContent, FormContent formContent) {
        this.leftNav = leftNav;
        this.dialogContent = dialogContent;
        this.formContent = formContent;
    }

    @And("^Edit a new name of Salary Types \"([^\"]*)\"$")
    public void editANewNameOfSalaryTypes(String newName) {
        dialogContent.findAndSend(dialogContent.getNameInput(),newName);
    }

    @And("^Click to Salary Types button$")
    public void clickToSalaryTypesButton() {
        leftNav.findAndClick(leftNav.getSalaryTypesButton());
    }

    @And("^Enter to a Name \"([^\"]*)\"$")
    public void enterToAName(String addName)  {
        dialogContent.findAndSend(dialogContent.getNameInput(),addName);
    }

    @And("^Select to a User Type \"([^\"]*)\"$")
    public void selectToAUserType(String userType) {
        dialogContent.findAndClick(dialogContent.getSalaryTypesUserTypeClick());
        dialogContent.listSelectOption(dialogContent.getSelectOption(),userType);

    }

    @And("^Enter a  name of Salary Types \"([^\"]*)\" to Search$")
    public void enterANameOfSalaryTypesToSearch(String searchName)  {
        formContent.findAndSend(formContent.getNewPositionSalarySearchName(),searchName);
    }


}
