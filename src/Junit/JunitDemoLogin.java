package Junit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class JunitDemoLogin
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
    @Test
    public void LoginTest2()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://sdash-development.s3-website.us-east-2.amazonaws.com/");

        driver.findElement(By.xpath("//div[@title='Sales']")).click(); //-------------Sales
        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("test2@yopmail.com");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("test@12");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    }
    @Test
    public void LoginTest3()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://sdash-development.s3-website.us-east-2.amazonaws.com/");

        driver.findElement(By.xpath("//div[@title='Sales']")).click(); //-------------Sales
        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("test3@yopmail.com");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("test@13");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    }
    @Test
    public void LoginTest4()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://sdash-development.s3-website.us-east-2.amazonaws.com/");

        driver.findElement(By.xpath("//div[@title='Sales']")).click(); //-------------Sales
        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("jtr@taglineinfotech.com");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("test@123");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    }

}
