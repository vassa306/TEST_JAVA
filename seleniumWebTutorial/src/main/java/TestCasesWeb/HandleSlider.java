package TestCasesWeb;

import Actions.TestActions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class HandleSlider extends TestActions {
        @BeforeTest
        public void setUp(){
            commonSetUp("https://jqueryui.com/slider/");
        }

        @Test
        public void TestcaseSlider() throws IOException {
            handleDemoSlider(driver,700,FRAME);
        }




}
