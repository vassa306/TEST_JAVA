package Parametrization;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFailure  {

    static int count = 0;
    @Test
    public void login(){
        count++;
        System.out.println(count);
        Assert.fail("Failing the Login Test");

        System.out.println("Capture screenshot");
    }

    @Test
    public void duUserReg(){

    }
}
