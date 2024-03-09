import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity9_sele {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/ajax");
        String pageTitle=driver.getTitle();
        System.out.println("PageTitle:"+pageTitle);

        driver.findElement(By.xpath("div[@id='ajax-content']/button")).click();
       //String hel=driver.findElement(By.xpath("div[@id='ajax-content']/button")).click();
    }
}
