package TestCasesWeb;

import Actions.TestActions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandlingFrames extends TestActions {
    @BeforeTest
    public void setUp(){
        commonSetUp("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
    }

    @Test
    public void testFrame(){
        handleFrame("iframeResult","/html/body/button");
    }

    @AfterTest
    public void tear(){
        tearUp();
    }

}
