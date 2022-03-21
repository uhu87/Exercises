package pl.uhu87.files;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CheckIfFileExists {


/*    public static boolean checkFileExists().

    uzupełnij ciało metody tak, aby wczytała z konsoli nazwę pliku,
    sprawdzi, czy plik istnieje a następnie wypisze true lub false.*/

    public static void main(String[] args) {

        checkIfFileExists();



    } public static void checkIfFileExists (){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwe pliku");
        String fileName = scanner.nextLine();
        Path path = Paths.get(fileName);
        File file = new File(fileName);
        System.out.println(Files.exists(path));
        System.out.println(file.exists());
    }
}
