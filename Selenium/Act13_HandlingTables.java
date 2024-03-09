import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Act13_HandlingTables {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/tables");
        String pageTitle = driver.getTitle();
        System.out.println("PageTitle:" + pageTitle);
     driver.findElements(By.xpath("//table[@class='ui celled striped table']"));
      List<WebElement> rows=driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr")) ;
        System.out.println(rows.size());
        List<WebElement> cols=driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr[1]/td")) ;
        System.out.println(cols.size());
        // Find and print all the cell values in the third row of the table
        WebElement thirdRow = rows.get(2);
        List<WebElement> cellsInThirdRow = thirdRow.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr[3]/td"));
        System.out.println("Cell values in the third row:");
        for (WebElement cell : cellsInThirdRow) {
            System.out.print(cell.getText() + "\t");
        }
        System.out.println(); // Move to the next line for better readability

        // Find and print the cell value at the second row second column
        WebElement cellSecondRowSecondColumn = rows.get(1).findElement(By.xpath("//table[@class='ui celled striped table']/tbody/tr[2]/td[2]"));
        System.out.println("Cell value at the second row second column: " + cellSecondRowSecondColumn.getText());


    }
}
