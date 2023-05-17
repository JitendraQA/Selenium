package Asserts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionDemo3
{

    public static void main(String[] args) throws InterruptedException
    {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://sdash-development.s3-website.us-east-2.amazonaws.com/");

            driver.findElement(By.xpath("//div[@title='Sales']")).click(); //-------------Sales
            driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("jtr@taglineinfotech.com");
            driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("test@123");
            driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
            Thread.sleep(3000);

            String Expected = "http://sdash-development.s3-website.us-east-2.amazonaws.com/";
            String Actual = driver.getCurrentUrl();

            System.out.println("Expected = " +Expected);
            System.out.println("Actual = " +Actual);

            Assert.assertEquals(Actual,Expected,"Test case is failed");










    }


}
