package StepDefinition;

import PageClass.LinkedinLoginPage;
import UtilPackage.SeleniumBaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

		public class LinkedinStepDefinition {
		@Given ("I am Launching in chrome browser")
		public void i_am_launching_in_chrome_browser() {
		SeleniumBaseClass.browserlaunch("chrome");
		}
	
		@And("I am launching linkedin URL")
		public void i_am_launching_linkedin_url() {
		SeleniumBaseClass.url();
		}
		
		@When("I entered the username and password")
		public void i_entered_the_username_and_password (String UserName,String Password) {
		LinkedinLoginPage.Enter_Username_password("tbkmoorthi@gmail.com","tbkmbalakm1984");
}
}
