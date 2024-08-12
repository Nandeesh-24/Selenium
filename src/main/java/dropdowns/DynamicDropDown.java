package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class DynamicDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new Driver("https://rahulshettyacademy.com/dropdownsPractise/").driver;

        //open From drop down
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        //select From station
        driver.findElement(By.xpath("//a[@value='BLR']")).click();

        Thread.sleep(1000);

        //open To drop down
//        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

        Thread.sleep(2000);

        driver.quit();
    }
}
