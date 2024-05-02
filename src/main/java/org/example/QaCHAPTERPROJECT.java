package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class QaCHAPTERPROJECT {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        driver.findElement(By.xpath("//button[normalize-space()='Bank Manager Login']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Add Customer']")).click();
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Abigail");
        driver.findElement(By.xpath("git "));

    }
}