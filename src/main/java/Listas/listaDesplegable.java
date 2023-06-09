package Listas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listaDesplegable {
    public static void main(String[] args) {
        String url = "https://demoqa.com/select-menu";

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pitufa\\Desktop\\installproyect\\Proyect\\Prueba\\src\\main\\resources\\driver\\chromedriver.exe");
        // Instalar en el navegador

        WebDriver driver=new ChromeDriver();

        // abrir pagina

        driver.get(url);

        //maximizar navegador

        driver.manage().window().maximize();

        Select listaDesplegable1 = new Select(driver.findElement(By.id("oldSelectMenu")));

        listaDesplegable1.selectByIndex(5);
        //listaDesplegable1.selectByValue("7");




    }


}

