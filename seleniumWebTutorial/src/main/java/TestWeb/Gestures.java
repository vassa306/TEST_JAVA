package TestWeb;

import Actions.TestActions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gestures extends TestActions {
    @BeforeTest
    public void setUp() {
        setupWithNewOptions("https://www.google.cz");
    }
    @Test
    public void testcaseAction() {
        testMouseOver(GOOGLEBTNSRCHXPTH,LINKW2A);

    }


}
