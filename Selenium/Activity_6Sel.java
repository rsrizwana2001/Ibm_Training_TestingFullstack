import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity_6Sel {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/input-events");
        String pageTitle=driver.getTitle();
        System.out.println("PageTitle:"+ pageTitle);

        WebElement elementTointeract =driver.findElement(By.id("keyPressed"));
        Actions actions=new Actions(driver);
        actions.moveToElement(elementTointeract).build().perform();




    }
}
