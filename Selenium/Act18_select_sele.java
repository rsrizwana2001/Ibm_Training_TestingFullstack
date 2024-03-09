import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Act18_select_sele {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/selects");
        String pageTitle = driver.getTitle();
        System.out.println("PageTitle:" + pageTitle);

        WebElement multiselectdropdown=driver.findElement(By.id("multi-select"));

        Select select=new Select(multiselectdropdown);
     select.selectByVisibleText("Javascript");
     select.selectByIndex(4);
        select.selectByIndex(5);
        select.selectByIndex(6);
     select.selectByValue("node");
     select.deselectByIndex(4);

    }
}