package pl.uhu87.files.OnlyContain;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class OnlyContain {

   // Z wczytanego pliku wypisz tylko takie ktore maja slowa JAVA w ronzych odmianach



    public static void main(String[] args) {


        File file = new File("D:\\PROGRAMMING\\Exercises\\src\\main\\java\\pl\\uhu87\\files\\OnlyContain\\text4.txt");

        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String nextLine = scan.nextLine();
                if (nextLine.toLowerCase(Locale.ROOT).contains("jav")) {
                    System.out.println(nextLine);
                }

            }

        } catch (FileNotFoundException e) {
            System.out.println("brak pliku");
            ;
        }
    }
}
