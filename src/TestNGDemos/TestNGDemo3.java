package TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

//----Program for TestNG annotation (@BeforeMethod & @AfterMethod)
public class TestNGDemo3
{

    WebDriver driver;
    @BeforeMethod
    public void Openbroswer()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void Closebrowser () throws InterruptedException
    {
       driver.close();
    }
    @Test
    void LoginTest1() throws InterruptedException
    {
        driver.get("http://sdash-development.s3-website.us-east-2.amazonaws.com/");

        driver.findElement(By.xpath("//div[@title='Sales']")).click(); //-------------Sales
        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("test1@yopmail.com");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("test@11");
        //driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        Thread.sleep(3000);
    }
    @Test
    void LoginTest2() throws InterruptedException
    {
        driver.get("http://sdash-development.s3-website.us-east-2.amazonaws.com/");

        driver.findElement(By.xpath("//div[@title='Sales']")).click(); //-------------Sales
        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("test2@yopmail.com");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("test@12");
       // driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        Thread.sleep(3000);
    }
    @Test
    void LoginTest3() throws InterruptedException
    {
        driver.get("http://sdash-development.s3-website.us-east-2.amazonaws.com/");

        driver.findElement(By.xpath("//div[@title='Sales']")).click(); //-------------Sales
        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("jtr@taglineinfotech.com");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("test@123");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        Thread.sleep(3000);
    }

}
