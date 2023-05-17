package SeleniumBasics;

import io.netty.handler.codec.http.multipart.FileUpload;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.swing.*;
import java.io.File;

public class PracticeBasics
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://itera-qa.azurewebsites.net/home/automation\n");
        driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Test");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id=\"phone\"]")).sendKeys("1234");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("test@yopmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("7666");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Surat,Gujarat");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
        Thread.sleep(2000);


         driver.findElement(By.xpath("//input[@id='male']")).click();//------------Radio button
        Thread.sleep(2000);

        WebElement opt1 = driver.findElement(By.xpath("//input[@id='monday']"));//----Check box
        opt1.click();
        Thread.sleep(2000);
        WebElement opt2 = driver.findElement(By.xpath("//input[@id='tuesday']"));
        opt2.click();
        WebElement opt3 = driver.findElement(By.xpath("//input[@id='wednesday']"));
        opt3.click();
        Thread.sleep(2000);


        WebElement Selopt = driver.findElement(By.className("custom-select"));//----------------------Dropdown
        Select SelOption = new Select(Selopt);
        SelOption.selectByIndex(2);
        //SelOption.selectByVisibleText("Norway");
        //SelOption.selectByValue("4");

        driver.findElement(By.xpath("//label[normalize-space()='1 year']")).click();//--------Radio Button
        Thread.sleep(2000);

        driver.findElement(By.xpath("//label[normalize-space()='TestNG']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[normalize-space()='Serenity BDD']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[normalize-space()='Selenium Webdriver']")).click();
        Thread.sleep(2000);

        //WebElement FileUpload = driver.findElement(By.xpath("//input[@id='inputGroupFile02']"));
//        FileUpload.click();

         driver.findElement(By.id("inputGroupFile02")).sendKeys("https://www.google.com/\n" +
                "https://thumbs.dreamstime.com/b/beautiful-rain-forest-ang-ka-nature-trail-doi-inthanon-national-park-thailand-36703721.jpg");
    }
}

