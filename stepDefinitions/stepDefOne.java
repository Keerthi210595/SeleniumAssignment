package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefOne {
		
	@Given("user is in login page")
	public void user_is_in_login_page() {
		   System.out.println("Step1 passed");
		}
	
	@When("user enter username as demosalesmanager")
	public void user_enter_username_as_demosalesmanager() {
		System.out.println("Step2 passed");;
	}
	@When("user enter password as crmsfa")
	public void user_enter_password_as_crmsfa() {
		System.out.println("Step3 passed");
	}
	@When("user clicks on Login Button")
	public void user_clicks_on_login_button() {
		System.out.println("Step4 passed");
	}
	@Then("user navigated to Welcomepage")
	public void user_navigated_to_welcomepage() {
		System.out.println("Step5 passed");
	}
	@Then("user should see Welcome message")
	public void user_should_see_welcome_message() {
		System.out.println("Step6 passed");
	}

}
