public class methods {
    public static void main(String[] args) {
        int s = sum(4,8);
        System.out.println(sum(4,8));

        System.out.println(average(4.32,3.32,3.3));

        System.out.println(numberMinusThree(4));

    }
    static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }

    static double average(double a, double b, double c){
        double avg = (a + b +c)/3;
        return avg;

    }
    static int numberMinusThree(int a){
        int b = a -3;
        return b;
    }

}


