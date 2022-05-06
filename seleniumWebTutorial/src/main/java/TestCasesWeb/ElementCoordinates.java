package TestCasesWeb;

import Actions.TestActions;
import org.testng.annotations.*;

public class ElementCoordinates extends TestActions {
    @BeforeMethod
    public void setUp() {
        commonSetUp("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
    }

    @Test
    public void testRect() {
        getRectAttributes();
    }

    @AfterMethod
    public void tearUp(){
        driver.close();
    }
}
