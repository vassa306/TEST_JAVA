package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final WebElement banner;
    private final WebElement login;
    private final WebElement passsword;
    private final WebElement link;

    public static  WebDriver driver;
    //Create constructor
    public LoginPage(WebDriver driver){
        banner = driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']"));
        login = driver.findElement(By.cssSelector("input#email._55r1._6luy"));
        passsword = driver.findElement(By.id("pass"));
        link = driver.findElement(By.partialLinkText("Forgot password?"));
    }
    // get value of Webelement This methods returns values containing constructor
    public WebElement getBanner() {
        return banner;
    }

    public WebElement getEmail() {
        return login;
    }

    public WebElement getPasssword() {
        return passsword;
    }

    public WebElement getLink(){
        return link;

    }
}
