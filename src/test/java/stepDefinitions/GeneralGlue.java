package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import pages.BaseClass;

public class GeneralGlue extends PageObject {

	BaseClass baseclass;

	@Given("User is on landing page")
	public void user_is_on_landing_page() {
//	   System.out.println("User is on login page");
//		getDriver().get("www.google.com");
		baseclass.InitialiseBroser();
		waitABit(3000);
	}
	@When("^User enter usename as (.+) and password as (.+) login into application$")
	public void user_enter_usename_as_and_password_as_login_into_application(String name, String pass) {
		System.out.println("User loggedin with user name as " +name + " and password as "+ pass);
	}
//	@When("^User enters "([^"])" and "([^"])"$")
	
	@Then("home page is displayed")
	public void home_page_is_displayed() {
		System.out.println("home page dispalyed");
	}
	
	@And("crede card details should be displayed")
	public void crede_card_details_should_be_displayed() {
		System.out.println("credit card details dispalyed");
	}
	
	@Given("I want to write a step with {string}")
	public void i_want_to_write_a_step_with(String name) {
	   System.out.println(name);

	}
	@When("I check for the {string} in step")
	public void i_check_for_the_in_step(String val) {
		 System.out.println(val);
	}
	@Then("I verify the {string} in step")
	public void i_verify_the_in_step(String stat) {
		 System.out.println(stat);
	}
	
	@When("^set the environment$")
	public void settingEnvironmrnt() {
		System.out.println("User is set the environment " );
	}
	
	@Then("^check the environment$")
	public void checkingEnvironmrnt() {
		System.out.println("environment checking done " );
	}
	
	@When("^User is on signin page$")
	public void userIsOnSignInPage() {
		System.out.println("User is on sign in page " );
	}
	
	@When("^User enter signin details$")
	public void enterSIgnInDetails(List<String> data) {
		System.out.println("user first name " +data.get(0));
		System.out.println("user last name " +data.get(1));
		System.out.println("user mob no " +data.get(2));
		System.out.println("user email id " +data.get(3));
	}
	

	
	
}
