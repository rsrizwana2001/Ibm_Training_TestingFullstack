import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Act14_HandlingTables_particular {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/tables");
        String pageTitle = driver.getTitle();
        System.out.println("PageTitle:" + pageTitle);
        driver.findElements(By.xpath("//table[contains(@id,'sortableTable')]"));

        List<WebElement> rows=driver.findElements(By.xpath("//table[@class='ui sortable celled table']/tbody/tr")) ;
        System.out.println("Rows size:"+rows.size());
        List<WebElement> cols=driver.findElements(By.xpath("//table[@class='ui sortable celled table']/tbody/tr[1]/td")) ;
        System.out.println("cols size:"+cols.size());

  //      WebElement SecRowSecCellValue= rows.get(2).findElement(By.xpath());
//
    }

}
