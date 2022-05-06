package TestCasesWeb;

import Actions.TestActions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleSVG extends TestActions {
    @BeforeTest
    public void setUp(){
        commonSetUp("https://covid19india.org");
    }

    @Test
    public void testcaseSVG() throws InterruptedException {
        handleSVGGraph();

    }
}
