package Introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Test4 {
    public static void main(String[] args) throws NoAlertPresentException, InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.edureka.co/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(300);

        Actions builder = new Actions(driver);

        WebElement link = driver.findElement(By.linkText("Cyber Security"));
        builder.moveToElement(link).perform(); // perform the action

        WebElement data = driver.findElement(By.linkText("Big Data"));
        builder.moveToElement(data).perform(); // perform the action

        WebElement visualize = driver.findElement(By.xpath("//a[@class='ga_cat_info_li giTrackElementClpV2'][normalize-space()='BI and Visualization']"));
        builder.moveToElement(visualize).perform(); // perform the action

        // You can perform a click action directly without creating a separate action
        visualize.click();

        // Close the WebDriver
        driver.quit();
    }
}
