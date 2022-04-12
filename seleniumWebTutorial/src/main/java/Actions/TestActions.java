package Actions;

import PageObjects.Homepage;
import PageObjects.LoginPage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static constants.LoginConstants.*;
import static constants.ValidationMessages.*;

public abstract class TestActions {
    protected static WebDriver driver;


    public static void commonSetup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
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
        Assert.assertEquals(title,LOGINPAGE_TITLE );
        System.out.println("Page title: " + title + " Page URL is: " + URL);
        /* check link on webpage*/
        Assert.assertEquals(URL,LOGINPAGE_URL);
        String actuallinkvalue = loginPage.getLink().getText();
        Assert.assertEquals(actuallinkvalue,Reset_Password);
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

    public void tearUp(){
        driver.quit();

    }

    public void getAllLinks(){
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total links are " + links.size());
    }

}


