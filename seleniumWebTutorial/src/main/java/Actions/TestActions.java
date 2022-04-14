package Actions;

import PageObjects.Homepage;
import PageObjects.LoginPage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static constants.LoginConstants.*;
import static constants.ValidationMessages.*;
import static java.util.concurrent.TimeUnit.*;

public abstract class TestActions {
    protected static WebDriver driver;
    private List<WebElement> options;


    public static void commonSetup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        String baseUrl = "https://www.facebook.com";
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(10, SECONDS);


    }

    public static void commonSetupWeb(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        String baseUrl = "https://www.way2automation.com/way2auto_jquery/index.php";
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(15, SECONDS);
    }

    public static void commonSetupWiki(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        String baseUrl = "https://www.wikipedia.org";
        driver.get(baseUrl);
    }



    public void checkPageLink(WebDriver driver) throws InterruptedException {
        LoginPage loginPage = getLoginPage();
        loginPage.getLogin().sendKeys(DEFAULT_LOGIN);
        loginPage.getPasssword().sendKeys(DEFAULT_PASS);
        driver.manage().timeouts().implicitlyWait(8, SECONDS);

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

    public void getLinksFromFooter(WebDriver driver){
        LoginPage loginPage = getLoginPage();
        WebElement block = driver.findElement(By.xpath("//div[@class=\"_95ke _8opy\"]"));
        List<WebElement> footerlinks = block.findElements(By.tagName("a"));
        System.out.println("Printing Footer Links");
        int linknum = footerlinks.size();
        System.out.println("Total Links in Footer: " + linknum);
        Assert.assertEquals(linknum,FOOTERLINKSCOUNT,"incorrect number of links");

        for (WebElement footerlink : footerlinks){
            System.out.println(footerlink.getText()+" URL is " + footerlink.getAttribute("href"));
        }

    }

    private LoginPage getLoginPage() {
        LoginPage loginPage = new Homepage(driver).getLoginPage();
        loginPage.getBanner().click();
        return loginPage;
    }

    public void tearUp(){
        driver.quit();

    }
    public void getAllLinks(WebDriver driver) {
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Printing Links");
        int num = links.size();
        System.out.println("Total link Size is " + links.size());
        Assert.assertEquals(num, LINKSCOUNT, "Wrong links count");

        for (WebElement link : links) {
            System.out.println(link.getText() + "URL is " + link.getAttribute("href"));


        }
    }

        public void getDropdownValues(WebDriver driver, String name){
        List<WebElement>options = driver.findElements(By.name(name));
        System.out.println("Printingvalues :");
        for (WebElement option : options){
            System.out.println("values is " + option.getText());

            }
        }

        public void pickValueFromDropdown(WebDriver driver, String name, String option) {
            WebElement dropdown = driver.findElement(By.name(name));
            boolean displayed = dropdown.isDisplayed();
            Assert.assertEquals(displayed, true, "Is not displayed");
            Select select = new Select(dropdown);
            select.selectByValue(option);
            String actt = select.getFirstSelectedOption().getText();
            Assert.assertEquals(actt,option, "Incorrect value is selected");
            System.out.println("selected value is " + actt);
        }


        public void pickValueByVisibleText(WebDriver driver, String id, String option) {
        Select select = new Select(driver.findElement(By.id(id)));
        select.selectByVisibleText(option);
        String act = select.getFirstSelectedOption().getText();
        Assert.assertEquals(act,option,"The incorrect value has been selected");
        System.out.println("selected value is "+ act);

        }

        public void pickValuefrom(WebDriver driver,String Id,String value) throws InterruptedException {
        Select select = new Select(driver.findElement(By.id(Id)));
        select.selectByValue(value);
        String act = select.getFirstSelectedOption().getText();
        Assert.assertEquals(act,"हिन्दी","INCORRECT language is selected");
        System.out.println(act);

            }

        }







