import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DepartmentSwitch
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://sdash-development.s3-website.us-east-2.amazonaws.com/");

        driver.findElement(By.xpath("//div[@title='Sales']")).click(); //-------------Sales dept
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='sc-eDvSVe fceOQu']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[@title='Build']")).click(); //-------------Build dept
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='sc-eDvSVe fceOQu']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[@title='Tenant']")).click(); //------------Tenant dept
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='sc-eDvSVe fceOQu']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//span[normalize-space()='Manager']")).click(); //------Manager dept
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='sc-eDvSVe fceOQu']")).click();
        Thread.sleep(1000);


    }
}
