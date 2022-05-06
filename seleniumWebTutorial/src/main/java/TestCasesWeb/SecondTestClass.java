package TestCasesWeb;

import Actions.TestActions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SecondTestClass extends TestActions {

    @BeforeMethod
    public void setUp(){
      commonSetupWeb();

  }
  @Test
    public void getDropdownValues(){
        getDropdownValues(driver,"country");
  }
  @Test
  public void selectDropdownValue() throws InterruptedException {
      pickValueFromDropdown(driver,"country","Germany");

  }

    @AfterMethod
    public void exitTests(){
        tearUp();
    }




}
