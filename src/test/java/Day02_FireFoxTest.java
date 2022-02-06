import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day02_FireFoxTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");

        WebDriver driver= new FirefoxDriver();

        driver.get("https://www.google.com");

        driver.manage().window().maximize();





    }
}
