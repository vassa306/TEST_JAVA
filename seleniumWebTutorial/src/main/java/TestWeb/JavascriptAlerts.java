package TestWeb;

import Actions.TestActions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavascriptAlerts extends TestActions {
    @BeforeTest
    public void seatUp(){
        commonSetUp(REDIFF);
    }

    @Test
    public void testcaseAlert() {
        handleJSAlert();
    }

    @AfterMethod
    public void tearUp(){
        System.out.println("Test completed");
        driver.close();
       driver.quit();
    }
}
