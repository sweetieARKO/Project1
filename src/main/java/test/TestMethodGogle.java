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
        driver.manage().window().maximize();
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
//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line first-item-of-tablet-line first-item-of-mobile-line hovered']//img[@title='Printed Dress']
}
    @AfterTest
    public void close() throws InterruptedException {
        driver.quit();
    }
}
//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line first-item-of-tablet-line first-item-of-mobile-line hovered']//img[@title='Printed Dress']