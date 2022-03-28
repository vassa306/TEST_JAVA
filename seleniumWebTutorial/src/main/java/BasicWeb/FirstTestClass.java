package BasicWeb;

import Actions.TestActions;
import org.openqa.selenium.WebDriver;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class FirstTestClass extends TestActions {



    public static void main(String[] args) throws InterruptedException, IOException {

        Properties prop = new Properties();
        try (FileInputStream file = new FileInputStream("C:\\Developer\\seleniumWebTutorial\\src\\main\\java\\config\\object.properties")) {
            prop.load(file);
            System.out.println(prop.getProperty("login"));
            System.out.println(prop.getProperty("password"));
        }
            TestActions.commonSetup();
            logIntoFB(driver);


        }


    }















