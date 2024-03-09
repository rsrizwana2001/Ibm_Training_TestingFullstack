
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.firefoxDriver;

    public class SeleniumExample {

        public static void main(String[] args) {
            // Set the path to your firefoxDriver executable
            System.setProperty("firefoxdriver.chrome.driver", "path/to/your/firefoxdriver");

            // Initialize the WebDriver
            WebDriver driver = new FirefoxDriver();

            // Open the browser to the specified URL
            driver.get("https://v1.training-support.net");

            // Get and print the title of the page
            String pageTitle = driver.getTitle();
            System.out.println("Page title: " + pageTitle);

            // Find the "About Us" button by its id
            WebElement aboutUsButton = driver.findElement(By.id("aboutUsLink"));

            // Click on the "About Us" button
            aboutUsButton.click();

            // Get and print the title of the new page
            String newPageTitle = driver.getTitle();
            System.out.println("New page title: " + newPageTitle);

            // Close the browser
            driver.quit();
        }
    }

