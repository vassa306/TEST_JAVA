package TestCasesWeb;

import Actions.TestActions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleSVG extends TestActions {
    @BeforeTest
    public void setUp(){
        commonSetUp("https://covid19india.org");
    }

    /*
     parameter duration 90, 30 days
     */
    @Test
    public void testcaseSVG() throws InterruptedException {
        handleSVGGraph(XPATHCOVIDINDIA,90,COVIDH5XPATH);

    }
    @AfterTest
    public void tearUp(){
        driver.close();
        driver.quit();
    }


}
