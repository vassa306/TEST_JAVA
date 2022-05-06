package TestCasesWeb;

import Actions.TestActions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Assingment4 extends TestActions {

    @Test
        public void assignment4(){
            assfour();
        }

        @AfterTest
        public void testClose(){
        tearUp();
        }

}
