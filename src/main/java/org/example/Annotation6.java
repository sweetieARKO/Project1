package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation6 {
        public String baseUrl = "http://www.automationpractice.pl/index.php";
        public WebDriver driver;

        @BeforeTest
        public void launchBrowser() {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
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


