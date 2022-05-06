package TestCasesWeb;

import Actions.TestActions;
import org.testng.annotations.AfterTest;
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
        printToPDF(driver,"selenium");
    }
    @AfterTest
    public void tearUp(){
       driver.close();
       driver.quit();
    }

}
