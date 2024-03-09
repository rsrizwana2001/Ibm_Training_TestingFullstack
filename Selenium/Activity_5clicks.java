import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Random;

public class Activity_5clicks {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/input-events");
        System.out.println("Home page title: " + driver.getTitle());



                // Set the path to your chromedriver executable
               // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");


                // Navigate to the target page
               // driver.get("https://v1.training-support.net/selenium/input-events");

                // Get the title of the page and print it to the console
//                String pageTitle = driver.getTitle();
//                System.out.println("Page Title: " + pageTitle);

                // Find the cube element
                WebElement cube = driver.findElement(By.id("wrapD3Cube"));

                // Perform left click and print the value of the side in the front
                cube.click();
                String frontSideValue = cube.findElement(By.id("front")).getText();
                System.out.println("Value of the side in the front after left click: " + frontSideValue);

                // Perform double click to show a random side and print the number
                Actions actions = new Actions(driver);
                actions.doubleClick(cube).build().perform();
                int randomSideNumber = new Random().nextInt(6) + 1;
                System.out.println("Random side shown after double click: " + randomSideNumber);

                // Perform right click and print the value shown on the front of the cube
                actions.contextClick(cube).build().perform();
                String frontSideValueAfterRightClick = cube.findElement(By.id("front")).getText();
                System.out.println("Value of the side in the front after right click: " + frontSideValueAfterRightClick);

                // Close the browser
                //driver.quit();
            }
        }


