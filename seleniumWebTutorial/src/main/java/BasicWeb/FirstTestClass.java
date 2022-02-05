package BasicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.util.concurrent.TimeUnit;


public class FirstTestClass {

    public static void main (String[] args){
        WebDriver driver = setUp();
        logIntoFB(driver);
    }

    public static void logIntoFB(WebDriver driver) {
        driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']")).click();
        WebElement emailfield = driver.findElement(By.id("email"));
        emailfield.click();
        emailfield.sendKeys("vassa306@gmail.com");

        WebElement passfield = driver.findElement(By.id("pass"));
        passfield.click();

        passfield.sendKeys("Banicek1922!");
        WebElement Login = driver.findElement(By.xpath("//button[@name='login']"));
        Login.click();

        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);

        String title = driver.getTitle();
        String URL = driver.getCurrentUrl();
        System.out.println("Page title: " + title + " Page URL is: " +  URL);
    }


    public static WebDriver setUp() {
        WebDriver driver;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\vassa\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        String baseUrl = "https://www.facebook.com";
        driver.get(baseUrl);
        return driver;
    }
}










