import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deneme {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.techproeducation.com/");

        String expectedUrl = "www.techproeducation.com";
        String actualUrl = driver.getCurrentUrl();

        if(expectedUrl.equals(actualUrl)){

            System.out.println("Passed");
        }else{
            System.out.println("failed");
            System.out.println("gecerli Url ;" + actualUrl);

        }

        driver.close();
    }
}
