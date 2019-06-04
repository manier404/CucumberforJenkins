package feature;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature/", monochrome = true, tags = {
		"@Regression,@Smoke" }, glue = "feature",dryRun=false, plugin = "json:src/test/java/report.json")
public class TestRunner {

}
