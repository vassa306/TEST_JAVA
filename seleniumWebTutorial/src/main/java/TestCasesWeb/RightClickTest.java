package TestCasesWeb;

import Actions.TestActions;
import org.testng.annotations.*;

import java.io.IOException;

public class RightClickTest extends TestActions {
    @BeforeMethod
        public void setUp(){
        commonSetUp(POPUPURL);
    }

    @Test
    public void testcaseClickLink(){

    }
    @Test
    public void testCaseRightClc() throws IOException {
        rightClick();
    }



    @AfterMethod
    public void tearUp(){
        driver.close();
        driver.quit();
    }

}
