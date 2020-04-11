import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class Loopstests {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
            System.out.println("Hello World");
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


    static void findHeighst() {
        List<Integer> pole = generateList(5, 10);
        System.out.println(pole);

        int x = pole.get(0);

        for (int i = 1; i < pole.size(); i++) {
            if (x < pole.get(i)) {
                x = pole.get(i);

                System.out.println(x);

            }
        }

    }
}