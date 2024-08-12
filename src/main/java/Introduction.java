import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Introduction {
    public static void main(String[] args) {

        //Steps to invoke chrome driver
//        System.setProperty("webdriver.chrome.driver","//path to chrome.exe file");

        WebDriver driver = new ChromeDriver();

        // goto url
        driver.get("https://rahulshettyacademy.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close(); // only closes original window opened by driver

    }
}