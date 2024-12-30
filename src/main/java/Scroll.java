import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class Scroll {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500)");

        Thread.sleep(2000);
        jse.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

        List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
        int count = 0;
        for (WebElement value : values){
            count += Integer.parseInt(value.getText());
        }

        String totalAmount = driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim();
        Assert.assertEquals(count, Integer.parseInt(totalAmount));
        Thread.sleep(3000);
        driver.quit();

    }
}
