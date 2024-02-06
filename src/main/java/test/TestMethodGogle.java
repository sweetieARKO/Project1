package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objects.FaceBookPage;
import objects.GoogleSearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestMethodGogle {
    WebDriver driver;
    GoogleSearchPage objectrepro;

    @BeforeTest
    public void beforetest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");

    }

    @Test
    public void SearchOpreation() throws InterruptedException {
        GoogleSearchPage page = new GoogleSearchPage(driver);
        page.searchGoogle("Facebook");
        page.clickOnSearchButton();
        page.clickFacebook();
    }
@Test
public void find() throws  InterruptedException{
        FaceBookPage face = new FaceBookPage(driver);
        face.EnterUsername();
        face.EnterPassword();
        face.ClickOnButton();
    Thread.sleep(2000);

}
    @AfterTest
    public void close() throws InterruptedException {
        driver.quit();
    }
}