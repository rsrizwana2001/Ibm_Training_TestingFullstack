import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

public class helloselenium {



        public static void main(String[] args) {
            // Setup the Firefox driver(GeckoDriver)
            WebDriverManager.firefoxdriver().setup();

            // Create a new instance of the Firefox driver
            WebDriver driver = new FirefoxDriver();

            // Open the browser
            driver.get("https://v1.training-support.net");

            // Perform testing and assertions...

            // Close the browser
            // Feel free to comment out the line below
            // so it doesn't close too quickly
            driver.quit();
        }
    }


