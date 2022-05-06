package TestCasesWeb;

import Actions.TestActions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class HandleParrentFrame extends TestActions {
    @BeforeTest
    public void setUp(){
        commonSetUp("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe_frameborder_css");
    }

    @Test
    public void firsttest() throws IOException {

        swichToParrentFrame();

    }

    @AfterTest
    public void tearUp(){
        driver.close();
        driver.quit();

    }

}
