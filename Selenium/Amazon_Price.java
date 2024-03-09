import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon_Price {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.in/s?k=iphone+15&crid=2X4BDNIBGK3ZE&sprefix=iphone+15+%2Caps%2C273&ref=nb_sb_noss_2");
        String pageTitle = driver.getTitle();
        System.out.println("PageTitle:" + pageTitle);
//        String price=driver.findElement(By.xpath("//div[@class='a-row']")).getText();
//        System.out.println(price);
//        driver.findElement(By.xpath("//div=[@id='inputWrapper']")).sendKeys("Amazon");
        driver.findElement(By.xpath("//div=[@id='inputWrapper']")).sendKeys("Iphones", Keys.ENTER);
        driver.findElement(By.xpath("//div[@class='a-row']")).sendKeys(Keys.ENTER);
        String Price = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
        System.out.println(Price);
//        String Price=driver.findElement(By.xpath("")).getText();
//        System.out.println(Price);
//    }
    }
}