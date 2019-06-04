package stepDefinition;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature/", monochrome = true, tags = {
		"@Regression,@Smoke" }, glue = "stepDefinition",dryRun=false, plugin = "json:src/test/java/report.json")
public class TestRunner {

}
