package main.baiscs;

import java.util.ArrayList;
import java.util.List;

public class numbers {
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

    //prochazeni listu
    static void numberInInterval(List<Integer> list, int min, int max, int expected) {
        List<Integer> indexes = new ArrayList<Integer>();
        List<Integer> array = new ArrayList<Integer>();

        for (int number :
                list) {
            if (number <= max && number > min) {
                indexes.add(number);
                for (int i : indexes) {
                    //System.out.println("this is numbers in interval" + i);
                    if (i == max) {
                        System.out.println("max value found in list: " + i);
                    } else {
                        System.out.println("");
                    }
                    if (i == expected) {
                        i = i - 1;
                        System.out.println("expected value found in list: " + i);
                    }
                }
            }
        }
    }
   // if x > pole get i  x = list.get(i) it means min value found
    public static int minNumber(List<Integer>list) {
        int x = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (x > list.get(i)){
                x = list.get(i);
            }
        }
        return x;
    }

    public static void minNumberVypis(List<Integer>list){
        System.out.println("nejmensi cislo je " + minNumber(list));

    }



    public static void main(String[] args) {
        List<Integer> numbers = generateList(7, 20);
        numberInInterval(numbers, 8, 15, 10);

        List<Integer> pole;
        pole = generateList(20, 20);
        minNumberVypis(pole);
    }
}








