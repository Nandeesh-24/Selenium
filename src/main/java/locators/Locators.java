package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Locators {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        //wait 5 secs before making fail, this is applicable for all
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //goto url
        driver.get("https://www.rahulshettyacademy.com/locatorspractice/");

        //find by id
        driver.findElement(By.id("inputUsername")).sendKeys("nandeesh");

        //find by name
        driver.findElement(By.name("inputPassword")).sendKeys("1234@123");//rahulshettyacademy

        //find by classname
        driver.findElement(By.className("signInBtn")).click();
        
        //find by css selector - p.error : p is tag, .error is class
        String error = driver.findElement(By.cssSelector("p.error")).getText();

        System.out.println(error);

        //find by link text
        driver.findElement(By.linkText("Forgot your password?")).click();

        Thread.sleep(1000);

        //find by xpath
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");

        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");

        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();

        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");

        driver.findElement(By.xpath("//form/input[3]")).sendKeys("39083008308");

        driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();

        String info = driver.findElement(By.cssSelector("form p")).getText();

        System.out.println(info);

        driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();

        //To avoid the interception error, when changing from one view to another view within same url
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("nandeesh");

        //find by css selector using regular expression , *
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();

        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(file,new File("/"+"sample.jpeg"));

        //find by xpath using contains
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
        

//        driver.quit();


    }
}
