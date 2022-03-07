package pl.uhu87.scanner;

import java.util.Scanner;

public class GrossNet {

    public static void main(String[] args) {


        grossNet();

    }

    public static void grossNet() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("BN or NB?");
        String input = scanner.nextLine();
        while (!input.equals("BN") && !input.equals("NB")) {
            System.out.println("please write \"BN\" or \"NB\"");
            input = scanner.nextLine();
        }
        if (input.equals("NB")) {
            System.out.println("Give me a net value");
            while (!scanner.hasNextDouble()) {
                System.out.println("Wrong data");
                scanner.next();
            }
            double paymentNet = scanner.nextDouble();
            System.out.println("Given net payment is " + paymentNet * 1.23 + " gross");
        } else {
            System.out.println("Give me a net value");
            while (!scanner.hasNextDouble()) {
                System.out.println("Wrong data");
                scanner.next();
            }
            double paymentGross = scanner.nextDouble();
            double result = paymentGross-paymentGross*0.23;
            System.out.println("Given gross payment is " + result + " net");
        }

    }
}
