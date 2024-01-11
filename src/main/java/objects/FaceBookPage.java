package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class FaceBookPage {
    WebDriver driver;

    public FaceBookPage(WebDriver driver) {
        this.driver = driver;
    }

    By Username_editbox = By.xpath("//input[@id='email']");
    By Password_editbox = By.xpath("//input[@id='pass']");
    By Login_editbox = By.name("login");

    public void EnterUsername() throws InterruptedException {
        try {
            driver.findElement(Username_editbox).sendKeys("Tester");
        } catch (Exception e) {
            System.out.println(STR."Exception caught: \{e.getMessage()}");
    ;

        }
    }

    public void EnterPassword() {
        try {
            driver.findElement(Password_editbox).sendKeys("Test123");
        } catch (Exception e) {
            System.out.println("Exception caught" + e.getMessage());


        }


    }

    public void ClickOnButton() {
        try {
            driver.findElement(Login_editbox).click();
            String title = driver.getTitle();
            assertEquals(title, "Login page");
        } catch (Exception e) {
            System.out.println("Exception caught" + e.getMessage());
        }
    }
}