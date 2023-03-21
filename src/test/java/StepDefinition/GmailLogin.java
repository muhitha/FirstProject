package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GmailLogin {
WebDriver driver;
	
	@Given("Launch the web browser Chrome")
	public void launch_the_web_browser_chrome() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();    
	}

	@And("open the application gmail ")
	public void open_the_application_gmail() {
		driver.get("http://www.gmail.co.in");
	    driver.manage().window().maximize();
	}
	
	@Then("Enter valid username")
	public void enter_valid_username() {
		driver.findElement(By.id("identifierId")).sendKeys("muhithagengab22@gmail.com");
	}

	@And("Enter valid password")
	public void enter_valid_password() {
		driver.findElement(By.name("password")).sendKeys("88386905666");
	   
	}

	@Then("Click on the next button")
	public void click_on_the_next_button() {
		driver.findElement(By.xpath("//*[@id='passwordNext']")).click();
	}

	@Then("Click on the compose button")
	public void click_on_the_compose_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Click on the attach icon")
	public void click_on_the_attach_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Select the files to be uploaded with the window based pop up.")
	public void select_the_files_to_be_uploaded_with_the_window_based_pop_up() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



}
