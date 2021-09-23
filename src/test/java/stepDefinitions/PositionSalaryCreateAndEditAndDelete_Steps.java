package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pages.DialogContent;
import pages.FormContent;
import pages.LeftNav;
import pages.Parent;

public class PositionSalaryCreateAndEditAndDelete_Steps {
    private final LeftNav leftNav;

    private final DialogContent dialogContent;
    private final FormContent formContent;

    public PositionSalaryCreateAndEditAndDelete_Steps(LeftNav leftNav, DialogContent dialogContent, FormContent formContent) {
        this.leftNav = leftNav;
        this.dialogContent = dialogContent;
        this.formContent = formContent;
    }

    @And("^Click to Position Salary Button$")
    public void clickToPositionSalaryButton() {
        leftNav.findAndClick(leftNav.getPositionSalary());
    }

    @And("^Enter New Position Name as \"([^\"]*)\" to Add$")
    public void enterNewPositionNameAsToAdd(String name) {
        dialogContent.findAndSend(dialogContent.getNewPositionSalaryAddName(),name);
    }

    @And("^Enter New Position Name as \"([^\"]*)\" to Search$")
    public void enterNewPositionNameAsToSearch(String searchName)  {
        formContent.findAndSend(formContent.getNewPositionSalarySearchName(),searchName);
    }



    @And("^Enter a Experience Range \"([^\"]*)\"$")
    public void enterAExperienceRange(String experienceRange)  {
        formContent.findAndSend(formContent.getExperienceRange(),experienceRange);
    }

    @And("^Enter to Date From$")
    public void enterToDateFrom() {
        formContent.findAndClick(formContent.getDateClick());
        formContent.randomClick(formContent.getCalendar());
    }

    @And("^Enter to Salary \"([^\"]*)\"$")
    public void enterToSalary(String salary)  {
        formContent.findAndSend(formContent.getEnterSalary(),salary);

    }

    @And("^Click to Add of Salary History button$")
    public void clickToAddOfSalaryHistoryButton() {
        formContent.findAndClick(formContent.getSalaryPositionAdd());
    }

    @And("^Click to Specific Position Salary Button$")
    public void clickToSpecificPositionSalaryButton() {
        Parent.waiting(3);
        formContent.findAndClick(formContent.getPositionSalary());
    }

    @And("^Click to Position Salary Add Button$")
    public void clickToPositionSalaryAddButton() {
        formContent.findAndClick(formContent.getPositionSalaryAddPlus());
    }


    @And("^Click to Edit  Button$")
    public void clickToEditButton() {
        dialogContent.findAndClick(dialogContent.getEditButton());
    }

    @And("^Enter A New Position Name \"([^\"]*)\"$")
    public void enterANewPositionName(String newName)  {
        dialogContent.findAndSend(dialogContent.getNewPositionSalaryAddName(),newName);
    }

    @And("^Back To Position Salary$")
    public void backToPositionSalary() {
        dialogContent.findAndClick(dialogContent.getBackButton());
    }
}
