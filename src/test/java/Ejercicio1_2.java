import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejercicio1_2 {
    private WebDriver driver;
    @Test
    public void facebookUp(){
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.close();
    }
}
