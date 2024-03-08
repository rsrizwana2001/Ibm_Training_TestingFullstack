import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Act2_Selenium {


        public static void main(String[] args) {
            // Set the path to your ChromeDriver executable
            System.setProperty("webdriver.chrome.driver", "path/to/your/chromedriver");

            // Initialize the WebDriver
            WebDriver driver = new FirefoxDriver();

            // Open the browser to the specified URL
            String url = "https://v1.training-support.net/selenium/login-form";
            driver.get(url);

            // Get and print the title of the page
            String pageTitle = driver.getTitle();
            System.out.println("Page title: " + pageTitle);

            // Find the username field using any locator and enter "admin" into it
            WebElement usernameField = driver.findElement(By.id("username"));
            usernameField.sendKeys("admin");

            // Find the password field using any locator and enter "password" into it
            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.sendKeys("password");

            // Find the "Log in" button using any locator and click it
            WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
            loginButton.click();

            // Close the browser
            driver.quit();
        }
    }


