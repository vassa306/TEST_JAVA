package TestWeb;

import Actions.TestActions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class PrintingToPDF extends TestActions {
   @BeforeTest
    public void setUp(){
       commonSetUpPrint("https://selenium.dev");
   }
    @Test(priority = 1)
    public void testPrinttoPdf() throws IOException {
        printToPDF("selenium");
    }

}
