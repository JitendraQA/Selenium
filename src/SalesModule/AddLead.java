package SalesModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

//--------------------Add lead operation
public class AddLead
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://sdash-development.s3-website.us-east-2.amazonaws.com/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@title='Sales']")).click();
        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("jtr@taglineinfotech.com");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("test@123");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

        driver.findElement(By.xpath("//div[@class='sidebar-toggle']//*[name()='svg']")).click();
        driver.findElement(By.xpath("//div[@class='sc-ZqFbI icOIxW']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Leads']")).click();
        driver.findElement(By.xpath("//button[@class='sc-eDvSVe hnZiph btn-main']")).click();

        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Paul");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Mason");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("458158458");
        driver.findElement(By.xpath("//input[@placeholder='E-Mail']")).sendKeys("test12@yopmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Client 1 Ownership %']")).sendKeys("50");

        //--Financial Method
        WebElement dropdown = driver.findElement(By.xpath("//div[11]//div[1]//div[2]//*[name()='svg']"));
        dropdown.click();
        driver.findElement(By.xpath("//li[normalize-space()='Cash']")).click();


//            WebElement dropdown1 = driver.findElement(By.xpath("//div[12]//div[1]//div[2]//*[name()='svg']")); /--Area on Interest
//            dropdown1.click();
//            driver.findElement(By.xpath("//input[@id='1']")).click();
//            driver.findElement(By.xpath("//input[@id='2']")).click();
//            //driver.findElement(By.xpath("//div[contains(text(),'Area on Interest')]")).click();
//            WebElement drop2 = driver.findElement(By.xpath("//div[@id='sidebar']"));
//            drop2.click();

            //---Land
            WebElement dropdown3 = driver.findElement(By.xpath("//div[13]//div[1]//div[2]//*[name()='svg']"));
            dropdown3.click();
            driver.findElement(By.xpath("//li[normalize-space()='Owns land']")).click();

            //---Lead Type
            WebElement dropdown4 = driver.findElement(By.xpath("//div[14]//div[1]//div[2]//*[name()='svg']"));
            dropdown4.click();
            driver.findElement(By.xpath("//li[normalize-space()='Facebook']")).click();

            //---Agent1
            WebElement dropdown5 = driver.findElement(By.xpath("//div[@class='col-md-10 mb-3']//div[2]//div[2]//*[name()='svg']"));
            dropdown5.click();
            driver.findElement(By.xpath("//li[normalize-space()='Andrew (216)']")).click();

            //---Agent2
            WebElement dropdown6 = driver.findElement(By.xpath("//div[16]//div[1]//div[2]//*[name()='svg']"));
            dropdown6.click();
            driver.findElement(By.xpath("//li[normalize-space()='Forwarded to Peter (499)']")).click();

            //Add lead
            driver.findElement(By.xpath("//span[normalize-space()='Add Lead']")).click();

    }
}
