import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Act20_selenium_Prompt {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        String pageTitle = driver.getTitle();
        System.out.println("PageTitle:" + pageTitle);
        driver.findElement(By.id("prompt")).click();
        Alert promptalert = driver.switchTo().alert();
        String alertText = promptalert.getText();
        System.out.println(alertText);
        promptalert.sendKeys("Awesome!");
        promptalert.accept();
        driver.close();
    }
}
