package Introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class Test6 {
    public static void main(String[] args) throws NoAlertPresentException, InterruptedException, AWTException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.edureka.co/");
        driver.findElement(By.linkText("Courses")).click();

        Robot robot = new Robot();
        Thread.sleep(4000);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(4000);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(4000);
        System.out.println();
        Thread.sleep(4000);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(4000);
        System.out.println("b");
        Thread.sleep(4000);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(4000);
        System.out.println("c");
        robot.mouseMove(30, 100);
        System.out.println("d");
        driver.quit();





    }
}