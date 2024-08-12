package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    public WebDriver driver = new ChromeDriver();

    public Driver(String url){
        this.driver.get(url);
    }

    public Driver(WebDriver driver, String url){
        this.driver = driver;
        this.driver.get(url);
    }
}
