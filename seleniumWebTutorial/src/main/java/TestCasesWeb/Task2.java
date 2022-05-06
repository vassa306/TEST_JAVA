package TestCasesWeb;

import Actions.TestActions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class Task2 extends TestActions {
    @BeforeMethod
    public void setUp(){
        commonSetupForm();


    }
    @Test
    public void handleForm() throws IOException {
        insertIntoForm(driver);
        captureFullpage("automation");
    }


    @AfterMethod()
        public void tearUp(){
            driver.close();
            driver.quit();
        }
    }

