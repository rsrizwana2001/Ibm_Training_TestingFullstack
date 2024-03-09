import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Act22_iframe_selenium {
    public static void main(String[] args) {


        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get(" https://v1.training-support.net/selenium/popups");

        String pageTitle = driver.getTitle();
        System.out.println("PageTitle:" + pageTitle);
       // signin = driver.findElement(By.xpath("//div[@class='ui huge inverted orange button']"));


        //  # Find the element to hover over
        //  element_to_hover_over = driver.find_element_by_id("exampleElement")

//# Create an ActionChains object and perform the hover action
        //              hover = ActionChains(driver).move_to_element(element_to_hover_over)
        //    hover.perform()

        WebElement signInButton = driver.findElement(By.id("sign_in"));
        Actions actions = new Actions(driver);
        actions.moveToElement(signInButton).build().perform();

        // Print the tooltip message
        WebElement tooltip = driver.findElement(By.className("ui-tooltip-content"));
        System.out.println("Tooltip Message: " + tooltip.getText());

        // Click the Sign in button to open the form
        signInButton.click();

        // Enter credentials
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));

        usernameField.sendKeys("admin");
        passwordField.sendKeys("password");

        // Click login
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
        loginButton.click();

        // Wait for a moment to let the login process complete
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the message after logging in
        WebElement loginMessage = driver.findElement(By.id("action-confirmation"));
        System.out.println("Login Message: " + loginMessage.getText());

        // Close the browser
        driver.quit();
    }
}



