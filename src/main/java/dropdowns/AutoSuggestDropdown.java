package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import java.util.List;

public class AutoSuggestDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new Driver("https://rahulshettyacademy.com/dropdownsPractise/").driver;

        driver.findElement(By.id("autosuggest")).sendKeys("ind");

        Thread.sleep(3000);

        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        for (WebElement option : options){
            if (option.getText().equalsIgnoreCase("India")){
                option.click();
                break;
            }
        }

        Thread.sleep(2000);

        driver.quit();
    }
}
