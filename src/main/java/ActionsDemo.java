import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.in/");

        //action class
        Actions a = new Actions(driver);

        WebElement moveto = driver.findElement(By.id("nav-link-accountList"));

        //enter text with shift down
        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox")))
                .click()
                .keyDown(Keys.SHIFT).sendKeys("hello")
                .doubleClick()
                .build()
                .perform();

        //moveto specific element and right click
        a.moveToElement(moveto).contextClick().build().perform();

        Thread.sleep(2000);

        driver.quit();
    }
}
