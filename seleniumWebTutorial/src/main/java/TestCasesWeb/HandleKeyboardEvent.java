package TestCasesWeb;

import Actions.TestActions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class HandleKeyboardEvent extends TestActions {

    @BeforeTest
    public void setUp(){
        commonSetUp(TESTGMAIL);
    }

    @Test
    public void testcaseHandleKeyboard() throws IOException {
        pressKeyboard(GMAILSEARCHBOXID);
    }

    @AfterTest
    public void tearUp(){
        driver.close();
        driver.quit();
    }

}
