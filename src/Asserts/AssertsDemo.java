package Asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertsDemo
{
    @Test
    public void test1()
    {
       // Assert.assertEquals(12, 13);
        Assert.assertEquals("Hello", "Heljlo", "Test case failed");
    }

    @Test
    public void test12()
    {
        // Assert.assertEquals(12, 13);
        Assert.assertEquals("12", "12", "Test case Pass");

    }


}

