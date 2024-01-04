package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {
public String baseUrl = "https://www.edureka.co/";
public WebDriver driver;
@BeforeTest
public void LaunchBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }
    @Test
    public void varifyHomePageTitle(){
    String expectedTitle ="Instructor-Led Online Training with 24X7 Lifetime Support | Edureka";
    String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
    @AfterTest
    public void terminateBrowser(){
    driver.close();
    }
}