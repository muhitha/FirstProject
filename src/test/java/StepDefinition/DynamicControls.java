package StepDefinition;

	import java.time.Duration;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedCondition;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import io.cucumber.java.en.And;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class DynamicControls {
		WebDriver driver;
		@Given("Open the Chrome Browser1")
		public void open_the_chrome_browser() {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		@Given("^Launched the application$")
		public void launched_the_application() {
			driver.get("http://the-internet.herokuapp.com");
		    driver.manage().window().maximize();
		}
		@When("I click on Dynamic Controls link")
		public void verify_the_login_page_displays() {
	        driver.findElement(By.xpath("//a[text()='Dynamic Controls']")).click();
		
		}
		/*@When("verify the login page displays")
		public void i_click_on_dynamic_controls_link() {
			 boolean status=driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/h4[1]")).isDisplayed();
		}*/
		@When("I check in the box")
		public void i_check_in_the_box() {
			driver.findElement(By.id("checkbox")).click();
			}
		@Then("I enable the box")
		public void i_enable_the_box() {
			driver.findElement(By.xpath("//button[normalize-space()='Enable']")).click();
		}
		
		@Then("verify message displays")
		public void verify_message_displays() {
			WebElement wait=new WebDriverWait(driver,Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(By.id("message")));
	       //String message= driver.findElement;
	       System.out.println(wait);
	       
	       driver.quit();
		}

	}

