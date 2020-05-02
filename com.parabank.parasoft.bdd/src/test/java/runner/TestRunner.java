package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
	(features = ".\\Feature",
	glue = "stepDef",
	dryRun = false,
	monochrome = true,
	plugin = {"pretty","html:test-output","json:target/cucumber.json"}

)
public class TestRunner {

}
