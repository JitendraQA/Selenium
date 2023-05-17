import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CreateNewAccount
{
       public static void main(String[] args) throws InterruptedException
       {
              WebDriver driver = new ChromeDriver();
              //WebDriver driver = new FirefoxDriver();
              driver.manage().window().maximize();
              driver.get("http://sdash-development.s3-website.us-east-2.amazonaws.com/");

              driver.findElement(By.xpath("//div[@title='Sales']")).click(); //-------------Sales
              driver.findElement(By.xpath("//p[normalize-space()='Create a new account']")).click();

              driver.findElement(By.xpath("/html/body/div/div/div/div/div[4]/div[2]/div/div[2]/div/form/div[2]/input")).sendKeys("hello");
              driver.findElement(By.xpath("/html/body/div/div/div/div/div[4]/div[2]/div/div[2]/div/form/div[3]/input")).sendKeys("test@yopmail.com");
              driver.findElement(By.xpath("/html/body/div/div/div/div/div[4]/div[2]/div/div[2]/div/form/div[4]/input")).sendKeys("test@123");
              driver.findElement(By.xpath("/html/body/div/div/div/div/div[4]/div[2]/div/div[2]/div/form/div[5]/input")).sendKeys("test@12345");

              WebElement testDropdown = driver.findElement(By.xpath("//div[@class=' css-19t05qd-control']"));
              testDropdown.click();













//              Thread.sleep(4000);
//              Select dropdown = new Select(testDropdown);
//              List<WebElement> options = dropdown.getOptions();
//            //  WebElement firstselectedoption = dropdown.getFirstSelectedOption();

//              testDropdown.click();
//              Select dropdown = new Select(testDropdown);
//              Thread.sleep(2000);
//              dropdown.selectByIndex(2);
//
//              Thread.sleep(2000);



       }

}
