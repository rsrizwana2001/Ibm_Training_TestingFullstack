package testRunner;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features",
        glue = {"stepDefinitions"},
     //   tags = "@activity5",
       // tags="@SmokeTest",
       // plugin = {"pretty"},
        plugin = {"html:cucumber-reports"},

        monochrome = true
)
public class ActivitiesRunner6 {
}
