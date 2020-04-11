import java.text.NumberFormat;
import java.util.Scanner;


public class Math {

    public static void main(String[] args) {
        final byte MONTHS = 12;
        final byte PERCENT = 100;
        int principal = 0;
        float annualInterest = 0;
        float monthlyInterest = 0;
        byte years = 0;
        int numberOfPayments = 0;


        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Principal: ");
            if (input.hasNextInt())
                principal = input.nextInt();
            if (principal >= 1000 && principal <= 1000_000) {
            } else {
                System.out.println("Principal has to be between 1000 and 1_000_000 " + "value was: " + principal);

            }
            break;


        }

        while (true) {
            System.out.println("Annual Interest Rate: ");
            if (input.hasNextFloat()) {
                annualInterest = input.nextFloat();
            } else {
                System.out.println(" Input value is not correct");
            }
            if (annualInterest >= 1 && annualInterest <= 30) {
                System.out.println("Montrhly interest is short time duration");
            }
            monthlyInterest = annualInterest / PERCENT / MONTHS;
            String monthlyformatted = NumberFormat.getCurrencyInstance().format(monthlyInterest);
            System.out.println("Monthly " + monthlyformatted);

            break;

        }

        while (true) {
            System.out.println("Period (YEARS)");
            if (input.hasNextByte())
                years = input.nextByte();
            numberOfPayments = years * MONTHS;
            System.out.println("Number of Payments: " + numberOfPayments + " months");
            break;
        }

        while (true) {
            double mortrage = principal * (monthlyInterest * java.lang.Math.pow(1 + monthlyInterest, numberOfPayments) / (java.lang.Math.pow(1 + monthlyInterest, numberOfPayments) - 1));
            String mortrageformatted = NumberFormat.getCurrencyInstance().format(mortrage);
            System.out.println("Mortrage " + mortrageformatted);


            float YearlyPayment = (float) (mortrage * MONTHS);
            String Yearlyformatted = NumberFormat.getCurrencyInstance().format(YearlyPayment);
            System.out.println("Yearly Mortrage :  " + Yearlyformatted);
            break;
        }

    }

}











