package stepDefinitions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;

public class Act3steps {




        private WebDriver driver;
        private WebDriverWait wait;

        @Given("User is on the page")
        public void userIsOnThePage() {
            // Initialize WebDriver and WebDriverWait
            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
            driver = new ChromeDriver();
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Open the browser with the specified URL
            driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        }

        @When("User clicks the Simple Alert button")
        public void userClicksSimpleAlertButton() {
            WebElement simpleAlertButton = driver.findElement(By.id("simple"));
            simpleAlertButton.click();
        }

        @When("User clicks the Confirm Alert button")
        public void userClicksConfirmAlertButton() {
            WebElement confirmAlertButton = driver.findElement(By.id("confirm"));
            confirmAlertButton.click();
        }

        @When("User clicks the Prompt Alert button")
        public void userClicksPromptAlertButton() {
            WebElement promptAlertButton = driver.findElement(By.id("prompt"));
            promptAlertButton.click();
        }

        @Then("Alert opens")
        public void alertOpens() {
            Alert alert = driver.switchTo().alert();
        }

        @And("Read the text from it and print it")
        public void readAndPrintAlertText() {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            System.out.println("Alert Text: " + alertText);
        }

        @And("Write a custom message in it {string}")
        public void writeCustomMessageInAlert(String customMessage) {
            Alert alert = driver.switchTo().alert();
            alert.sendKeys(customMessage);
        }

        @And("Close the alert")
        public void closeAlert() {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        }

        @And("Close the alert with cancel")
        public void closeAlertWithCancel() {
            Alert alert = driver.switchTo().alert();
            alert.dismiss();
        }

        @And("Read the result text")
        public void readResultText() {
            // Add logic to read the result text if applicable
        }

        @And("Close Browser")
        public void closeBrowser() {
            driver.quit();
        }
    }



