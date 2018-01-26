package loginTest;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class LoginTest {

    WebDriver driver;
    LoginPage loginPage;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.navigateToPage();
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void checkTitle() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "Ultimate QA";
        assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void loginWithEmptyCredentials() {
        loginPage.loginWithEmpty();
    }

}
