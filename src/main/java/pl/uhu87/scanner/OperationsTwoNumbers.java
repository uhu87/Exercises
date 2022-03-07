package pl.uhu87.scanner;

import java.util.Scanner;

public class OperationsTwoNumbers {

    public static void main(String[] args) {

        operation();

    }

    public static void operation() {

        Scanner scanner = new Scanner(System.in        );

        System.out.println("podaj liczbe 1");
        while (!scanner.hasNextInt()){
            System.out.println("to nei liczba");
            scanner.next();
        }
        int number1 = scanner.nextInt();

        System.out.println("podaj liczbe 2");

        while (!scanner.hasNextInt()){
            System.out.println("to nei liczba");
            scanner.next();
        }
        int number2 = scanner.nextInt();


        System.out.println(number1 + number2);
        System.out.println(number1 - number2);
        System.out.println(number1 * number2);
        System.out.println(number1 / number2);
    }
}
