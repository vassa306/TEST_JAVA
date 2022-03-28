package Actions;

import PageObjects.Homepage;
import PageObjects.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static constants.LoginConstants.DEFAULT_LOGIN;

public abstract class TestActions {
    protected static WebDriver driver;


    public static void commonSetup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vassa\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        String baseUrl = "https://www.facebook.com";
        driver.get(baseUrl);

    }

    public static void logIntoFB(WebDriver driver) throws InterruptedException {
        LoginPage loginPage = new Homepage(driver).getLoginPage();
        loginPage.getBanner().click();
        loginPage.getLogin().sendKeys(DEFAULT_LOGIN);
/*
        WebElement passfield = driver.findElement(By.id("pass"));
        passfield.click();

        passfield.sendKeys("");
        WebElement Login = driver.findElement(By.xpath("//button[@name='login']"));
        Login.click();

        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        String title = driver.getTitle();
        String URL = driver.getCurrentUrl();
        System.out.println("Page title: " + title + " Page URL is: " + URL);
        /* check link on webpage*/
        WebElement link = driver.findElement(By.partialLinkText("Forgot password?"));
        link.click();
        System.out.println("link is " + link);
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

}


