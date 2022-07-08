package TestCasesWeb;

import Actions.TestActions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class InventiSearchBox extends TestActions {

    @BeforeTest
    public void setUp(){
        commonSetUp("https://www.inventi.cz/blog");

    }

    @Test
    public void checkSearch() throws IOException {
        ClickInventiSearch();

    }
}
