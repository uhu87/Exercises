package pl.uhu87.files.CountCharFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CountCharFromFile {

    //public static int count(String fileName).
    //
    //uzupełnij ciało metody tak, aby zliczała i zwracała ilość znaków z pliku


    public static void main(String[] args) {

        String file = "countCharacters.txt";
        countChar(file);


    } public static int countChar (String fileName) {

            Path path = Paths.get("D:\\PROGRAMMING\\Exercises\\src\\main\\java\\pl\\uhu87\\files\\CountCharFromFile\\countCharacters.txt");
            int counter = 0;
            if(Files.exists(path)){
            File file = new File(String.valueOf(path));
            try {
                Scanner scanner = new Scanner(file);
                while (scanner.hasNext()) {
                    counter+=scanner.nextLine().length();
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }
        System.out.println(counter);
                return  counter;
    }

}
