package TestCasesWeb;

import Actions.TestActions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;;


public class HandleNewTab extends TestActions {
    @BeforeTest
    public void setUp(){
        commonSetUp("https://www.way2automation.com/");
    }

    @Test(priority = 2)
    public void newTabTest() throws IOException {
        handleMultipleWindows(FIRSTURL,SECONDURL);
    }

    @AfterTest
    public void tearUp(){
        driver.quit();
        System.out.println("test completed xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }
}
