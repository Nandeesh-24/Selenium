package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class StaticDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver  = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

        Select dropdown = new Select(staticDropdown);

        //select by index
        dropdown.selectByIndex(2);
        Assert.assertEquals(dropdown.getFirstSelectedOption().getText(), "AED");

        Thread.sleep(1000);

        //select by visibile text
        dropdown.selectByVisibleText("USD");
        Assert.assertEquals(dropdown.getFirstSelectedOption().getText(), "USD");

        Thread.sleep(1000);

        //select by value
        dropdown.selectByValue("INR");
        Assert.assertEquals(dropdown.getFirstSelectedOption().getText(), "INR");

        Thread.sleep(2000);
        driver.quit();
    }
}
