package Junit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 public class Junit1
{
    @Test
    public void LoginTest1()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://sdash-development.s3-website.us-east-2.amazonaws.com/");

        driver.findElement(By.xpath("//div[@title='Sales']")).click(); //-------------Sales
        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("test1@yopmail.com");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("test@11");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    }
    public void LoginTest2()//Newly added
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://sdash-development.s3-website.us-east-2.amazonaws.com/");

        driver.findElement(By.xpath("//div[@title='Sales']")).click(); //-------------Sales
        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("test1@yopmail.com");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("test@11");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    }
}
