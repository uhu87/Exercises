package pl.uhu87.files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Rewrite {


    //uzupełnij ciało metody tak, aby wczytała z konsoli nazwę pliku,
    //sprawdzi czy plik istnieje i jeżeli istnieje stworzy drugi
    // plik z sufiksem "_2", do którego 2-krotnie zostanie zapisana zawartość pliku wzorcowego.


    public static void main(String[] args) {

        try {
            reWrite();
        } catch (IOException e) {
            e.printStackTrace();
        }


    } public static void reWrite () throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwe pliku");
        String fileName = scanner.nextLine();
        Path path = Paths.get(fileName);
        if(Files.exists(path)){
            String newFileName = path.toFile().getName().replaceFirst(".txt", "_2.txt");


            try (FileWriter fileWriter = new FileWriter(newFileName, true)) {

                File file = new File(path.toString());
                Scanner scanner1 = new Scanner(file);
                while (scanner1.hasNextLine()) {
                    String nextLine = scanner1.nextLine();
                    System.out.println(nextLine);
                    fileWriter.append(nextLine).append("\n").append(nextLine).append("\n");

                }
            }


        } else {
            System.out.println("no such file");
        }
    }
}
