package PageObjects;

import org.openqa.selenium.WebDriver;

public class Homepage {


    private LoginPage loginPage;

    public Homepage(WebDriver driver) {
        this.loginPage = new LoginPage(driver);
    }

    public LoginPage getLoginPage() {
        return loginPage;

    }
}

