package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
    private WebDriver driver;

    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    By searchBox = By.xpath("//textarea[@id='APjFqb']");
    By search_btn = By.xpath("(//input[@name='btnK'])[1]");
    By Facebook_link = By.xpath("//a/h3[normalize-space()='Facebook - log in or sign up']");

    public void searchGoogle(String searchInput) {
        try {
            WebElement searchBoxElement = driver.findElement(searchBox);
            searchBoxElement.sendKeys(searchInput);
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public void clickOnSearchButton() {
        try {
            driver.findElement(search_btn).click();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public void clickFacebook() {
        try {
            driver.findElement(Facebook_link).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
