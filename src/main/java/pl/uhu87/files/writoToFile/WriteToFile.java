package pl.uhu87.files.writoToFile;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class WriteToFile {


    public static void main(String[] args) {


            String fileName = "fileName.txt";
           writeToFile(fileName);



    }   public static void writeToFile (String fileName){

        Path path = Paths.get("D:\\PROGRAMMING\\Exercises\\src\\main\\java\\pl\\uhu87\\files\\writoToFile\\"+fileName);

                if(!Files.exists(path)){
                try {
                    Files.createFile(path);
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Podaj tekst");

                    try (FileWriter writer = new FileWriter(fileName, true)) {
                        while (!scanner.hasNext("quit")) {
                            System.out.println("podaj tekst");
                            String input = scanner.nextLine();
                            writer.append(input);
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            } else {
                System.out.println("Juz istnieje");
            }
    }
}
