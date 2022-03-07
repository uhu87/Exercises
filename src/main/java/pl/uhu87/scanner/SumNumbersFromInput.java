package pl.uhu87.scanner;

import java.util.Scanner;
/*Uzupełnij ciało metody tak, aby:

        1. wczytywała liczby z konsoli do momentu wprowadzania 0 (ale nie włączając go do sumy liczb),
        2. sumowała ich wartość oraz liczbę.
        Wywołaj metodę w metodzie `main`.*/

public class SumNumbersFromInput {

    public static void main(String[] args) {

        getData1();
        getData2();

    }

    public static void getData1() {


        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int input = 0;
        int counter = 0;
        while (scanner.hasNext()){
            input= scanner.nextInt();
            if(input==0){break;}
            sum+=input;
            counter++;
        }

        System.out.println(sum + ", " + counter);


        Scanner scan = new Scanner(System.in);
        int input2 = 0;
        int sum2 = 0;

        while ((input2 = scan.nextInt()) != 0) {

            sum2 = sum2 + input2;

        }
        System.out.println(sum2);

    }

    public static void getData2() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        int input;

        do {
            input = scanner.nextInt();
            sum += input;
            if (input != 0) {
                counter++;
            }

        } while (input != 0);

        System.out.println("Suma: " + sum);
        System.out.println("Liczba: " + counter);
    }

}
