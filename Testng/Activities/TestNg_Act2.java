import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNg_Act2 {
    WebDriver driver;

    @BeforeClass
    public void beforeMethod() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://v1.training-support.net/selenium/target-practice");
    }
    @Test
    public void exampleTestCase() {
        // Check the title of the page
        String title = driver.getTitle();

        //Print the title of the page
        System.out.println("Page title is: " + title);

        //Assertion for page title
        Assert.assertEquals(title,"Target Practice" );


    }

    @Test
    public void testFindBlackButton() {
        // Test method to look for the black button and make an incorrect assertion
        // This test case is meant to throw an error
        driver.findElement(By.id("noSuchElement")).click(); // Assuming there is no element with id "noSuchElement"
        Assert.assertTrue(false, "The test should fail because the element is not found.");
    }

    @Test(enabled = false)
    public void testSkipByEnabledParameter() {
        // Test method to be skipped by setting its enabled parameter to false
        // This method will be skipped, but it will not be shown as skipped
        System.out.println("This method should be skipped, but won't be shown as skipped.");
    }

    @Test
    public void testSkipByException() {
        // Test method to be skipped by throwing a SkipException inside the method
        throw new SkipException("Skipping this test method intentionally.");
    }

    @AfterClass
    public void tearDown() {
        // Close the browser after all tests are done
        driver.close();
    }
}
