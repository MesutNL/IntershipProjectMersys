package stepDefinitions;

import cucumber.api.java.en.And;
import pages.DialogContent;
import pages.FormContent;
import pages.LeftNav;

public class ExcelTemplateCreateAndEditAndDelete_Steps {
    private final LeftNav leftNav;

    private final DialogContent dialogContent;
    private final FormContent formContent;

    public ExcelTemplateCreateAndEditAndDelete_Steps(LeftNav leftNav, DialogContent dialogContent, FormContent formContent) {
        this.leftNav = leftNav;
        this.dialogContent = dialogContent;
        this.formContent = formContent;
    }

    @And("^Click to Reports$")
    public void clickToReports() {
        leftNav.findAndClick(leftNav.getReportsButton());

    }

    @And("^Click to Setup of Reports$")
    public void clickToSetupOfReports() {
        leftNav.findAndClick(leftNav.getReportsSetupButton());
    }

    @And("^Click to Excel Template$")
    public void clickToExcelTemplate() {
        leftNav.findAndClick(leftNav.getExcelTemplateButton());
    }

    @And("^Enter a Name of New Budget Excel Template \"([^\"]*)\"$")
    public void enterANameOfNewBudgetExcelTemplate(String name)  {
        dialogContent.findAndSend(dialogContent.getNameInput(),name);
    }

    @And("^Enter Period Count of New Budget Excel Template \"([^\"]*)\"$")
    public void enterPeriodCountOfNewBudgetExcelTemplate(String periodCount)  {
        formContent.findAndSend(formContent.getPeriodCount(),periodCount);
    }

    @And("^Enter a Row Size \"([^\"]*)\"$")
    public void enterARowSize(String rowSize)  {
        formContent.findAndSend(formContent.getRowSize(),rowSize);
    }

    @And("^Enter a Column Size \"([^\"]*)\"$")
    public void enterAColumnSize(String columnSize) {
        formContent.findAndSend(formContent.getColumnSize(),columnSize);
    }

    @And("^Click to Add Version$")
    public void clickToAddVersion() {
        formContent.findAndClick(formContent.getAddVersionButton());
    }

    @And("^Enter of Budget Excel Template  as \"([^\"]*)\" to Search$")
    public void enterOfBudgetExcelTemplateAsToSearch(String searchName) throws Throwable {
        formContent.findAndSend(formContent.getNewPositionSalarySearchName(),searchName);
    }

    @And("^Edit a oldName as new name \"([^\"]*)\"$")
    public void editAOldNameAsNewName(String newName) throws Throwable {
        dialogContent.findAndSend(dialogContent.getNameInput(),newName);
    }
}
