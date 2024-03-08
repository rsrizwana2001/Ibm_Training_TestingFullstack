import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Act_21_WindowHandling_selenium {
    public static void main(String[] args) {


        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/tab-opener");
        String pageTitle = driver.getTitle();
        System.out.println("PageTitle:" + pageTitle);
        driver.findElement(By.xpath("//div[@class='spaced']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<String> afterallhandles=new java.util.ArrayList<>(driver.getWindowHandles());

        String newTab=afterallhandles.get(1);
        driver.switchTo().window(newTab);

        String Title=driver.getTitle();
       String Heading= driver.findElement(By.xpath("//div[@class='content']")).getText();
        System.out.println("Heading:"+Heading);

        WebElement newTabButton = driver.findElement(By.id("actionButton"));
        newTabButton.click();

        // Wait for the new tab to open again
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));

        // Print all the handles after clicking the button in the new tab
        List<String> allHandlesAfterClick = new java.util.ArrayList<>(driver.getWindowHandles());
        System.out.println("All Handles after clicking button in the new tab: " + allHandlesAfterClick);

        // Close the browser
        driver.quit();
    }
}

        // Open the page











