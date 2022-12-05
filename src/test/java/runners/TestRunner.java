package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions ;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features/ExamplesNativeScript.feature"},
		glue = {"stepdefinitions","AppHooks"},
		plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
				"junit:target/cucumber-reports/Cucumber.xml", 
				"html:target/cucumber/report.html"},
		monochrome = true
		
		)


public class TestRunner {

}