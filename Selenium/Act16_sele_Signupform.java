import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Act16_sele_Signupform {
    public static void main(String[] args) {


        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        String pageTitle = driver.getTitle();
        System.out.println("PageTitle:" + pageTitle);


                // Find the input fields of the Sign Up form and fill in the details
                WebElement usernameInput = driver.findElement(By.xpath("//input[@placeholder='Username']"));
                WebElement passwordInput = driver.findElement(By.xpath("//input[@placeholder='Password']"));
                WebElement confirmPasswordInput = driver.findElement(By.xpath("//input[@placeholder='Confirm Password']"));
                WebElement emailInput = driver.findElement(By.xpath("//input[@placeholder='Email']"));

                // Fill in the details with your own data
                usernameInput.sendKeys("your_username");
                passwordInput.sendKeys("your_password");
                confirmPasswordInput.sendKeys("your_password");
                emailInput.sendKeys("your_email@example.com");

                // Submit the form
                WebElement signUpButton = driver.findElement(By.xpath("//button[@class='mat-flat-button mat-primary']"));
                signUpButton.click();

                // Wait for success message to appear
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")));

                // Print the success message to the console
                System.out.println("Success Message: " + successMessage.getText());

                // Close the browser
                driver.quit();

            }
        }


