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
        phoneSetup("http//gmail.com");

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
