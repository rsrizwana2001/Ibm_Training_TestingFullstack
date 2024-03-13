
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Act4 {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up the Firefox driver and open the browser
        //System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
    }

    @Test
    public void testMethod1() {
        // Your test logic for the first test method goes here
        // e.g., driver.findElement(By.id("someElement")).click();


    }

    @Test
    public void testMethod2() {
        // Your test logic for the second test method goes here
        // e.g., driver.findElement(By.name("someButton")).submit();
    }

    // Add more @Test methods as needed

    @AfterClass
    public void tearDown() {
        // Close the browser after all tests are done
        driver.close();
    }
}
