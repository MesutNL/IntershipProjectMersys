package stepDefinitions;

import cucumber.api.java.en.And;
import pages.FormContent;
import pages.LeftNav;

public class SalaryConstantsEditAndDelete_Steps {
    private final LeftNav leftNav;
    private final FormContent formContent;


    public SalaryConstantsEditAndDelete_Steps(LeftNav leftNav,
                                              FormContent formContent) {
        this.leftNav = leftNav;
        this.formContent = formContent;

    }


    @And("^Click to Salary Constants Button$")
    public void clickToSalaryConstantsButton() {
        leftNav.findAndClick(leftNav.getSalaryConstants());
    }

    @And("^Enter Salary Constant Name as \"([^\"]*)\" to Add$")
    public void enterSalaryConstantNameAsToAdd(String name) {
        formContent.findAndSend(formContent.getFormNameInput(),name);

    }

    @And("^Add a Random Date$")
    public void addARandomDate() {
        formContent.findAndClick(formContent.getDateClick());
        formContent.randomClick(formContent.getCalendar());
    }

    @And("^Enter Key as \"([^\"]*)\" to Add$")
    public void enterKeyAsToAdd(String key)  {
        formContent.findAndSend(formContent.getFormKeyInput(),key);

    }

    @And("^Enter Value as \"([^\"]*)\" to Add$")
    public void enterValueAsToAdd(String value)  {
        formContent.findAndSend(formContent.getFormValueInput(),value);
    }

    @And("^Enter Salary Constant Name as \"([^\"]*)\" to Search$")
    public void enterSalaryConstantNameAsToSearch(String name) {
        formContent.findAndSend(formContent.getFormNameSearch(),name);
    }

    @And("^Enter Key as \"([^\"]*)\" to Search$")
    public void enterKeyAsToSearch(String key)  {
        formContent.findAndSend(formContent.getFormKeySearch(),key);

    }
}

