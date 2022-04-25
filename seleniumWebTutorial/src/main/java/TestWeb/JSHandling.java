package TestWeb;

import Actions.TestActions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JSHandling extends TestActions {
    @BeforeMethod
    public void setUp(){
        commonSetupHandleJs();
    }

    @Test
    public void testJsDropdown() throws InterruptedException {
        handleJSelement("fromPlaceName");
    }

    @AfterMethod
    public void tearUp(){
        driver.close();
        driver.quit();
    }

}
