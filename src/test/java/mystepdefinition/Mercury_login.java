package mystepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Mercury_login {
 WebDriver driver;
@Given("User has launched the application")
public void user_has_launched_the_application() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\TESTING\\selenium\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe");
	 driver=new ChromeDriver();
     driver.get("http://newtours.demoaut.com/");
     driver.manage().window().maximize();
}

@Then("User enters the valid credentials")
public void user_enters_the_valid_credentials() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By .name("userName")).sendKeys("demo");
	driver.findElement(By .name("password")).sendKeys("demo");
}

@Then("User clicks on submit button")
public void user_clicks_on_submit_button() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By .name("login")).click();
}

@Then("User verifies the login status")
public void user_verifies_the_login_status() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	String b=driver.findElement(By .linkText("SIGN-OFF")).getText();
    Assert.assertEquals("SIGN-OFF",b);
	
}

@Given("User Launched the app of Mercury Tours")
public void user_Launched_the_app_of_Mercury_Tours() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\TESTING\\selenium\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe");
	 driver=new ChromeDriver();
    driver.get("http://newtours.demoaut.com/");
    driver.manage().window().maximize();
}

@Then("User clicks onh SignUp link")
public void user_clicks_onh_SignUp_link() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By .xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
}

@When("User enters the valid data in the form")
public void user_enters_the_valid_data_in_the_form() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By .name("firstName")).sendKeys("lalitha");
	driver.findElement(By .name("lastName")).sendKeys("shiv");
	driver.findElement(By .name("phone")).sendKeys("9876543210");
	driver.findElement(By .name("userName")).sendKeys("lalitha123@gmail.com");
	driver.findElement(By .name("address1")).sendKeys("11,sathya nagar west,saram");
	driver.findElement(By .name("city")).sendKeys("puducherry");
	driver.findElement(By .name("state")).sendKeys("pondicherry");
	driver.findElement(By .name("postalCode")).sendKeys("605013");
	Select s=new Select(driver.findElement(By .name("country")));
	s.selectByValue("92");
	driver.findElement(By .name("email")).sendKeys("lalitha");
	driver.findElement(By .name("password")).sendKeys("password123");
	driver.findElement(By .name("confirmPassword")).sendKeys("password123");

}

@When("User clicks on Submit button available")
public void user_clicks_on_Submit_button_available() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By .name("register")).click();
}

@Then("User verifies the registration status")
public void user_verifies_the_registration_status() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	String b=driver.findElement(By .linkText("SIGN-OFF")).getText();
    Assert.assertEquals("SIGN-OFF",b);
	
}

}
