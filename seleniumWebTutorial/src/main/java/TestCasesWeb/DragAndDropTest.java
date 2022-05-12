package TestCasesWeb;

import Actions.TestActions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class DragAndDropTest extends TestActions {
    @BeforeTest
    public void seatUp(){
        commonSetUp(JQUERYEX);
    }

    @Test
    public void testcaseDroppable() throws IOException {
        dragAndDropJS(driver);
    }

    @AfterMethod
    public void tearUp() {
         driver.close();
         driver.quit();
     }



}
