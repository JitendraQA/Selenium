import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown
{
       public static void main(String[] args) throws InterruptedException
       {
              WebDriver driver = new ChromeDriver();
              //WebDriver driver = new FirefoxDriver();
              driver.manage().window().maximize();

              driver.get("https://www.lifepartner.in/");

              WebElement testdropdown = driver.findElement(By.id("sel3"));
              Thread.sleep(2000);
              Select dropdown = new Select(testdropdown);
              dropdown.selectByIndex(1);
                     Thread.sleep(4000);
              WebElement testdropdown1 = driver.findElement(By.id("sel1"));
              Select dropdown1 = new Select(testdropdown1);
              dropdown1.selectByIndex(15);
                     Thread.sleep(1000);
              WebElement testdropdown2 = driver.findElement(By.id("sel2"));
              Select dropdown2 = new Select(testdropdown2);
              dropdown2.selectByIndex(12);
                     Thread.sleep(1000);
              WebElement testdropdown3 = driver.findElement(By.id("sel4"));
              Select dropdown3 = new Select(testdropdown2);
              dropdown3.selectByIndex(10);
                     Thread.sleep(1000);
              WebElement testdropdown4 = driver.findElement(By.id("sel4"));
              Select dropdown4 = new Select(testdropdown2);
              dropdown3.selectByIndex(2);

              Thread.sleep(4000);










//             // WebElement testDropdown = driver.findElement(By.xpath("///div[@class=' css-1hwfws3']"));
//              WebElement testDropdown = driver.findElement(By.xpath("/html/body/div/div/div/div/div[4]/div[2]/div/div[2]/div/form/div[6]/div/div/div/div[1]"));
//              Thread.sleep(1000);
//              Select dropdown = new Select(testDropdown);
//             // dropdown.selectByValue("Sales");
//             dropdown.selectByIndex(2);
//              //dropdown.selectByVisibleText("Tenant");
//              Thread.sleep(2000);
//
//
////              driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
////
////              Thread.sleep(2000);
//


       }

}
