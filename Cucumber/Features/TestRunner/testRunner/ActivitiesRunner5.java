package testRunner;


import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
        features="features",
        glue={"stepDefinitions"},
        tags="@activity5"
)

public class ActivitiesRunner5 {
}
