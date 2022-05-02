package TestWeb;

import Actions.TestActions;
import com.sun.org.apache.xml.internal.security.utils.JavaUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import static constants.TestConstants.DEFAULT_LOGIN;

public class testMobile extends TestActions
{
    @BeforeTest
    public void seUpMobile(){
        phoneSetup("https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
                ;
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
