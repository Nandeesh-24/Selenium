import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SslCheck {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true); // bypass ssl error

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://expired.badssl.com/");

        System.out.println(driver.getTitle());

        Thread.sleep(2000);

        driver.quit();
    }
}
