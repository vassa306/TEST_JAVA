package main.basics;


import java.util.Locale;

public class WorkWithStrings {
    public static void main(String[] args) {
        String s = " Hello worlds ";
        String a = "Hello Earth";

        CheckStringContent(s);
        toUppercase(s);
        toLowerCase(s);
    }

    public static void toUppercase(String a) {

        String upper = a.trim().toUpperCase();
        System.out.print("string to uppercase is " + upper);
    }

    public static void toLowerCase(String a) {

        String lower = a.trim().toLowerCase();
        System.out.print("string to lowercase is " + lower);
    }

    public static void CheckStringContent(String s) {
        int i = s.trim().length();
        //    int b = s.trim().length();
        boolean a = s.contains("e");
        String o = s.replace("e", "s");
        System.out.print(i + "contains e: " + a + " replace " + o + " length without space ");
    }

}

