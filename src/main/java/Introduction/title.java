package Introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class title {
    public static void main(String[] args) throws NoAlertPresentException, InterruptedException, AWTException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com");
        String ActualTitle =  driver.getTitle();
        String ExpectedTitle ="Facebook - log in or sign up";
        if (ActualTitle.equals(ExpectedTitle)) {
            System.out.println(STR."This is the title of the webpage\{ActualTitle}");
        } else{
                System.out.println(STR."This is not the title of the webpage\{ActualTitle}");

            }
        driver.quit();
        }

    }
