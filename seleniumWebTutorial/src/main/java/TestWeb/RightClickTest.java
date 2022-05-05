package TestWeb;

import Actions.TestActions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class RightClickTest extends TestActions {
    @BeforeTest
        public void setUp(){
        commonSetUp("https://deluxe-menu.com/popup-mode-sample.html");
    }

    @Test
    public void testCaseRightClc() throws IOException {
        rightClick();
    }

    @AfterTest
    public void tearUp(){
        driver.close();
        driver.quit();
    }

}
