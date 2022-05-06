package TestCasesWeb;

import Actions.TestActions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.ParseException;

public class JSHandling extends TestActions {
    @BeforeMethod
    public void setUp(){
        commonSetupHandleJs();
    }

    @Test
    public void testJsDropdown() throws InterruptedException {
        handleJSelement("fromPlaceName");
    }

    @Test
    public void pickerFrom() throws ParseException {
        pickValueFromPicker("txtJourneyDate","5","May","2022");


    }

    @Test
    public void pickerTo()throws ParseException{
        pickValueFromPicker("txtReturnJourneyDate","25","May","2022");
    }



    @AfterMethod
    public void tearUp(){
        driver.close();
        driver.quit();
    }

}
