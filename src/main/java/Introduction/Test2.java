package Introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test2 {
        public static void main(String[] args) throws NoAlertPresentException, InterruptedException {
            WebDriverManager.firefoxdriver().setup();
             WebDriver driver = new FirefoxDriver();
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
    }


