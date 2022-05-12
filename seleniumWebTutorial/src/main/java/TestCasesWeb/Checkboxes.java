package TestCasesWeb;

import Actions.TestActions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class Checkboxes extends TestActions {
    @BeforeMethod
    public void setUp(){
        commonSetUp("https://www.w3.org/TR/wai-aria-practices-1.1/examples/checkbox/checkbox-2/checkbox-2.html");
    }

    @Test
    public void handleCheckboxes() throws IOException {
        tickCheckboxesNewPage(driver);
    }

    @AfterMethod
    public void tearUp(){
        driver.quit();
    }
}
