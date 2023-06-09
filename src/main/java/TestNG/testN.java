  package TestNG;
import com.google.common.annotations.VisibleForTesting;
//import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.Assert;

public class testN {
    private String url = "https://demoqa.com/";
    WebDriver driver;

    @BeforeTest
    public void setBaseUrl()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pitufa\\Desktop\\installproyect\\Proyect\\Prueba\\src\\main\\resources\\driver\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get(url);
    }

    @Test
    public void urlTest()
    {
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl, url);

    }
    @AfterTest
    public void closeSessioin ()
    {
        driver.quit();
    }


}
