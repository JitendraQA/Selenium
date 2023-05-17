package Asserts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionDemo2
{

    WebDriver driver;
    @BeforeClass
    public void Openbroswer()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterClass
    public void Closebrowser () throws InterruptedException
    {
       driver.close();
    }
    @Test
    void LoginTest1() throws InterruptedException
    {
        driver.get("http://sdash-development.s3-website.us-east-2.amazonaws.com/");

        driver.findElement(By.xpath("//div[@title='Sales']")).click(); //-------------Sales
        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        Thread.sleep(3000);
        //Assert.assertEquals("Invalid Credentials", "Successfully Login");
        //Assert.assertNotEquals("Login Success", "Login Success");
        ///Assert.assertNull("","Please enter");
        Assert.assertNotNull("", "Hello");
    }
    @Test
    void LoginTest2() throws InterruptedException
    {
        driver.get("http://sdash-development.s3-website.us-east-2.amazonaws.com/");

        driver.findElement(By.xpath("//div[@title='Sales']")).click(); //-------------Sales
        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("test2@yopmail.com");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("test@12");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        Thread.sleep(3000);
        Assert.assertEquals("Invalid Credentials", "Successfully Login");
    }
    @Test
    void LoginTest3() throws InterruptedException
    {
        driver.get("http://sdash-development.s3-website.us-east-2.amazonaws.com/");

        driver.findElement(By.xpath("//div[@title='Sales']")).click(); //-------------Sales
        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        Thread.sleep(3000);
        Assert.assertEquals("Please Enter Email & Password", "Successfully Login");
    }
    @Test
    void LoginTest4() throws InterruptedException
    {
        driver.get("http://sdash-development.s3-website.us-east-2.amazonaws.com/");

        driver.findElement(By.xpath("//div[@title='Sales']")).click(); //-------------Sales
        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("jtr@taglineinfotech.com");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("test@123");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        Thread.sleep(3000);
        Assert.assertEquals("Successfully Login", "Successfully Login");
    }

}
