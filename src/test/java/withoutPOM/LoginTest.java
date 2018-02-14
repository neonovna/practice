package withoutPOM;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest {
    @Test
    public void login() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.ultimateqa.com/users/sign_in");
        driver.findElement(By.id("user_email")).sendKeys("Name");
        driver.findElement(By.id("user_password")).sendKeys("QWERTY");
        driver.findElement(By.name("commit")).click();
    }
}
