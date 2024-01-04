package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchFrame {
    //
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower d


        public static void main(String[] args) throws NoAlertPresentException, InterruptedException {
            WebDriverManager.chromedriver().setup();
            ChromeDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.google.com");
            driver.switchTo().frame("Fail");
        }
    }


