package TestWeb;

import Actions.TestActions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.ParseException;

public class HardWaitExercise extends TestActions {
   @BeforeMethod
    public void commonSetUp(){
       commonSetUpHardWait();
   }
   @Test
    public void hardWaitExe() throws InterruptedException, ParseException {
        hardWaitTest();
   }
   @AfterMethod
    public void tearUp(){
       driver.close();
       driver.quit();
   }
}
