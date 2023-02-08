package testRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions
        (
            features = "src/test/resources/Webinar_Registration.feature",
                glue = {"stepDefinitions"}
        )

public class TestRunner_Webinar_Registration  extends AbstractTestNGCucumberTests {
}
