package TestWeb;

import Actions.TestActions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class HandleWebTable extends TestActions {

    @BeforeMethod
    public void setUp(){
        commonSetupWebTable();
    }

    @Test
    public void handleTabless() throws IOException {
        handleWebTables("//table[@class='dataTable']/tbody/tr","//table[@class='dataTable']/tbody/tr[1]/td");
    }

    @AfterMethod
    public void tearUp(){
        driver.close();
        driver.quit();


    }
}
