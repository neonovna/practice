package loginTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class loginTest extends base {

    @Test
    public void checkTitle() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "Ultimate QA";
        assertEquals(expectedTitle, actualTitle);
    }


}
