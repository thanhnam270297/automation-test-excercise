package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.loginPageObject;

public class StepLogin {

    loginPageObject loginPageObject;

    @Given("The login page of BankGuru has been loaded")
    public void theLoginPageOfBankGuruHasBeenLoaded() {
        loginPageObject.openURL("https://demo.guru99.com/v4/");
    }

    @Then("I verify login page is displayed")
    public void iVerifyLoginPageIsDisplayed() {
        loginPageObject.loginPageIsDisplayed();
    }

    @When("I input UserID as {string} and Password as {string}")
    public void inputUserIdAndPassword(String arg0, String arg1) {
        loginPageObject.inputUserId(arg0);
        loginPageObject.inputUserPw(arg1);
    }

    @And("I click LOGIN button")
    public void clickToLoginButton() {
        loginPageObject.clickToLoginButton();
    }
}
