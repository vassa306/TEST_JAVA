package TestWeb;

import Actions.TestActions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class HandleBasicAuth extends TestActions {
    @BeforeTest
    public void setUp(){
        /*
        One way is add admin:admin@ before start of domain
         */
        commonSetUpBasicAuth("https://the-internet.herokuapp.com/basic_auth");
    }

    @Test
    public void test1BasicAuth() throws IOException {
        basicAuthorization();

    }
    @AfterTest
    public void tearUp(){
        driver.close();
        driver.quit();
    }
}
