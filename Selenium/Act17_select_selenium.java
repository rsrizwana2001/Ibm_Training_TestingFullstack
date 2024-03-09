import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Act17_select_selenium {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/selects");
        String pageTitle = driver.getTitle();
        System.out.println("PageTitle:" + pageTitle);

       WebElement dropdown= driver.findElement(By.id("single-select"));
        Select select=new Select(dropdown);
        List<WebElement> options=select.getOptions();

        select.selectByVisibleText("Option 2");
        select.selectByIndex(3);
        select.selectByValue("4");
       // select.getAllSelectedOptions();
       List<WebElement> AllOptions= select.getOptions();
        System.out.println("Options in the dropdown: ");
       for(WebElement option:AllOptions)
       {
           System.out.println(option.getText());
       }



    }



}
