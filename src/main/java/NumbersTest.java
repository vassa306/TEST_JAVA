import java.lang.Math;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class NumbersTest {



    public static void main(String[] args) {
        sumUntilZero();

    }




    static int generateNumber(int max) {
        return (int) Math.round(Math.random() * max);
    }

    static List<Integer> generateList(int count, int max) {
        List<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < count; i++) {
            array.add(generateNumber(max));
        }
        return array;
    }

    static List<Integer> generateList() {
        List<Integer> array = new ArrayList<Integer>();
        array.add(5);
        array.add(4);
        array.add(1);
        array.add(8);
        array.add(3);
        return array;
    }

    static void isDivisibleBy3() {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        if (i % 3 == 0)
            System.out.println(i + "je delitelne 3");
        else
            System.out.println(i + " neni delitelne 3");
    }

    static void sumUntilZero() {
        int a = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte cele cislo");
        if (sc.hasNextInt()) {
            a = sc.nextInt();
        }
        else {
            System.out.println("Nejedna se o cislo, ale o text");
        }


        int soucet = 0;
        while (a > 0 && a < 10) {
            soucet = soucet + a ;
            a = sc.nextInt();



        }


        System.out.println("Soucet vybranych cisel je " + soucet);

    }

    static void hrajemeSiSPromenymi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte prosim cele cislo");
        int a = sc.nextInt();
        System.out.println("Zadejte prosim cele cislo:");
        int b = sc.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("a " + a);
        System.out.println("b " + b);


    }


}