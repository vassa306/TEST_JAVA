package TestCasesWeb;

import Actions.TestActions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleTabs extends TestActions {
    @BeforeMethod
    public void setUp(){
        commonSetUp("https://www.hollisterco.com/shop/eu");
    }

    @Test
    public void checktabs() throws InterruptedException {
        handleTabs();
    }


    @AfterMethod
    public void tearUp(){
        driver.close();
        driver.quit();
    }
}
