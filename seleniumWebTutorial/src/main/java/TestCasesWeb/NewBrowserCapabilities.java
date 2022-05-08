package TestCasesWeb;

import Actions.TestActions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewBrowserCapabilities extends TestActions {

    @BeforeTest
    public void setUp(){
        setupWithNewOptions(SELENIUMDEV);
    }
    @Test
    public void testNewCapa(){
        System.out.println("firefox is running");;
    }

    @AfterTest
    public void tearUp(){
        driver.close();
        driver.quit();
    }


}
