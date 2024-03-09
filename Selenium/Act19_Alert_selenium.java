import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Act19_Alert_selenium {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        String pageTitle = driver.getTitle();
        System.out.println("PageTitle:" + pageTitle);

        WebElement confirmButton=driver.findElement(By.id("confirm"));
        confirmButton.click();
        Alert confirmAlert=driver.switchTo().alert();
        String Alert=confirmAlert.getText();
        System.out.println("AlertText"+Alert);
        confirmAlert.accept();
        confirmButton.click();
        confirmAlert=driver.switchTo().alert();
        confirmAlert.dismiss();






    }

}
