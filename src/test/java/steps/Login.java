package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
    @Given("User navigates to stackoverflow website")
    public void user_navigates_to_stackoverflow_website() {
        System.out.println("Method 1");
    }

    @And("User clicks on the login button on homepage")
    public void user_clicks_on_the_login_button_on_homepage() {
        System.out.println("Method 2");
    }

    @And("User enters a valid username")
    public void user_enters_a_valid_username() {
        System.out.println("Method 3");
    }

    @And("User enters a valid password")
    public void user_enters_a_valid_password() {
        System.out.println("Method 4");
    }

    @When("User clicks on the login button")
    public void user_clicks_on_the_login_button() {
        System.out.println("Method 5");
    }

    @Then("User should be taken to the successful login page")
    public void user_should_be_taken_to_the_successful_login_page() {
        System.out.println("Method 6");
    }
}
