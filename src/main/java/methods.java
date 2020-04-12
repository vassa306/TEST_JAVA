import java.util.ArrayList;
import java.util.List;

public class methods {
    public static void main(String[] args) {
        // multiplyNumbers(6, 7);
        // System.out.println(multiplyNumbers(9, 7));
        /*  int s = sum(4,8);
        System.out.println(sum(4,8));

        System.out.println(average(4.32,3.32,3.3));

        System.out.println(numberMinusThree(4));
*/
        evenNumbers(5, 9);

    }

    static List<Integer> generateList(int i, int i1) {
        List<Integer> array = new ArrayList<Integer>();
        array.add(5);
        array.add(4);
        array.add(1);
        array.add(8);
        array.add(3);
        return array;
    }

    static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    static double average(double a, double b, double c) {
        double avg = (a + b + c) / 3;
        return avg;

    }

    static int numberMinusThree(int a) {
        int b = a - 3;
        return b;
    }

    static int multiplyNumbers(int a, int b) {
        int multiply = a * b;
        return multiply;

    }

    static int twiceMultiply(int a) {
        int twicemultiply = a * 2;
        return twicemultiply;
    }

    static int subs(int a, int b) {
        int substract = a - b;
        return substract;

    }

    static int magic(int a, int b, int c) {
        int magical = (a + (2 * b)) - c;
        return magical;
    }


    static int calcAbsValue(int a, int b) {
        int abs = a - b;
        return abs;


    }

    static int writeSentence(String sentence) {
        char ch = sentence.charAt(sentence.indexOf('a'));
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'a') {
                count++;
                System.out.println("number of a:=" + ch);
            }
        }
        System.out.println("Total count of a:=" + count);
        return count;
    }

    static boolean questionSentence(String sentence) {

        boolean question = false;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == '?') {
                question = true;
                if (sentence.charAt(i) != '?') {
                    question = false;

                }

            }

        }
        System.out.println("Is this sentence is interogative ?\n" + question);
        return question;
    }

    static List<Integer> evenNumbers(int y, int il) {

        List<Integer> field = new ArrayList<Integer>();
        field.add(6);
        field.add(8);
        field.add(9);
        field.add(10);
        field.add(45);
        field.add(6);
        field.add(3);


        System.out.println(field);


        List<Integer> evenField = new ArrayList<Integer>();

        for (int i = 0; i < field.size(); i++) {
            if (field.get(i) % 2 == 0) {
                evenField.add(field.get(i));

            }
        }
        System.out.println("even field je" + evenField);
        return evenField;
    }
}


/**
 * UKOLY
 * 1) metoda, ktera vynasobi dve cisla
 * 2) metoda, ktera vrati dvojnasobek zadaneho cisla
 * 3) metoda, ktera odecte dve cisla
 * 4) metoda, ktera dostane na vstupu tri cisla, prvni secte s dvojnasobkem druheho a pak odecte treti
 * 5) metoda, ktera vrati vzdalenost dvou cisel, tedy absolutni hodnotu jejich rozdilu.
 * (Vypocitam to tak, ze cisla od sebe odectu. Pokud je vysledek zaporny, umazu znamenko)
 * 6) metoda, ktera dostane jako vstupni parametru vetu (napriklad, "Jak se dneska m�te?")
 * a vrati pocet pismen "a" ve v�t�.
 * 7) metoda, ktera dostane na vstupu vetu a vrati true pokud je veta tazaci (m� na konci otazn�k) jinak vrati false.
 * 8) metoda, ktera dostane na vstupu pole cisel a vrati pole, kde budou jenom suda cisla ze vstupniho pole
 * 9) metoda dotane na vstupu pole slov (Stringu) a cislo, ktere bude udavat maximalni pocet znaku ve slove.
 * Metoda vrati pole ve kterem budou pouze slova kratsi nez bez zadana na vstupu.
 * 10) Metoda, ktera spocte ctyrnasobek zadaneho cisla, ale v jejim tele se nikde nesmi vyskytnout "*"
 * napoveda: pouzijte metody, ktere jste uz naprogramovali.
 */


