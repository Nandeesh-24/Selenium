import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscelleanous {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //maximize window
        driver.manage().window().maximize();

        //delete all cookies
        driver.manage().deleteAllCookies();

        //delete cookie
        driver.manage().deleteCookieNamed("ghjk");

    }
}
