package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import pages.DialogContent;
import pages.LeftNav;

public class SubjectCreateAndDelete_Steps {

    private  final DialogContent dialogContent;
    private final LeftNav leftNav;

    public SubjectCreateAndDelete_Steps(DialogContent dialogContent, LeftNav leftNav) {
        this.dialogContent = dialogContent;
        this.leftNav = leftNav;
    }


    @And("^Click to Subjects$")
    public void clickToSubjects() {
        leftNav.findAndClick(leftNav.getSubjects());
    }

    @And("^Select a Subject Category as \"([^\"]*)\" to Add$")
    public void selectASubjectCategoryAsToAdd(String subjectCategoryName)  {
        dialogContent.findAndClick(dialogContent.getSelectAddClick());
        dialogContent.listSelectOption(dialogContent.getSelectOption(),subjectCategoryName);

    }

    @And("^Select a Subject Categories as \"([^\"]*)\" to Search$")
    public void selectASubjectCategoriesAsToSearch(String subjectCategoryCode)  {
        dialogContent.findAndClick(dialogContent.getSelectSearchClick());
        dialogContent.listSelectOption(dialogContent.getSelectOption(),subjectCategoryCode);
    }
}
