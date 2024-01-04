package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class firefoxAnotations7 {
        public String baseUrl = "http://www.automationpractice.pl/index.php";
        public WebDriver driver;

        @BeforeTest
        public void launchBrowser() {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get(baseUrl);

        }
        @Test
        public void verifyHomePageTitle() {
            driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("T-shirts" );
            driver.findElement(By.xpath("//button[@class='btn btn-default button-search']")).click();
        }

        // @AfterTest
        //public void tearDown() {
        //  if (driver != null) {
        //    driver.quit();
        //  System.out.println("Browser closed");
        //}
        //}
    }



