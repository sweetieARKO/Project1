package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Action {
    public static void main(String[] args) throws NoAlertPresentException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        WebElement images = driver.findElement(By.xpath("//a[contains(text(),'Images')]"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions act = new Actions(driver);
        act.contextClick(images).build().perform();
    }
}
