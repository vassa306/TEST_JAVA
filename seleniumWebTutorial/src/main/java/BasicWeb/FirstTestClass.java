package BasicWeb;

import Actions.TestActions;
import org.testng.*;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class FirstTestClass extends TestActions{

    @BeforeTest
    public void setUp(){
    commonSetup();
    }

    @Test(priority = 1)
    public void validLoginFb() throws InterruptedException {
    validLogin(driver);
    }

    @Test
    public void invalidLoginFb(){

    }

    @AfterTest
    public void cleanUp(){
        driver.close();

    }

    @AfterSuite
    public void exitTests(){
        driver.quit();
    }








    public static void main(String[] args) throws InterruptedException, IOException {

        Properties prop = new Properties();
        try (FileInputStream file = new FileInputStream("C:\\devops\\Test_JAVA\\seleniumWebTutorial\\src\\main\\java\\config\\object.properties")) {
            prop.load(file);
            System.out.println(prop.getProperty("login"));
            System.out.println(prop.getProperty("password"));
        }
            TestActions.commonSetup();
            validLogin(driver);


        }


    }















