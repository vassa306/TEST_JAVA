package TestCasesWeb;

import Actions.TestActions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class WikiTestClass extends TestActions {
    @BeforeMethod
    public void setUp() {
        commonSetupWiki();
    }



    @Test
    public void selectLanguageOnWiki() {
        pickValueByVisibleText(driver,"searchLanguage","Eesti");


    }

    @Test
    public void selectvaluefromWiki() throws InterruptedException, IOException {
        pickValuefrom(driver,"searchLanguage","hi");
    }

    @AfterMethod
    public void exitTests(){
        tearUp();
    }



}
