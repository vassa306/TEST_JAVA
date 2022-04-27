package TestWeb;

import Actions.TestActions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class handleTabPopUp extends TestActions {
    @BeforeMethod
     public void setUp(){
        commonSetUp("https://www.hdfc.com/");
    }
    @Test(priority = 1)
    public void test1(){
        handlesWindows();
    }

}
