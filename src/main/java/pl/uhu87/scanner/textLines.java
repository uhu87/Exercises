package pl.uhu87.scanner;

/*
W pliku `Main05.java` stwórz metodę o sygnaturze:

        `public static void textLines()`,

        która wczyta kolejne linie tekstu z konsoli,a następnie je wyświetli.

        Program ma zakończyć działanie po wpisaniu `quit` (ale już bez wyświetlania go na konsoli).

        Wywołaj metodę w metodzie `main`.*/

import java.util.Scanner;

public class textLines {


    public static void main(String[] args) {

                textLines();

    } public static void textLines (){

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("quit")){
            System.out.println(input);
            input = scanner.nextLine();

        }


    }
}
