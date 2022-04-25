package Actions;

import PageObjects.Homepage;
import PageObjects.LoginPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import static constants.TestConstants.*;
import static constants.ValidationMessages.*;
import static java.util.concurrent.TimeUnit.SECONDS;


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

    public static void commonSetupWeb() {
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

    public static void commonSetupWiki() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        String baseUrl = "https://www.wikipedia.org";
        driver.get(baseUrl);
    }

    public static void commonSetupTask() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        String baseUrl = "https://www.google.com";
        driver.get(baseUrl);
    }

    public static void commonSetupForm() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        String baseUrl = "https://qa.way2automation.com";
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public static void commonSetupCheckbox() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        String baseUrl = "http://www.tizag.com/htmlT/htmlcheckboxes.php";
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public static void commonSetupWebTable() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        String baseUrl = "https://money.rediff.com/gainers/bse/daily/groupall";
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public static void commonSetupHandleJs() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        String baseUrl = "https://ksrtc.in/oprs-web/guest/home.do";
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }


    public void checkPageLink(WebDriver driver) throws InterruptedException {
        LoginPage loginPage = getLoginPage();
        loginPage.getLogin().sendKeys(DEFAULT_LOGIN);
        loginPage.getPasssword().sendKeys(DEFAULT_PASS);
        driver.manage().timeouts().implicitlyWait(8, SECONDS);

        String title = driver.getTitle();
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(title, LOGINPAGE_TITLE);
        System.out.println("Page title: " + title + " Page URL is: " + URL);
        /* check link on webpage*/
        Assert.assertEquals(URL, LOGINPAGE_URL);
        String actuallinkvalue = loginPage.getLink().getText();
        Assert.assertEquals(actuallinkvalue, Reset_Password);
    }

    public void invalidPassword(WebDriver driver) {

        LoginPage loginPage = getLoginPage();
        loginPage.getLogin().sendKeys(DEFAULT_LOGIN);
        loginPage.getPasssword().sendKeys(Keys.ENTER);
        String validationMgs = TestActions.driver.findElement(By.className("_9ay7")).getText();
        Assert.assertEquals(validationMgs, Incorrect_Password);
        System.out.println(" value is " + validationMgs);
    }

    public void invalidLogin(WebDriver driver) {
        LoginPage loginPage = getLoginPage();
        loginPage.getLogin().sendKeys(Keys.ENTER);
        String valLoginMsg = TestActions.driver.findElement(By.className("_9ay7")).getText();
        Assert.assertEquals(valLoginMsg, Incorrect_Login);
        System.out.println("value is " + valLoginMsg);


    }

    public void getLinksFromFooter(WebDriver driver) {
        LoginPage loginPage = getLoginPage();
        WebElement block = driver.findElement(By.xpath("//div[@class=\"_95ke _8opy\"]"));
        List<WebElement> footerlinks = block.findElements(By.tagName("a"));
        System.out.println("Printing Footer Links");
        int linknum = footerlinks.size();
        System.out.println("Total Links in Footer: " + linknum);
        Assert.assertEquals(linknum, FOOTERLINKSCOUNT, "incorrect number of links");

        for (WebElement footerlink : footerlinks) {
            System.out.println(footerlink.getText() + " URL is " + footerlink.getAttribute("href"));
        }

    }

    private LoginPage getLoginPage() {
        LoginPage loginPage = new Homepage(driver).getLoginPage();
        loginPage.getBanner().click();
        return loginPage;
    }

    public void tearUp() {
        driver.quit();

    }

    public void getAllLinks(WebDriver driver) {
        getLoginPage();
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Printing Links");
        int num = links.size();
        System.out.println("Total link Size is " + links.size());
        try {
            for (WebElement link : links) {
                System.out.println(link.getText() + " URL is " + link.getAttribute("href"));

            }

        } catch (StaleElementReferenceException e) {
            e.getMessage();
        }
    }

    public void getDropdownValues(WebDriver driver, String name) {
        List<WebElement> options = driver.findElements(By.name(name));
        System.out.println("Printingvalues :");
        for (WebElement option : options) {
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
        Assert.assertEquals(actt, option, "Incorrect value is selected");
        System.out.println("selected value is " + actt);
    }

    public void pickValueByVisibleText(WebDriver driver, String id, String option) {
        Select select = new Select(driver.findElement(By.id(id)));
        select.selectByVisibleText(option);
        String act = select.getFirstSelectedOption().getText();
        Assert.assertEquals(act, option, "The incorrect value has been selected");
        System.out.println("selected value is " + act);


    }

    public void pickValuefrom(WebDriver driver, String Id, String value) throws InterruptedException, IOException {
        Select select = new Select(driver.findElement(By.id(Id)));
        select.selectByValue(value);
        String act = select.getFirstSelectedOption().getText();
        Assert.assertEquals(act, "हिन्दी", "INCORRECT language is selected");
        System.out.println(act);


    }

    public void handleGoogle(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//button[@id = \"L2AGLb\"]")).click();
        WebElement input = driver.findElement(By.xpath("//input[@class=\'gLFyf gsfi\']"));
        input.sendKeys("way2automation");
        input.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(10, SECONDS);
        driver.findElement(By.partialLinkText("Way2Automation: Get Online Selenium Certification Course")).click();
        WebElement block = driver.findElement(By.xpath("//div[@class=\'ast-builder-grid-row ast-builder-grid-row-has-sides ast-builder-grid-row-no-center\']"));
        List<WebElement> headerlinks = block.findElements(By.tagName("a"));
        int actcount = headerlinks.size();
        for (WebElement headerlink : headerlinks) {
            System.out.println("URL is " + headerlink.getAttribute("href"));


        }
        System.out.println(headerlinks.size());
        Assert.assertEquals(actcount, 9);
    }

    public void insertIntoForm(WebDriver driver) throws IOException {
        WebElement email = driver.findElement(RelativeLocator.with(By.tagName("input"))
                .above(By.tagName("select")));
        WebElement phone = driver.findElement(RelativeLocator.with(By.tagName("input")).above(email));
        phone.sendKeys("aaaaaa");
        WebElement name = driver.findElement(RelativeLocator.with(By.tagName("input")).above(phone));
        name.sendKeys("aaaaa");
        WebElement city = driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.tagName("select")));
        WebElement username = driver.findElement(RelativeLocator.with(By.tagName("input")).below(city));
        WebElement password = driver.findElement(RelativeLocator.with(By.tagName("input")).below(username));
        File passscrn = password.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(passscrn, new File("./screenshot/pass.jpg"));
        WebElement submit = driver.findElement(RelativeLocator.with(By.tagName("input")).below(password));
        String s = submit.getTagName();
        System.out.println("tag " + s.toLowerCase() + "/" + submit.getLocation());
        submit.click();
        File screen = submit.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screen, new File("./screenshot/below.jpg"));

    }

    public static boolean isElementPresent(String locator) {
        try {
            driver.findElement(By.xpath(locator));
            return true;
        } catch (Throwable t) {
            return false;
        }
    }

    public void tickCheckboxes(WebDriver driver) throws IOException {
//               int i = 1;
//                int count = 0;
//               while (isElementPresent("//div[4]/input["+i+"]")) {
//                    driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
//                  i++;
//                    count++;
//             }
        WebElement block = driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]"));
        List<WebElement> checkboxes = block.findElements(By.name("sports"));
        System.out.println("number of checkboxes is : " + checkboxes.size());
        for (WebElement checkbox : checkboxes) {
            checkbox.click();
        }
        File f = block.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(f, new File("./screenshot/block.jpg"));


    }

    public void handleWebTables(String row, String coll) throws IOException {
        List<WebElement> rowNums = driver.findElements(By.xpath(row));
        System.out.println("Row count is : " + rowNums.size());
        List<WebElement> collNums = driver.findElements(By.xpath(coll));
        System.out.println("columns count is: " + collNums.size());
        Assert.assertEquals(rowNums.size(), ROWSCOUNTALL, "Incorrect rows size");

        for (WebElement rowNum : rowNums) {
            System.out.print("[" + rowNum.getText().toUpperCase() + "]" + "\n");

//        for (int rows = 1; rows < rowNums.size(); rows++) {
//
//            for (int cols = 1; cols < collNums.size(); cols++) {
//                System.out.print(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+rows+"]/td["+cols+"]")).getText()+"   ");
//
//
//            }
        }
        exportToTxt(rowNums);

    }

    public void exportToTxt(List<WebElement> rowNums) throws IOException {
        File F = new File("C:\\FileWriting\\myTextFile.txt");
        FileWriter fw = new FileWriter(F, false);
        BufferedWriter writer = new BufferedWriter(fw);

        //Writing into file first loop rows and second columns
        for (int rof = 0; rof < 1; rof++) {
            for (int col = 0; col < 1; col++) {
                for (WebElement rowNum : rowNums) {

                    writer.write(rowNum.getText().toUpperCase() + "," + "\n ");
                }
                writer.newLine();

            }
            writer.close();
            System.out.println("file created!");


        }


    }

    public void handleJSelement(String locator) throws InterruptedException {
        driver.findElement(By.id(locator)).sendKeys("BENG");
        driver.findElement(By.id(locator)).sendKeys(Keys.DOWN);
        Thread.sleep(TIMEOUT);
        driver.findElement(By.id(locator)).sendKeys(Keys.DOWN);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // do not forget insert return before statement
        String script = "return document.getElementById(\"fromPlaceName\").value;";
        String text = (String) js.executeScript(script);
        //System.out.println(text);
        //Assert.assertEquals(text,FROM," Invalid value selected");
        int i = 0;

        while (!text.equalsIgnoreCase(FROM)) {
            i++;
            driver.findElement(By.id(locator)).sendKeys(Keys.DOWN);
            Thread.sleep(TIMEOUT);
            text = (String) js.executeScript(script);
            System.out.println(text);
            if (i > 10) {
                break;
            }
            if (i > 10) {
                System.out.println("Element not found");
            } else {
                System.out.println("Element found");
            }
        }
        Assert.assertEquals(text,FROM,"Invalid value selected");
    }
}











