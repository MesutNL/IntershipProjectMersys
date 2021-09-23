package pages;

import utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LeftNav extends Parent {


    public LeftNav() {
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }


    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupButtonInCountry;

    @FindBy(xpath = "(//span[text()='Parameters'])[1]")
    private WebElement parametersButton;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    private WebElement countriesButton;

    @FindBy(xpath = "//span[text()='Cities']")
    private WebElement citiesButton;

    @FindBy(xpath = "//span[text()='Education']")
    private WebElement education;

    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    private WebElement setupButtonInEducation;

    @FindBy(xpath = "//span[text()='Subject Categories']")
    private WebElement subjectCategories;

    @FindBy(css = "a[href='/subjects/list']")
    private WebElement subjects;

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResources;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement setupButtonInHumanResources;

    @FindBy(xpath = "//span[text()='Salary Modifiers']")
    private WebElement salaryModifiers;

    @FindBy(xpath = "//span[text()='Salary Constants']")
    private WebElement salaryConstants;

    @FindBy(css = "div[role='listbox']>mat-option")
    private List<WebElement> selectOption;

    @FindBy(xpath = "(//span[text()='Positions'])[1]")
    private WebElement positionsButton;

    @FindBy(xpath = "(//span[text()='Reports'])[4]")
    private WebElement reportsButton;

    @FindBy(xpath = "(//span[text()='Setup'])[7]")
    private WebElement reportsSetupButton;

    @FindBy(xpath = "//span[text()='Excel Template']")
    private WebElement excelTemplateButton;

    @FindBy(xpath = "(//span[text()='Salary Types'])[1]")
    private WebElement salaryTypesButton;

    @FindBy(xpath = "(//span[text()='Position Salary'])[1]")
    private WebElement positionSalary;

    @FindBy(xpath = "// span[text()='Budget']")
    private  WebElement Budget;

    @FindBy(xpath = "(//span[text()='Setup'])[6]")
    private WebElement setupButtonInBudget;

    @FindBy(xpath = "(// span[text()='Budget Groups'])[1]")
    private WebElement budgetGroups;

    @FindBy(xpath ="(//span[text()='Cost Centers'])[1]" )
    private WebElement costCenters;

    public WebElement getSetupButtonInCountry() {
        return setupButtonInCountry;
    }

    public WebElement getParametersButton() {
        return parametersButton;
    }

    public WebElement getCountriesButton() {
        return countriesButton;
    }

    public WebElement getCitiesButton() {
        return citiesButton;
    }

    public WebElement getEducation() {
        return education;
    }

    public WebElement getSetupButtonInEducation() {
        return setupButtonInEducation;
    }

    public WebElement getSubjectCategories() {
        return subjectCategories;
    }

    public WebElement getSubjects() {
        return subjects;
    }

    public WebElement getHumanResources() {
        return humanResources;
    }

    public WebElement getSetupButtonInHumanResources() {
        return setupButtonInHumanResources;
    }

    public WebElement getSalaryModifiers() {
        return salaryModifiers;
    }

    public WebElement getSalaryConstants() {
        return salaryConstants;
    }

    public List<WebElement> getSelectOption() {
        return selectOption;
    }

    public WebElement getPositionsButton() {
        return positionsButton;
    }

    public WebElement getReportsButton() {
        return reportsButton;
    }

    public WebElement getReportsSetupButton() {
        return reportsSetupButton;
    }

    public WebElement getExcelTemplateButton() {
        return excelTemplateButton;
    }

    public WebElement getSalaryTypesButton() {
        return salaryTypesButton;
    }

    public WebElement getPositionSalary() {
        return positionSalary;
    }

    public WebElement getBudget() {
        return Budget;
    }

    public WebElement getSetupButtonInBudget() {
        return setupButtonInBudget;
    }

    public WebElement getBudgetGroups() {
        return budgetGroups;
    }

    public WebElement getCostCenters() {
        return costCenters;
    }
}
