import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {
    WebDriver driver;


    @Test
    public void starting_point() {

        WebDriverManager.chromedriver().setup();
        System.out.println("welcome");
        driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.close();
    }
}