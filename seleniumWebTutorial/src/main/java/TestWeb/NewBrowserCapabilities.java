package TestWeb;

import Actions.TestActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class NewBrowserCapabilities extends TestActions {

    @BeforeTest
    public void setUp(){
        setupWithNewOptions(SELENIUMDEV);
    }
    @Test
    public void testNewCapa(){
        System.out.println("firefox is running");;
    }
}
