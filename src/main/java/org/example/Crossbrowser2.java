package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Crossbrowser2 {
    static WebDriver driver;


    @BeforeTest
    public void MineBrowser(String browser) {
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


        }
    }

    @Test
    public void verifyTitle() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        String expectedTitle = "Google";
        String ActualTitle = driver.getTitle();
        if (ActualTitle.equalsIgnoreCase(expectedTitle)) {
            System.out.println(ActualTitle);
        } else {
            System.out.println(driver.getTitle());
        }
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("What is Software Testing" + Keys.ENTER);
    }

    @Test
    public void tittleVarifyWithEdge() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.edureka.co/");
        WebElement search = driver.findElement(By.xpath("//input[@class='new-search-inp ui-autocomplete-input"));
        search.sendKeys("Software testing");

        String ActualTitle = driver.getTitle();


    }


    @Test
    public void tittleVarifyWithFirefox() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        userName.sendKeys("Admin");
        password.sendKeys("admin123");
        button.click();

    }
}
