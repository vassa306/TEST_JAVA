import java.util.Scanner;

public class booltests {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperature: ");
        float temp = scanner.nextFloat();

        if (temp <= 32) {
            System.out.println("Temperature is too low");
        }
        else if (!(temp == 40 && temp < 38))
        System.out.println("Its too hot, you have to drink water because temperature is " + temp + " celsia");
        else {
            System.out.println(" It is too hot, stay in home because current temperature is " + temp);
        }

    }


}
