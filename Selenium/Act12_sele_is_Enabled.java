import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Act12_sele_is_Enabled {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        String pageTitle = driver.getTitle();
        System.out.println("PageTitle:" + pageTitle);
        WebElement textfield = driver.findElement(By.xpath("//input[@type='text']"));
        textfield.isEnabled();
        // driver.findElement(By.class("spaced")).click();
        driver.findElement(By.xpath("//@button[contains(text(),'Remove checkbox')]")).click();


        textfield.isEnabled();

    }
}
