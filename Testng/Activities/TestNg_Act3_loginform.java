import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNg_Act3_loginform {
    WebDriver driver;
    @BeforeClass
    public void beforeMethod(){
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
         driver.get("https://v1.training-support.net/selenium/login-form\n");
    }
    @Test
    public void testLogin() {
        // Find the login input fields - username and password
        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("password"));

        // Enter the credentials - admin and password
        usernameInput.sendKeys("admin");
        passwordInput.sendKeys("password");
        // Click the "Log in" button
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        // Read the confirmation message and make an assertion
        WebElement confirmationMessage = driver.findElement(By.id("action-confirmation"));
        String actualMessage = confirmationMessage.getText();
        String expectedMessage = "Welcome Back, admin!";

       // Assert.assertEquals(actualMessage, expectedMessage, "Incorrect confirmation message");
        //Read login message
        //String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        //Assert.assertEquals("Welcome Back, admin", loginMessage);

    }

    @AfterClass
    public void tearDown() {
        // Close the browser after the test is done
        driver.close();
    }
}

