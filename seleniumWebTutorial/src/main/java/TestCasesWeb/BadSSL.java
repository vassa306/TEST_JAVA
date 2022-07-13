package TestCasesWeb;

import Actions.TestActions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class BadSSL extends TestActions {
    @BeforeTest
    public void setUp() {
        setUpWithBasSSL("https://expired.badssl.com/");
    }

    @Test
    public void testcaseBadSSl() throws IOException {
        checkOptions(driver);
        System.out.println("Bad SSL page appears");
    }

    @AfterMethod
    public void exitTests(){
        tearUp();
    }



}

