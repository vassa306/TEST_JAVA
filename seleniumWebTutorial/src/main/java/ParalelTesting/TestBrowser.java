package ParalelTesting;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestBrowser {

    @Parameters({"browser"})
    @Test
    public void doLogin(String b){
        System.out.println("browser name " + b);

    }
}
