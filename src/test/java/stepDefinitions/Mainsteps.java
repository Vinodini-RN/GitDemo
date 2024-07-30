package stepDefinitions;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Mainsteps {
	
	@Given("user is on netbanking landling page")
	public void user_is_on_netbanking_landling_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user is on netbanking landling page");
	}
	
	@Then("whether home page is dispayed")
	public void whether_home_page_is_dispayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("whether home page is dispayed");
		
	}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Cards are displayed");
	}

	@When("user login into application with {string} and password {string}")
	public void user_login_into_application_with_and_password(String username, String password) {
		System.out.println(username +"application are displayed"+password);
	}

	@Given("user is on prctice landling page")
	public void user_is_on_prctice_landling_page() {
	   System.out.println("practice");
	   Assert.assertTrue(false);
	}
	@When("user signup into application")
	public void user_signup_into_application(List<String> data) {
	   System.out.println(data.get(0));
	   System.out.println(data.get(1));
	   System.out.println(data.get(2));
	   System.out.println(data.get(3));
	}
	
	@Given("setup the enteries")
	public void setup_the_enteries() {
	   System.out.println("Given background");
	}
	@When("launch the browser")
	public void launch_the_browser() {
		System.out.println("When background");
	}
	@When("hit the home page")
	public void hit_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("And background");
	}
	
}
