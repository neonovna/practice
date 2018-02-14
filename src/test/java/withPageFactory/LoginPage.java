package withPageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    @FindBy(id = "user_email")
    private WebElement userName;

    @FindBy (how = How.ID, using = "user_password")
    private WebElement password;

    @FindBy (name = "commit")
    private WebElement btnLogin;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this); // initialize web elements - first option
    }
    public void userLogin(String strUserName, String strPassword){
        userName.sendKeys(strUserName);
        password.sendKeys(strPassword);
        btnLogin.click();
    }
}
