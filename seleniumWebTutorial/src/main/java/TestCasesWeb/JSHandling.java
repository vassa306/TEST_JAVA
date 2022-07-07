package TestCasesWeb;

import Actions.TestActions;
import org.testng.annotations.*;

import java.text.ParseException;

public class JSHandling extends TestActions {
    @BeforeSuite
    public void setUp(){
        commonSetupHandleJs();
    }

    @Test
    public void testJsDropdown() throws InterruptedException {
        handleJSelement("fromPlaceName");
    }

    @Test
    public void pickerFrom() throws ParseException {
        pickValueFromPicker("txtJourneyDate","16","May","2022");


    }

    @Test
    public void pickerTo()throws ParseException{
        pickValueFromPicker("txtReturnJourneyDate","25","May","2022");
    }



    @AfterSuite
    public void tearUp(){

        driver.quit();
    }

}
