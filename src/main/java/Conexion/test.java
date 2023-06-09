package Conexion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class test {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pitufa\\Desktop\\installproyect\\Proyect\\Prueba\\src\\main\\resources\\driver\\chromedriver.exe");
        // Instalar en el navegador

        WebDriver driver=new ChromeDriver();

        // abrir pagina

        driver.get("https://demoqa.com");

        //maximizar navegador

        driver.manage().window().maximize();


    }
}
