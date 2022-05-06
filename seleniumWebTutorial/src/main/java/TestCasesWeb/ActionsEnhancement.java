package TestCasesWeb;

import Actions.TestActions;
import org.testng.annotations.*;

public class ActionsEnhancement extends TestActions {
    @BeforeMethod
    public void setUp(){
        commonSetUp("https://google.com");

    }

    @Test
    public void testcaseEnhancements(){
        testEnhacement();
    }

    @AfterMethod
    public void EndTest(){
        tearUp();
    }
}
