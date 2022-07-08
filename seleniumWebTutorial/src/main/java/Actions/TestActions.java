package Actions;

import PageObjects.Homepage;
import PageObjects.LoginPage;
import constants.TestConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.print.PrintOptions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Month;
import java.util.*;

import static constants.ValidationMessages.*;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;


public abstract class TestActions extends TestConstants {
    protected static WebDriver driver;
    private List<WebElement> options;

    long startTime;
    long endTime;
    long duration;
    double seconds;


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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
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

    public static void commonSetUpHardWait() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        String baseUrl = "https://www.expedia.co.in/";
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void commonSetUp(String baseUrl) {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
    }

    public static void commonSetUpBasicAuth(String baseUrl) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver(options);
        ((HasAuthentication) driver).register(UsernameAndPassword.of("admin", "admin"));
        driver.manage().window().maximize();
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
    }

    public static void commonSetUpPrint(String baseUrl) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("disable-notifications");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
    }

    //new firefox options
    public static void setupWithNewOptions(String baseUrl) {

        FirefoxOptions options = new FirefoxOptions();
        WebDriverManager.firefoxdriver().setup();
        //options.addArguments("--headless");
        System.setProperty("webdriver.gecko.driver", "C:\\webdriver\\geckodriver.exe");
        driver = new FirefoxDriver(options);
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void assfour() {

        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://google.com");
        //set width and height
        int width = 120;
        int height = 120;

        //20 means speed of resizing
        //1000 means width and height
        for (int i = 0; i <= 800; i = i + 20) {
            Dimension dim = new Dimension(width + i, height + i);
            driver.manage().window().setSize(dim);

        }


    }


    //handle bad SSL certificates
    public static void setUpWithBasSSL(String baseUrl) {
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        options.addArguments("disable-notifications");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.addArguments("incognito");
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

    }

    public static void phoneSetup(String baseUrl) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        options.addArguments("--disable-features=VizDisplayCompositor");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver(options);
        DevTools devtools = ((ChromeDriver) driver).getDevTools();
        devtools.createSession();


        Map<String, Object> deviceMetrics = new HashMap<String, Object>() {
            {
                put("width", 375);
                put("height", 812);
                put("mobile", true);
                put("deviceScaleFactor", 50);
                put("deviceName", "iPhone X");
            }

        };
        ((ChromeDriver) driver).executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
    }

    /**
     * @param baseUrl
     */
    //second Method for Mobile Set UP
    public void setUpForIphone(String baseUrl) {
        Map<String, String> mobileEm = new HashMap<String, String>();
        mobileEm.put("deviceName", "iPhone SE");
        ChromeOptions opt = new ChromeOptions();
        opt.setExperimentalOption("mobileEmulation", mobileEm);
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver(opt);
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }

    //update to Selenium 4
    public void checkPageLink(WebDriver driver) throws InterruptedException {
        LoginPage loginPage = getLoginPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
        loginPage.getEmail().sendKeys(DEFAULT_LOGIN);
        loginPage.getPasssword().sendKeys(Keys.ENTER);
        String validationMgs = TestActions.driver.findElement(By.className("_9ay7")).getText();
        Assert.assertEquals(validationMgs, Incorrect_Password);
        System.out.println(" value is " + validationMgs);
    }

    public void invalidLogin(WebDriver driver) {
        LoginPage loginPage = getLoginPage();
        loginPage.getEmail().sendKeys(Keys.ENTER);
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

    /**
     * @param driver
     * @param name
     */
    public void getDropdownValues(WebDriver driver, String name) {
        List<WebElement> options = driver.findElements(By.name(name));
        System.out.println("Printingvalues :");
        for (WebElement option : options) {
            System.out.println("values is " + option.getText());

        }
    }

    /**
     * @param driver
     * @param name
     * @param option
     */
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

    /**
     * @param driver
     * @param id
     * @param option
     */
    public void pickValueByVisibleText(WebDriver driver, String id, String option) {
        Select select = new Select(driver.findElement(By.id(id)));
        select.selectByVisibleText(option);
        String act = select.getFirstSelectedOption().getText();
        Assert.assertEquals(act, option, "The incorrect value has been selected");
        System.out.println("selected value is " + act);


    }

    /**
     * @param driver
     * @param Id
     * @param value
     * @throws InterruptedException
     * @throws IOException
     */
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

    public void tickCheckboxesNewPage(WebDriver driver) throws IOException {
//               int i = 1;
//                int count = 0;
//               while (isElementPresent("//div[4]/input["+i+"]")) {
//                    driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
//                  i++;
//                    count++;
//             }
        WebElement block = driver.findElement(By.id("ex1"));
        List<WebElement> checkboxes = block.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println("number of checkboxes is : " + checkboxes.size());
        for (WebElement checkbox : checkboxes) {
            checkbox.click();
        }
        File f = block.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(f, new File("./screenshot/NewPageCheckboxesblock.jpg"));


    }

    /**
     * @param row
     * @param coll
     * @throws IOException
     */
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

    /**
     * @param rowNums
     * @throws IOException
     */
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

    public void exportToTxtInt(List<Integer> locations) throws IOException {
        File F = new File("C:\\FileWriting\\myTextFileInt.txt");
        FileWriter fw = new FileWriter(F, false);
        BufferedWriter writer = new BufferedWriter(fw);

        //Writing into file first loop rows and second columns
        for (int rof = 0; rof < 1; rof++) {
            for (int col = 0; col < 1; col++) {
                for (Integer  location : locations) {

                    writer.write(location.toString().toUpperCase() + "," + "\n ");
                }
                writer.newLine();

            }
            writer.close();
            System.out.println("file created!");


        }


    }





    /**
     * @param locator
     * @throws InterruptedException
     */
    public void handleJSelement(String locator) throws InterruptedException {
        driver.findElement(By.id(locator)).sendKeys("BENG");
     //   driver.findElement(By.id(locator)).sendKeys(Keys.DOWN);
      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     //   driver.findElement(By.id(locator)).sendKeys(Keys.DOWN);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // do not forget insert return before statement
        String script = "return document.getElementById(\"fromPlaceName\").value;";
        String text = (String) js.executeScript(script);
        //System.out.println(text);
        //Assert.assertEquals(text,FROM," Invalid value selected");
        int i = 0;
        int max = 10;

        while (!text.equalsIgnoreCase(FROM)) {
            i++;
            driver.findElement(By.id(locator)).sendKeys(Keys.DOWN);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            text = (String) js.executeScript(script);

            if (i > max) {
                break;
            }
            if (i > max) {
                System.out.println("Element not found");
            } else {
                System.out.println("Element found");
            }
        }
        Assert.assertEquals(text, FROM, "Invalid value selected");
        System.out.println(text);
    }

    public static String[] getMonthYear(String monthYearVal) {

        return monthYearVal.split(" ");
    }


    public static String convertToMonth(String selectedMonth) {
        Month month = Month.of(Integer.parseInt(selectedMonth));
        return String.valueOf(month);
    }

    /**
     * @param locator
     * @param expDay
     * @param expMonth
     * @param expYear
     * @throws ParseException
     */
    public static void pickValueFromPicker(String locator, String expDay, String expMonth, String expYear) throws ParseException {
        try {


            Integer i = Integer.parseInt(expDay);
            if ((expMonth.equals("June") || (expMonth.equals("March")) || (i > 31)) || (i < 1)) {
                System.out.println("Wrong date selected: " + expDay + " / " + expMonth);
                return;
            }

            if (i == null) {
                System.out.println("not value selected");
            }

            WebElement picker = driver.findElement(By.id(locator));
            picker.click();
            String monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
            while (!(getMonthYear(monthYearVal)[0].equals(expMonth)
                    && getMonthYear(monthYearVal)[1].equals(expYear))) {
                driver.findElement(By.xpath("//a[@title='Next']")).click();
                monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
            }
            WebElement s = driver.findElement(By.xpath("//a[text()='" + expDay + "']"));
            s.click();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            String script = "return document.getElementById(\"" + locator + "\").value;";
            String date = (String) js.executeScript(script);
            System.out.println(date);
            String selectedDate = date.substring(0, 2);
            String selectedMonth = date.substring(3, 5);
            String selectedYear = date.substring(6);
            String convertedMonth = convertToMonth(selectedMonth).toLowerCase();
            String cap = convertedMonth.substring(0, 1).toUpperCase();
            String capitalizedMonth = cap + convertedMonth.substring(1);
            System.out.println(capitalizedMonth);
            Assert.assertEquals(selectedDate, expDay, "Invalid date selected");
            Assert.assertEquals(capitalizedMonth, expMonth, "Wrong month selected");
            Assert.assertEquals(selectedYear, expYear, "Invalid Year selected");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void hardWaitTest() throws InterruptedException, ParseException {
        WebElement e = driver.findElement(By.id("package-origin-hp-package"));
        e.click();
        e.sendKeys("nyc");
        e.sendKeys(Keys.ARROW_DOWN);
        e.sendKeys(Keys.ENTER);
        WebElement picker = driver.findElement(By.id("package-departing-hp-package"));
        picker.sendKeys(SELECTEDDATE);
        picker.sendKeys(Keys.ENTER);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "return document.getElementById(\"package-departing-hp-package\").value;";
        String date = (String) js.executeScript(script);
        System.out.println(date);
    }

    //how to click all links in for
    public void handleTabs() throws InterruptedException {
        System.out.println("total links are: " + driver.findElements(By.tagName("a")).size());
        WebElement footer = driver.findElement(By.cssSelector(".footer__info-links.grid-col.grid-col-2"));
        List<WebElement> Links = footer.findElements(By.tagName("a"));
        System.out.println("count link " + Links.size());
        int allLinks = Links.size();
        Assert.assertEquals(allLinks, ALLLINKS, "wrong links count");

        WebElement columndriver = driver.findElement(By.cssSelector(".footer__info-links.grid-col.grid-col-2 ul"));
        System.out.println("Total links in first column is: " + columndriver.findElements(By.tagName("a")).size());

        for (int i = 0; i < columndriver.findElements(By.tagName("a")).size(); i++) {
            String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
            columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
            Thread.sleep(TIMEOUT);
        }
        java.util.Iterator<String> iter = driver.getWindowHandles().iterator();
        while (iter.hasNext()) {
            driver.switchTo().window(iter.next());
            System.out.println("opened pages: " + driver.getTitle() + ", " + driver.getCurrentUrl());
        }

    }

    public void handlesWindows() {
        WebElement banner = driver.findElement(By.xpath("//div[@class=\'click_nri\']/a"));
        banner.click();
        WebElement e = driver.findElement(By.xpath("//a[text()=\"English\"]"));
        e.click();
        //open a new page by using CTRL+ENTER
        String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
        driver.findElement(By.linkText("Careers")).sendKeys(clickonlinkTab);

        java.util.Iterator<String> iter = driver.getWindowHandles().iterator();
        String parentid = iter.next();
        String childId = iter.next();
        driver.switchTo().window(parentid);
        System.out.println("Page title is: " + driver.getTitle() + "URL: " + driver.getCurrentUrl());
        driver.switchTo().window(childId);
        System.out.println("Page title is: " + driver.getTitle() + "URL: " + driver.getCurrentUrl());
    }

    public void handleFrame(String frameId, String locator) {
        startTime = System.nanoTime();
        WebElement btn = driver.findElement(By.id("accept-choices"));
        btn.click();
        List<WebElement> frames = driver.findElements(By.tagName("iframe"));
        System.out.println(frames.size());
        driver.switchTo().frame(frameId);
        driver.findElement(By.xpath(locator)).click();
        driver.switchTo().defaultContent();
        for (WebElement frame : frames) {
            System.out.println(frame.getAttribute("id"));
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        seconds = duration / 1000000000.0;
        System.out.println("Time taken to execute this method " + seconds + " seconds");
    }

    public void testMobileIphone() throws IOException {
        String currentUrl = driver.getCurrentUrl();
        System.out.println("current url: " + currentUrl);
        Assert.assertEquals(currentUrl, "https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin"
                , "Invalid loaded URL");
        WebElement emailField = driver.findElement(By.xpath("//input[@type=\"email\"]"));
        emailField.sendKeys(DEFAULT_LOGIN);
        File email = emailField.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(email, new File("./screenshot/emailfield.jpg"));

    }

    //new way how to take full page screenshot
    public void captureFullpage(String name) throws IOException {
        Date date = new Date();
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1 = formatter.format(date);
        System.out.println(date1);
        File pageScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(pageScreenshot, new File("./screenshot/" + name + ".jpg"));

    }


    public void swichToParrentFrame() throws IOException {
        int framescnt = 0;

        WebElement e = driver.findElement(By.id("accept-choices"));
        e.click();
        List<WebElement> frames = driver.findElements(By.tagName("iframe"));
        framescnt = frames.size();
        System.out.println("Number of frames in page is : " + framescnt);
        for (WebElement frame : frames) {
            System.out.println(frame.getAttribute("id"));
        }
        Assert.assertEquals(framescnt, CNTFRAMES, "Invalid count of frames");
        captureFullpage("frames");


        driver.switchTo().frame(1);
        System.out.println(driver.getTitle());


    }

    public void handleMultipleWindows(String firstUrl, String secondUrl) throws IOException {

        String closedUrl = null;
        String currentUrl = null;
        String url = null;
        String lastUrl = null;

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(firstUrl);
        WebElement e = driver.findElement(By.id("L2AGLb"));
        e.click();
        //write some text into input in Google
        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys("Hello Selenium 4");
        captureFullpage("googlePageResult");
        // open another new window
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get(secondUrl);
        currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://www.google.com/intl/cs/gmail/about/", "Wrong windows selected");
        int openedsize = driver.getWindowHandles().size();
        System.out.println(openedsize);
        Set<String> winIds = driver.getWindowHandles();
        //create iterator
        Iterator<String> iterator = winIds.iterator();
        //iterate through
        List<String> winIndex = new ArrayList<String>();
        while (iterator.hasNext()) {
            //add winids into list
            winIndex.add(iterator.next());
        }
        //get first window a close it
        driver.switchTo().window(winIndex.get(0));
        closedUrl = driver.getCurrentUrl();
        System.out.println("closed url: " + driver.getCurrentUrl());
        Assert.assertEquals(closedUrl, EXPURL, "invalid URL closed");
        driver.close();
        //switch to third window
        driver.switchTo().window(winIndex.get(2));
        url = driver.getCurrentUrl();
        System.out.println(url);
        Assert.assertEquals(url, "https://www.google.com/intl/cs/gmail/about/", "wrong window closed");
        driver.close();
        // check url of Last Window
        driver.switchTo().window(winIndex.get(1));
        lastUrl = driver.getCurrentUrl();
        System.out.println("remaining: " + lastUrl);
        Assert.assertEquals(lastUrl, FIRSTURL, "wrong window remains");
        captureFullpage("lastUrlScreen");

    }

    public void basicAuthorization() throws IOException {
        WebElement e = driver.findElement(By.id("content"));
        System.out.println(e.getText());
        captureFullpage("BasicAuthorization");
    }

    /**
     * parameters:
     *
     * @String name
     * @Webdriver driver
     */
    public void printToPDF(WebDriver driver, String name) throws IOException {
        Pdf pdf = ((PrintsPage) driver).print(new PrintOptions());
        //use java nio file library instead of Google.com io and run in headless mode
        Files.write(Paths.get("./" + name + ".pdf"), OutputType.BYTES.convertFromBase64Png(pdf.getContent()));
    }

    /**
     * @param driver
     * @throws IOException
     */
    public void checkOptions(WebDriver driver) throws IOException {
        String title = driver.getTitle();
        Assert.assertEquals(title, TITLESSL, "invalid title printed");
        captureFullpage("badSSL");
    }

    /**
     * no params
     */
    public void getRectAttributes() {
        WebElement img = driver.findElement(By.xpath("//*[@id=\"logo\"]"));
        // call method get Rect from Rectangle class
        if (img.isDisplayed()) {
            Rectangle rect = img.getRect();
            // print all coordinations of Gmail Logo
            System.out.println("------------------------------------");
            System.out.println("Height :" + rect.getHeight());
            System.out.println("Width :" + rect.getWidth());
            System.out.println("X coordinations " + rect.getX());
            System.out.println("Y coordinates " + rect.getY());
        } else {
            System.out.println("Element is not displayed");
        }

    }

    /**
     * @param xpathlocator
     * @param locator
     */
    public void testMouseOver(String xpathlocator, String locator) {
        WebElement accept = driver.findElement(By.id("L2AGLb"));
        accept.click();
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("way2automation");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(visibilityOfElementLocated(By.xpath(xpathlocator))).click();
        driver.findElement(By.partialLinkText("Way2Automation: Get Online Selenium Certification Course")).click();
        WebElement menu = driver.findElement(By.id("menu-item-27617"));
        Actions action = new Actions(driver);

        action.moveToElement(menu).perform();
        WebElement pracpag = driver.findElement(By.linkText(locator));
        pracpag.click();

    }

    /**
     * @param locator
     * @return
     */
    public WebDriver switchToFrame(String locator) {
        WebElement frame = driver.findElement(By.xpath(locator));
        return driver.switchTo().frame(frame);

    }

    /**
     * @param driver
     * @param xOffest
     * @param locator
     * @throws IOException
     */
    public void handleDemoSlider(WebDriver driver, int xOffest, String locator) throws IOException {
        switchToFrame(locator);
        WebElement mainSlider = driver.findElement(By.id("slider"));
        int wi = mainSlider.getSize().width / 2;
        WebElement slider = driver.findElement(By.xpath("//div[@id =\"slider\"]"));
        new Actions(driver).dragAndDropBy(slider, xOffest, 0).perform();
        captureFullpage("slider");
    }

    /**
     * @param locator
     */
    public void handleResizable(String locator) {
        // better cannot repeat the same code x times!!!
        switchToFrame("//iframe[@class=\"demo-frame\"]");
        //WebElement frame = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
        //driver.switchTo().frame(frame);
        WebElement resize = driver.findElement(By.xpath(locator));
        Actions action = new Actions(driver);
        action.dragAndDropBy(resize, 300, 200).perform();


    }

    /**
     * @param driver
     */
    public void dragAndDropW3C(WebDriver driver) {
        // accept button W3C
        WebElement acceptBtn  = driver.findElement(By.id("accept-choices"));
        acceptBtn.click();

        switchToFrame(FRAMEW3C);
        WebElement draggable = driver.findElement(By.id("drag1"));
        WebElement droppable = driver.findElement(By.id("div2"));
        Actions actions = new Actions(driver);
        //do not forget perform
        actions.dragAndDrop(draggable, droppable).perform();
    }

    public void dragAndDropJS(WebDriver driver) throws IOException {
        // accept button W3C
        switchToFrame(FRAME);
        WebElement draggable = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
        WebElement droppable = driver.findElement(By.xpath("//div[@id = 'droppable']"));
        Actions actions = new Actions(driver);
        //do not forget perform
        actions.dragAndDrop(draggable, droppable).perform();
        captureFullpage("drag and drop");

    }



    /**
     * @throws IOException
     */
    public void rightClick() throws IOException {
        String url = null;
        WebElement img = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/div[2]/table[1]/tbody/tr/td[3]/p[2]/img"));

        Actions actions = new Actions(driver);
        actions.contextClick(img).moveToElement(img).perform();
        //move to submenu 2
        actions.moveToElement(driver.findElement(By.id("dm2m1i1tdT"))).perform();
        // move to submenu 3
        actions.moveToElement(driver.findElement(By.id("dm2m2i1tdT"))).perform();
        driver.findElement(By.id("dm2m3i1tdT")).click();

        //print url of second page
        Set<String> winids = driver.getWindowHandles();
        //create iterator
        Iterator<String> iterator = winids.iterator();
        //iterate through
        List<String> winIndex = new ArrayList<String>();
        while (iterator.hasNext()) {
            //add winids into list

            winIndex.add(iterator.next());
        }
        //get second window
        driver.switchTo().window(winIndex.get(1));
        url = driver.getCurrentUrl();
        Assert.assertEquals(url, URLEXP, "wrong page opened");
        captureFullpage("secondWindow");

    }

    //how to handle CTRL C or CTRL+V with Selenium
    //use element instead of actions and working now
    public void pressKeyboard(String locator) throws IOException {

        WebElement search = driver.findElement(By.id(locator));
        search.sendKeys("testvasek@gmail.com");
        search.sendKeys(Keys.chord(Keys.CONTROL + "a"));
        search.sendKeys(Keys.chord(Keys.CONTROL + "c"));
        driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div")).click();
        search.click();
        search.sendKeys(Keys.SPACE);
        search.sendKeys(Keys.chord(Keys.CONTROL + "v"));
        captureFullpage("CTRLC + V");
    }

    public void handleJSAlert() {
        driver.findElement(By.linkText("Sign in")).click();
        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("Text in alert is: " + alertText);
        Assert.assertEquals(alertText, VALIDATIONMSGREDIFF, "wrong alert text");
        alert.accept();

    }

    //how to get locations on any element on page
    public void getLocationOfElement() throws IOException {
        List<Integer> locations = new ArrayList<Integer>();

        WebElement Accept = driver.findElement(By.id("L2AGLb"));
        Accept.click();
        WebElement link = driver.findElement(By.linkText("Gmail"));
        //get location of x and y

        int x = link.getRect().getX();

        int y = link.getRect().getY();
        locations.add(x);
        locations.add(y);
        String url = null;

        Actions actions = new Actions(driver);
        // click on element according to location
        actions.moveByOffset(locations.get(0), locations.get(1)).click().perform();


        url = driver.getCurrentUrl();
        System.out.println("current URL " + url);
        Assert.assertEquals(url, GMAIL, "wrong page opens");
        exportToTxtInt(locations);
    }


    /**
     *
     * @param locator
     * @param duration
     * @param datelocator
     * @throws InterruptedException
     */
    public void handleSVGGraph(String locator, int duration, String datelocator) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.xpath(locator)).click();
        //Select no of days button at bottom
        wait.until(visibilityOfElementLocated(By.xpath("//button[contains(text(),'"+duration+" days')]"))).click();

        //come back to state Delhi
        driver.findElement(By.xpath(locator)).click();

        //get list of all circle elements
        List<WebElement> confirmedPts = driver.findElements(By.xpath("//div[@class='svg-parent fadeInUp is-confirmed']//*[name()='circle']"));
        System.out.println("no of graphpoints = " + confirmedPts.size());
        Actions action = new Actions(driver);
        int i = 0;

        System.out.println("Confirmed cases===============");

        for (WebElement point : confirmedPts) {
            i++;
            action.moveToElement(point).perform();
            System.out.println("Confirmed cases in day" + i + " = " + driver.findElement(By.xpath("//div[@class='stats is-confirmed']/div/h2")).getText());
        }

        List<WebElement> activePts = driver.findElements(By.xpath("//div[@class='svg-parent fadeInUp is-confirmed']//*[name()='circle']"));
        int j = 0;
        System.out.println("Active cases=============");
        for (WebElement point : activePts) {
            j++;
            action.moveToElement(point).perform();
            System.out.println("number of confirmed cases in day" + j + " = " + driver.findElement(By.xpath("//div[@class='stats is-active']//div/h2")).getText());

        }

        List<WebElement> recoveredPts = driver.findElements(By.xpath("//div[@class='svg-parent fadeInUp is-recovered']//*[name()='circle']"));
        int k = 0;
        System.out.println("Recovered cases");
        for (WebElement point : recoveredPts) {
            k++;
            action.moveToElement(point).perform();
            System.out.println("Recovered cases in day" + k + " = " + driver.findElement(By.xpath("//div[@class='stats is-recovered']//div/h2")).getText());
        }
        //last print contains also date
        List<WebElement> vacinatedPTS = driver.findElements(By.xpath("//div[@class='svg-parent fadeInUp is-vaccinated']//*[name()='circle']"));
        int l = 0;
        System.out.println("Vacinated cases");
        for (WebElement point: vacinatedPTS) {
            l++;
            action.moveToElement(point).perform();
            System.out.println("Vaccinated cases in " + driver.findElement(By.xpath(datelocator)).getText() + " - "+ driver.findElement(By.xpath("//div[@class='stats is-vaccinated']//div/h2")).getText());

        }

    }

    public void rightClickInFacebook(WebDriver driver) throws IOException {
        LoginPage loginPage = getLoginPage();
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
        wait.until(visibilityOfElementLocated(By.cssSelector("#email"))).click();
        try {
            actions.contextClick(loginPage.getEmail()).moveToElement(loginPage.getEmail()).perform();
        }
        catch (StaleElementReferenceException e){
            System.out.println(e.getStackTrace());
        }
        finally {
            captureFullpage("facebook");
        }
    }

    public void ClickInventiSearch() throws IOException {
        driver.findElement(By.xpath("//div[@class='search-panel-toggle']")).click();
        driver.findElement(By.id("search-panel__input")).sendKeys("Testing");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(4));
        wait.until(visibilityOfElementLocated(By.xpath("//button[@class='search-panel__submit']"))).click();
        String results = driver.findElement(By.xpath("//div[@class = 'col col-1-12 grid-12-12']/h2")).getText();
        results = results.substring(27);
        results = results.substring(1,8);
        System.out.println(results);
        Assert.assertEquals(results,"Testing","Invalid search content");
        System.out.println(results);
        captureFullpage("Inventi results");

    }
}


























