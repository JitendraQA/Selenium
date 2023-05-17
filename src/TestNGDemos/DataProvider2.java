package TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2
{
    WebDriver driver;
    @BeforeTest //---------------Executed before the execution of all the test methods
    public void Openbrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterTest  //---------------Executed after the execution of all the test methods
    public void Closebrowser()
    {
        driver.close();
    }
    @Test(dataProvider = "LoginData")
    public void LoginTest(String username, String password) throws InterruptedException
    {
        driver.get("http://sdash-development.s3-website.us-east-2.amazonaws.com/");
        driver.findElement(By.xpath("//div[@title='Sales']")).click(); //-------------Sales dept
        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys(username);
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
        //driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        Thread.sleep(2000);

    }
    @DataProvider(name="LoginData")
    public Object[][] passData()
    {
        Object[][] data = new Object[4][2];

        data[0][0]="test@gmail.com";
        data[0][1]="1111";

        data[1][0]="test12@gmail.com";
        data[1][1]="12345";

        data[2][0]="";
        data[2][1]="";

        data[3][0]="jtr@taglineinfotech.com";
        data[3][1]="test@123";

        return data;
    }


}
