package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.homePageObject;

public class StepCreateNewCustomer {

    pageObject.homePageObject homePageObject;

    @Then("^I verify log in successful$")
    public void iVerifyLogInSuccessful() {
        homePageObject.homePageIsDisplayed();
    }

    @When("I click {string} subtab")
    public void iClickSubtab(String arg0) {
        
    }

    @And("I input all information")
    public void iInputAllInformation() {
        
    }

    @And("I click Submit button")
    public void iClickSubmitButton() {
        
    }

    @Then("I verify customer created successful")
    public void iVerifyCustomerCreatedSuccessful() {
        
    }

    @And("I input {string} and {string} as {string}")
    public void iInputAndAs(String arg0, String arg1, String arg2) {
        
    }

    @Then("I verify account generated successfully")
    public void iVerifyAccountGeneratedSuccessfully() {
    }
}
