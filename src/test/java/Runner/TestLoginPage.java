package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
		features={"src/test/resources/Feature/IRCTCAccountCreate.feature"},glue= {"StepDefinition"} ,
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},monochrome=true,publish=true)

public class TestLoginPage extends AbstractTestNGCucumberTests { 

}
