package Actions;

import PageObjects.Homepage;
import PageObjects.LoginPage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static constants.LoginConstants.DEFAULT_LOGIN;
import static constants.LoginConstants.DEFAULT_PASS;
import static constants.ValidationMessages.Incorrect_Login;
import static constants.ValidationMessages.Incorrect_Password;

public abstract class TestActions {
    protected static WebDriver driver;


    public static void commonSetup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        String baseUrl = "https://www.facebook.com";
        driver.get(baseUrl);


    }

    public void getPageLink(WebDriver driver) throws InterruptedException {
        LoginPage loginPage = getLoginPage();
        loginPage.getLogin().sendKeys(DEFAULT_LOGIN);
        loginPage.getPasssword().sendKeys(DEFAULT_PASS);
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        

        String title = driver.getTitle();
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(title, "Facebook - Log In or Sign Up");
        System.out.println("Page title: " + title + " Page URL is: " + URL);
        /* check link on webpage*/
        Assert.assertEquals(URL,"https://www.facebook.com/");
        WebElement link = driver.findElement(By.partialLinkText("Forgot password?"));
        String actuallinkvalue = link.getText();
        Assert.assertEquals(actuallinkvalue,"Forgot password?");
        /*
        WebElement CancelBtn = driver.findElement(By.xpath("//div[@class=\'rfloat _ohf\']/a[@role=\'button\']"));
        String Cancel = CancelBtn.getText();
        CancelBtn.click();
        System.out.println(Cancel);

        WebElement Search = driver.findElement(By.xpath("//div[@class='rfloat _ohf']/button[@value='1']"));
        Search.getText();
        Search.click();
        Thread.sleep(2000);
        System.out.println("search button text is" + Search);

        WebElement Alert = driver.findElement(By.xpath("//div[@class='pam uiBoxRed']/div[@class='_9o4g fsl fwb fcb']"));
        String Alertx = Alert.getText();
        System.out.println("text in Alert is " + Alertx);

         */
    }
    public void invalidPassword(WebDriver driver) {

        LoginPage loginPage = getLoginPage();
        loginPage.getLogin().sendKeys(DEFAULT_LOGIN);
        loginPage.getPasssword().sendKeys(Keys.ENTER);
        String validationMgs = TestActions.driver.findElement(By.className("_9ay7")).getText();
        Assert.assertEquals(validationMgs, Incorrect_Password);
        System.out.println(" value is " + validationMgs);
    }
        public void invalidLogin(WebDriver driver){
            LoginPage loginPage = getLoginPage();
            loginPage.getLogin().sendKeys(Keys.ENTER);
            String valLoginMsg = TestActions.driver.findElement(By.className("_9ay7")).getText();
            Assert.assertEquals(valLoginMsg, Incorrect_Login);
            System.out.println("value is " + valLoginMsg);


        }

    private LoginPage getLoginPage() {
        LoginPage loginPage = new Homepage(driver).getLoginPage();
        loginPage.getBanner().click();
        return loginPage;
    }

    public void cleanUp(){
        driver.quit();

    }

}


