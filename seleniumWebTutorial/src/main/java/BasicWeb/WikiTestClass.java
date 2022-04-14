package BasicWeb;

import Actions.TestActions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WikiTestClass extends TestActions {
    @BeforeMethod
    public void setUp() {
        commonSetupWiki();
    }

    @Test
    public void selectLanguageOnWiki() {
        pickValuefromWiki(driver,"searchLanguage","Eesti","hi");

    }

    @AfterMethod
    public void exitTests(){
        tearUp();
    }



}
