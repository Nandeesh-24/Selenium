import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {
    public static void main(String[] args) throws InterruptedException {
        int month = 6;
        String day = "15";
        String year = "2027";

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        driver.findElement(By.className("react-date-picker__inputGroup__input")).click();
        driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
        driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
        driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
        driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(month-1).click();
        driver.findElement(By.xpath("//abbr[text()='"+day+"']")).click();

        Thread.sleep(3000);
        driver.quit();
    }
}
