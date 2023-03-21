package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class FacebookLogin {
	
	WebDriver driver;
	
	@Given("Chrome browser launched")
	public void chrome_browser_launched() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();    
	}

	@And("Launch the application")
	public void launch_the_application() {
		driver.get("http://facebook.com");
	    driver.manage().window().maximize();
	  
	}

	@And("User Enter the Username field")
	public void user_enter_the_username_field() {
		driver.findElement(By.id("email")).sendKeys("tbkmoorthi@gmail.com");
	    
	}

	@And("User Enter the Password field")
	public void user_enter_the_password_field() {
	driver.findElement(By.id("pass")).sendKeys("tbkmbalakm1984");
	}

	@When("click on the Login page")
	public void click_on_the_login_page() {
		driver.findElement(By.name("login")).click();
	  
	}
	}
