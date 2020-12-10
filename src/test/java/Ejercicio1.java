import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejercicio1 {

    private WebDriver driver;
    @Test
    public void chormeUp(){
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.close();
    }
}
