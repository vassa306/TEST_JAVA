package TestCasesWeb;

import Actions.TestActions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class testMobile extends TestActions
{

    @BeforeTest
    public void seUpMobile(){
        setUpForIphone("https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
     //   phoneSetup("https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

    }
    @Test
    public void loginGmailMobile() throws IOException {
        testMobileIphone();

    }

    @AfterTest
    public void tearUp(){
        driver.close();
        driver.quit();
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx Test completed");
    }

}
