package Introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class popup {

    public static void main(String[] args) throws NoAlertPresentException, InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        String username = "abc";
        String password ="123";
        String url = "https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth";
        driver.get(url);

    }
}
