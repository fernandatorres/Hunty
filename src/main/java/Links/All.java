package Links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

public class All {
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


        System.out.println("________________________Todos los Links ____________");

        List<WebElement>  listoflinks=driver.findElements(By.tagName("a"));
        Iterator<WebElement> links = listoflinks.iterator();
        //
        while(links.hasNext())
        {
            System.out.println("________________________check link  ____________");

            src= links.next().getAttribute("href");

            if ( src == null || src.isEmpty())
            {
                System.out.println("EL URL no tiene acceso");
                continue;
            }
            try
            {
                http = (HttpURLConnection)(new URL(src).openConnection());
                http.setRequestMethod("HEAD");
                http.connect();

                responseCode = http.getResponseCode();
                System.out.println(responseCode);

                if(responseCode>=400)
                {
                    System.out.println(src + " Link Roto");
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
            System.out.println("________________________All links____________");
        }

        driver.quit();
    }
}