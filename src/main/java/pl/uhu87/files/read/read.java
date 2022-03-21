package pl.uhu87.files.read;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class read {

    public static void main(String[] args) {

        File file = new File("D:\\PROGRAMMING\\Exercises\\src\\main\\java\\pl\\uhu87\\files\\read\\test1.txt");

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
