package TestCasesWeb;

import Actions.TestActions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionsEnhancement extends TestActions {
    @BeforeTest
    public void setUp(){
        commonSetUp("https://google.com");

    }

    @Test
    public void testcaseEnhancements(){
        testEnhacement();
    }

    @AfterTest
    public void tearUp(){
        driver.close();
        driver.quit();
    }
}
