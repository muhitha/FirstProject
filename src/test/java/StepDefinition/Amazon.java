package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Amazon {
WebDriver driver;
	
	@Given("Chrome browser is launched")
	public void chrome_browser_is_launched() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();    
	}

	@And("launching in the application")
	public void launching_in_the_application() {
		driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	  
	}
	@And ("Search textbox click")
	public void search_textbox_click() {
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("ios 13");
	}
	@Then ("Search Icon ios 13 item")
	public void search_icon_the_ios_13_item() {
		driver.findElement(By.id("nav-search-submit-button")).click();
	}
	@And ("search result is displayed")
	public void search_result_is_displayed() {
		driver.findElement(By.xpath("//*[@id=\'search\']/span/div/h1/div/div[1]/div/div/span[1]")).click();
	}
	@Then("Click the ios 13(128GB)-Midnight")
	public void click_the_apple_i_phone_128gb_midnight(Integer int1) {
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
	}
	@And ("Add to cart in the page")
	public void add_to_cart_in_the_page() {
		driver.findElement(By.id("And Add to cart in the page"));
	}
	@Then("Go to the back window")
	public void go_to_the_back_window() {
		driver.navigate().back();
	}
	@And ("To check the go to cart page")
	public void to_chech_the_go_to_cart_page() {
		driver.findElement(By.id("ewc-content"));
	}
	}
	