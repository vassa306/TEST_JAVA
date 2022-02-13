package main.basics;


import java.util.Locale;

public class WorkWithStrings {
    public static void main(String[] args) {
        String s = " Hello Hello worlds ";
        String a = "Hello Earth ";

        CheckStringContent(s);
        toUppercase(s);
        toLowerCase(s);
        // if String is lesser than int position java threw out of bounds exception
        checkCharPosition(a,10);

        //    int b = s.trim().length();

        CheckCountOfChar(s);

        concatofStrings(s,a);

        substrMethod(s,5,13);
    }

    public static void substrMethod(String s,int a, int b) {
        int startindex = a;
        int endindex=b;
        System.out.println(s.trim().substring(startindex,endindex));
    }

    public static void concatofStrings(String s, String a) {
        System.out.println("concat:  "+ "\n" + s.trim() + "," + a.trim());
        System.out.println("concat with concat method:  "+ "\n" + s.trim().concat("**").concat(a.trim()));
    }

    public static void CheckCountOfChar(String s) {
        System.out.print(s.trim().length() - s.trim().replace("Hello","").length());
    }

    public static void checkCharPosition(String a, int position) {
        String upper = a.trim().toUpperCase();
        String pos = String.valueOf(a.charAt(position));
        StringBuilder builder = new StringBuilder();
        builder.append("this is result" + "\n").append(pos);
        System.out.println(builder.toString());
    }

    public static void toUppercase(String a) {
        String upper = a.trim().toUpperCase();
        System.out.print("string to uppercase is a" + upper);
    }

    public static void toLowerCase(String a) {
        String lower = a.trim().toLowerCase();
        System.out.print("string to lowercase is " + lower);
    }

    public static void CheckStringContent(String s) {
        int i = s.trim().length();
        //    int b = s.trim().length();
        boolean a = s.contains("e");
        String o = s.replace("ell", "sss");
        System.out.print(i + "contains e: " + a + " replace " + o + " length without space ");
    }





}

