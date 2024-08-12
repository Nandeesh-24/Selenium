package dropdowns;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.Driver;

public class LoopDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new Driver("https://rahulshettyacademy.com/dropdownsPractise/").driver;

        //open dropdown
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000);
        for (int i = 0; i < 4; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        Thread.sleep(1000);
        driver.findElement(By.id("btnclosepaxoption")).click();
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
        driver.quit();
    }
}
