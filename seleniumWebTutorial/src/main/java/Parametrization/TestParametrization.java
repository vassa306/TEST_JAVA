package Parametrization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParametrization {

    @Test(dataProvider="getData")
    public void doLogin(String name, String password){
        System.out.println("---------------------------------------------------------");
        System.out.println("Login: " + name + " \n" + "Password: "  + password);
    }

    @DataProvider
    public Object[][] getData(){
        //add number of rows and colums for parametrization
        Object[][] data = new Object[3][2];
        data[0][0] = "trainer@wayautomation.com";
        data[0][1]= "aaa2022!";
        data[1][0] ="java@waytoautomation.com";
        data[1][1] = "Test2020!";
        data[2][0] = "vassa306@gmail.com";
        data[2][1]="Test20201";

        return  data;
    }
}
