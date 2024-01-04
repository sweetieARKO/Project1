package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class Annotations {

    static WebDriver driver;
    public String baseUrl = "https://www.edureka.co";

        @Test
        public void verifyTitle() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(baseUrl);
            String expectedTitle = "Instructor-Led Online Training with 24X7 Lifetime Support | Edureka";
            String ActualTitle = driver.getTitle();
            if (ActualTitle.equalsIgnoreCase(expectedTitle)) {
                System.out.println(ActualTitle);
            } else {
                System.out.println(driver.getTitle());
            }
        driver.close();
        }


    }
