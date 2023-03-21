package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Flipkart {
WebDriver driver;
	
	@Given("launch in the chrome browser")
	public void launch_in_the_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();    
	}

	@And("Application launch")
	public void application_launch() {
		driver.get("http://facebook.com");
	    driver.manage().window().maximize();
	}
	 @Then ("Login button click")
	 public void login_button_click() {
		 driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a"));
	 }
	 @And ("Enter the Email ID")
	 public void enter_the_email_id() {
		 driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input"));
	 }
	  @Then ("Request OTP butoon click")
	  public void request_OTP_button_click() {
		  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button"));
	  }
	  @Then("Enter the OTP")
	  public void enter_the_otp() {
		  driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div/div[2]/div/div/form/div/div[1]/input"));
	  }
	  @And("Verify the button click")
	  public void verify_the_button_click() {
		  driver.findElement((By.xpath(" ))
	  }
	}
