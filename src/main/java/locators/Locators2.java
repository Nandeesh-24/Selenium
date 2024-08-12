package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Locators2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//wait 5 secs before making fail, this is applicable for all

        driver.get("https://www.rahulshettyacademy.com/locatorspractice/");

        String username = "nandeesh";

        driver.findElement(By.id("inputUsername")).sendKeys(username);
        String password = getPassword(driver);

        //regular expression
        //<input type="password" placeholder="Password" name="inputPassword" value="">
        driver.findElement(By.cssSelector("input[type*='Pass']")).sendKeys(password);//rahulshettyacademy

        driver.findElement(By.id("chkboxOne")).click();

        //regular expression
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

        Thread.sleep(1000);

        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.", "login text is incorrect");

        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello " + username + ",");

        driver.quit();
    }

    public static String getPassword(WebDriver driver) throws InterruptedException {

        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        driver.findElement(By.linkText("Forgot your password?")).click();

        Thread.sleep(1000);

        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

        String passwordText = driver.findElement(By.cssSelector("form p")).getText();

//Please use temporary password 'rahulshettyacademy' to Login.

        String[] passwordArray = passwordText.split("'");

// String[] passwordArray2 = passwordArray[1].split("'");

// passwordArray2[0]

        String password = passwordArray[1].split("'")[0];

        return password;

//0th index - Please use temporary password

//1st index - rahulshettyacademy' to Login.


//0th index - rahulshettyacademy

//1st index - to Login.


    }


}
