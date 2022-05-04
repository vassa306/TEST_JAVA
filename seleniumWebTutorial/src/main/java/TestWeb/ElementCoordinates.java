package TestWeb;

import Actions.TestActions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ElementCoordinates extends TestActions {
    @BeforeTest
    public void setUp() {
        commonSetUp("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
    }

    @Test
    public void testRect() {
        getRectAttributes();
    }

    @AfterTest
    public void tearUp(){
        driver.close();
        driver.quit();
    }
}
