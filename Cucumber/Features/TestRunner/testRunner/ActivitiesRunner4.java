package testRunner;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "Features",
        glue = {"stepDefinitions"},
        tags = "@activity4"
)

public class ActivitiesRunner4 {
}
