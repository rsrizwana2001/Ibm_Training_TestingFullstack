import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8_sele {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        String pageTitle=driver.getTitle();
        System.out.println("PageTitle:"+pageTitle);

        WebElement checkboxToggle=driver.findElement(By.id("dynamicCheckbox"));
        checkboxToggle.click();
        //implicit wait
        try {
            Thread.sleep(1000);
        }
       catch (InterruptedException e){
            e.printStackTrace();
       }
        checkboxToggle.click();
    }
    //you can also use by xpath  div=@class  .clicl() by passing 2 statements
}
