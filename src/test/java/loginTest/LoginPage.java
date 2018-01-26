package loginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By username = By.id("user_email");
    By pass = By.id("user_password");
    By loginBtn = By.id("btn-signin");

    public void navigateToPage() {
        driver.get(Constants.URL);
    }

    public void loginWithEmpty() {
        driver.findElement(loginBtn).click();
    }
}


