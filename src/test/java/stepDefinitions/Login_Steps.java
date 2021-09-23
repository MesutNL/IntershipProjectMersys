package stepDefinitions;

import pages.LoginPage;
import utilities.BaseDriver;
import utilities.ExcelUtility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class Login_Steps {

    private final LoginPage login;

    public Login_Steps(LoginPage login) {
        this.login = login;
    }

    @Given("^Navigate to website$")
    public void navigateToWebsite() {
        WebDriver driver = BaseDriver.getDriver();
        driver.get("https://demo.mersys.io/");
        driver.manage().window().maximize();
    }

    @When("^Enter username and password$")
    public void enterUsernameAndPassword() {

        List<List<String>> list = ExcelUtility.getListData("src/test/java/Resources/Mersys_Demo.xlsx", "correctLogin", 2);

        for (int i = 0; i < list.size(); i++) {
            login.findAndSend(login.getUserName(), list.get(i).get(0));
            login.findAndSend(login.getPassword(), list.get(i).get(1));
        }
    }

    @And("^Click to login button$")
    public void clickToLoginButton() {
        login.findAndClick(login.getLoginButton());
    }

    @Then("^User should be login successfully$")
    public void userShouldBeLoginSuccessfully() {
        login.verifyContainsText(login.getDashboard(), "Dashboard");
    }

    @And("^Click to accept cookies$")
    public void clickToAcceptCookies() {
        login.findAndClick(login.getCookies());
    }

    @When("^Enter wrong username and password$")
    public void enterWrongUsernameAndPassword() {

        List<List<String>> list = ExcelUtility.getListData("src/test/java/Resources/Mersys_Demo.xlsx", "wrongLogin", 2);

        for (int i = 0; i < list.size(); i++) {
            login.findAndSend(login.getUserName(), list.get(i).get(0));
            login.findAndSend(login.getPassword(), list.get(i).get(1));
        }
    }

    @Then("^User should not be logged in and should see the error message$")
    public void userShouldNotBeLoggedInAndShouldSeeTheErrorMessage() {
        login.verifyContainsText(login.getLoginErrorMessage(), "Invalid username or password");
    }


}
