import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;

public class broken {
    public static void main(String[] args) {
        String url = "https://demoqa.com/broken";

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pitufa\\Desktop\\installproyect\\Proyect\\Prueba\\src\\main\\resources\\driver\\chromedriver.exe");
        // Instalar en el navegador

        WebDriver driver = new ChromeDriver();

        // abrir pagina

        driver.get(url);

        //maximizar navegador

        driver.manage().window().maximize();

        WebElement validoLink = driver.findElement(By.xpath("//*[contains(text(),'Click Here for Valid Link')]"));
        WebElement invalidolink = driver.findElement(By.xpath("//*[contains(text(),'Click Here for Broken Link')]"));

        HttpURLConnection http = null;
        int responseCode = 200;
        String src = "";

        src = invalidolink.getAttribute("href");

        System.out.println("Validating this src:" + src);

        try
        {
            http = (HttpURLConnection)(new URL(src).openConnection());
            http.setRequestMethod("HEAD");
            http.connect();

            responseCode = http.getResponseCode();
            System.out.println(responseCode);

            if(responseCode>=400)
            {
                System.out.println(src + "Link Roto");
            }
            else
            {
                System.out.println(src+"Link Correcto");
            }

        }
        catch (Exception e)
        {
            System.out.println("Error Cathed:" + e );
        }
        driver.quit();
    }
}