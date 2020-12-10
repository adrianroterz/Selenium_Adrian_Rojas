import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejercicio2 {

    private WebDriver driver;

    @Test
    public void mostrarTitulo() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.close();

    }
}