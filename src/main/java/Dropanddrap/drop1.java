package Dropanddrap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drop1 {
    public static void main(String[] args) {
        String url = "https://demoqa.com/droppable";

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pitufa\\Desktop\\installproyect\\Proyect\\Prueba\\src\\main\\resources\\driver\\chromedriver.exe");
        // Instalar en el navegador

        WebDriver driver = new ChromeDriver();

        // abrir pagina

        driver.get(url);

        //maximizar navegador

        driver.manage().window().maximize();

        //intancia de accion
        Actions action = new Actions(driver);
        //definir the from and to
        WebElement from = driver.findElement(By.id("draggable"));
        WebElement to = driver.findElement(By.id("droppable"));

        //usar el metodo
        action.dragAndDrop(from,to).build().perform();



    }

}