package PageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final WebElement banner;
    private final WebElement login;
    private final WebElement passsword;

    public LoginPage(WebDriver driver){
        banner = driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']"));
        login = driver.findElement(By.id("email"));
        passsword = driver.findElement(By.id("pass"));
    }

    public WebElement getBanner() {
        return banner;
    }

    public WebElement getLogin() {
        return login;
    }

    public WebElement getPasssword() {
        return passsword;
    }
}
