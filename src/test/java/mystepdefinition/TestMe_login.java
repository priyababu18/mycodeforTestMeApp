package mystepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
//import junit.framework.Assert;

public class TestMe_login {
	WebDriver driver;
	@Given("TestMe app is launched")
	public void testme_app_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\TESTING\\selenium\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@Then("user clicks on the SignIn link")
	public void user_clicks_on_the_SignIn_link() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	}

	@Then("user provides valid username {string}")
	public void user_provides_valid_username(String string1) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By .name("userName")).sendKeys(string1);
	}

	@Then("user provides valid password {string}")
	public void user_provides_valid_password(String string2) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By .name("password")).sendKeys(string2);

		
	}

	@Then("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By .name("Login")).click();

	}

	@Then("user verifies the login status")
	public void user_verifies_the_login_status() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		String b=driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).getText();
		Assert.assertEquals("SignOut",b);
				
	}

	@Then("click on SignOut link")
	public void click_on_SignOut_link() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).click();
	}

}
