package TestCasesWeb;

import Actions.TestActions;
import org.testng.annotations.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class FirstTestClass extends TestActions{

    @BeforeMethod(groups = {"facebook","smoke"})
    public void setUp() {
    commonSetup();
    }

    @Test(priority = 1, groups = "facebook")
    public void getLinks() throws InterruptedException {
    checkPageLink(driver);

    }

    @Test(priority = 2, groups = "smoke")
    public void invalidPassFb(){
        invalidPassword(driver);

    }

    @Test(priority = 3, groups = "smoke")
    public void invalidLoginFb(){
        invalidLogin(driver);

    }

    @Test(priority = 4, groups = "smoke")
    public void getPageLinks(){
        getAllLinks(driver);
    }
    @Test(priority = 5, groups = "smoke")
    public void getFooterLink(){
        getLinksFromFooter(driver);
    }

    @Test(priority = 2, groups = {"facebook", "smoke"})
    public void testCaseRightClick() throws IOException {
        rightClickInFacebook(driver);
    }

    @AfterMethod(groups = {"facebbok","smoke"})
    public void exitTests(){
        tearUp();
    }



    public void main(String[] args) throws InterruptedException, IOException {

        Properties prop = new Properties();
        try (FileInputStream file = new FileInputStream("C:\\devops\\Test_JAVA\\seleniumWebTutorial\\src\\main\\java\\config\\object.properties")) {
            prop.load(file);
            System.out.println(prop.getProperty("login"));
            System.out.println(prop.getProperty("password"));
        }



        }


    }















