package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

    @Given("User enter user name and password")
    public void user_enter_user_name_and_password() {

        System.out.println("User Enters User name and password.");
    }
    @When("User click on login button")
    public void user_click_on_login_button() {
        System.out.println("User click on login button");
    }
    @Then("User should navigate to Home page")
    public void user_should_navigate_to_home_page() {
        System.out.println("User navigate to home page");
    }

}
