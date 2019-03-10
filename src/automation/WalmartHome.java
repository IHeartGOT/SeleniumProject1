package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class WalmartHome {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "/Users/prodipbhowmik/eclipse-workspace/selenium1/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("http://walmart.com");
        String title = driver.getTitle();
        Assert.assertEquals(title, "Walmart.com | Save Money. Live Better.");
        driver.manage().window().maximize();
        driver.close();
    }
}
