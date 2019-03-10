package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestWalmart {

    public WebDriver driver = null;

    @BeforeMethod
    public void Setup(){
        System.setProperty("webdriver.chrome.driver", "/Users/prodipbhowmik/eclipse-workspace/selenium1/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate ().to("http://walmart.com");
        String title = driver.getTitle();
        Assert.assertEquals(title, "Walmart.com | Save Money. Live Better.");
        driver.manage().window().maximize();
    }

    @Test
    public void Test1(){
        String title = driver.getTitle();
        Assert.assertEquals(title, "Walmart.com | Save Money. Live Better.");
        }

    @Test
    public void Test2(){
        driver.findElement(By.id("home"))


    }
}
