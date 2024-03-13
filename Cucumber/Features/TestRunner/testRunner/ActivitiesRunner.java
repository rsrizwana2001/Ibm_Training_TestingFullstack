package testRunner;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
        features="features",
        glue={"stepDefinitions"},
        tags="@activity1"
)
public class ActivitiesRunner {

}
