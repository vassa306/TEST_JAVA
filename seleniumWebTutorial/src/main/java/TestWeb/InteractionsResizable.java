package TestWeb;

import Actions.TestActions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InteractionsResizable extends TestActions {
    @BeforeTest
    public void setUp(){
        commonSetUp("https://jqueryui.com/resizable/");

    }

    @Test
    public void testcaseResizable(){
        handleResizable();
    }
    @AfterTest
    public void tearUp(){
        driver.close();
        driver.quit();
    }
}
