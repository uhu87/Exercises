package pl.uhu87.files.InputToFile;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputToFile {
/*    napisz program, który będzie wczytywał kolejne linie tekstu z konsoli,
    a następnie zapisywał je do pliku o nazwie `text1.txt`.
    Program ma zakończyć działanie po wpisaniu słowa `quit` (bez zapisywania go do pliku `text1 .txt`).*/

    public static void main(String[] args) throws IOException {

        try (FileWriter fileWriter = new FileWriter("D:\\PROGRAMMING\\Exercises\\src\\main\\java\\pl\\uhu87\\files\\InputToFile\\result.txt", true)) {
            Scanner scanner = new Scanner(System.in);
            while (!scanner.hasNext("quit")) {
                    fileWriter.append(scanner.nextLine()+"\n");}

        }

    }
}
