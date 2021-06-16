package StepDefn;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/tr.feature", glue ={"StepDefn"},
monochrome = true,
//{"json:target/cucumber.json"})
plugin = {"html:target/cucumber-html-report","json:target/cucumber-reports/cucumber.json","junit:target/cucumber-reports/cucumber.xml","json:target/cucumber.json"})

	public class TestRunner {
		
	}


