package pages;

import utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends Parent {


    public DialogContent() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }


    @FindBy(xpath = "//ms-table-toolbar//ms-add-button[contains(@class, 'ng-star-inserted')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "(//ms-text-field[contains(@id,'ms-text-field')]//input)[1]")
    private WebElement searchNameInput;

    @FindBy(xpath = "//span[contains(text(),'Search')]")
    private WebElement searchButton;

    @FindBy(xpath = "(//ms-text-field[contains(@id,'ms-text-field')]//input)[2]")
    private WebElement searchCodeInput;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogButton;

    @FindBy(xpath = "(//mat-select[@role='combobox'])[3]")
    private WebElement selectAddClick;

    @FindBy(xpath = "(//mat-select[@role='combobox'])[1]")
    private WebElement selectSearchClick;

    @FindBy(css = "div[role='listbox']>mat-option")
    private List<WebElement> selectOption;

    @FindBy(xpath = "(//div[@aria-live='polite'])[2]/div[2]")
    private WebElement ItemCantDeleteMessage;

    @FindBy(xpath = "//mat-form-field//input[@data-placeholder='Description']")
    private WebElement searchDescriptionInput;

    @FindBy(xpath = "//mat-form-field//input[@data-placeholder='Variable']")
    private WebElement searchVariableInput;

    @FindBy(xpath = "//ms-edit-button//button")
    private WebElement editButton;

    @FindBy(xpath = "//mat-toolbar/div/div[1]/div[2]")
    private WebElement backButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortName;

    @FindBy(xpath = "//mat-form-field//ms-text-field//input[1]")
    private WebElement positionsSearchname;

    @FindBy(xpath = "//mat-chip-list//input")
    private WebElement salaryTypesUserTypeClick;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='title']//input")
    private WebElement newPositionSalaryAddName;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.DESCRIPTION']/input")
    private WebElement descriptionBudgetGroupsSearch;

    @FindBy(xpath = "(//mat-select[@role='combobox']/div)[1]")
    private WebElement statusBudgetGroupClickSearch;

    @FindBy(xpath = "//tbody[@class='mat-calendar-body']/tr/td")
    private List<WebElement> selectDateBudgetGroups;



    public WebElement getAddButton() {
        return addButton;
    }

    public WebElement getNameInput() {
        return nameInput;
    }

    public WebElement getCodeInput() {
        return codeInput;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    public WebElement getSearchNameInput() {
        return searchNameInput;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getSearchCodeInput() {
        return searchCodeInput;
    }

    public WebElement getDeleteButton() {
        return deleteButton;
    }

    public WebElement getDeleteDialogButton() {
        return deleteDialogButton;
    }

    public List<WebElement> getSelectOption() {
        return selectOption;
    }

    public WebElement getItemCantDeleteMessage() {
        return ItemCantDeleteMessage;
    }

    public WebElement getSelectAddClick() {
        return selectAddClick;
    }

    public WebElement getSearchDescriptionInput() {
        return searchDescriptionInput;
    }

    public WebElement getSearchVariableInput() {
        return searchVariableInput;
    }

    public WebElement getEditButton() {
        return editButton;
    }

    public WebElement getSelectSearchClick() {    return selectSearchClick;    }

    public WebElement getBackButton() {
        return backButton;
    }

    public WebElement getShortName() {
        return shortName;
    }

    public WebElement getPositionsSearchname() {
        return positionsSearchname;
    }

    public WebElement getSalaryTypesUserTypeClick() {
        return salaryTypesUserTypeClick;
    }

    public WebElement getNewPositionSalaryAddName() {
        return newPositionSalaryAddName;
    }

    public WebElement getDescriptionBudgetGroupsSearch() {
        return descriptionBudgetGroupsSearch;
    }

    public WebElement getStatusBudgetGroupClickSearch() {
        return statusBudgetGroupClickSearch;
    }

    public List<WebElement> getSelectDateBudgetGroups() {
        return selectDateBudgetGroups;
    }
}
