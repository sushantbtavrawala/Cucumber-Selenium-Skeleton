package StepsDefination.UatTaskPage;

import AutomationTasks.loginToApplication;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginSteps {

    @Given("^I am on the webpage$")
    public void i_am_on_the_webpage() throws Throwable {
        loginToApplication.get_URL();
    }

    @When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_and(String username, String password) throws Throwable {
        loginToApplication.enter_Username(username);
        loginToApplication.enter_password(password);
        loginToApplication.continue_Button();
    }

    @Then("^I am on the homepage$")
    public void i_am_on_the_homepage() throws Throwable {

    }

}
