package main.basics;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class WorkWithStrings {
    public static void main(String[] args) {
        String s = " Hello Hello worlds ";
        String b = " HELLO Hello WORLDS";
        String a = "Hello Earth ";
        String c = " Hello earth ";
        String p = "racecar";

        CheckStringContent(s);
        toUppercase(s);
        toLowerCase(s);
        // if String is lesser than int position java threw out of bounds exception
        checkCharPosition(a, 10);

        //    int b = s.trim().length();

        CheckCountOfChar(s);

        concatofStrings(s, a);

        addSubIntoList(s, 5, 13);

        isContainsString(s);

      //  isTheSameStrings(s, a);

        compareIgnoreCase(s, b);

        compareMultipleStrings(s, b, a);

        String inputstring = "testing";

        // reverse for
        reverseString(s);

        counOfWords(s);

        countOfSpaces(s);

        isPalidrome(p);

        testTheSameData(a, c);

        


    }

    public static void testTheSameData(String s, String p) {
        if (s.trim().equalsIgnoreCase(p.trim())){
            System.out.println("the same data");
        }else{
            System.out.println("data does not match");
        }
    }

    public static void isPalidrome(String s) {
        if (reverseString(s).compareToIgnoreCase(s)==0){
            System.out.println("is palidrome");
        }else{
            System.out.println("not palidrome");
        }
    }

    public static void countOfSpaces(String s) {
        String word = s.trim();
        int count = word.length() - word.replace(" ","").length();
        System.out.println("number of spaces: " + count);
    }

    public static void counOfWords(String s) {
        String[] words = s.trim().split(" ");
        System.out.println("number of words is " + words.length);
    }



    public static String reverseString(String inputstring) {
        inputstring.trim();
        String output = "";
        for (int i = inputstring.length()-1; i >= 0; i --){
            output = output + inputstring.charAt(i);

        }
        return output;
    }

    public static void compareMultipleStrings(String s, String b,String a) {
        if (s.compareTo(b)==0 && s.compareTo(a)==0 && b.compareTo(a)==0){
            System.out.println("the same string ");
        }else{
            System.out.println("not the same string");
        }
    }


    public static void compareIgnoreCase(String s, String b) {
        if (s.compareToIgnoreCase(b)==0){
            System.out.println("the same string ");
        }else{
            System.out.println("not the same string");
        }
    }

/*
    public static void isTheSameStrings(String s2, String s3) {
        if (s2.equals(s3)) {
            System.out.println(s2);
        } else {
            System.out.println(s3);
        }
    }
*/

    public static void addSubIntoList(String s,int a, int b) {
        int startindex = a;
        int endindex=b;
        List<String> sublist = new ArrayList<String>();
        String subs1 = s.trim().substring(startindex);
        String subs2 = s.trim().substring(endindex);
        String subs3 = s.trim().substring(startindex,endindex);
        sublist.add(subs1);
        sublist.add(subs2);
        sublist.add(subs3);

        for (String jmeno : sublist) {
            System.out.println("list contains " + jmeno);
        }

       // System.out.println(s.trim().substring(startindex));
       // System.out.println(s.trim().substring(endindex));
      ///  System.out.println(s.trim().substring(startindex,endindex));
    }

    public static void concatofStrings(String s, String a) {
        System.out.println("concat:  "+ "\n" + s.trim() + a.trim());
      String result = s.trim().concat(a.trim());
      System.out.println(result.length() + " " + result);
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

        public static void isContainsString(String s){
            if (s.contains("ello")) {
                System.out.println("value found");
            } else {
                System.out.println("value not found");
            }
        }
    }







