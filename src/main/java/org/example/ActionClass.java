package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40L, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        driver.get("https://www.edureka.co/");
        Thread.sleep(3000);
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(By.id("header_topcat"))).build().perform();
        Thread.sleep(2000);
        WebElement link = driver.findElement(By.cssSelector("#software-testing-certification-courses"));
        builder.moveToElement(link).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath(""));

}

}
