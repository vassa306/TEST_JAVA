package TestCasesWeb;

import Actions.TestActions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDropTest extends TestActions {
    @BeforeTest
    public void seatUp(){
        commonSetUp("https://jqueryui.com/droppable/");
    }

    @Test
    public void testcaseDroppable(){
        dragAndDrop(driver);
    }

     @AfterMethod
    public void tearUp() {
         driver.close();
         driver.quit();
     }



}
