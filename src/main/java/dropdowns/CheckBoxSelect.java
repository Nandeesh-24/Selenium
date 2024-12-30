package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.Driver;

public class CheckBoxSelect {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new Driver("https://rahulshettyacademy.com/dropdownsPractise/").driver;

        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

        boolean isSelected = driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected();
        Assert.assertTrue(isSelected);

        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

        Thread.sleep(2000);


        driver.quit();
    }
}
