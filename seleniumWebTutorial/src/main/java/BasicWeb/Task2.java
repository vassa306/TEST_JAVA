package BasicWeb;

import Actions.TestActions;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task2 extends TestActions {
    @BeforeMethod
    public void setUp(){
        commonSetupForm();


    }
    @Test
    public void handleForm() {
        insertIntoForm(driver);
    }

    @AfterMethod()
        public void tearUp(){
            driver.close();
            driver.quit();
        }
    }

