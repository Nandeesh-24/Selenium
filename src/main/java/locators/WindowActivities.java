package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WindowActivities {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.apple.com/in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        Wait fleuntWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(2))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class);


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-analytics-element-engagement='globalnav hover - iphone']")));



//        driver.navigate().to("https://www.youtube.com"); // use after .get , as this doesn't wait to elements to load- we need to add the wait
//        driver.navigate().back();
//        driver.navigate().forward();
//        driver.navigate().forward();
//
//        driver.switchTo().window(driver.getWindowHandles().stream().toList().get(1));
//
//        driver.getTitle();

        driver.findElement(By.xpath("//div[@data-analytics-element-engagement='globalnav hover - iphone']")).click();

        Thread.sleep(2000);

        driver.quit();
    }

}
