import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Activity7_sele {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/drag-drop");
        String pageTitle= driver.getTitle();
        System.out.println("PageTitle:"+pageTitle);

       WebElement ball= driver.findElement(By.id("draggable"));
        WebElement Dropzone1= driver.findElement(By.id("droppable"));
        WebElement Dropzone2 = driver.findElement(By.id("dropzone2"));

        // Perform the drag-and-drop operation
        //actions.dragAndDrop(sourceElement, targetElement).perform();

       Actions actions=new Actions(driver);
       actions.dragAndDrop(ball,Dropzone1).perform();
       String res1 = driver.findElement(By.xpath("//div[@id='droppable']/p")).getText();

       String DropZone1Text=Dropzone1.getText();
       if(res1.equals("Dropped!"))
       {
           System.out.println("Ball is Dropped in DropZone1");

       }
       else{
           System.out.println("Ball is not Dropped in Dropzone1");
       }
        actions.dragAndDrop(ball,Dropzone2).perform();
        String DropZone2Text= Dropzone2.getText();
        String res2 = driver.findElement(By.xpath("//div[@id='dropzone2']/p")).getText();
        if(res2.equals("Dropped!"))
        {
            System.out.println("Ball is Dropped in DropZone2");

        }
        else{
            System.out.println("Ball is not Dropped in Dropzone2");
        }






    }
}
