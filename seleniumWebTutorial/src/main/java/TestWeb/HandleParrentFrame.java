package TestWeb;

import Actions.TestActions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class HandleParrentFrame extends TestActions {
    @BeforeTest
    public void setUp(){
        commonSetUp("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_frames2");
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
