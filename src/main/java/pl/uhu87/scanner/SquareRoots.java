package pl.uhu87.scanner;

import java.util.Scanner;

/* `public static void equation()`, która:

        1. poprosi o podanie liczb całkowitych `a`, `b`, `c`,
        2. obliczy pierwiastki równania kwadratowego, a następnie je wyświetli.
        Wywołaj metodę w metodzie `main`.*/
public class SquareRoots {

    public static void main(String[] args) {

        squareRoots();



    }   public static void squareRoots (){

        Scanner scanner = new Scanner(System.in);
        double a = Math.sqrt(scanner.nextDouble());
        double b = Math.sqrt(scanner.nextDouble());
        double c = Math.sqrt(scanner.nextDouble());

        System.out.println(a + ", " + b + ", " + c);


    }
}
