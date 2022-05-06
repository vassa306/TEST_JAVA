package TestCasesWeb;

import Actions.TestActions;
import org.testng.annotations.*;

public class InteractionsResizable extends TestActions {
    @BeforeMethod
    public void setUp(){
        commonSetUp("https://jqueryui.com/resizable/");

    }

    @Test
    public void testcaseResizable(){
        handleResizable(LOCATORFORRES);
    }
    @AfterMethod
    public void tearUp(){
        driver.close();
        driver.quit();
    }
}
