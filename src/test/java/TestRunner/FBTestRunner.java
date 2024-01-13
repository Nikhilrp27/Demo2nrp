package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(	
		features = {"AllFeatureFiles/Facebook.feature"},
		glue = {"StepDefinitionLayer"},
		dryRun = false
		)

public class FBTestRunner {

}
