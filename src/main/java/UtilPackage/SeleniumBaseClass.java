package UtilPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumBaseClass {
		public static WebDriver driver;
		public static void browserlaunch(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();    
		}
		}
		public static void url() {
		driver.get("https://www.linkedin.com");
		}
		public static void max() {
		driver.manage().window().maximize();
		}
		public static WebElement findelement(String attribute,String attributevalue) {
		WebElement element=null;
		if(attribute.equalsIgnoreCase("name")) 
		element=driver.findElement(By.name(attributevalue));
		
		else if(attribute.equalsIgnoreCase("Classname")) 
		element=driver.findElement(By.className(attributevalue));
			
		else if(attribute.equalsIgnoreCase("id")) 
		element=driver.findElement(By.id(attributevalue));
				
		else if(attribute.equalsIgnoreCase("xpath")) 
		element=driver.findElement(By.xpath(attributevalue));
					
		return element;
		}
		
		public static void sendvalue(String attribute, String attributevalue,String sendvalue) {
		WebElement value=findelement(attribute,attributevalue);
		value.sendKeys("value");
		}
		public  void clickaction(String attribute, String attributevalue) {
		WebElement value=findelement(attribute,attributevalue);
		value.click();
		}
		public void selectDropdown(String attribute, String attributevalue,String dropdown,String value) {
		WebElement value1=findelement(attribute,attributevalue);
		Select dp=new Select(value1);
		if(dropdown.equalsIgnoreCase("index")) {
		Integer index=Integer.parseInt("value");
		}
		}
		}