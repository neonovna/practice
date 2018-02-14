package withPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    By userName = By.id("user_email");
    By password = By.id("user_password");
    By btnLogin = By.name("commit");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void userLogin(String strUserName, String strPassword){
        driver.findElement(userName).sendKeys(strUserName);
        driver.findElement(password).sendKeys(strPassword);
        driver.findElement(btnLogin).click();
    }
}
