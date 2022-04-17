package BasicWeb;

import Actions.TestActions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class task1 extends TestActions {
    @BeforeMethod
 public void setUp(){
     commonSetupTask();

    }

    @Test
    public void insertTextIntoInput() throws InterruptedException {
     handleGoogle(driver);
    }

    @AfterMethod
    public void tearUp(){
        driver.close();
    }
}
