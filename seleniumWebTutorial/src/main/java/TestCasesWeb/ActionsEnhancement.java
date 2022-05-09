package TestCasesWeb;

import Actions.TestActions;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.List;

public class ActionsEnhancement extends TestActions {



    @BeforeMethod
    public void setUp(){
        commonSetUp("https://google.com");

    }

    @Test
    public void testcaseEnhancements() throws IOException {
        getLocationOfElement();
    }

    @AfterMethod
    public void EndTest(){
        tearUp();
    }
}
