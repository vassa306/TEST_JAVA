import java.lang.Math;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soucet {
    public static void main(String[] args) {
        rozdel();
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


    static void cislaVetsinezTri() {
        //soucet cisle vetsich nez tri
        List<Integer> pole = generateList(9, 8);
        System.out.println(pole);
        System.out.println("Zadejte cislo: ");
        Scanner sc = new Scanner(System.in);
        int pocetcisel = sc.nextInt();
        int soucetcisel = 0;
        List<Integer> field = generateList(pocetcisel, 10);
        for (int i=0; i<field.size(); i++);







    }

    static void rozdel() {
        List<Integer> pole = generateList(6, 10);

        List<Integer> mensinezpet = new ArrayList<Integer>();
        List<Integer> vetsinezpet = new ArrayList<Integer>();


        System.out.println(pole);


        for (int i = 0; i < pole.size(); i++) {
            //pokud jsou hodnoty mensi nez 5
            if (pole.get(i) < 5) {
                mensinezpet.add(pole.get(i));
               System.out.println("Prvni iterace:" + mensinezpet);
               System.out.println("Velikost pole s nazvem mensi je: " + mensinezpet.size() + " \n cisla jsou tyto: " + mensinezpet);


            } else {
                // pokud jsou hodnoty vetsi nez 5
                vetsinezpet.add(pole.get(i));
               System.out.println("druha iterace:" + vetsinezpet);
               System.out.println("Velikost pole s nazvem vetsi je: " + vetsinezpet.size() + " \n cisla jsou tyto: " + vetsinezpet);
            }
        }
        System.out.println(mensinezpet);
        System.out.println(vetsinezpet);

    }
    static void prumer() {
        List<Integer> pole = generateList(9, 10);
        System.out.println(pole);
        int x = pole.get(0);
        int j = pole.size();
        for (int i = 1; i < pole.size(); i++) {
            x = x + pole.get(i);

        }
        System.out.println((double) x / j);
    }
  /*  static void vypismatici(){
        static int [][]generateMatrix(int m. int n);
        int [][] matrix = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
*/

            }




