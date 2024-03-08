import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public interface Act4_seleinium {



        public static void main(String[] args) {
            // Set the path to your chromedriver executable
            System.setProperty("webdriver.firefox.driver", "path/to/firefoxdriver");

            // Open a new browser to the specified URL
            WebDriver driver = new FirefoxDriver();
            String url = "https://v1.training-support.net/selenium/target-practice";
            driver.get(url);

            // Get the title of the page and print it to the console
            String pageTitle = driver.getTitle();
            System.out.println("Page Title: " + pageTitle);

            // Using xpath, find the 3rd header on the page and print its text
            WebElement thirdHeader = driver.findElement(By.xpath("(//h3)[3]"));
            String thirdHeaderText = thirdHeader.getText();
            System.out.println("3rd Header Text: " + thirdHeaderText);

            // Using xpath, find the 5th header on the page and print its color
            WebElement fifthHeader = driver.findElement(By.xpath("(//h3)[5]"));
            String fifthHeaderColor = fifthHeader.getCssValue("color");
            System.out.println("5th Header Color: " + fifthHeaderColor);

            // Using other locators, find the violet button and print all its classes
            WebElement violetButton = driver.findElement(By.className("ui violet button"));
            String violetButtonClasses = violetButton.getAttribute("class");
            System.out.println("Violet Button Classes: " + violetButtonClasses);

            // Using other locators, find the grey button and print its text
            WebElement greyButton = driver.findElement(By.className("ui grey button"));
            String greyButtonText = greyButton.getText();
            System.out.println("Grey Button Text: " + greyButtonText);

            // Close the browser
            //driver.quit();
        }
    }

