package mystepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class logindefinition {
	
	@Given("Application is launched")
	public void application_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for application launching");
	}

	@When("user enters credentials")
	public void user_enters_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for credentials entry");
	}

}
