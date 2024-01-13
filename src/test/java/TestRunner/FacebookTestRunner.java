package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"AllFeatureFiles/FB1.feature"},
		glue = {"StepDefinitionLayer"},
		dryRun = false
		)
public class FacebookTestRunner {
	

}
