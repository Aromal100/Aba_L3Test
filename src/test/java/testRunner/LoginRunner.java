package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = ".//Features/Login.feature",  // Path to your feature files
	    glue = "stepDefinition",                   // Path to your step definition packages
	    plugin = {"pretty", "html:target/cucumber-LoginTestreports.html"}
	)

public class LoginRunner extends AbstractTestNGCucumberTests {
	
}
