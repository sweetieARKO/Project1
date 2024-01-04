package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;


public class Second{
    static WebDriver driver;

    @BeforeTest
    public void LaunchBrowser(String browser) {

        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            default:
                driver = null;
                break;
        }
    }

    @Test
    public void verifyTitle() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https:www.ebay.com");
        driver.findElement(By.cssSelector("#gh-ac")).sendKeys("bags");
        driver.findElement(By.cssSelector("#gh-btn")).click();
    }

    @Test
    public void tittleVarifyWithEdge() {
        WebDriverManager.edgedriver().setup();
        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https:www.ebay.com");
        driver.findElement(By.cssSelector("#gh-ac")).sendKeys("bags");
        driver.findElement(By.cssSelector("#gh-btn")).click();

    }
    
    @Test
    public void tittleVarifyWithFirefox() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        String expectedTitle = "Google";
        String ActualTitle = driver.getTitle();
        if (ActualTitle.equalsIgnoreCase(expectedTitle)) {
            System.out.println(ActualTitle);
        } else {
            System.out.println(driver.getTitle());


        }
        driver.close();
    }

}
