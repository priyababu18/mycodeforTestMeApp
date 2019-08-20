package mystepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class demo_tags {
	@Given("launch the flipkart website")
	public void launch_the_flipkart_website() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("launching the flpikart app");
	}

	@Then("enter the credentials for login")
	public void enter_the_credentials_for_login() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("enter the credentials for login");
	}

	@Given("user seraching the product")
	public void user_seraching_the_product() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("search the product");
	}

	@Then("user able to add it to cart")
	public void user_able_to_add_it_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("add to cart");
	}

	@Given("user able to see the count on cart")
	public void user_able_to_see_the_count_on_cart() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("count on crt");
	}

	@Then("user able to remove the item from cart")
	public void user_able_to_remove_the_item_from_cart() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("remove from cart");
	}

	@Given("user has active order")
	public void user_has_active_order() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("user has active order");
	}

	@Then("user tracks the status of order")
	public void user_tracks_the_status_of_order() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("track the status of order");
	}

}
