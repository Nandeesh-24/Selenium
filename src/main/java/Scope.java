import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Scope {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElements(By.tagName("a")).size());

        //limit the scope --> footer
        WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
        System.out.println(footerDriver.findElements(By.tagName("a")).size());

        //limit the scope --> first column in footer
        WebElement columnDriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        int count = columnDriver.findElements(By.tagName("a")).size();
        System.out.println(count);


        for (int i = 1; i < count; i++){

            //create keyboard command
            String clickOnLinkText = Keys.chord(Keys.COMMAND, Keys.ENTER);
            columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkText);
        }

        Set<String> childWindows = driver.getWindowHandles();

        Iterator<String> it = childWindows.iterator();
        it.next();
        while (it.hasNext()){
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }

        Thread.sleep(2000);
        driver.quit();
    }
}
