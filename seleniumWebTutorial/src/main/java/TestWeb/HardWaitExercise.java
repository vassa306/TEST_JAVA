package TestWeb;

import Actions.TestActions;
import org.testng.annotations.BeforeMethod;

public class HardWaitExercise extends TestActions {
   @BeforeMethod
    public void commonSetUp(){
       commonSetUpHardWait();
   }
   
}
