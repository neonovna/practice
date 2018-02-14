package withPOM;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    WebDriver driver;
    LoginPage loginPage;

    @Test
    public void login(){
        driver = new ChromeDriver();
        driver.get("https://courses.ultimateqa.com/users/sign_in");
        loginPage = new LoginPage(driver);
        loginPage.userLogin("Name", "QWERTY");
    }
}

