package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	
	@Given("User Launch Browser")
	public void user_launch_browser() {
	    
	}

	@Given("opens URL\"https:\\/\\/www.opencart.com\\/index.php?route=cms\\/demo\"")
	public void opens_url_https_www_opencart_com_index_php_route_cms_demo() {
	   
	}

	@When("User navigate to MyAccount menu")
	public void user_navigate_to_my_account_menu() {}
	    

	@When("click on Login")
	public void click_on_login() {}
	   

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String string, String string2) {
	    
	}

	@When("Click on Login button")
	public void click_on_login_button() {
	   
	}

	@Then("User navigates to MyAccount Page")
	public void user_navigates_to_my_account_page() {
	    
	}

}
