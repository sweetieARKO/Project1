package Introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class locators {

    public static void main(String[] args) throws NoAlertPresentException, InterruptedException, AWTException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.id("login1")).sendKeys("abc@gmail.com");
        driver.findElement(By.name("passwd")).sendKeys("defdW@1q");
        driver.findElement(By.name("proceed")).click();
       System.out.println(driver.findElement(By.id("div_login_error")).getText());
       driver.findElement(By.linkText("Forgot Password?")).click();
       driver.navigate().back();
       driver.findElement(By.partialLinkText("Password")).click();
       driver.navigate().back();
       driver.navigate().forward();
    }
}
