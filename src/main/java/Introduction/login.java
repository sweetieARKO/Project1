package Introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class login {
    public static void main(String[] args) throws NoAlertPresentException, InterruptedException, AWTException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com");
        driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.name("firstname")).sendKeys("Abigail");
        driver.findElement(By.name("lastname")).sendKeys("Arko");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("arkoabigail027@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("arkoabigail027@gmail.com");
        WebElement Password =  driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
        Password.sendKeys("Abigail243&open");
       WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        Select dropdown =new Select(month);
        dropdown.selectByValue("6");
        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
        Select find = new Select(day);
        find.selectByIndex(9);
        WebElement year = driver.findElement(By.id("year"));
        Select select = new Select(year);
        select.selectByVisibleText("1999");
        List<WebElement> sex = driver.findElements(By.name("sex"));
        for (WebElement e:sex){
            if (e.getAttribute("value").equalsIgnoreCase("1")){
                e.click();

              }
            driver.findElement(By.name("websubmit")).click();
          }

    }
    }
